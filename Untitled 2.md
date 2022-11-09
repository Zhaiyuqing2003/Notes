```typescript
MatrixLike {
    [] : VectorLike
}

VectorLike {
    [] : Element
}
		
MatrixLike
	.iter()

MatrixLike<T> ==equiv== VectorLike<VectorLike<T>>
    
a.iter().zip(b.iter)

zip<iter<T>, iter<U>> = iter<[T, U]>

funcList = [fn...]

rowIter(m) = iter().group(m) !!!but better implementation could be given
colIter(m) = iter().access()

ProxyAccessor ---iter()---> Iterator
Iterator ---access()---> ProxyAccessor

```


$$
\int_t^\infin f(x)\d x \equiv \lim\sub u\to \infin; \int_t^u f(x)\d x
$$
