package cci_practice;

import java.util.HashMap;

public class ArraysAndStrings {


    /** 1.1
     * Implement an algorithm to determine if a string has all unique characters.
     * What if you cannot use additional data structures?
     * @param str input string
     * @return returns true if every char in str is unique
     */
    public static boolean isUnique(String str) {

        for (int i = 0; i < (str.length() - 1); i++) {
            String compStr = str.substring(i + 1);
            if (compStr.indexOf(str.charAt(i)) != -1) return false;
        }

        return true;
    }

    /** 1.2
     * Given two strings, write a method to determine if one is a permutation of the other.
     *
     * This implementation only works if the permutations are case sensitive
     */
    public static boolean checkPermutation(String strA, String strB) {
        if (strA == null || strB == null) return false;
        if (strA.equals(strB)) return true;
        if (strA.length() != strB.length()) return false;

        HashMap<Character, Integer> countsA = new HashMap<>();
        HashMap<Character, Integer> countsB = new HashMap<>();

        for (int i = 0; i < strA.length(); i++) {
            char current = strA.charAt(i);
            if (countsA.containsKey(current)) {
                countsA.put(current, countsA.get(current) + 1);
            } else {
                countsA.put(current, 1);
            }

            current = strB.charAt(i);
            if (countsB.containsKey(current)) {
                countsB.put(current, countsB.get(current) + 1);
            } else {
                countsB.put(current, 1);
            }
        }

        for (char key : countsA.keySet()) {
            if (!countsA.get(key).equals(countsB.get(key))) return false;
        }

        return true;
    }


}
