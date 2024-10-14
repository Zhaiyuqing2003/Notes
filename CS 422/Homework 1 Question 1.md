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
{\def\divzero#1!{\textcolor{red}{\text{divzero}(#1)}}}
{\def\monop#1!{\mathop{\texttt{#1}}}}
{\def\true{\texttt{true}}}
{\def\false{\texttt{false}}}
{\def\bigstep{\sc BIG, \sc STEP-,}}
{\def\axiomrule#1/#2/#3;{
    \conf {#1}; \smash \conf {#2}; && \hfill \bigl({#3}\bigr)
}}
{\def\axiomrulepred#1/#2/#3/#4;{
    \conf {#1}; \smash \conf {#2}; & {#3} & \hfill \bigl({#4}\bigr)
}}
{\def\proprulebin#1/#2/#3/#4/#5/#6/#7;{
    \frac
        {\conf {#1}; \smash \conf {#2}; \quad \conf {#3}; \smash \conf {#4};}
        {\conf {#5}; \smash \conf {#6};}
    && \hfill \bigl(#7\bigr)
}}
{\def\proprulebinpred#1/#2/#3/#4/#5/#6/#7/#8;{
    \frac
        {\conf {#1}; \smash \conf {#2}; \quad \conf {#3}; \smash \conf {#4};}
        {\conf {#5}; \smash \conf {#6};}
    & {#7} & \hfill \bigl(#8\bigr)
}}
{\def\proprulemon#1/#2/#3/#4/#5;{
    \frac
        {\conf {#1}; \smash \conf {#2};}
        {\conf {#3}; \smash \conf {#4};}
    && \hfill \bigl(#5\bigr)
}}
{\def\proprulemonpred#1/#2/#3/#4/#5/#6;{
    \frac
        {\conf {#1}; \smash \conf {#2};}
        {\conf {#3}; \smash \conf {#4};}
    & {#5} & \hfill \bigl(#6\bigr)
}}
{\def\proprulebinprod#1/#2/#3/#4/#5/#6/#7;{
    \proprulebin {#1} / {#2} / {#3} / {#4} / {#5} / {#6} / {#7}; \\
    \proprulebin {#1} / {\divzero e!} / {#3} / {#4} / {#5} / {\divzero e!} /
        {\textcolor{red}{#7 \sc HALT, \sc 1,}}; \\
    \proprulebin {#1} / {#2} / {#3} / {\divzero e!} / {#5} / {\divzero e!} /
        {\textcolor{red}{#7 \sc HALT, \sc 2,}}; \\
    \proprulebin {#1} / {\divzero e_1!} / {#3} / {\divzero e_2!} / {#5} / {\divzero e_1;e_2!} /
        {\textcolor{red}{#7 \sc HALT, \sc 3,}};
}}
{\def\proprulebinpredprod#1/#2/#3/#4/#5/#6/#7/#8/#9;{
    \proprulebinpred {#1} / {#2} / {#3} / {#4} / {#5} / {#6} / {#7} / {#9}; \\
    \proprulebinpred {#1} / {\divzero e!} / {#3} / {#4} / {#5} / {\divzero e!} / {#8} /
        {\textcolor{red}{#9 \sc HALT, \sc 1,}}; \\
    \proprulebinpred {#1} / {#2} / {#3} / {\divzero e!} / {#5} / {\divzero e!} / {#8} /
        {\textcolor{red}{#9 \sc HALT, \sc 2,}}; \\
    \proprulebinpred {#1} / {\divzero e_1!} / {#3} / {\divzero e_2!} / {#5} / {\divzero e_1;e_2!} / {#8} /
        {\textcolor{red}{#9 \sc HALT, \sc 3,}};
}}
{\def\proprulemonprod#1/#2/#3/#4/#5;{
    \frac
        {\conf {#1}; \smash \conf {#2};}
        {\conf {#3}; \smash \conf {#4};}
    && \hfill \bigl(#5\bigr)
    \frac
        {\conf {#1}; \smash \conf {\divzero e!};}
        {\conf {#3}; \smash \conf {\divzero e!};}
    && \hfill \bigl(#5\bigr)
}}
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

$\divzero (a_1 \smash i_1) \mathop/ a_2, \sigma; ...!$ is a configuration that capture the error information when dividing by zero. It says that the state before the division is $\sigma$, the numerator is $a_1$ that evaluates to $i_1$, and the denominator is $a_2$ which evaluates to $0$ that causes the problem. It has operation like given $\divzero e_1!$ and $\divzero e_2!$, we could get $\divzero e_1; e_2!$. This means the new configuration stores both error for the given two configurations. For clarity, $\divzero (a_1, \smash i_1)\mathop/a_2, \sigma!$ will capture error for both operand of a binary operation, if such binary operation has indeterministic order. (There are other options, we can save only the first/second error if they both give error, or we can just randomly pick one error from the two. Since the problem doesn’t specify exactly what to do, we choose to do save both the error)

#### Arithmetic

$$
\axiomrule i, \sigma/ i/ \bigstep \sc INT,; \\
\axiomrulepred x, \sigma/ \sigma(x)/ \if \  \sigma(x) \neq \bot/ \bigstep \sc LOOKUP,; \\
\proprulebinprod a_1, \sigma/ i_1/ a_2, \sigma/ i_2/a_1 \monop+! a_2, \sigma/ i_1 +\tub Int.. i_2/ \bigstep \sc ADD,; \\
\proprulebinpredprod a_1, \sigma/ i_1/ a_2, \sigma/ i_2/a_1 \monop{/}! a_2, \sigma/ i_1 \mathop{/}\tub Int.. i_2/ \if \ i_2 \neq 0//\bigstep \sc DIV,; \\
\proprulebin a_1 \sigma;/i_1/a_2, \sigma/0/a_1 \monop{/}! a_2, \sigma/\divzero (a_1 \smash i_1) \mathop{/} a_2, \sigma !/ \textcolor{red}{\bigstep \sc DIVZERO,}; \\
$$

#### Boolean

$$
\axiomrule t, \sigma/t/\bigstep \sc BOOL,; \\
\proprulebin a_1, \sigma/i_1/a_2, \sigma/i_2/a_1 \monop <=! a_2, \sigma/i_1 \le\tsub Int; i_2/\bigstep \sc LEQ,; \\
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



