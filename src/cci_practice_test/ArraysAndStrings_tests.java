package cci_practice_test;

import static cci_practice.ArraysAndStrings.isUnique;
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

}
