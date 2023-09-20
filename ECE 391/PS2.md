#### Problem 1

```assembly
movw $0x3c8, %dx
movb $COLOR_INDEX, %al
outb %al, (%dx)

movw $0x3c9, %dx
movb $RED, %al
outb %al, (%dx)
movb $GREEN, %al
outb %al, (%dx)
movb $BLUE, %al
outb %al, (%dx)
```

```
$0x3c8 --> VGA Address Write Mode Register
$0x3c9 --> VGA Data Register
```

#### Problem 2



