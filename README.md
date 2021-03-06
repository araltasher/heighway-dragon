# heighway-dragon
**The Heighway dragon** (also known as the Harter–Heighway dragon) was first investigated by NASA physicists *John Heighway*, *Bruce Bank*s, and *William Harter*. It was described by Martin Gardner in his Scientific American column Mathematical Games in 1967. Many of its properties were first published by Chandler Davis and Donald Knuth. It appeared on the section title pages of the Michael Crichton novel Jurassic Park.

#### Construction
Recursive construction of the curve
It can be written as a Lindenmayer system with

- angle 90°
- initial string FX
- string rewriting rules
  - X ↦ X+YF+
  - Y ↦ −FX−Y.

That can be described this way : Starting from a base segment, replace each segment by 2 segments with a right angle and with a rotation of 45° alternatively to the right and to the left:

![Iteration of the recusrions](https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/Dragon_curve_iterations_%282%29.svg/1600px-Dragon_curve_iterations_%282%29.svg.png)

The first 5 iterations and the 9th
The Heighway dragon is also the limit set of the following iterated function system in the complex plane:

![f_1(z)=\frac{(1+i)z}{2}](https://upload.wikimedia.org/math/e/b/8/eb824e09acc7f1d52bba7cf580579b60.png)

![f_2(z)=1-\frac{(1-i)z}{2}](https://upload.wikimedia.org/math/7/9/3/793eb2f136cbdc920dd8f7f82a7b2266.png)

with the initial set of points ![S_0=\{0,1\}.](https://upload.wikimedia.org/math/3/b/a/3ba42c29168ef1164d0985293b183566.png)

Using pairs of real numbers instead, this is the same as the two functions consisting of

![f_1(x,y)= \frac{1}{\sqrt{2}}\begin{pmatrix} \cos 45^\circ & -\sin 45^\circ \\ \sin 45^\circ & \cos 45^\circ \end{pmatrix} \begin{pmatrix} x \\ y \end{pmatrix}](https://upload.wikimedia.org/math/8/0/1/801344ad38e2207a7260f0a8c26905f6.png)

![f_2(x,y)= \frac{1}{\sqrt{2}}\begin{pmatrix} \cos 135^\circ & -\sin 135^\circ \\ \sin 135^\circ & \cos 135^\circ \end{pmatrix} \begin{pmatrix} x \\ y \end{pmatrix} + \begin{pmatrix} 1 \\ 0 \end{pmatrix}](https://upload.wikimedia.org/math/2/9/f/29ff4a41acede9fd4cefc405a7b3892b.png)

This representation is more commonly used in software such as Apophysis.

#### Demo

You'll need to include the StdDraw class in your repository. The program (*Fractal.java*) takes in an input *"n"* for the number of iterations, which decides the complexity of the shape. For example:

```Java
n = 15;
```
<img src="https://raw.githubusercontent.com/araltasher/heighway-dragon/master/heighwayDragon.gif" alt="dragon-demo" width="400"/>
