# Calculating the Slope of a Line

## What is a Line?

A line is straight with no thickness (only 1 dimension!) and goes in both directions without ending. Lines have points which "sit" on the lines, kind of like cars parked in a street, only there are an infinite number of cars! Lines are usually graphed on a coordinate plane, with two coordinates, (x,y), for each point.

## What is Slope?

All lines have a slope. The slope is a number that can be positive, negative, zero, or undefined (also called an infinity slope). The slope is the vertical change (rise) of the line divided by the horizontal change (run). The slope may be a whole number, a fraction, or a decimal. Slope is represented by the letter m. All you need to calculate the slope of a line are the coordinates of any two points on the line. The formula for the slope of a line is:

![alt tag](https://wikimedia.org/api/rest_v1/media/math/render/svg/addc6085e3d07da9a6fc0b4311095db03ebaa74e)

where the triangle symbol is the Greek letter delta. 

Here is an example of what "rise" and "run" mean:

![alt tag](http://www.montereyinstitute.org/courses/DevelopmentalMath/COURSE_TEXT2_RESOURCE/U13_L2_T1_text_final_3_files/image003.jpg)

Think of the slope as the steepness of the line. The steeper the line, the higher the absolute value of the slope and the "faster" the coordinates are increasing or decreasing. If the line is horizontal (flat), then the slope is zero. If the line is vertical (straight up and down), then the slope is undefined. If the line is going "up," then its slope is positive. If it is going "down" then its slope is negative. 

## To Calculate:

Determine which two points on your line you want to use to calculate the slope. Often, you'll be able to see two points whose coordinates are whole numbers. In the graph above, you can use the points (2,1) and (6,3). The numeric formula for slope is:

![alt tag](https://wikimedia.org/api/rest_v1/media/math/render/svg/72263d5113a7cc985f29fc9fc4b3f5e85dd5bbe5)

The x and y with a 1 subscript are for the first point, and the x and y with a 2 subscript are for the second point. It doesn't really matter which is your first point or your second point, but make sure you are consistent!

## Examples:

Using the points (2,1) and (6,3) as seen in the graph above, the slope is:

m = (y2 - y1) / (x2 - x1) 
  = (3 - 1) / (6 - 2) 
  = 2 / 4 
  = 1 / 2 
  = 0.5

For another example, the points are (6,1) and (6,3), so the slope is:

m = (y2 - y1) / (x2 - x1) 
  = (3 - 1) / (6 - 6)

Oh no! 6 - 6 = 0, but we cannot divide by 0, so the slope is undefined. Graph these two points and draw a line between them and you'll see that they form a vertical line.

## Using Our Program:

The program will first ask you for the coordinates for the first point, then the second. You can input decimal numbers as well as whole numbers to calculate the slope, but not fractions. If you have a coordinate that is a fraction, convert it to a decimal before inputting it into the program. If you have a negative coordinate, add a dash (-5 for example). Make sure to only input numbers -- anything else will cause an error and the program will restart.

The program then calculates the slope using the formula. If the slope is undefined (x2 - x1 = 0), the program will tell you that it is an Infinity Slope or an Undefined Slope. Otherwise, the program will print out the numerical value for the slope.

## A Note for Calculus Students:

This particular program only covers the slope of a line and what it means in the context of algebra. A program for slope in the context of calculus may be added soon.

## Further Reading:

For more information visit: https://en.wikipedia.org/wiki/Slope
