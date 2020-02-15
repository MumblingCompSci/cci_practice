package cci_practice;

public class ArraysAndStrings {


    /**
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
}
