import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordSplit {

    public static void main(String[] args) {
        String[] strArr = {"hellocat", "apple,bat,cat,goodbye,hello,yellow,why"};
        String result = WordSplit(strArr);
        System.out.println(result);
    }

    public static String WordSplit(String[] strArr) {
        if (strArr == null || strArr.length != 2) {
            return "Invalid input format";
        }

        String sequence = strArr[0];
        String[] dictionaryArray = strArr[1].split(",");
        Set<String> dictionary = new HashSet<>(Arrays.asList(dictionaryArray));

        // Iterate through all possible splits of the sequence
        for (int i = 1; i < sequence.length(); i++) {
            String firstPart = sequence.substring(0, i);
            String secondPart = sequence.substring(i);

            // Check if both parts exist in the dictionary
            if (dictionary.contains(firstPart) && dictionary.contains(secondPart)) {
                return firstPart + "," + secondPart; // Found a valid split
            }
        }

        return "not possible"; // No valid split found
    }
}