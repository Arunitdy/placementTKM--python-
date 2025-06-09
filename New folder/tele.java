/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


 

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 */

import java.util.*;

public class tele {
       
    static HashMap<Integer, char[]> map = new HashMap<>();
    
    public static void  generateCombinations(String digits, int index, StringBuilder currentCombination, List<String> result) {
        
        if (index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }
        int digit = Character.getNumericValue(digits.charAt(index));
        char[] letters = map.get(digit);
        for (char letter : letters) {
            currentCombination.append(letter);
            generateCombinations(digits, index + 1, currentCombination, result);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
      
    }

    public static void main(String[] args) {
        

        map.put(2, new char[]{'a', 'b', 'c'});
        map.put(3, new char[]{'d', 'e', 'f'});
        map.put(4, new char[]{'g', 'h', 'i'});
        map.put(5, new char[]{'j', 'k', 'l'});
        map.put(6, new char[]{'m', 'n', 'o'});
        map.put(7, new char[]{'p', 'q', 'r', 's'});
        map.put(8, new char[]{'t', 'u', 'v'});
        map.put(9, new char[]{'w', 'x', 'y', 'z'});

       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits: ");
        String digits = sc.nextLine();
        if (digits.isEmpty()) {
            System.out.println("[]");
            return;
        }   
        List<String> result = new ArrayList<>();
        StringBuilder currentCombination = new StringBuilder();
        generateCombinations(digits, 0, currentCombination, result);
        System.out.println(result);

        
        sc.close();
    }
}
