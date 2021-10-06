1. A `Dictionary` is:
    a. An unordered collection of objects that have unique values.
    b. An ordered collection that has indexes and acts much like an array.
    c. An unordered collection of key-value pairs. *
    d. An ordered collection whose size can't change.

    Correct:
        c. This is the correct description of a `Dictionary`.
    Wrong:
        a. This describes a `HashSet`.
        b. This describes a `List`.
        d. This describes an array.

2. True or false: the key and value of a `Dictionary` must be the same data type.

    a. True
    b. False *

    Correct/Wrong:
        The key and value can be different data types.

3. Given the `Dictionary` declaration below, how do you write a `foreach` loop to iterate through its elements?

    ```csharp
    Dictionary<string, int> petAges = new Dictionary<string, int>() {
      { "Mo", 14 },
      { "Quill",  12 },
      { "Tuxedo", 8 }
    };
    ```

    a. `foreach (KeyValuePair<string, int> petAge : petAges)`
    b. `foreach (KeyValuePair<string, int> petAge in petAges)` *
    c. `foreach (Dictionary.Entry<string, int> petAge in petAges)`
    d. `foreach (petAges => Dictionary.Entry<string, int> petAge)`

    Correct:
        b. This is the correct syntax for a `foreach` loop.
    Wrong:
        a, c, d. This isn't the correct syntax for a `foreach` loop.

4. What happens when the following code executes?

    ```csharp
    Dictionary<string, int> animalNumberLegs = new Dictionary<string, int>()
    {
        { "Dog", 4 },
        { "Fish", 0 },
        { "Bear", 2 }
    };
    animalNumberLegs["Bear"] = 4;
    ```

    a. The value for "Bear" is overwritten with `4`. *
    b. A second "Bear" is added, with a value of `4`.
    c. A compiler error occurs because the syntax is invalid.
    d. Nothing. You can't add values after initializing a `Dictionary` with values.

    Correct:
        a. Correct. The element is overwritten.
    Wrong:
        b. Keys must be unique in `Dictionary`s. A second "Bear" can't be added.
        c. This is valid syntax. The element is overwritten.
        d. You can add values after initializing a `Dictionary` with values.

5. Given the following code, how do you access the key and value of `testScore`?

    ```csharp
    Dictionary<string, int> testScores = new Dictionary<string, int>(){
      { "Alice", 99 },
      { "Bob",  92 },
      { "Charlie", 87 }
    };

    foreach (KeyValuePair<string, int> testScore in testScores)
    {
        Console.WriteLine("Key: " + /*fill in code*/);
        Console.WriteLine("Value: " + /*fill in code*/);
    }
    ```

    a. `testScore[0]` and `testScore[1]`
    b. `testScore.Key` and `testScore.Value` *
    c. `testScore[Key]` and `testScore[Value]`
    d. `testScore.GetKey()` and `testScore.GetValue()`

    Correct:
        b. This is the correct syntax for accessing the key and value of a `KeyValuePair`.
    Wrong:
        a, c, d. The syntax is invalid.

6. How do you determine if the key "Dave" exists in the `Dictionary` below?

    ```csharp
    Dictionary<String, String> people = new Dictionary<String, String>();
    ```

    a. `people.GetKey("Dave")`
    b. `people.HasKey("Dave")`
    c. `people.KeyExists("Dave")`
    d. `people.ContainsKey("Dave")` *

    Correct:
        d. This is the correct method and way to check for a key's existence.
    Wrong:
        a., b., c., These aren't valid methods.
