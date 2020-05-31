# The Quadratic Formula

## What's it for?

The quadratic formula is used to calculate the zeros of a quadratic polynomial. A quadratic polynomial is a polynomial where the highest exponent on the variable is 2. The generic form of a quadratic polynomial is:

![alt tag](https://wikimedia.org/api/rest_v1/media/math/render/svg/a846e7c036a5ed1955e2c04d84147b349d3f75c3)

where b and c are any numbers, a is any number other than zero, and x is a variable.

Any polynomial can be written as a function. A graph of a function of a quadratic polynomial is a smooth arc known as a parabola. The parabola goes one way, either up or down, reaches a point called the vertex, and then goes back the other way. If you were to fold the graph in half at the vertex, you would see that the function sits on top of itself. It's symmetric about the vertex!

![alt tag](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f8/Polynomialdeg2.svg/330px-Polynomialdeg2.svg.png)

## Zeros?

The zeros (also known as roots) of a quadratic polynomial are the x-values for which ax^2 + bx + c = 0. There are always two zeros. These zeros may both be real numbers, or they may both be imaginary numbers.* 

It may be helpful to think of the zeros of a quadratic polynomial as the points on a parabola that intersect, or pass through, the x-axis. In the graph above, the zeros are -1 and 2. Now you may be thinking, "What if the vertex of the polynomial is on the x-axis?" If that happens, then the zero is a repeating zero and technically appears twice. (For calculus students, the zero has a multiplicity of 2.) 

Well, what if the parabola doesn't intersect the x-axis at all? When this happens, both of the zeros of the polynomial are imaginary numbers. This will make more sense once we look at the quadratic formula.

## The Formula:

The quadratic formula can be derived from the generic form of a quadratic polynomial.** 

The formula is:

![alt tag](https://wikimedia.org/api/rest_v1/media/math/render/svg/2a9804ca8ce019507e3199ca8fced800fb5b7d7c)

One zero is found using a positive sign after -b, and the other is found using a negative sign after -b. 

If b^2 - 4ac equals zero, then there is a repeated zero. 

If b^2 - 4ac is greater than zero, then there are two real zeros of the polynomial. 

If b^2 - 4ac is less than zero, then there are two imaginary roots of the polynomial. Why? If a number is less than zero, then it is negative. Negative numbers do not have square roots that are real numbers, but they do have imaginary square roots.

## Example:

Using the polynomial in the graph above, one of the zeros is:

x = [1 + sqrt((-1)^2 - (4)(1)(-2))] / (2)(1)

x = [1 + sqrt(1 + 8)] / 2

x = [1 + 3] / 2

x = 4 / 2 

x = 2

The other zero is:

x = [1 - sqrt((-1)^2 - (4)(1)(-2))] / (2)(1)

x = [1 - sqrt(1 + 8)] / 2

x = [1 - 3] / 2

x = -2 / 2 

x = -1

So the two zeros are 2 and -1.

## Using Our Program:

The program uses the quadratic formula to calculate the zeros of a quadratic polynomial. It will ask for the value of a, then b, and finally c. Be sure to input only numbers. Negative numbers and decimals are also OK, but don't input anything other than a number! Doing so will cause an error. The program may say that you have imaginary roots, or it may even crash and need to be restarted.

The program does not currently calculate imaginary numbers. If the quadratic formula you input has imaginary zeros, then the progam will print "Imaginary Solution..." If the polynomial has real roots, then the program will print the zeros of the polynomial.

## Factoring and Further Reading:

Another way to calculate the zeros of a quadratic polynomial is factoring. An explanation of factoring can be found at https://www.mathsisfun.com/algebra/factoring-quadratics.html

*For more information on imaginary numbers, see  https://www.khanacademy.org/math/algebra2/introduction-to-complex-numbers-algebra-2/the-imaginary-numbers-algebra-2/a/intro-to-the-imaginary-numbers

**For the derivation of the quadratic formula, see https://en.wikipedia.org/wiki/Quadratic_formula
