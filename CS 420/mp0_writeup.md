For five runs, we have

```plain text
Time: 0.306356
Operations: 100000000 and MegaFlops/s:326.417682

Time: 0.309133
Operations: 100000000 and MegaFlops/s:323.485305

Time: 0.304768
Operations: 100000000 and MegaFlops/s:328.118602

Time: 0.302773
Operations: 100000000 and MegaFlops/s:330.280442

Time: 0.304446
Operations: 100000000 and MegaFlops/s:328.465494
```

The `add.c` file

```c
/*
 * CS - 420 MP 0: Matrix Addition
 */
#include "add.h"

#define MIN(x, y) (((x) < (y)) ? (x) : (y))

/*
 * You can use the macros below to access array elements
 * MATPTR_ELEMENT(matptr, i, j)
 * MATRIX_ELEMENT(matr, i, j)
 * 
 * These will access the jth element on the ith row
 * 
 * Use MATPTR_ELEMENT on matrix pointers (matrix*)
 * and MATRIX_ELEMENT on matrices themselves (matrix)
 */

void matrixAdd(matrix* m1, matrix* m2, matrix* result) {
  int row = MIN(m1->row, m2->row);
  int col = MIN(m1->col, m2->col);

  for (int i = 0; i < row; i ++) {
    for (int j = 0; j < col; j++) {
      MATPTR_ELEMENT(result, i, j) = MATPTR_ELEMENT(m1, i, j) + MATPTR_ELEMENT(m2, i, j);
    }
  }
}
```

