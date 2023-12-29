# apply-work-java-challenges
Repository contains code made for technical tests applied in interviews

- [LetterCapitalize](#lettercapitalize)
- [WordSplit](#wordsplit)
- [PrintNumbers - Recursively](#printnumbers)

## LetterCapitalize

Letter Capitalize, have the function LetterCapitalize(str), take the str parameter being passed and capitalize the first letter of each word. Words will be separated by only one space.

```java
cd src && javac LetterCapitalize.java
java LetterCapitalize
---
output:
Capitalize The First Letter Of Each Word
```

This Java program defines a function `LetterCapitalize` that takes a string as input, splits it into words, capitalizes the first letter of each word using the `capitalizeFirstLetter` helper function, and then joins the words back into a single string.<br>
The example in the `main` method demonstrates its usage.

## WordSplit

Word Split. Have the function WordSplit(strArr) read the array of strings stored in strArr, which will contain 2 elements: the first element will be a sequence of characters, and the second element will be a long string of comma-separated words, in alphabetical order, that represents a dictionary of some arbitrary length. For example: strArr can be: `["hellocat", "apple,bat,cat,goodbye,hello,yellow,why"]`.<br>
Your goal is to determine if the first element in the input can be split into two words, where both words exist in the dictionary that is provided in the second input.<br>
In this example, the first element can be split into two words: hello and cat because both of those words are in the dictionary.

Certainly! Below is the Java code for the `WordSplit` function:

```java
cd src && javac WordSplit.java
java WordSplit
---
output:
hello,cat
```

This Java program defines a function `WordSplit` that takes an array of two strings as input. It splits the dictionary string into a set of words and then iterates through all possible splits of the sequence, checking if both parts exist in the dictionary.<br>
The example in the `main` method demonstrates its usage.

## PrintNumbers

Print numbers until a specific number without using traditional loop constructs like `for`, `do-while`, or `while`, you can achieve it through recursion. Here's a simple example in Java:

```java
cd src && javac PrintNumbers.java
java PrintNumbers
---
output:
0
1
2
3
4
5
6
7
8
9
10
```

In this example, the `PrintNumbers` method is a recursive function that prints numbers from `current` up to `target`.<br>
The base case checks if `current` is still less than or equal to `target`, and if so, it prints the current number and calls itself with an incremented `current` value. This continues until the base case is false.

While recursion achieves the goal of not using explicit loops, keep in mind that recursive solutions might have limitations in terms of stack depth and could lead to a `StackOverflowError` for large inputs. It's important to consider the problem constraints and choose an appropriate solution accordingly.

 The `Math.abs()` method returns the absolute value of its argument, effectively converting negative numbers to positive and leaving positive numbers unchanged.

 In this example, `Math.abs(negativeValue)` will return the absolute (positive) value of `-10`, resulting in `10`. You can use the same method for other numeric types like `long`, `float`, and `double` as well.
