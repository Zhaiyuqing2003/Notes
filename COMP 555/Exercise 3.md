##### Exercise 3.1.1

```cpp
float limitedSquare(x) float x; {
    /* returns x-squared, but never more than 100 */
    return (x<=-10.0||x>=10.0)?100:x*x;
}
```

```tsx
<typename, float> <id, limitedSquare> <lparen> <id, x> <rparen> 
    <typename, float> <id, x> <semicolon> 
<lbrace>
	<keyword, return> 
        <lparen> 
            <id, x> <op, leq> <number, float -10.0> 
            <op, logical_or> 
            <id, x> <op, geq> <number, float 10.0> 
        <rparen>
        <op, tri_then>
            <number, 100>
		<op, tri_else>
            <id, x>
            <op, mul>
            <id, x>
    <semicolon>
<rbrace>
```

##### Exercise 3.1.2

```html
Here is a photo of <B>my house</B>
<P><IMG SRC = "house.gif"><BR>
See <A HREF = "morePix.html">More Pictures</A> if you
like that one.</P>
```

```tsx
<text, "Here is a photo of">
<tag_start, "B"> <text, "my house"> <tag_end, "B">
<tag_start, "P"> 
<tag_start, "IMG", { SRC : "house.gif" }>
<tag_start, "BR">
<text, "See">
<tag_start, "A", { HREF : "morePix.html" }>
<text, "More Pictures">
<tag_end, "A">
<text, "if you like that one.">
<tag_end, "P">    
```

##### Exercise 3.2.2

```tsx
a(a|b)*a          // string start and end with a
((ε|a)b*)*        // any string of a and b	
(a|b)*a(a|b)(a|b) // string that last third character is a 
a*ba*ba*ba*       // string that only consists three b
(aa|bb)*((ab|ba)(aa|bb)*(ab|ba)(aa|bb)*)* // string has even number of a and b
```

##### Exercise 3.2.3

1. n + 1
2. n + 1
3. n - 1
4. n*(n + 1)/2 + 1
5. 2^n

##### Exercise 3.2.4

```tsx
(s|S)(e|E)(l|L)(e|E)(c|C)(t|T)
```

##### Exercise 3.2.5

```tsx
~ := [bcdfghjklmnpqrstvwxyz]
~* a (~|a)* e (~|e)* i (~|i)* o (~|o)* u (~|u)*
```

```tsx
a* ... z*
```

```tsx 
/*  ([^"*/]|"[^"]*")*  */
```

```
(01)* | (10)*
(012)* 

(01|02)* | (10|12)* | (21|20)*

```



