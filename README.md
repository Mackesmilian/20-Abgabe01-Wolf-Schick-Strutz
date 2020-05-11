# Configuartion Management Assignment 01

Our extension of the framework for assignment 01 for the course
"Configuartion Management".

# Overview

In this program, we will implement the classes `Beer.java` and `Spirit.java`. `Beer.java` extends `Drink.java` and `Spirit.java` extends `SimpleDrink.java`. In each of the two classes, we will implement one exception and one `ArrayList`.

## Our implementations

### Beer.java

This class extends `Drink.java`. In this class, we will implement one exception - most likely an `IllegalArgumentException` (a custom exception won't work as `Beer.java` will already extend `Drink.java` and multiple inheritance is not supported by java) when someone tries to create an object Beer but inputs 0 alcohol percentage. The exception will tell the User that "Alcohol free beer is not beer".
Furthermore, we will implement an `ArrayList` of light beers. As the name suggests, this will simply be an `ArrayList` containing all light coloured Beer objects the user created. For this list there will be a method which returns all names of the beers stored in the list.

### Spirit.java

This class extends `SimpleDrink.java`. Similarly to `Beer.java`, this class implements an `ArrayList` and throws an exception. We will implement an `ArrayList` of "hard" spirits, meaning spirits with an alcohol content above 50%. If someone wants to create a Spirit object with less than 40% alcohol content, an `IllegalArgumentException` will be thrown as such drinks are not classified as spirits. For this list, there will also be a method which returns a String of all names of spirits stored in said list.


## Tests with JUnit

The goal will be to reach 100% test coverage. For this we will most likely need to create at least three or four test classes:

* `TestBeer.java`
* `TestLiquid.java`
* `TestSpirit.java`
* `TestSimpleDrink.java` - although we are not 100% sure this one is necessary.

### TestBeer.java

In order to reach 100% test coverage we will run down all methods in `Beer.java`. First we will use `@BeforeClass` to create the objects needed for the tests and to avoid creating separate objects for every method. The first test will be a Test to see if the constructor worked correctly, therefore we will implement a test method which tests all attributes set within the constructors. The benefit of this is that we will also test all getters.
Next we will move on to testing our `IllegalArgumentException`. For this we will be using `assertThrows()`. Lastly we will test all setters in this class.
As an added bonus, because the `Beer.java` constructor will need an object of Liquid, we will simultaneously be testing some methods of `Liquid.java`.

### TestLiquid.java

This class will also test `Liquid.java`, assuming the tests in `TestBeer.java` will not provide 100% test coverage. Methodology will be the same, we will implement test methods to test each of the (remaining) methods of `Liquid.java`.

### TestSpirit.java

This class will work in exactly the same way `TestBeer.java`. There isn't much to add, except that because this class extends `SimpleDrink.java` we will also get some test coverage within `SimpleDrink.java`.

### TestSimpleDrink.java

This will probably not be necessary because the other test method might be enough to get 100% test coverage.


## Contributing

* Maximilian Wolf
* Thomas Strutz
* Dominik Schick

## Author of this document

* Maximilian Wolf
