$$
\bold H(\omega) = {V\tsub in; \over V_C} = {Z_C \over Z_C + Z_R} = {1/j\omega C_1 \over R_1 + 1/j\omega C_1} = \inv {1 + j \omega R_1C_1}
$$

$$
|\bold H (\omega)| = {1 \over \sgrt 1 + (\omega R_1C_1)^2 /> }
$$

Set $|\bold H(\omega)| = 1/\sqrt 2$
$$
\align[[
1+(\omega R_1C_1)^2 &=2 \\
\omega R_1C_1 &= 1 \\
\omega &= \note  {1 / R_1 C_1}!
]]
$$
It makes sense. As $\omega \to 0$, $|\bold H(\omega)| \to 1$. As $\omega \to \infin$, $|\bold H(\omega)| \to 0$. So, it's indeed low pass filter.
$$
Z_C \parallel Z_L = {R_L / j\omega C_1 \over R_L + 1/j\omega C_1} = { R_L \over 1 + j\omega R_L C_1} 
$$

$$
\bold H(\omega) = {V\tsub in; \over V\tsub out;} = {Z_C \parallel Z_L  \over Z_R + (Z_C \parallel Z_L)} = {R_L / ( 1+ j\omega R_L C_1) \over R_1 + R_L / ( 1+ j\omega R_L C_1)} = {R_L \over R_L + R_1 + j\omega R_1R_LC_1}
$$

$$
|\bold H(\omega)| = {R_L \over \sgrt (R_L + R_1)^2 + (\omega R_1 R_L C_1)^2 />}
$$

$$
|\bold H (\omega) | = {R_L \over R_L + R_1}
$$



Set ${ |\bold H(w)| \bigm/ |\bold H(0)| } = 1 /\sqrt 2 $
$$
{R_L \over \sgrt (R_L + R_1)^2 + (\omega R_1 R_L C_1)^2 />} = {1\over \sqrt 2} {R_L \over R_L + R_1} \\
{R_L + R_1 \over \sgrt (R_L + R_1)^2 + (\omega R_1 R_L C_1)^2 />} = {1\over \sqrt 2} \\
{(R_L + R_1)^2 + (\omega R_1 R_L C_1)^2 \over (R_L + R_1)^2 }  = 2 \\
{\omega R_1 R_L C_1 \over R_L+R_1} = 1 \\
\omega  = {R_L + R_1 \over R_1 R_L C_1 } \\
\omega = {1 \over (R_1 \parallel R_L) \, C_1}
$$
Set $R_L = \infin$



