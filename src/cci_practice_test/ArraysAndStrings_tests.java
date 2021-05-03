package cci_practice_test;

import static cci_practice.ArraysAndStrings.*;
import org.junit.*;


import static org.junit.Assert.*;

public class ArraysAndStrings_tests {

    /** For 1.1 */
    @Test
    public void isUniqueTrue() {
        Assert.assertTrue("abcdefghijk is unique", isUnique("abcdefghijk"));
        Assert.assertTrue("asdfjkl;2io1976 is unique", isUnique("asdfjkl;2io1976"));
    }
    @Test
    public void isUniqueFalse() {
        Assert.assertFalse("aAa is not unique", isUnique("aAa"));
        Assert.assertFalse("abcdefghijklmnopqrstuvwxyzz is not unique", isUnique("abcdefghijklmnopqrstuvwxyzz"));
    }

    /** For 1.2 */
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
