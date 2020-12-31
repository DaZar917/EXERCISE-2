## Exercise 2
*Description of how I solved this problem*

#### Brief Description
In general, the project consists of 3 classes:
* Main
* DataConverter
* BruteForceAlgorithm

Now I will talk about the properties of each of the classes and describe the main innovations for each of them.

#### Main
Contains the main function which in turn calls the necessary functions from other classes. This was done so as not to contaminate the code in the main class.

#### DataConverter
The DataConverter class contains a list of the following functions:
* scan - the scan () function scans from the standard input and checks to see if the line contains the numbers. If you enter an incorrect character, the program will ask you to enter everything again.
* convert_data - сonverts data to the format I need for easy use.
* separate_first_integer - separates the first element of the array to use it as a sum in the future.
* separate_unusable_values - Separates items that will not be used when solving a problem.
* separate_usable_values - Throwing out a list of items that we can't use, we get a list of the ones we need.



#### BruteForceAlgorithm
The core of this project. Uses the usual brute force algorithm. first fills the array with zeros, then from the end fills with values that we can use. You can also look at the path that this algorithm has built.
