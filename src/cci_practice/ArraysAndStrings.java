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
     * TODO: make this work for any characters
     */
//    public static boolean checkPermutation(String strA, String strB) {
//        if (strA.length() != strB.length()) return false;
//
//        int[] countA = new int[26], countB = new int[26];
//
//        for (int i = 0; i < (strA.length()); i++) {
//            countA[strA.charAt(i) - 'a']++;
//            countB[strB.charAt(i) - 'a']++;
//        }
//
//        for (int i = 0; i < 26; i++) {
//            if (countA[i] != countB[i]) return false;
//        }
//
//        return true;
//    }
    public static boolean checkPermutation(String strA, String strB) {
        if (strA.length() != strB.length()) return false;

        HashMap<Character, Integer> countsA = new HashMap<Character, Integer>();
        HashMap<Character, Integer> countsB = new HashMap<Character, Integer>();

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
