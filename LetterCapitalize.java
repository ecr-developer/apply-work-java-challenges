public class LetterCapitalize {

    public static void main(String[] args) {
        String input = "capitalize the first letter of each word";
        String result = LetterCapitalize(input);
        System.out.println(result);
    }

    public static String LetterCapitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str; // Return the input unchanged if it's null or empty
        }

        // Split the input string into words
        String[] words = str.split(" ");

        // Capitalize the first letter of each word
        for (int i = 0; i < words.length; i++) {
            words[i] = capitalizeFirstLetter(words[i]);
        }

        // Join the words back into a single string
        return String.join(" ", words);
    }

    private static String capitalizeFirstLetter(String word) {
        if (word == null || word.isEmpty()) {
            return word; // Return the input unchanged if it's null or empty
        }

        // Capitalize the first letter and append the rest of the word
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
}