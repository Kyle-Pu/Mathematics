# Heron's Area Formula

Heron's Area Formula calculates the area of a triangle given the 3 sides.

The area of triangle according to Heron's Formula is given below.

![alt tag](https://wikimedia.org/api/rest_v1/media/math/render/svg/d138044bb9ed870dd9dc5c7c8a3c07ab1db1705d "Heron's Formula")

Where s is the semi-perimeter given by:

![alt tag](https://wikimedia.org/api/rest_v1/media/math/render/svg/08ed8a6e351198e0c4ca8d71fa2e2bc4171e9439 "semi-perimeter")

a, b, c are the three sides of the triangle.

## Example

Let the sides of the triangle be 4.0, 13.0 and 15.0

![first equation](http://latex.codecogs.com/png.latex?%5Cinline%20s%3D%5Cfrac%7B1%7D%7B2%7D%28a&plus;b&plus;c%29%3D%5Cfrac%7B1%7D%7B2%7D%284.0%20&plus;%2013.0%20&plus;%2015.0%29%3D16.0)

![second equation](http://latex.codecogs.com/png.latex?%5Cinline%20Area%3D%5Csqrt%7B16.0%5Ctimes%2816.0%20-%204.0%29%5Ctimes%2816.0%20-%2013.0%29%5Ctimes%2816.0%20-%2015.0%29%7D)

![third equation](http://latex.codecogs.com/png.latex?%5Cinline%20%3D%5Csqrt%7B16.0%5Ctimes12.0%5Ctimes3.0%5Ctimes1.0%7D)

![fourth equation](http://latex.codecogs.com/png.latex?%5Cinline%20%3D%5Csqrt%7B576.0%7D)

![fifth equation](http://latex.codecogs.com/png.latex?%5Cinline%20%3D24)

## Using Our Program:

The program will first ask you for the length of the first side of the triangle. It will
accept both decimals and whole numbers as an input, but it will not allow fractions. The
program will then repeat this step two more times. It will ask for the length of the 
second side of the triangle, then for the length of the third side of the triangle. The 
same rules apply for providing side lengths here, so decimals or whole numbers, but no
fractions.

After you have provided these three side lengths, the program will use Heron's Area Forumula
to calculate the area of the given triangle. If the sides do not make a valid triangle, then 
the program will either output an area of 0.0, or NaN (not a number).


## Further Reading:

For more information visit: https://en.wikipedia.org/wiki/Heron%27s_formula
