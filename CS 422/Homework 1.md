$$
{\def\<{\langle}}
{\def\>{\rangle}}
{\def\conf#1;{\langle #1 \rangle}}
{\def\smash{\Downarrow}}
{\def\sc#1#2,{{\text{#1\scriptsize{#2}}}}}
{\def\if{\text{if}}}
{\def\tsub#1;{_{\text{#1}}}}
{\def\tub#1..{_{\text{#1}}}}
{\def\note#1!{\fbox{$#1$}}}
{\def\divzero#1!{\text{divzero}(#1)}}
{\def\monop#1!{\mathop{\texttt{#1}}}}
{\def\true{\texttt{true}}}
{\def\false{\texttt{false}}}
{\def\bigstep{\sc BIG, \sc STEP-,}}
{\def\axiomrule#1/#2/#3;{\conf #1; \smash \conf #2; & \hfill #3 }}
{\def\axiomrulepred#1/#2/#3/#4;{\conf #1; \smash \conf #2; \quad \if \ #3 & \hfill #4}}
{\def\proprulebin#1/#2/#3/#4/#5/#6/#7;{\frac{\conf {#1}; \smash \conf {#2}; \quad \conf {#3}; \smash \conf {#4};}{\conf {#5}; \smash \conf {#6};} & \hfill #7}}
{\def\proprulebinpred#1/#2/#3/#4/#5/#6/#7/#8;{\frac{\conf {#1}; \smash \conf {#2}; \quad \conf {#3}; \smash \conf {#4};}{\conf {#5}; \smash \conf {#6};} \quad \if \ #7 & \hfill #8}}
{\def\proprulemon#1/#2/#3/#4/#5;{\frac {\conf {#1}; \smash \conf {#2};} {\conf {#3}; \smash \conf {#4};} & \hfill #5}}
{\def\proprulemonpred#1/#2/#3/#4/#5/#6;{\frac {\conf {#1}; \smash \conf {#2};} {\conf {#3}; \smash \conf {#4};} \quad \if \ #5 & \hfill #6}}
{\def\sproprulemon#1/#2/#3/#4/#5;{\frac {\conf {#1}; \to \conf {#2};} {\conf {#3}; \to \conf {#4};} & \hfill #5}}
{\def\sproprulemonpred#1/#2/#3/#4/#5/#6;{\frac {\conf {#1}; \to \conf {#2};} {\conf {#3}; \to \conf {#4};} \quad \if \ #5 & \hfill #6}}
{\def\saxiomrulepred#1/#2/#3/#4;{\conf {#1}; \to \conf {#2}; \quad \if \ #3 & \hfill #4}}
{\def\saxiomrule#1/#2/#3;{\conf {#1}; \to \conf {#2}; & \hfill #3}}
{\def\sigenv#1;{#1, \sigma}}
{\def\smallstep{\sc SMALL, \sc STEP-,}}
$$

# Homework 1

## 1   Division by Zero

### Big Step Semantics

$\divzero (a_1 \smash i_1) \mathop/ a_2, \sigma!$ is a configuration that capture the error information when dividing by zero. It says that the state before the division is $\sigma$, the numerator is $a_1$ that evaluates to $i_1$, and the denominator is $a_2$ which evaluates to $0$ that causes the problem. $\divzero (a_1, \smash i_1)\mathop/a_2, \sigma!$ is not holistic, that is, if there are expression like $a_1$

#### Arithmetic

$$
\axiomrule i, \sigma/ i/ (\bigstep \sc INT,); \\
\axiomrulepred x, \sigma/ \sigma(x)/ \sigma(x) \neq \bot/ (\bigstep \sc LOOKUP),; \\
\proprulebin a_1, \sigma/ i_1/ a_2, \sigma/ i_2/a_1 \monop+! a_2, \sigma/ i_1 +\tub Int.. i_2/ (\bigstep \sc ADD,); \\
\frac{\conf a_1, \sigma; \smash \conf \divzero e!;}{\conf a_1 \monop+! a_2, \sigma; \smash \conf \divzero e!;} & \hfill \note\bigstep \sc ADD, \sc HALT,\sc 1,! \\
\frac{\conf a_1, \sigma; \smash \conf i_1; \quad \conf a_2, \sigma; \smash \conf \divzero e!;}{\conf a_1 \monop+! a_2, \sigma; \smash \conf \divzero e!;} & \hfill \note\bigstep \sc ADD, \sc HALT,\sc 2,! \\
\proprulebinpred a_1, \sigma/ i_1/ a_2, \sigma/ i_2/a_1 \monop{/}! a_2, \sigma/ i_1 \mathop{/}\tub Int.. i_2/ i_2 \neq 0/(\bigstep \sc DIV,); \\
\proprulemonpred a_1, \sigma/\divzero e!/a_1 \monop{/}! a_2, \sigma/\divzero e!/ i_2 \neq 0/ \note \bigstep \sc DIV, \sc HALT, \sc 1,!; \\
\proprulebinpred a_1, \sigma/ i_1/ a_2, \sigma/ \divzero e!/a_1 \monop{/}! a_2, \sigma/ \divzero e!/ i_2 \neq 0/ \note \bigstep \sc DIV, \sc HALT, \sc 2,!; \\
\frac{\conf a_1, \sigma; \smash \conf i_1; \quad \conf a_2, \sigma; \smash \conf 0;}{\conf a_1 \monop/! a_2, \sigma; \smash \conf \divzero (a_1 \smash i_1) \mathop/ a_2, \sigma!;} & \hfill \note \bigstep \sc DIVZERO,! \\
$$

#### Boolean

$$
\conf t, \sigma; \smash \conf t; & \hfill (\bigstep \sc BOOL,) \\
\frac{\conf a_1, \sigma; \smash \conf i_1; \quad \conf a_2, \sigma; \smash \conf i_2;}{\conf a_1 \mathbin{\texttt{<=}}\, a_2, \sigma; \smash \conf i_1 \le\tub Int.. i_2;} & \hfill (\bigstep \sc LEQ,) \\
\frac{\conf a_1, \sigma; \smash \conf \divzero e!;}{\conf a_1 \mathbin{\texttt{<=}}\, a_2, \sigma; \smash \conf \divzero e!;} & \hfill \note\bigstep \sc LEQ, \sc HALT,\sc 1,! \\
\frac{\conf a_1, \sigma; \smash \conf i_1; \quad \conf a_2, \sigma; \smash \conf \divzero e!;}{\conf a_1 \mathbin{\texttt{<=}}\, a_2, \sigma; \smash \conf \divzero e!;} & \hfill \note \bigstep \sc LEQ, \sc HALT,\sc 2,! \\
\frac{\conf b, \sigma; \smash \conf \true;}{\conf \monop{!}! b, \sigma; \smash \conf \false;} & \hfill (\bigstep \sc NOT-,\sc TRUE,) \\
\frac{\conf b, \sigma; \smash \conf \divzero e!;}{\conf \monop{!}! b, \sigma; \smash \conf \divzero e!;} & \hfill \note\bigstep \sc NOT-,\sc TRUE, \sc HALT,! \\
\frac{\conf b, \sigma; \smash \conf \true;}{\conf \monop{!}! b, \sigma; \smash \conf \false;} & \hfill (\bigstep \sc NOT-,\sc FALSE,) \\
\frac{\conf b, \sigma; \smash \conf \divzero e!;}{\conf \monop{!}! b, \sigma; \smash \conf \divzero e!;} & \hfill \note \bigstep \sc NOT-,\sc FALSE, \sc HALT,! \\
\frac{\conf b_1, \sigma; \smash \conf \false;}{\conf b_1 \monop \&\&! b_2, \sigma; \smash \conf \false;} & \hfill \bigstep \sc AND-,\sc FALSE,) \\
\frac{\conf b_1, \sigma; \smash \conf \divzero e!;}{\conf b_1 \monop \&\&! b_2, \sigma; \smash \conf \divzero e!;} & \hfill \note\bigstep \sc AND-,\sc FALSE, \sc HALT,! \\
\frac{\conf b_1, \sigma; \smash \conf \true; \quad \conf b_2, \sigma; \smash \conf t;}{\conf b_1 \monop \&\&! b_2, \sigma; \smash \conf t;} & \hfill (\bigstep \sc AND-,\sc TRUE,) \\
\frac{\conf b_1, \sigma; \smash \conf \true; \quad \conf b_2, \sigma; \smash \conf \divzero e!;}{\conf b_1 \monop \&\&! b_2, \sigma; \smash \conf \divzero e!;} & \hfill \note \bigstep \sc AND-,\sc TRUE, \sc HALT,! \\
$$

#### Control Flow

$$
\conf \set{}, \sigma; \smash \conf \sigma; & \hfill (\bigstep \sc EMPTY-, \sc BLOCK,) \\
\frac{\conf s, \sigma; \smash \conf \sigma';}{\conf \monop\{! s \monop\}!, \sigma; \smash \conf \sigma';} & \hfill (\sc BIG,\sc STEP-,\sc BLOCK,) \\
\frac{\conf s, \sigma; \smash \conf \divzero e!;}{\conf \monop\{! s \monop\}!, \sigma; \smash \conf \divzero e!;}& \hfill \note\sc BIG,\sc STEP-,\sc BLOCK, \sc HALT,!\\
\frac
{\conf a, \sigma; \smash \conf i;}
{\conf x\monop=!a{\monop;!}, \sigma; \smash \conf \sigma[i/x];} 
& \hfill (\sc BIG,\sc STEP-,\sc ASGN,) \\
\frac
{\conf a, \sigma; \smash \conf \divzero e!;}
{\conf x\monop=!a{\monop;!}, \sigma; \smash \conf \divzero e!;} 
& \hfill \note \sc BIG,\sc STEP-,\sc ASGN, \sc HALT, ! \\
\frac
{\conf s_1, \sigma; \smash \conf \sigma_1; \quad \conf s_2, \sigma_1; \smash \conf \sigma_2;}
{\conf s_1  \ s_2, \sigma; \smash \conf \sigma_2;}
& \hfill (\sc BIG,\sc STEP-,\sc SEQ,) \\
\frac
{\conf s_1, \sigma; \smash \conf \divzero e!;}
{\conf s_1  \ s_2, \sigma; \smash \conf \divzero e!;}
& \hfill \note \sc BIG,\sc STEP-,\sc SEQ, \sc HALT,\sc 1,! \\
\frac
{\conf s_1, \sigma; \smash \conf \sigma_1; \quad \conf s_2, \sigma_1; \smash \conf \divzero e!;}
{\conf s_1  \ s_2, \sigma; \smash \conf \divzero e!;}
& \hfill \note \sc BIG,\sc STEP-,\sc SEQ, \sc HALT,\sc 2,! \\
\frac
{\conf b, \sigma; \smash \conf \true; \quad \conf s_1, \sigma; \smash \conf \sigma_1;}
{\conf \monop if!\, (b) \, s_1 \monop else!\, s_2, \sigma; \smash \conf \sigma_1;}
& \hfill (\sc BIG,\sc STEP-,\sc IF-, \sc TRUE,) \\
\frac
{\conf b, \sigma; \smash \conf \divzero e!;}
{\conf \monop if!\, (b) \, s_1 \monop else!\, s_2, \sigma; \smash \conf \divzero e!;}
& \hfill \note \sc BIG,\sc STEP-,\sc IF-, \sc TRUE, \sc HALT,\sc 1,! \\
\frac
{\conf b, \sigma; \smash \conf \true; \quad \conf s_1, \sigma; \smash \conf \divzero e!;}
{\conf \monop if!\, (b) \, s_1 \monop else!\, s_2, \sigma; \smash \conf \divzero e!;}
& \hfill \note \sc BIG,\sc STEP-,\sc IF-, \sc TRUE, \sc HALT,\sc 2,! \\
\frac
{\conf b, \sigma; \smash \conf \false; \quad \conf s_2, \sigma; \smash \conf \sigma_2;}
{\conf \monop if!\, (b) \, s_1 \monop else!\, s_2, \sigma; \smash \conf \sigma_2;}
& \hfill (\sc BIG,\sc STEP-,\sc IF-, \sc FALSE,) \\
\frac
{\conf b, \sigma; \smash \conf \false; \quad \conf s_2, \sigma; \smash \conf \divzero e!;}
{\conf \monop if!\, (b) \, s_1 \monop else!\, s_2, \sigma; \smash \conf \divzero e!;}
& \hfill \note \sc BIG,\sc STEP-,\sc IF-, \sc FALSE, \sc HALT,\sc 2,! \\
\frac
{\conf b, \sigma; \smash \conf \false;}
{\conf \monop while! \, (b) \, s , \sigma; \smash \conf \sigma;} 
& \hfill (\sc BIG,\sc STEP-,\sc WHILE-, \sc FALSE,) \\
\frac
{\conf b, \sigma; \smash \conf \divzero e!;}
{\conf \monop while! \, (b) \, s , \sigma; \smash \conf \divzero e!;} 
& \hfill \note \sc BIG,\sc STEP-,\sc WHILE-, \sc FALSE, \sc HALT,! \\
\frac
{\conf b, \sigma; \smash \conf \true; \quad \conf s \, \monop while!\, (b) \, s , \sigma; \smash \conf \sigma';}
{\conf \monop while! \, (b) \, s , \sigma; \smash \conf \sigma';}
& \hfill (\sc BIG,\sc STEP-,\sc WHILE-, \sc TRUE,) \\
\frac
{\conf b, \sigma; \smash \conf \divzero e!;}
{\conf \monop while! \, (b) \, s , \sigma; \smash \conf \divzero e!;}
& \hfill \note \sc BIG,\sc STEP-,\sc WHILE-, \sc TRUE, \sc HALT,\sc 1,! \\
\frac
{\conf b, \sigma; \smash \conf \true; \quad \conf s \, \monop while!\, (b) \, s , \sigma; \smash \conf \divzero e!;}
{\conf \monop while! \, (b) \, s , \sigma; \smash \conf \divzero e!;}
& \hfill \note \sc BIG,\sc STEP-,\sc WHILE-, \sc TRUE, \sc HALT,\sc 2,! \\
$$

### Small Step Semantics

$\divzero a_1 \mathop/ a_2, \sigma!$ is a configuration that capture the error information when dividing by zero. It says that the state before the division is $\sigma$, the numerator is $a_1$, and the denominator is $a_2$ which evaluates to $0$ that causes the problem.
$$
\saxiomrulepred x, \sigma/\sigma(x), \sigma/\sigma(x) \neq \bot/(\smallstep \sc LOOKUP,);\\
\sproprulemon a_1, \sigma/a_1', \sigma/a_1 \monop+! a_2, \sigma/a_1' \monop+! a_2 , \sigma/(\smallstep \sc ADD-, \sc ARG, \sc 1,); \\
\sproprulemon a_1, \sigma/\divzero e!/a_1 \monop+! a_2, \sigma/\divzero e!/(\smallstep \sc ADD-, \sc ARG, \sc 1-, \sc HALT,); \\
\sproprulemon a_2, \sigma/a_2', \sigma/a_1 \monop+! a_2, \sigma/a_1 \monop+! a'_2 , \sigma/(\smallstep \sc ADD-, \sc ARG, \sc 2,); \\
\sproprulemon a_2, \sigma/\divzero e!/a_1 \monop+! a_2, \sigma/\divzero e!/(\smallstep \sc ADD-, \sc ARG, \sc 2-, \sc HALT,); \\
\saxiomrule i_1 \monop+! i_2, \sigma/i_1 +\tsub Int; i_2, \sigma/(\smallstep \sc ADD,);
$$

$$
\sproprulemon a_1, \sigma/a_1', \sigma/a_1 \monop{/}! a_2, \sigma/a_1' \monop{/}! a_2 , \sigma/(\smallstep \sc DIV-, \sc ARG, \sc 1,); \\
\sproprulemon a_1, \sigma/\divzero e!/a_1 \monop{/}! a_2, \sigma/\divzero e!/(\smallstep \sc DIV-, \sc ARG, \sc 1-, \sc HALT,); \\
\sproprulemon a_2, \sigma/a_2', \sigma/a_1 \monop{/}! a_2, \sigma/a_1\monop{/}!a'_2 , \sigma/(\smallstep \sc DIV-, \sc ARG, \sc 2,); \\
\sproprulemon a_2, \sigma/\divzero e!/a_1 \monop{/}! a_2, \sigma/\divzero e!/(\smallstep \sc DIV-, \sc ARG, \sc 2-, \sc HALT,); \\
\saxiomrulepred i_1 \monop{/}! i_2, \sigma/i_1 \,{/}\tsub Int;\, i_2, \sigma/i_2 \neq 0/(\smallstep \sc DIV,); \\
\sproprulemon a_2, \sigma/0, \sigma/a_1 \monop{/}! a_2, \sigma/\divzero a_1 \mathop{/}a_2, \sigma!/(\smallstep \sc DIVZERO,); \\
$$

$$
\sproprulemon a_1, \sigma/a_1', \sigma/a_1 \monop<=! a_2, \sigma/a_1' \monop <=! a_2 , \sigma/(\smallstep \sc LEQ-, \sc ARG, \sc 1,); \\
\sproprulemon a_1, \sigma/\divzero e!/a_1 \monop<=! a_2, \sigma/\divzero e!/(\smallstep \sc LEQ-, \sc ARG, \sc 1-, \sc HALT,); \\
\sproprulemon a_2, \sigma/a_2', \sigma/a_1 \monop<=! a_2, \sigma/a_1 \monop<=! a_2 , \sigma/(\smallstep \sc LEQ-, \sc ARG, \sc 2,); \\
\sproprulemon a_2, \sigma/\divzero e!/a_1 \monop<=! a_2, \sigma/\divzero e!/(\smallstep \sc LEQ-, \sc ARG, \sc 2-, \sc HALT,); \\
\saxiomrule i_1 \monop{<=}! i_2, \sigma/i_1 \le\tsub Int; i_2, \sigma/(\smallstep \sc LEQ,);
$$

$$
\sproprulemon b, \sigma/ b', \sigma/\monop{!}! b, \sigma/ \monop{!}!b', \sigma/(\sc SMALL, \sc STEP-, \sc NOT-, \sc ARG,);\\
\sproprulemon b, \sigma/ \divzero e!/\monop{!}! b, \sigma/ \divzero e!/(\sc SMALL, \sc STEP-, \sc NOT-, \sc ARG, \sc HALT,);\\
\saxiomrule \monop{!}! \true, \sigma/ \false, \sigma/(\sc SMALL, \sc STEP-, \sc NOT-, \sc TRUE,);\\
\saxiomrule \monop{!}! \false, \sigma/ \true, \sigma/(\sc SMALL, \sc STEP-, \sc NOT-, \sc FALSE,);\\
\sproprulemon  b_1, \sigma/ b_1', \sigma/ b_1 \monop\&\&! b_2, \sigma/ b'_1 \monop\&\&! b_2, \sigma/ (\sc SMALL, \sc STEP-, \sc AND-, \sc ARG, \sc 1,);\\
\sproprulemon  b_1, \sigma/ \divzero e!/ b_1 \monop\&\&! b_2, \sigma/\divzero e!/ (\sc SMALL, \sc STEP-, \sc AND-, \sc ARG, \sc 1-, \sc HALT,);\\
\saxiomrule \false\monop\&\&!  b_2, \sigma/ \false, \sigma/(\sc SMALL, \sc STEP-, \sc AND-, \sc FALSE,);\\
\saxiomrule \true\monop\&\&!  b_2, \sigma/ b_2, \sigma/(\sc SMALL, \sc STEP-, \sc AND-, \sc TRUE,);\\
$$

$$
\saxiomrule \monop\{! s \monop\}!, \sigma / s, \sigma / (\sc SMALL, \sc STEP-, \sc BLOCK,); \\
\sproprulemon a, \sigma/a', \sigma/x\monop=! a {\monop;!}, \sigma/ x\monop=!a'{\monop;!}, \sigma/(\smallstep \sc ASGN-,\sc ARG, \sc 2,); \\
\sproprulemon a, \sigma/\divzero e!/x\monop=! a {\monop;!}, \sigma/ \divzero e!/(\smallstep \sc ASGN-,\sc ARG, \sc 2-, \sc HALT,); \\
\saxiomrulepred x \monop=!i{\texttt;}, \sigma /\monop\{\}!,{\sigma[i/x]}/\sigma(x)\neq \bot/(\smallstep \sc ASGN,); \\
\sproprulemon s_1, \sigma/s_1', \sigma/s_1 \ s_2, \sigma /s_1' \ s_2, \sigma/(\smallstep \sc SEQ-,\sc ARG, \sc 1,); \\
\sproprulemon s_1, \sigma/\divzero e!/s_1 \ s_2, \sigma /\divzero e!/(\smallstep \sc SEQ-,\sc ARG, \sc 1-, \sc HALT,); \\
\saxiomrule \monop\{\}!\ s_2/s_2, \sigma/ (\smallstep \sc SEQ-, \sc EMPTY-, \sc BLOCK,);
$$


$$
\sproprulemon b, \sigma/b', \sigma/ \monop if!\, (b) \, s_1 \monop else! \, s_2 , \sigma / \monop if!\, (b')\, s_1 \monop else! \, s_2, \sigma / (\smallstep \sc IF-, \sc ARG, \sc 1,); \\
\sproprulemon b, \sigma/\divzero e!/ \monop if!\, (b) \, s_1 \monop else! \, s_2 , \sigma / \divzero e! / (\smallstep \sc IF-, \sc ARG, \sc 1-, \sc HALT,); \\
\saxiomrule \texttt{if}\, \texttt{(true)}\, s_1 \monop else! s_2, \sigma/s_1, \sigma/(\smallstep \sc IF-, \sc TRUE,); \\
\saxiomrule \texttt{if}\, \texttt{(false)}\, s_1 \monop else! s_2, \sigma/s_2, \sigma/(\smallstep \sc IF-, \sc FALSE,); \\
\saxiomrule \monop while! \monop(!\! b \!\monop)!s, \sigma /\monop if!\monop(!\! b\!\monop)! \monop\{! s \monop while! \monop(!\! b \!\monop)!s \monop\}! \monop else! \monop\{\}!, \sigma/(\smallstep \sc WHILE,); \\
\saxiomrule \monop int! xl\!\monop;! s/s, xl \mapsto 0/ (\smallstep\sc VAR,);
$$

## 2   Increment Construct

It’s assumed that the **operator priority has already been taken care of by lexer and parser**, so semantics will not bother considering the priority of operators.

### BNF

```pseudocode
Int   ::= the domain of integers with integer operations
Bool  ::= the domain of booleans
Id    ::= standard identifiers
AExp  ::= Int
        | Id
        | ++ Id                           <-- Added Semantics
        | AExp + AExp
        | AExp / AExp
BExp  ::= Bool
        | AExp <= AExp
        | ! BExp
        | BExp && BExp
Block ::= { }
        | { Stmt }
Stmt  ::= Block
        | Id = AExp ;
        | Stmt Stmt
        | if ( BExp ) Block else Block;
        | while ( BExp ) Block;
Pgm   ::= int List{Id} ; Stmt
```

### Big Step Semantics

The biggest problem is that previously we treat arithmetic and boolean operation *pure*, so the operation only yield a integer or boolean result without state. To add the increment semantics, we must also include the updated states in the boolean and arithmetic operations. 

Also, since the increment semantic is *impure*, if we want our semantic **consistent**, we have to enforce a **strict sequential order** for all binary operations that are previously non-deterministic. Otherwise the code like `(++x) + x` might yield different result if follow different derivation tree. We could choose the order **from left to right**. (Technically, you cannot really enforce an order in big step semantics, the trick here is to make the right operand evaluation uses the updated state from the evaluation results of left operand)
$$
\axiomrulepred x, \sigma/ \sigma(x), \sigma/ \sigma(x) \neq \bot/ (\bigstep \sc LOOKUP,); \\
\proprulebin a_1, \sigma/ i_1, \sigma_1/ a_2, \sigma_1/ i_2, \sigma_2/a_1 \monop+! a_2, \sigma/ i_1 +\tub Int.. i_2, \sigma_2/ (\bigstep \sc ADD,); \\
\proprulebinpred a_1, \sigma/ i_1, \sigma_1/ a_2, \sigma_1/ i_2, \sigma_2/a_1 \monop{/}! a_2, \sigma/ i_1 \mathop{/}\tub Int.. i_2, \sigma_2/ i_2 \neq 0/(\bigstep \sc DIV,); \\
\proprulemonpred x, \sigma/i , \sigma_1/\monop ++! x, \sigma/i + \tsub Int; 1, \sigma_1[i+\tsub Int;1{/}x]/\sigma_1(x) \neq \bot/(\bigstep \sc INCREMENT,);
$$

$$
\proprulebin a_1, \sigma/ i_1, \sigma_1/ a_2, \sigma_1/ i_2, \sigma_2/a_1 \mathbin{\texttt{<=}}\, a_2, \sigma/ i_1 \le\tub Int.. i_2, \sigma_2/ (\bigstep \sc LEQ,); \\
\proprulemon b, \sigma/\true, \sigma_1/\monop{!}! b, \sigma /\false, \sigma_1/ (\bigstep \sc NOT-, \sc TRUE,); \\
\proprulemon b, \sigma/\false, \sigma_1/\monop{!}! b, \sigma /\true, \sigma_1/ (\bigstep \sc NOT-, \sc FALSE,); \\
\proprulemon b_1, \sigma/\false, \sigma_1/ b_1 \monop\&\&! b_2, \sigma /\false, \sigma_1/ (\bigstep \sc AND-, \sc FALSE,); \\
\proprulebin b_1, \sigma/\true, \sigma_1/b_2, \sigma_1/t, \sigma_2/b_1 \monop\&\&! b_2, \sigma/t, \sigma_2/ (\bigstep \sc AND-, \sc TRUE,);\\
$$

$$
\axiomrule \texttt\{ \texttt\}, \sigma/\sigma / (\bigstep \sc EMPTY-, \sc BLOCK,); \\
\proprulemon s, \sigma/ \sigma_1/\monop\{! s \monop\}!, \sigma/\sigma_1/ (\bigstep \sc BLOCK,); \\
\proprulemonpred a, \sigma/ i, \sigma_1/x \monop=! a\!\monop;!, \sigma/\sigma_1[i{/}x]/ \sigma_1(x) \neq \bot/(\bigstep \sc ASGN,); \\
\proprulebin s_1, \sigma/\sigma_1/s_2 , \sigma_1/\sigma_2/s_1 \ s_2, \sigma/ \sigma_2/(\bigstep \sc SEQ,);\\
\proprulebin b, \sigma/\true, \sigma_1/ s_1, \sigma_1/\sigma_2/\texttt{if}\,\texttt{(} b\texttt) \, s_1 \monop else! s_2, \sigma/\sigma_2/(\bigstep\sc IF-, \sc TRUE,); \\
\proprulebin b, \sigma/\false, \sigma_1/ s_2, \sigma_1/\sigma_2/\texttt{if}\,\texttt{(} b\texttt) \, s_1 \monop else! s_2, \sigma/\sigma_2/(\bigstep\sc IF-, \sc FALSE,); \\
\proprulemon b, \sigma/\false, \sigma_1/\texttt{while}\,\texttt( b \texttt) \, s , \sigma /\sigma_1/(\bigstep \sc WHILE-, \sc FALSE,);\\
\proprulebin b, \sigma/\true, \sigma_1/s \, \texttt{while} \,\texttt( b\texttt) \, s, \sigma_1 /\sigma_2/\texttt{while}\,\texttt( b \texttt) \, s , \sigma /\sigma_2/(\bigstep \sc WHILE-, \sc TRUE,);
$$

Simply put, we just enforce the sequential order, include the state change, add one new rule. Technically, the premises in the increment rule could simply be $\conf x, \sigma; \smash \conf i, \sigma;$, as the rule that could apply here is variable lookup, and that doesn’t change the state.

### Type Systems

Type system only concerns about the type of variables. In this case, increment an integer still results an integer, and there aren’t new information to store. Therefore, we only need one new rule:
$$
{\def\int{\text{int}}}
\frac{xl \vdash a : \int}{ xl \vdash \monop ++! a : \int} \quad (\sc BIG, \sc STEP, \sc TYPE, \sc SYSTEM-, \sc INCREMENT,)
$$

### Small Step Semantics

Like Big Step Semantics, we have to enforce strict sequential order and update the states.
$$
\saxiomrulepred x, \sigma/\sigma(x), \sigma/\sigma(x) \neq \bot/(\smallstep \sc LOOKUP,);\\
\sproprulemon a_1, \sigma/a_1', \sigma_1/a_1 \monop+! a_2, \sigma/a_1' \monop+! a_2 , \sigma_1/(\smallstep \sc ADD-, \sc ARG, \sc 1,); \\
\sproprulemon a_2, \sigma/a_2', \sigma_1/i_1 \monop+! a_2, \sigma/i_1 \monop+! a'_2 , \sigma_1/(\smallstep \sc ADD-, \sc ARG, \sc 2,); \\
\saxiomrule i_1 \monop+! i_2, \sigma/i_1 +\tsub Int; i_2, \sigma/(\smallstep \sc ADD,);
$$

$$
\sproprulemon a_1, \sigma/a_1', \sigma_1/a_1 \monop{/}! a_2, \sigma/a_1' \monop{/}! a_2 , \sigma_1/(\smallstep \sc DIV-, \sc ARG, \sc 1,); \\
\sproprulemon a_2, \sigma/a_2', \sigma_1/i_1 \monop{/}! a_2, \sigma/i_1\monop{/}!a'_2 , \sigma_1/(\smallstep \sc DIV-, \sc ARG, \sc 2,); \\
\saxiomrulepred i_1 \monop{/}! i_2, \sigma/i_1 \,{/}\tsub Int;\, i_2, \sigma/i_2 \neq 0/(\smallstep \sc DIV,);
$$

$$
\sproprulemonpred x, \sigma/i, \sigma_1/\monop++! x, \sigma/i +\tsub Int; 1 , \sigma_1[i+\tsub Int; 1{/}x]/ \sigma_1(x) \neq \bot/(\smallstep \sc INCREMENT,); \\
$$

$$
\sproprulemon a_1, \sigma/a_1', \sigma_1/a_1 \monop<=! a_2, \sigma/a_1' \monop <=! a_2 , \sigma_1/(\smallstep \sc LEQ-, \sc ARG, \sc 1,); \\
\sproprulemon a_2, \sigma/a_2', \sigma_1/i_1 \monop<=! a_2, \sigma/i_1 \monop<=! a_2 , \sigma_1/(\smallstep \sc LEQ-, \sc ARG, \sc 2,); \\
\saxiomrule i_1 \monop{<=}! i_2, \sigma/i_1 \le\tsub Int; i_2, \sigma/(\smallstep \sc LEQ,);
$$

$$
\sproprulemon b, \sigma/ b', \sigma_1/\monop{!}! b, \sigma/ \monop{!}!b', \sigma_1/(\sc SMALL, \sc STEP-, \sc NOT-, \sc ARG,);\\
\saxiomrule \monop{!}! \true, \sigma/ \false, \sigma/(\sc SMALL, \sc STEP-, \sc NOT-, \sc TRUE,);\\
\saxiomrule \monop{!}! \false, \sigma/ \true, \sigma/(\sc SMALL, \sc STEP-, \sc NOT-, \sc FALSE,);\\
\sproprulemon  b_1, \sigma/ b_1', \sigma_1/ b_1 \monop\&\&! b_2, \sigma/ b'_1 \monop\&\&! b_2, \sigma_1/ (\sc SMALL, \sc STEP-, \sc AND-, \sc ARG, \sc 1,);\\
\saxiomrule \false\monop\&\&!  b_2, \sigma/ \false, \sigma/(\sc SMALL, \sc STEP-, \sc AND-, \sc FALSE,);\\
\saxiomrule \true\monop\&\&!  b_2, \sigma/ b_2, \sigma/(\sc SMALL, \sc STEP-, \sc AND-, \sc TRUE,);\\
$$

$$
\saxiomrule \monop\{! s \monop\}!, \sigma / s, \sigma / (\sc SMALL, \sc STEP-, \sc BLOCK,); \\
\sproprulemon a, \sigma/a', \sigma_1/x\monop=! a {\monop;!}, \sigma/ x\monop=!a'{\monop;!}, \sigma_1/(\smallstep \sc ASGN-,\sc ARG, \sc 2,); \\
\saxiomrulepred x \monop=!i{\texttt;}, \sigma /\monop\{\}!,{\sigma[i/x]}/\sigma(x)\neq \bot/(\smallstep \sc ASGN,); \\
\sproprulemon s_1, \sigma/s_1', \sigma_1/s_1 \ s_2, \sigma /s_1' \ s_2, \sigma_1/(\smallstep \sc SEQ-,\sc ARG, \sc 1,); \\
\saxiomrule \monop\{\}!\ s_2/s_2, \sigma/ (\smallstep \sc SEQ-, \sc EMPTY-, \sc BLOCK,);
$$

$$
\sproprulemon b, \sigma/b', \sigma_1/ \monop if!\, (b) \, s_1 \monop else! \, s_2 , \sigma / \monop if!\, (b')\, s_1 \monop else! \, s_2, \sigma_1 / (\smallstep \sc IF-, \sc ARG, \sc 1,); \\
\saxiomrule \texttt{if}\, \texttt{(true)}\, s_1 \monop else! s_2, \sigma/s_1, \sigma/(\smallstep \sc IF-, \sc TRUE,); \\
\saxiomrule \texttt{if}\, \texttt{(false)}\, s_1 \monop else! s_2, \sigma/s_2, \sigma/(\smallstep \sc IF-, \sc FALSE,); \\
\saxiomrule \monop while! \monop(!\! b \!\monop)!s, \sigma /\monop if!\monop(!\! b\!\monop)! \monop\{! s \monop while! \monop(!\! b \!\monop)!s \monop\}! \monop else! \monop\{\}!, \sigma/(\smallstep \sc WHILE,); \\
\saxiomrule \monop int! xl\!\monop;! s/s, xl \mapsto 0/ (\smallstep\sc VAR,);
$$

Similarly, the premises in the increment rule could simply be $\conf x, \sigma; \to\conf i, \sigma;$, as the rule that could apply here is variable lookup, and that doesn’t change the state.

## 3   IO Construct

### BNF

```pseudocode
Int   ::= the domain of integers with integer operations
Bool  ::= the domain of booleans
Id    ::= standard identifiers
AExp  ::= Int
        | Id
        | read()                          <-- Added Semantics
        | AExp + AExp
        | AExp / AExp
BExp  ::= Bool
        | AExp <= AExp
        | ! BExp
        | BExp && BExp
Block ::= { }
        | { Stmt }
Stmt  ::= Block
        | Id = AExp ;
        | Stmt Stmt
        | print ( AExp )                  <-- Added Semantics
        | if ( BExp ) Block else Block;
        | while ( BExp ) Block;
Pgm   ::= int List{Id} ; Stmt
```

### Big Step Semantics

We see that the `read()` and `print(AExp)` is *impure* here, but it is only *impure* in a sense that it changes the outside system’s state, but not the $\sigma$ inside the language. So, we don’t need to include state in the arithmetic and boolean operations. We do, however, need to enforce **strict sequential order** as they are *impure*. To enforce the sequential order of outside system’s state, **introduce a system state** $\gamma$. There are two operations on system state. $\gamma(\leftarrow)$ which takes an integer string in and change the system state (equivalent to taking input from `stdin`), and $\gamma(\to)$ which puts an integer and change the system state (equivalent to putting output to `stdout`). For sake of simplicity, let’s assume the system operation always work.
$$
\axiomrulepred x, \sigma, \gamma/ \sigma(x), \gamma/ \sigma(x) \neq \bot/ (\bigstep \sc LOOKUP,); \\
\proprulebin a_1, \sigma, \gamma/ i_1, \gamma_1/ a_2, \sigma, \gamma_1/ i_2, \gamma_2/a_1 \monop+! a_2, \sigma, \gamma/ i_1 +\tub Int.. i_2, \sigma, \gamma_2/ (\bigstep \sc ADD,); \\
\proprulebinpred a_1, \sigma, \gamma/ i_1, \gamma_1/ a_2, \sigma, \gamma_1/ i_2, \gamma_2/a_1 \monop{/}! a_2, \sigma, \gamma/ i_1 \mathop{/}\tub Int.. i_2, \gamma_2/ i_2 \neq 0/(\bigstep \sc DIV,); \\
$$

$$
\axiomrule \monop read()!, \sigma, \gamma/ i, \gamma(\leftarrow)/ (\bigstep \sc READ,); \\
\proprulemon a, \sigma, \gamma/i, \gamma_1/\texttt {print} \, \texttt( a \texttt), \sigma, \gamma/\sigma, \gamma_1(\to)/(\bigstep \sc PRINT,);
$$

$$
\proprulebin a_1, \sigma, \gamma/ i_1,  \gamma_1/ a_2, \sigma, \gamma_1/ i_2,  \gamma_2/a_1 \mathbin{\texttt{<=}}\, a_2, \sigma, \gamma/ i_1 \le\tub Int.. i_2, \gamma_2/ (\bigstep \sc LEQ,); \\
\proprulemon b, \sigma, \gamma/\true,  \gamma_1/\monop{!}! b, \sigma, \gamma /\false, \gamma _1/ (\bigstep \sc NOT-, \sc TRUE,); \\
\proprulemon b, \sigma, \gamma/\false, \gamma_1/\monop{!}! b, \sigma, \gamma /\true, \gamma _1/ (\bigstep \sc NOT-, \sc FALSE,); \\
\proprulemon b_1, \sigma, \gamma/\false,\gamma_1/ b_1 \monop\&\&! b_2, \sigma /\false, \gamma_1/ (\bigstep \sc AND-, \sc FALSE,); \\
\proprulebin b_1, \sigma, \gamma/\true, \gamma_1/b_2, \sigma, \gamma_1/t, \gamma_2/b_1 \monop\&\&! b_2, \sigma, \gamma/t, \gamma_2/ (\bigstep \sc AND-, \sc TRUE,);\\
$$

$$
\axiomrule \texttt\{ \texttt\}, \sigma, \gamma/\sigma, \gamma / (\bigstep \sc EMPTY-, \sc BLOCK,); \\
\proprulemon s, \sigma, \gamma/ \sigma_1, \gamma_1/\monop\{! s \monop\}!, \sigma, \gamma/\sigma_1, \gamma_1/ (\bigstep \sc BLOCK,); \\
\proprulemonpred a, \sigma, \gamma/ i, \sigma, \gamma_1/x \monop=! a\!\monop;!, \sigma, \gamma/\sigma[i{/}x], \gamma_1/ \sigma(x) \neq \bot/(\bigstep \sc ASGN,); \\
\proprulebin s_1, \sigma, \gamma/\sigma_1, \gamma_1/s_2 , \sigma_1, \gamma_1/\sigma_2, \gamma_2/s_1 \ s_2, \sigma, \gamma/ \sigma_2, \gamma_2/(\bigstep \sc SEQ,);\\
\proprulebin b, \sigma, \gamma/\true, \gamma_1/ s_1, \sigma, \gamma_1/\sigma_1, \gamma_2/\texttt{if}\,\texttt{(} b\texttt) \, s_1 \monop else! s_2, \sigma, \gamma/\sigma_1, \gamma_2/(\bigstep\sc IF-, \sc TRUE,); \\
\proprulebin b, \sigma, \gamma/\false, \gamma_1/ s_2, \sigma, \gamma_1/\sigma_2, \gamma_2/\texttt{if}\,\texttt{(} b\texttt) \, s_1 \monop else! s_2, \sigma, \gamma/\sigma_2, \gamma_2/(\bigstep\sc IF-, \sc FALSE,); \\
\proprulemon b, \sigma, \gamma/\false, \gamma_1/\texttt{while}\,\texttt( b \texttt) \, s , \sigma, \gamma /\sigma, \gamma_1/(\bigstep \sc WHILE-, \sc FALSE,);\\
\proprulebin b, \sigma, \gamma/\true, \gamma_1/s \, \texttt{while} \,\texttt( b\texttt) \, s, \sigma, \gamma_1 /\sigma_1, \gamma_2/\texttt{while}\,\texttt( b \texttt) \, s , \sigma, \gamma/\sigma_1, \gamma_2/(\bigstep \sc WHILE-, \sc TRUE,);
$$

### Type Systems

$$
{\def\stmt{\text{stmt}}}
xl \vdash \monop read()! : \int & \hfill (\sc BIG, \sc STEP, \sc TYPE, \sc SYSTEM-, \sc READ,)\\
\frac{xl \vdash a : \int}{ xl \vdash \monop print! \texttt( a \texttt): \stmt} & \hfill (\sc BIG, \sc STEP, \sc TYPE, \sc SYSTEM-, \sc PRINT,)
$$

### Small Step Semantics

Like Big Step Semantics, we have to enforce strict sequential order, but we could prevent using $\gamma$, as we could enforce the order directly.
$$
\saxiomrulepred x, \sigma/\sigma(x), \sigma/\sigma(x) \neq \bot/(\smallstep \sc LOOKUP,);\\
\sproprulemon a_1, \sigma/a_1', \sigma/a_1 \monop+! a_2, \sigma/a_1' \monop+! a_2 , \sigma/(\smallstep \sc ADD-, \sc ARG, \sc 1,); \\
\sproprulemon a_2, \sigma/a_2', \sigma/i_1 \monop+! a_2, \sigma/i_1 \monop+! a'_2 , \sigma/(\smallstep \sc ADD-, \sc ARG, \sc 2,); \\
\saxiomrule i_1 \monop+! i_2, \sigma/i_1 +\tsub Int; i_2, \sigma/(\smallstep \sc ADD,);
$$

$$
\saxiomrule \monop read()!, \sigma /i, \sigma/(\smallstep \sc READ,);\\
\sproprulemon a, \sigma/i, \sigma/ \monop print! \texttt( a \texttt), \sigma/\texttt\{ \texttt\}, \sigma/(\smallstep \sc PRINT,);
$$

$$
\sproprulemon a_1, \sigma/a_1', \sigma/a_1 \monop{/}! a_2, \sigma/a_1' \monop{/}! a_2 , \sigma/(\smallstep \sc DIV-, \sc ARG, \sc 1,); \\
\sproprulemon a_2, \sigma/a_2', \sigma/i_1 \monop{/}! a_2, \sigma/i_1\monop{/}!a'_2 , \sigma/(\smallstep \sc DIV-, \sc ARG, \sc 2,); \\
\saxiomrulepred i_1 \monop{/}! i_2, \sigma/i_1 \,{/}\tsub Int;\, i_2, \sigma/i_2 \neq 0/(\smallstep \sc DIV,);
$$

$$
\sproprulemon a_1, \sigma/a_1', \sigma/a_1 \monop<=! a_2, \sigma/a_1' \monop <=! a_2 , \sigma/(\smallstep \sc LEQ-, \sc ARG, \sc 1,); \\
\sproprulemon a_2, \sigma/a_2', \sigma/i_1 \monop<=! a_2, \sigma/i_1 \monop<=! a_2 , \sigma/(\smallstep \sc LEQ-, \sc ARG, \sc 2,); \\
\saxiomrulepred i_1 \monop{<=}! i_2, \sigma/i_1 \le\tsub Int; i_2, \sigma/i_2 \neq 0/(\smallstep \sc LEQ,);
$$

$$
\sproprulemon b, \sigma/ b', \sigma/\monop{!}! b, \sigma/ \monop{!}!b', \sigma/(\sc SMALL, \sc STEP-, \sc NOT-, \sc ARG,);\\
\saxiomrule \monop{!}! \true, \sigma/ \false, \sigma/(\sc SMALL, \sc STEP-, \sc NOT-, \sc TRUE,);\\
\saxiomrule \monop{!}! \false, \sigma/ \true, \sigma/(\sc SMALL, \sc STEP-, \sc NOT-, \sc FALSE,);\\
\sproprulemon  b_1, \sigma/ b_1', \sigma/ b_1 \monop\&\&! b_2, \sigma/ b'_1 \monop\&\&! b_2, \sigma/ (\sc SMALL, \sc STEP-, \sc AND-, \sc ARG, \sc 1,);\\
\saxiomrule \false\monop\&\&!  b_2, \sigma/ \false, \sigma/(\sc SMALL, \sc STEP-, \sc AND-, \sc FALSE,);\\
\saxiomrule \true\monop\&\&!  b_2, \sigma/ b_2, \sigma/(\sc SMALL, \sc STEP-, \sc AND-, \sc TRUE,);\\
$$

$$
\saxiomrule \monop\{! s \monop\}!, \sigma / s, \sigma / (\sc SMALL, \sc STEP-, \sc BLOCK,); \\
\sproprulemon a, \sigma/a', \sigma/x\monop=! a {\monop;!}, \sigma/ x\monop=!a'{\monop;!}, \sigma/(\smallstep \sc ASGN-,\sc ARG, \sc 2,); \\
\saxiomrulepred x \monop=!i{\texttt;}, \sigma /\monop\{\}!,{\sigma[i/x]}/\sigma(x)\neq \bot/(\smallstep \sc ASGN,); \\
\sproprulemon s_1, \sigma/s_1', \sigma/s_1 \ s_2, \sigma /s_1' \ s_2, \sigma/(\smallstep \sc SEQ-,\sc ARG, \sc 1,); \\
\saxiomrule \monop\{\}!\ s_2/s_2, \sigma/ (\smallstep \sc SEQ-, \sc EMPTY-, \sc BLOCK,);
$$

$$
\sproprulemon b, \sigma/b', \sigma/ \monop if!\, (b) \, s_1 \monop else! \, s_2 , \sigma / \monop if!\, (b')\, s_1 \monop else! \, s_2, \sigma / (\smallstep \sc IF-, \sc ARG, \sc 1,); \\
\saxiomrule \texttt{if}\, \texttt{(true)}\, s_1 \monop else! s_2, \sigma/s_1, \sigma/(\smallstep \sc IF-, \sc TRUE,); \\
\saxiomrule \texttt{if}\, \texttt{(false)}\, s_1 \monop else! s_2, \sigma/s_2, \sigma/(\smallstep \sc IF-, \sc FALSE,); \\
\saxiomrule \monop while! \monop(!\! b \!\monop)!s, \sigma /\monop if!\monop(!\! b\!\monop)! \monop\{! s \monop while! \monop(!\! b \!\monop)!s \monop\}! \monop else! \monop\{\}!, \sigma/(\smallstep \sc WHILE,); \\
\saxiomrule \monop int! xl\!\monop;! s/s, xl \mapsto 0/ (\smallstep\sc VAR,);
$$

## 4   All Together

It’s very disgusting. (First time my interactive latex editor has temporarily frozened!) The general idea is pretty straightforward. For big step semantics, add the states and add the halt case. For small semantics, add the evaluation order and add the halt case. They are pretty hard to work with, as adding one new feature usually requires changes all the rules more or less, and sometimes need to duplicate rules two times or three times to propagate the errors / information. Small step semantics seems easier to work with, as it’s more granular by design.

### Big Step Semantics

$$
\axiomrulepred x, \sigma, \gamma/ \sigma(x), \sigma, \gamma/ \sigma(x) \neq \bot/ (\bigstep \sc LOOKUP,); \\
\proprulebin a_1, \sigma, \gamma/ i_1, \sigma_1, \gamma_1/ a_2, \sigma_1, \gamma_1/ i_2, \sigma_2, \gamma_2/a_1 \monop+! a_2, \sigma/ i_1 +\tub Int.. i_2, \sigma_2, \gamma_2/ (\bigstep \sc ADD,); \\
\proprulemon a_1, \sigma, \gamma/ \divzero e!/a_1 \monop+! a_2, \sigma/ \divzero e!/ \note \bigstep \sc ADD, \sc HALT, \sc 1,!; \\
\proprulebin a_1, \sigma, \gamma/ i_1, \sigma_1, \gamma_1/ a_2, \sigma_1, \gamma_1/ \divzero e!/a_1 \monop+! a_2, \sigma/ \divzero e!/ \note \bigstep \sc ADD, \sc HALT, \sc 2,!; \\
$$

$$
\proprulebinpred a_1, \sigma, \gamma/ i_1, \sigma_1, \gamma_1/ a_2, \sigma_1, \gamma_1/ i_2, \sigma_2, \gamma_2/a_1 \monop{/}! a_2, \sigma, \gamma/ i_1 \mathop{/}\tub Int.. i_2, \sigma_2, \gamma_2/ i_2 \neq 0/(\bigstep \sc DIV,); \\
\proprulemonpred a_1, \sigma, \gamma/ \divzero e!/a_1 \monop{/}! a_2, \sigma, \gamma/ \divzero e!/ i_2 \neq 0/(\bigstep \sc DIV, \sc HALT, \sc 1,); \\
\proprulebinpred a_1, \sigma, \gamma/ i_1, \sigma_1, \gamma_1/ a_2, \sigma_1, \gamma_1/ \divzero e!/a_1 \monop{/}! a_2, \sigma, \gamma/ \divzero e!/ i_2 \neq 0/(\bigstep \sc DIV,  \sc HALT, \sc 2,); \\
\frac{\conf a_1, \sigma, \gamma; \smash \conf i_1, \sigma_1, \gamma_1; \quad \conf a_2, \sigma_1 , \gamma_1; \smash \conf 0, \sigma_2, \gamma_2;}{\conf a_1 \monop/! a_2, \sigma; \smash \conf \divzero (a_1 \smash i_1) \mathop/ a_2, \sigma_2!;} & \hfill \note \bigstep \sc DIVZERO,! \\
$$

$$
\proprulemonpred x, \sigma, \gamma/i , \sigma_1, \gamma_1/\monop ++! x, \sigma, \gamma/i + \tsub Int; 1, \sigma_1[i+\tsub Int;1{/}x], \gamma_1/\sigma_1(x) \neq \bot/(\bigstep \sc INCREMENT,); \\
$$

$$
\axiomrule \monop read()!, \sigma, \gamma/ i, \sigma,  \gamma(\leftarrow)/ (\bigstep \sc READ,); \\
\proprulemon a, \sigma, \gamma/i, \sigma_1, \gamma_1/\texttt {print} \, \texttt( a \texttt), \sigma, \gamma/\sigma_1, \gamma_1(\to)/(\bigstep \sc PRINT,); \\
\proprulemon a, \sigma, \gamma/\divzero e!/\texttt {print} \, \texttt( a \texttt), \sigma, \gamma/\divzero e!/(\bigstep \sc PRINT, \sc HALT,);
$$

$$
\proprulebin a_1, \sigma, \gamma/ i_1, \sigma_1,  \gamma_1/ a_2, \sigma_1, \gamma_1/ i_2, \sigma_2,  \gamma_2/a_1 \mathbin{\texttt{<=}}\, a_2, \sigma, \gamma/ i_1 \le\tub Int.. i_2, \sigma_2, \gamma_2/ (\bigstep \sc LEQ,); \\
\proprulemon a_1, \sigma, \gamma/ \divzero e!/a_1 \mathbin{\texttt{<=}}\, a_2, \sigma, \gamma/ \divzero e!/ (\bigstep \sc LEQ, \sc HALT, \sc 1,); \\
\proprulebin a_1, \sigma, \gamma/ i_1, \sigma_1,  \gamma_1/ a_2, \sigma_1, \gamma_1/ \divzero e!/a_1 \mathbin{\texttt{<=}}\, a_2, \sigma, \gamma/ \divzero e!/ (\bigstep \sc LEQ, \sc HALT, \sc 2,); \\
\proprulemon b, \sigma, \gamma/\true,  \sigma_1, \gamma_1/\monop{!}! b, \sigma, \gamma /\false, \sigma_1, \gamma_1/ (\bigstep \sc NOT-, \sc TRUE,); \\
\proprulemon b, \sigma, \gamma/\divzero e!/\monop{!}! b, \sigma, \gamma /\divzero e!/ (\bigstep \sc NOT-, \sc TRUE, \sc HALT,); \\
\proprulemon b, \sigma, \gamma/\false, \sigma_1, \gamma_1/\monop{!}! b, \sigma, \gamma /\true, \sigma_1, \gamma_1/ (\bigstep \sc NOT-, \sc FALSE,); \\
\proprulemon b_1, \sigma, \gamma/\divzero e!/ b_1 \monop\&\&! b_2, \sigma /\divzero e!/ (\bigstep \sc AND-, \sc FALSE, \sc HALT,); \\
\proprulebin b_1, \sigma, \gamma/\true, \sigma_1,  \gamma_1/b_2, \sigma_1, \gamma_1/t, \sigma_2, \gamma_2/b_1 \monop\&\&! b_2, \sigma, \gamma/t, \sigma_2, \gamma_2/ (\bigstep \sc AND-, \sc TRUE,);\\
\proprulemon b_1, \sigma, \gamma/\divzero e!/b_1 \monop\&\&! b_2, \sigma, \gamma/\divzero e!/ (\bigstep \sc AND-, \sc TRUE, \sc HALT, \sc 1,);\\
\proprulebin b_1, \sigma, \gamma/\true, \sigma_1,  \gamma_1/b_2, \sigma_1, \gamma_1/\divzero e!/b_1 \monop\&\&! b_2, \sigma, \gamma/\divzero e!/ (\bigstep \sc AND-, \sc TRUE, \sc HALT, \sc 2,);\\
$$

$$
\axiomrule \texttt\{ \texttt\}, \sigma, \gamma/\sigma, \gamma / (\bigstep \sc EMPTY-, \sc BLOCK,); \\
\proprulemon s, \sigma, \gamma/ \sigma_1, \gamma_1/\monop\{! s \monop\}!, \sigma, \gamma/\sigma_1, \gamma_1/ (\bigstep \sc BLOCK,); \\
\proprulemon s, \sigma, \gamma/ \divzero e!/\monop\{! s \monop\}!, \sigma, \gamma/\divzero e!/ (\bigstep \sc BLOCK, \sc HALT,); \\
\proprulemonpred a, \sigma, \gamma/ i, \sigma_1, \gamma_1/x \monop=! a\!\monop;!, \sigma, \gamma/\sigma_1[i{/}x], \gamma_1/ \sigma_1(x) \neq \bot/(\bigstep \sc ASGN,); \\
\proprulemonpred a, \sigma, \gamma/ \divzero e!/x \monop=! a\!\monop;!, \sigma, \gamma/\divzero e!/ \sigma_1(x) \neq \bot/(\bigstep \sc ASGN, \sc HALT,); \\
\proprulebin s_1, \sigma, \gamma/\sigma_1, \gamma_1/s_2 , \sigma_1, \gamma_1/\sigma_2, \gamma_2/s_1 \ s_2, \sigma, \gamma/ \sigma_2, \gamma_2/(\bigstep \sc SEQ,);\\
\proprulemon s_1, \sigma, \gamma/\divzero e!/s_1 \ s_2, \sigma, \gamma/ \divzero e!/(\bigstep \sc SEQ, \sc HALT, \sc 1,);\\
\proprulebin s_1, \sigma, \gamma/\sigma_1, \gamma_1/s_2 , \sigma_1, \gamma_1/\divzero e!/s_1 \ s_2, \sigma, \gamma/ \divzero e!/(\bigstep \sc SEQ, \sc HALT, \sc 2,);\\
$$

$$
\proprulebin b, \sigma, \gamma/\true, \sigma_1, \gamma_1/ s_1, \sigma_1, \gamma_1/\sigma_2, \gamma_2/\texttt{if}\,\texttt{(} b\texttt) \, s_1 \monop else! s_2, \sigma, \gamma/\sigma_2, \gamma_2/(\bigstep\sc IF-, \sc TRUE,); \\
\proprulemon b, \sigma, \gamma/\divzero e!/\texttt{if}\,\texttt{(} b\texttt) \, s_1 \monop else! s_2, \sigma, \gamma/\divzero e!/(\bigstep\sc IF-, \sc TRUE, \sc HALT, \sc 1,); \\
\proprulebin b, \sigma, \gamma/\true, \sigma_1, \gamma_1/ s_1, \sigma_1, \gamma_1/\divzero e!/\texttt{if}\,\texttt{(} b\texttt) \, s_1 \monop else! s_2, \sigma, \gamma/\divzero e!/(\bigstep\sc IF-, \sc TRUE, \sc HALT, \sc 2,); \\
\proprulebin b, \sigma, \gamma/\false, \sigma_1, \gamma_1/ s_2, \sigma_1, \gamma_1/\sigma_2, \gamma_2/\texttt{if}\,\texttt{(} b\texttt) \, s_1 \monop else! s_2, \sigma, \gamma/\sigma_2, \gamma_2/(\bigstep\sc IF-, \sc FALSE,); \\
\proprulebin b, \sigma, \gamma/\false, \sigma_1, \gamma_1/ s_1, \sigma_1, \gamma_1/\divzero e!/\texttt{if}\,\texttt{(} b\texttt) \, s_1 \monop else! s_2, \sigma, \gamma/\divzero e!/(\bigstep\sc IF-, \sc FALSE, \sc HALT, \sc 2,); \\
\proprulemon b, \sigma, \gamma/\false, \sigma_1, \gamma_1/\texttt{while}\,\texttt( b \texttt) \, s , \sigma, \gamma /\sigma_1, \gamma_1/(\bigstep \sc WHILE-, \sc FALSE,);\\
\proprulemon b, \sigma, \gamma/\divzero e!/\texttt{while}\,\texttt( b \texttt) \, s , \sigma, \gamma /\divzero e!/(\bigstep \sc WHILE-, \sc FALSE, \sc HALT,);\\
\proprulebin b, \sigma, \gamma/\true, \sigma_1, \gamma_1/s \, \texttt{while} \,\texttt( b\texttt) \, s, \sigma_1, \gamma_1 /\sigma_2, \gamma_2/\texttt{while}\,\texttt( b \texttt) \, s , \sigma, \gamma/\sigma_2, \gamma_2/(\bigstep \sc WHILE-, \sc TRUE,);\\
\proprulemon b, \sigma, \gamma/\divzero e!/\texttt{while}\,\texttt( b \texttt) \, s , \sigma, \gamma/\divzero e!/(\bigstep \sc WHILE-, \sc TRUE, \sc HALT, \sc 1,);\\
\proprulebin b, \sigma, \gamma/\true, \sigma_1, \gamma_1/s \, \texttt{while} \,\texttt( b\texttt) \, s, \sigma_1, \gamma_1 /\divzero e!/\texttt{while}\,\texttt( b \texttt) \, s , \sigma, \gamma/\divzero e!/(\bigstep \sc WHILE-, \sc TRUE, \sc HALT, \sc 2,);
$$

Increment won’t have halt case, as its premise is essentially a variable lookup, which cannot have errors.

### Small Step Semantics

$$
\saxiomrulepred x, \sigma/\sigma(x), \sigma/\sigma(x) \neq \bot/(\smallstep \sc LOOKUP,);\\
\sproprulemon a_1, \sigma/a_1', \sigma_1/a_1 \monop+! a_2, \sigma/a_1' \monop+! a_2 , \sigma_1/(\smallstep \sc ADD-, \sc ARG, \sc 1,); \\
\sproprulemon a_1, \sigma/\divzero e!/a_1 \monop+! a_2, \sigma/\divzero e!/(\smallstep \sc ADD-, \sc ARG, \sc 1-, \sc HALT,); \\
\sproprulemon a_2, \sigma/a_2', \sigma_1/i_1 \monop+! a_2, \sigma/i_1 \monop+! a'_2 , \sigma_1/(\smallstep \sc ADD-, \sc ARG, \sc 2,); \\
\sproprulemon a_2, \sigma/\divzero e!/i_1 \monop+! a_2, \sigma/\divzero e!/(\smallstep \sc ADD-, \sc ARG, \sc 2-, \sc HALT,); \\
\saxiomrule i_1 \monop+! i_2, \sigma/i_1 +\tsub Int; i_2, \sigma/(\smallstep \sc ADD,);
$$

$$
\sproprulemon a_1, \sigma/a_1', \sigma_1/a_1 \monop{/}! a_2, \sigma/a_1' \monop{/}! a_2 , \sigma_1/(\smallstep \sc DIV-, \sc ARG, \sc 1,); \\
\sproprulemon a_1, \sigma/\divzero e!/a_1 \monop{/}! a_2, \sigma/\divzero e!/(\smallstep \sc DIV-, \sc ARG, \sc 1-, \sc HALT,); \\
\sproprulemon a_2, \sigma/a_2', \sigma_1/i_1 \monop{/}! a_2, \sigma/i_1\monop{/}!a'_2 , \sigma_1/(\smallstep \sc DIV-, \sc ARG, \sc 2,); \\
\sproprulemon a_2, \sigma/\divzero e!/i_1 \monop{/}! a_2, \sigma/\divzero e!/(\smallstep \sc DIV-, \sc ARG, \sc 2-, \sc HALT,); \\
\saxiomrulepred i_1 \monop{/}! i_2, \sigma/i_1 \,{/}\tsub Int;\, i_2, \sigma/i_2 \neq 0/(\smallstep \sc DIV,); \\
\sproprulemon a_2, \sigma/0, \sigma_1/i_1 \monop{/}! a_2, \sigma/\divzero i_1 \mathop{/}a_2, \sigma_1!/(\smallstep \sc DIVZERO,); \\
$$

$$
\sproprulemon a_1, \sigma/a_1', \sigma_1/a_1 \monop<=! a_2, \sigma/a_1' \monop <=! a_2 , \sigma_1/(\smallstep \sc LEQ-, \sc ARG, \sc 1,); \\
\sproprulemon a_1, \sigma/\divzero e!/a_1 \monop<=! a_2, \sigma/\divzero e!/(\smallstep \sc LEQ-, \sc ARG, \sc 1-, \sc HALT,); \\
\sproprulemon a_2, \sigma/a_2', \sigma_1/i_1 \monop<=! a_2, \sigma/i_1 \monop<=! a_2 , \sigma_1/(\smallstep \sc LEQ-, \sc ARG, \sc 2,); \\
\sproprulemon a_2, \sigma/\divzero e!/a_1 \monop<=! a_2, \sigma/\divzero e!/(\smallstep \sc LEQ-, \sc ARG, \sc 2-, \sc HALT,); \\
\saxiomrule i_1 \monop{<=}! i_2, \sigma/i_1 \le\tsub Int; i_2, \sigma/(\smallstep \sc LEQ,);
$$

$$
\sproprulemon b, \sigma/ b', \sigma_1/\monop{!}! b, \sigma/ \monop{!}!b', \sigma_1/(\sc SMALL, \sc STEP-, \sc NOT-, \sc ARG,);\\
\sproprulemon b, \sigma/ \divzero e!/\monop{!}! b, \sigma/ \divzero e!/(\sc SMALL, \sc STEP-, \sc NOT-, \sc ARG, \sc HALT,);\\
\saxiomrule \monop{!}! \true, \sigma/ \false, \sigma/(\sc SMALL, \sc STEP-, \sc NOT-, \sc TRUE,);\\
\saxiomrule \monop{!}! \false, \sigma/ \true, \sigma/(\sc SMALL, \sc STEP-, \sc NOT-, \sc FALSE,);\\
\sproprulemon  b_1, \sigma/ b_1', \sigma_1/ b_1 \monop\&\&! b_2, \sigma/ b'_1 \monop\&\&! b_2, \sigma_1/ (\sc SMALL, \sc STEP-, \sc AND-, \sc ARG, \sc 1,);\\
\sproprulemon  b_1, \sigma/ \divzero e!/ b_1 \monop\&\&! b_2, \sigma/\divzero e!/ (\sc SMALL, \sc STEP-, \sc AND-, \sc ARG, \sc 1-, \sc HALT,);\\
\saxiomrule \false\monop\&\&!  b_2, \sigma/ \false, \sigma/(\sc SMALL, \sc STEP-, \sc AND-, \sc FALSE,);\\
\saxiomrule \true\monop\&\&!  b_2, \sigma/ b_2, \sigma/(\sc SMALL, \sc STEP-, \sc AND-, \sc TRUE,);\\
$$

$$
\saxiomrule \monop\{! s \monop\}!, \sigma / s, \sigma / (\sc SMALL, \sc STEP-, \sc BLOCK,); \\
\sproprulemon a, \sigma/a', \sigma_1/x\monop=! a {\monop;!}, \sigma/ x\monop=!a'{\monop;!}, \sigma_1/(\smallstep \sc ASGN-,\sc ARG, \sc 2,); \\
\sproprulemon a, \sigma/\divzero e!/x\monop=! a {\monop;!}, \sigma/ \divzero e!/(\smallstep \sc ASGN-,\sc ARG, \sc 2-, \sc HALT,); \\
\saxiomrulepred x \monop=!i{\texttt;}, \sigma /\monop\{\}!,{\sigma[i/x]}/\sigma(x)\neq \bot/(\smallstep \sc ASGN,); \\
\sproprulemon s_1, \sigma/s_1', \sigma_1/s_1 \ s_2, \sigma /s_1' \ s_2, \sigma_1/(\smallstep \sc SEQ-,\sc ARG, \sc 1,); \\
\sproprulemon s_1, \sigma/\divzero e!/s_1 \ s_2, \sigma /\divzero e!/(\smallstep \sc SEQ-,\sc ARG, \sc 1-, \sc HALT,); \\
\saxiomrule \monop\{\}!\ s_2/s_2, \sigma/ (\smallstep \sc SEQ-, \sc EMPTY-, \sc BLOCK,);
$$


$$
\sproprulemon b, \sigma/b', \sigma_1/ \monop if!\, (b) \, s_1 \monop else! \, s_2 , \sigma / \monop if!\, (b')\, s_1 \monop else! \, s_2, \sigma_1 / (\smallstep \sc IF-, \sc ARG, \sc 1,); \\
\sproprulemon b, \sigma/\divzero e!/ \monop if!\, (b) \, s_1 \monop else! \, s_2 , \sigma / \divzero e! / (\smallstep \sc IF-, \sc ARG, \sc 1-, \sc HALT,); \\
\saxiomrule \texttt{if}\, \texttt{(true)}\, s_1 \monop else! s_2, \sigma/s_1, \sigma/(\smallstep \sc IF-, \sc TRUE,); \\
\saxiomrule \texttt{if}\, \texttt{(false)}\, s_1 \monop else! s_2, \sigma/s_2, \sigma/(\smallstep \sc IF-, \sc FALSE,); \\
\saxiomrule \monop while! \monop(!\! b \!\monop)!s, \sigma /\monop if!\monop(!\! b\!\monop)! \monop\{! s \monop while! \monop(!\! b \!\monop)!s \monop\}! \monop else! \monop\{\}!, \sigma/(\smallstep \sc WHILE,); \\
\saxiomrule \monop int! xl\!\monop;! s/s, xl \mapsto 0/ (\smallstep\sc VAR,);
$$

$$
\sproprulemonpred x, \sigma/i, \sigma_1/\monop++! x, \sigma/i +\tsub Int; 1 , \sigma_1[i+\tsub Int; 1{/}x]/ \sigma_1(x) \neq \bot/(\smallstep \sc INCREMENT,); \\
$$

$$
\saxiomrule \monop read()!, \sigma /i, \sigma/(\smallstep \sc READ,);\\
\sproprulemon a, \sigma/i, \sigma_1/ \monop print! \texttt( a \texttt), \sigma/\texttt\{ \texttt\}, \sigma_1/(\smallstep \sc PRINT,);\\
\sproprulemon a, \sigma/\divzero e!/ \monop print! \texttt( a \texttt), \sigma/\texttt\{ \texttt\}, \divzero e!/(\smallstep \sc PRINT, \sc HALT,);
$$

