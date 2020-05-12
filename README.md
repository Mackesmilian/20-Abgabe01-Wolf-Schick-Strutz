# Configuartion Management Assignment 01

Our extension of the framework for assignment 01 for the course
"Configuartion Management".

# Overview

In this program, we will implement the classes `at.fh.bsd.Beer.java` and `at.fh.bsd.Spirit.java`. `at.fh.bsd.Beer.java` extends `at.fh.bsd.Drink.java` and `at.fh.bsd.Spirit.java` extends `at.fh.bsd.SimpleDrink.java`. In each of the two classes, we will implement one exception and one `ArrayList`.

## Our implementations

### at.fh.bsd.Beer.java

This class extends `at.fh.bsd.Drink.java`. In this class, we will implement one exception - most likely an `IllegalArgumentException` (a custom exception won't work as `at.fh.bsd.Beer.java` will already extend `at.fh.bsd.Drink.java` and multiple inheritance is not supported by java) when someone tries to create an object at.fh.bsd.Beer but inputs 0 alcohol percentage. The exception will tell the User that "Alcohol free beer is not beer" (see example below).
Furthermore, we will implement an `ArrayList` of light beers. As the name suggests, this will simply be an `ArrayList` containing all light coloured at.fh.bsd.Beer objects the user created. For this list there will be a method which returns all names of the beers stored in the list.

### at.fh.bsd.Spirit.java

This class extends `at.fh.bsd.SimpleDrink.java`. Similarly to `at.fh.bsd.Beer.java`, this class implements an `ArrayList` and throws an exception. We will implement an `ArrayList` of "hard" spirits, meaning spirits with an alcohol content above 50%. If someone wants to create a at.fh.bsd.Spirit object with less than 40% alcohol content, an `IllegalArgumentException` will be thrown as such drinks are not classified as spirits. For this list, there will also be a method which returns a String of all names of spirits stored in said list.


## Tests with JUnit

The goal will be to reach 100% test coverage. For this we will most likely need to create at least three or four test classes:

* `at.fh.bsd.TestBeer.java`
* `at.fh.bsd.TestLiquid.java`
* `at.fh.bsd.TestSpirit.java`
* `at.fh.bsd.TestSimpleDrink.java` - ~~although we are not 100% sure this one is necessary.~~ As it turns out, one simple method within `at.fh.bsd.TestSimpleDrink.java` was needed.

### at.fh.bsd.TestBeer.java

In order to reach 100% test coverage we will run down all methods in `at.fh.bsd.Beer.java`. First we will use `@BeforeClass` to create the objects needed for the tests and to avoid creating separate objects for every method. The first test will be a Test to see if the constructor worked correctly, therefore we will implement a test method which tests all attributes set within the constructors. The benefit of this is that we will also test all getters.
Next we will move on to testing our `IllegalArgumentException`. For this we will be using `assertThrows()`. Lastly we will test all setters in this class.
As an added bonus, because the `at.fh.bsd.Beer.java` constructor will need an object of at.fh.bsd.Liquid, we will simultaneously be testing some methods of `at.fh.bsd.Liquid.java`.

### at.fh.bsd.TestLiquid.java

This class will also test `at.fh.bsd.Liquid.java`, assuming the tests in `at.fh.bsd.TestBeer.java` will not provide 100% test coverage. Methodology will be the same, we will implement test methods to test each of the (remaining) methods of `at.fh.bsd.Liquid.java`.

### at.fh.bsd.TestSpirit.java

This class will work in exactly the same way `at.fh.bsd.TestBeer.java`. There isn't much to add, except that because this class extends `at.fh.bsd.SimpleDrink.java` we will also get some test coverage within `at.fh.bsd.SimpleDrink.java`.

### at.fh.bsd.TestSimpleDrink.java

~~This will probably not be necessary because the other test method might be enough to get 100% test coverage.~~
During our implementation, we realized there was one untested method within `at.fh.bsd.SimpleDrink.java`, which means we needed a `at.fh.bsd.TestSimpleDrink.java` class, which just contains one method.

## at.fh.bsd.Beer.java Constructor

```Java
public at.fh.bsd.Beer(at.fh.bsd.Liquid liquid, String name, boolean isDark, int wort) throws IllegalArgumentException {
        super(name);
        this.liquid = liquid;
        this.isDark = isDark;
        this.wort = wort;
        if (!this.isAlcoholic()) {
            throw new IllegalArgumentException("Alcohol free beer is not beer!");
        }
        if (!this.isDark) {
            lightBeers.add(this);
        }
    }
```
As you can see, our "creative" exception is an `IllegalArgumentException` because alcohol free beer is not beer, therefore passing this to our constructor is illegal.
Below you can see our test method for this exception:

```Java
@Test
    public void checkException(){
        assertThrows(IllegalArgumentException.class,()->{
            at.fh.bsd.Beer nonAlc = new at.fh.bsd.Beer(new at.fh.bsd.Liquid("lager", 0.5, 0),
                    "NullKommaJosef", false, 0);
        });
    }
```

## Contributing

* Maximilian Wolf
* Thomas Strutz
* Dominik Schick

## Author of this document

* Maximilian Wolf
