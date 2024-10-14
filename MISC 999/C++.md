## C++ 编码常见场景处理方式

此笔记是关于 Effective C++ 的个人笔记。

### 规则八

**不要在析构函数中抛出异常。**

但是，构造函数中可以抛出异常，这是因为两者不同的处理方式导致的。

在`try-catch`代码块中，如果在`try`块中出现错误，则会先调用`try`块中的所有析构函数清除内存，然后进入`catch`块，这被称为`stack unwinding`。

如下示例所示，`Foo`是一个具有抛出异常构造函数的类。此时，如果在`try`块中引发异常/或者调用`Foo`的构造函数，`stack unwinding`就会开始调用正常的析构函数，释放内存，然后进入`catch`块。

```c++
class Foo {
  Foo() { throw 42; }
};

try {
	Foo foo{}; 
} catch (...) {}
```

但是，如果在`try`块中包含了抛出异常的析构函数的对象（下面例子中的`Bar`），如果此时如果因为（1）其他原因导致异常：`throw 42`（2）调用了`Bar`的析构函数 产生了异常，此时就会进行`stack unwinding`的过程以释放内存。

如果是上述第一种情况（**CASE 3**），此时调用`Bar`的析构函数将导致再次出现异常。根据c++标准，同时出现两个异常时，就会调用`std::terminate`终止程序。

如果是上述第二种情况，则会调用 **除去当前引发异常的析构函数所属的对象** 以外所有对象的析构函数。如果当前`try`块内包含不止一个`Bar`（**CASE 4**），那么就会再次触发异常而终止程序。当然，如果只存在一个`Bar`在当前代码块（**CASE 1 & CASE 2**），程序会清理其他部分的内存，进入`catch`代码块。

```c++
class Bar {
  ~Bar() noexcept(false) {
    cout << "throwing" << endl;
    throw 42;
  }
};
// CASE 1, success
try {
  Bar bar{};
} catch (...) {};
// CASE 2, success
try {
  Bar bar[1];
} catch (...) {};
// CASE 3, will cause program to terminate
try {
  Bar bar{};
  throw 42;
} catch (...) {}; 
// CASE 4, will cause program to terminate
try {
  Bar bar[10];
} catch (...) {};
```

注意，上述`Bar`函数被设置了`noexcept(false)`。这是因为从`c++11`以后，析构函数默认带有`noexcept`修饰，如果此时抛出异常，则上述四个情况全部都会出错。

上述是根据标准规定得到的结果。然而具体编译器实现有差别。`clang++`的实现中，**CASE4** 会程序会退出，在退出前的调试信息是`throwing throwing`, 说明异常抛出了两次导致了程序退出。然而在`g++`中，**CASE 4** 程序不会退出，仅仅会返回一次`throwing`，然后被`catch`捕捉到，程序正常结束。（很有可能是`g++`的bug）

综上，介于析构函数抛出异常**出错情况难以预测且复杂**，并且和**编译器有关**。故此规范不要在析构函数中抛出异常。**如果需要抛出异常，将其逻辑在常规函数中**，让用户手动调用是更好的选择。



