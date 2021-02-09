# Lab 2 - Inheritance
![Points badge](../../blob/badges/.github/badges/points.svg)

## Outcomes
* Enhance an existing unit test suite to increase confidence in code correctness.
* Refactor existing highly similar classes by adding a third (super-)class and leveraging inheritance.

## Description
* Look at the code for the two classes given, `TabSeparatedFile`, and `CommaSeparatedFile` and refactor the code to try to maximize re-use of common data elements and methods.
* Add new unit tests as needed to utilize new function names, etc.
* Create a new super class and extend that in the existing classes.
* Try to make the two files that were given as small as possible by forcing everything possible up into the super class.

### Clone
- Clone this lab locally, using `git clone URL_FROM_GITHUB`.

### Import and Initialize
- Import this existing Gradle project using the same steps you used in the first lab.
- Click the run button to see that the **FileTest.java** tests pass.
	- The **InheritanceTest.java** file will only work after you utilize inheritance as required by the lab instructions.

### Refactor
- Refactor the two given classes to use a new `super` class.
- You should not change the **FileTest** file, just the classes themselves.
