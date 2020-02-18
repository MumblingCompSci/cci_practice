package cci_practice_test;

import static cci_practice.ArraysAndStrings.*;
import org.junit.*;


import static org.junit.Assert.*;

public class ArraysAndStrings_tests {

    @Test
    public void isUniqueTrue() {
        Assert.assertTrue(isUnique("abcdefghijk"));
        Assert.assertTrue(isUnique("asdfjkl;2io1976"));
    }
    @Test
    public void isUniqueFalse() {
        Assert.assertFalse(isUnique("aAa"));
        Assert.assertFalse(isUnique("abcdefghijklmnopqrstuvwxyzz"));
    }

    @Test
    public void checkPermutationTrue() {
        assertTrue(checkPermutation("abc", "cab"));
        assertTrue(checkPermutation("abcdefghijklm", "mlkjiabcdefgh"));
        assertTrue(checkPermutation("aAA21@\\a3","AAa12\\@a3"));
        assertTrue(checkPermutation("", ""));
    }
    @Test
    public void checkPermutationFalse() {
        assertFalse(checkPermutation("abc", "abcd"));
        assertFalse(checkPermutation("abcdefghijklmnop", "aaaaaaaaaaaaaaaa"));
        assertFalse(checkPermutation("aAA21@\\a3","AAa12\\@a"));
        assertFalse(checkPermutation(null, null));
    }
}
