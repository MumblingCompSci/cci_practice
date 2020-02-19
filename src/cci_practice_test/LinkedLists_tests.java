package cci_practice_test;
import cci_practice.LinkedLists;
import org.junit.*;

import static cci_practice.LinkedLists.kthToLast;
import static org.junit.Assert.assertEquals;
import static cci_practice.LinkedLists.removeDuplicates;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists_tests {

    @Test
    public void removeDuplicatesTest() {
        LinkedList<Integer> testList = new LinkedList<>();

        testList.add(10);
        testList.add(29);
        testList.add(10);
        testList.add(30);
        testList.add(10);
        testList.add(10);

        LinkedList<Integer> output = removeDuplicates(testList);
        assertEquals(3, output.size());
    }
    @Test
    public void noDuplicatesTest() {
        LinkedList<Integer> testList = new LinkedList<>(List.of(1,2,3,4,5,6,7));

        LinkedList<Integer> output = removeDuplicates(testList);
        assertEquals(7, output.size());
    }

    @Test
    public void kthToLastTest() {
        LinkedList<Integer> list = new LinkedList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

        assertEquals((int) list.get(list.size() - 4), (int) kthToLast(list, 4));
        assertEquals((int) list.get(list.size() - 10), (int) kthToLast(list, 10));
        assertEquals((int) list.get(list.size() - 14), (int) kthToLast(list, 14));
    }
}
