# Library Basics

## Lab 02 | Arrays, For Loops, & Testing

### Feature Tasks
Rolling Dice: Write a method called roll that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.
<br>
Contains Duplicates: Write a method called containsDuplicates that returns true or false depending on whether the array contains duplicate values.
<br>
Calculating Averages: Write a method that accepts an array of integers and calculates and returns the average of all the values in the array.
<br>
Array of Arrays: Given an array of arrays calculate the average value for each array and return the array with the lowest average.
<br>
Testing: Each of these feature tasks have tests written in JUnit. They can be run using Gradle both in IntelliJ and the command line.

## Lab 03 | Maps and File I/O

### Feature Tasks
Analyzing Weather Data: Use the October Seattle weather data above. Iterate through all of the data to find the min and max values. Use a HashSet of type Integer to keep track of all the unique temperatures seen. Finally, iterate from the min temp to the max temp and create a String containing any temperature not seen during the month. Return that String.
<br>
Tallying Election: Write a function called tally that accepts a List of Strings representing votes and returns one string to show what got the most votes.
<br>
Linter: Write a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.
<br>
Testing: The first two tasks are normal tests that check the tests work. The last test for the linter required a few custom JavaScript files meant to test the edge cases that the linter should catch.
