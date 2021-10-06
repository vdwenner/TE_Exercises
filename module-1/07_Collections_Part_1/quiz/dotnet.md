1. Select the ways a `List` differs from an array: (select all that apply)

    a. A `List`'s length doesn't need to be declared. *
    b. You can add different data types to a `List`.
    c. Elements can be added to and removed from the middle of a `List`. *
    d. You can't access a `List` element at a particular index.
    e. You use a different property to retrieve the number of elements in a `List`. *

    Correct:
        a. A `List` grows and shrinks as it's needed, unlike an array that has a fixed length.
        c. `List`s have methods that you can use to add and remove elements from the middle of a `List`, unlike arrays.
        e. `List`s have a different property for retrieving the number of elements.
    Wrong:
        b. Like arrays, `List`s are bound to the data type it was declared with.
        d. You can access a `List` element at a particular index.

2. What does the `<T>` indicate when used like `List<T>`?

    a. It means that it's a collection.
    b. The `List` can only hold a datatype called `T`.
    c. You need to specify a datatype in place of `T`. *
    d. Nothing. It's a typo.

    Correct:
        c. The `T` is a placeholder for a datatype to be specified by the developer. The datatype goes in the brackets `<>`.
    Wrong:
        a. The namespace of the `List` class indicates that it's a collection.
        b. That could be possible, but a developer probably wouldn't use `T` as it isn't a very descriptive name.
        d. It's not a typo.

3. Given the `List` declaration below, how do you write a `foreach` loop to iterate through its elements?

    ```csharp
    List<int> scores = new List<int>() {80, 94, 81, 75, 91, 98, 84};
    ```

    a. `for (each score in scores)`
    b. `foreach (int score in scores)` *
    c. `foreach (score : scores)`
    d. `foreach (scores => score)`

    Correct:
        b. This is the correct syntax for a `foreach` loop.
    Wrong:
        a, c, d. This isn't the correct syntax for a `foreach` loop.

4. What property do you use to get the number of elements in a `List`?

    a. `.Length`
    b. `.Amount`
    c. `.Count` *
    d. `.Size`

    Correct:
        c. This is the correct property.
    Wrong:
        a. This is the property used for arrays.
        b, d. These aren't valid properties.

5. Given a `List<string>`, what does the following line of code do?

    ```csharp
    myList.Insert(1, "My Text");
    ```

    a. Inserts "My Text" as the first item in `myList`.
    b. Inserts "My Text" as the second item in `myList`. *
    c. Adds the values `1` and `"My Text"` to `myList`.
    d. Overwrites the element at that position in `myList`.

    Correct:
        b. This is correct. The `1` indicates the zero-based index of where to insert the item.
    Wrong:
        a. The `1` indicates the zero-based index of where to insert the item. This line inserts it as the second item.
        c. You can't add two values to a `List` in one line.
        d. The element isn't overwritten.

6. Given the `List` declaration below, how do you access the *third* item?

    ```csharp
    List<string> animals = new List<string>() {"Dog", "Cat", "Fish", "Bear"};
    ```

    a. `animals[2]` *
    b. `animals[3]`
    c. `animals["Fish"]`
    d. `animals.Get(2)`

    Correct:
        a. Correct. `List`s are zero-based indexes like arrays.
    Wrong:
        b. This retrieves the fourth item because `List`s are zero-based indexes like arrays.
        c. You can't retrieve a `List` item by its value.
        d. This isn't a valid method.