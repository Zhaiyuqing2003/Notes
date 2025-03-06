#### (1)

Write $A = QR$, so
$$
A + uv^T = QR + uv^T \\
QQ^T(A + uv^T) = QQ^T(QR + uv^T) \\
Q(Q^T A + Q^T uv^T) = Q(R + Q^T uv^T)
$$
So, $w = Q^T u$

#### (2)

$$
R + wv^T = Q_1 Q_1^T (R + wv^T) = Q_1 (Q_1^T R + Q_1wv^T)
$$

So we need to make $Q_1$ such that $Q_1^T w = ce_1$, that requires it to be a series of Givens Rotations that knocks out all entries other than the first one:
$$
Q_1 = G_{1, 2} G_{2, 3} ... G_{n - 1, n}
$$

#### (3)

Since $Q_1^T$ is a series of Givens Rotations, it only manipulates two adjacent rows, that means $Q_1^T R$ will almost have only thing on its subdiagonal, so it's Upper Hessenberg matrix. Also $Q_1 w v^T$ only contains possibly first and second row, while all other rows are zero. So that $Q_1^T R + Q_1wv^T = H$

#### (4)

For $H$, since it is Upper Hessenberg, we only need to use $O(n)$ Givens rotations to knock off its subdiagonal entries. (i.e. $H = Q_2 R'$, $R'$ is what we wanted, and $Q_2 = H_{n, n-1} ... H_{2, 1}$.

#### (5)

As mentioned, we need $O(n)$ Givens rotations, and each rotation only compute on 2 rows so that requires $O(n)$ operation. So, the complexity is $O(n^2)$ in the end