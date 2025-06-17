
import java.util.*;
public class PandC {

    // PERMUTATION FUNCTION
    public static void findPermutations(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            findPermutations(str.substring(0,i) + str.substring(i+1), result + str.charAt(i));
        }
    }

    // COMBINATION FUNCTION
    

    public static void main(String[] args) {
        String input = "ABC";

        System.out.println("All Permutations of " + input + ":");
        findPermutations(input, "");

        System.out.println("\nAll Combinations of " + input + ":");
        findCombinations(input, "", 0);
    }
}