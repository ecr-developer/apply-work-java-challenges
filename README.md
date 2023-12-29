# apply-work-java-challenges
Repository contains code made for technical tests applied in interviews

- [LetterCapitalize](#lettercapitalize)
- [WordSplit](#wordsplit)

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
