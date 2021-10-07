#  Collections Part 2 - Java lecture notes

Yesterday, you showed the students how to use `List`s. `List`s are data structures that are similar to arrays, but they can grow and shrink as needed, which is why they're easier to work with.

Next they'll learn about a new data structure called a `Map`. `Map`s also don't have a fixed length, but that's about where the similarities end.

## Agenda

* Collections recap
* `Map<T,T>`

### Collections recap

* Collections classes live in a package and come from a standard Java library of classes.
* These are written for you and are generic enough that they're useful under many circumstances.
* Fundamentally, packages are ways of organizing code.

### `Map<T,T>`

A `Map` is a collection of key-value pairs that allows values to be located using user-defined keys. Keys must be unique within the collection, but the values may be duplicated.

Remind students the `<T>` is shorthand for "replace T with a data type." `Map`s take two data types: one for the key, and one for the value. The data types don't have to be the same.

A relatable real-life example is a snack machine. The *key* is something like `A5`, which gets you the *value* at that key, a bag of chips. Chips can be at other locations too, but nothing else can be at `A5`.

| key  | value        |
| ---- | ------------ |
| "A5" | "Chips"      |
| "A6" | "Chips"      |
| "A7" | "Candy bars" |

> Note: Students might have a hard time with the concept of a key relating to a value. *Try not to directly relate it to a List's index because that can cause more confusion.* Be sure to explain that the key is what labels a specific location in the `Map`, and then you put the value at that location.

#### Lecture code walkthrough

The lecture code for today's lesson is in the lecture-final `src/main/java/com/techelevator/Lecture.java`. Walk through the code in the `main()` method.

You'll cover and demonstrate:

1. Declaring and initializing a `Map`.
2. Adding an item to a `Map` using the `put()` method.
3. Retrieving an item from a `Map` using the `get()`.
4. Retrieving just the keys from a `Map`.
5. Checking to see if a key already exists in the `Map`.
6. Replacing an item in the `Map` using the `put()` method.
7. Iterating through the key-value pairs in the `Map`, using `Map.Entry<T, T>` type.
   1. When using `Map.Entry`, you access the key and value with the `getKey()` and `getValue()` methods.
   2. Remind students that `Map`s are unordered, and items in loop may return in a different order than they were added.
8. Removing an item from the `Map`.
   1. Loop again to show item was removed.
