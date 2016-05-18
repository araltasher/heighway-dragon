# heighway-dragon
The Heighway dragon (also known as the Harter–Heighway dragon or the Jurassic Park dragon) was first investigated by NASA physicists John Heighway, Bruce Banks, and William Harter. It was described by Martin Gardner in his Scientific American column Mathematical Games in 1967. Many of its properties were first published by Chandler Davis and Donald Knuth. It appeared on the section title pages of the Michael Crichton novel Jurassic Park.

Construction[edit]
Recursive construction of the curve
It can be written as a Lindenmayer system with

angle 90°
initial string FX
string rewriting rules
X ↦ X+YF+
Y ↦ −FX−Y.
That can be described this way : Starting from a base segment, replace each segment by 2 segments with a right angle and with a rotation of 45° alternatively to the right and to the left:

The first 5 iterations and the 9th
The Heighway dragon is also the limit set of the following iterated function system in the complex plane:

f_1(z)=\frac{(1+i)z}{2}
f_2(z)=1-\frac{(1-i)z}{2}
with the initial set of points S_0=\{0,1\}.

Using pairs of real numbers instead, this is the same as the two functions consisting of

f_1(x,y)= \frac{1}{\sqrt{2}}\begin{pmatrix} \cos 45^\circ & -\sin 45^\circ \\ \sin 45^\circ & \cos 45^\circ \end{pmatrix} \begin{pmatrix} x \\ y \end{pmatrix}
f_2(x,y)= \frac{1}{\sqrt{2}}\begin{pmatrix} \cos 135^\circ & -\sin 135^\circ \\ \sin 135^\circ & \cos 135^\circ \end{pmatrix} \begin{pmatrix} x \\ y \end{pmatrix} + \begin{pmatrix} 1 \\ 0 \end{pmatrix}
This representation is more commonly used in software such as Apophysis.
