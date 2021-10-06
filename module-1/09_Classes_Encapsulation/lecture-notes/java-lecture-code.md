# Classes and Encapsulation - Java Lecture Notes

Students were introduced to classes when they learned about objects and collections. Now they'll begin writing their own classes and learn about encapsulation.

Classes consist of constructors, methods, and properties. Properties represent state, methods act as behaviors and constructors are part of the initialization process.

## Classroom preparation

* None

## Lecture code

The lecture code for today's lesson is in the lecture-final `oop-with-encapsulation-lecture` project. It models a deck of cards.

Don't push the lecture code to students but show them how to create a new project and create the classes with their input using lecture-final as guidance, or for suggestions.

### Project files

- `com.techelevator.cardexample`
  - `Card.java`: a class for representing a card in a deck of cards. It uses the `Game` class.
  - `Deck.java`: a class for representing a deck. It uses the `Card` class.
  - `Game.java`: a class for representing the game using the deck of cards.
- `com.techelevator.draw.tool`
  - `WoodenPencil.java`: an example class showing packages, instance variables, constructors (default and overloaded), instance methods, and static methods.
- `MainProgram.java`: a `main` method showing the game and its underlying deck of cards.

### Unicode output

The `Game` class has Unicode characters for the card suits. If you get output such as `Ace?` in your IntelliJ console, you'll have to change a setting in IntelliJ to have it display correctly. To do that, refer to the [following document](https://www.jetbrains.com/help/idea/configuring-individual-file-encoding.html#options).

![IntelliJ File Encoding](../../resources/utf-8_file_encoding.png)

## Agenda

*For timing, most of the class will be spent doing the group lecture exercise and talking about class design. The following topics come up organically as you go through the lecture. Feel free to stop to talk about them.*

* `WoodenPencil` walkthrough
* Class design
* Encapsulation
* Access modifiers
* Static properties

### `WoodenPencil` walkthrough

The sample class provides examples of various concepts that are covered in today's lesson. There are notes in comments for information students should know and understand.

You can walk through this class with the students to discuss different components and answer any questions:

- Package definition
- Class declaration
- Static (Class) variables
- `private` instance variables
- Getters and setters
    - Instance
    - Derived
    - Class
- Constructors
    - Overload
- Instance methods
    - Overload
- Static methods
- Access modifiers (seen throughout class)

### Class design

- Have the students help you identify the ideal properties and values for a card, and for a deck of cards.
- What data types can be used?

### Encapsulation

- **Encapsulation** is:
    - The packaging of data and functions into a single component.
    - Hiding the implementation details of a class to prevent other parties from setting the data to an invalid or inconsistent state and also reduce coupling.
- Should the value and suit of the card be accessible?
- Should the cards in the deck be accessible?

### Goals of encapsulation

- Encapsulation makes code extendable.
- Encapsulation makes code maintainable.
- Encapsulation promotes "loose coupling."
    - A **loosely coupled** system is one in which each of its components has, or makes use of, little or no knowledge of the definitions of other separate components.

### Access modifiers

- `private` and `public`
- Access modifiers can be applied to instance methods and variables, as well as static methods and variables.
- They control whether certain methods and properties are available for use by the users of the class, or meant only to be used internally.

### Static (Class) variables

- **Static** indicates it belongs to the class and not an instance.
- What might be valid static properties? Suits? Values?

### Shuffle feature

If time permits and the students are receptive to it, leave it up to them to implement a shuffle algorithm. A solution using `Collections.shuffle()`, as well as a separately coded solution, are both provided in `Deck.java`.
