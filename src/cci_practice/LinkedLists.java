package cci_practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {

    /** 2.1
     * Write code to remove duplicates from an unsorted linked list.
     *
     * How would you solve this problem if a temporary buffer is not allowed?
     */
    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> list) {
        ListIterator<Integer> stepper = list.listIterator(0);

        while(stepper.hasNext()) {
            int current = stepper.next();
            ListIterator<Integer> runner = stepper;

            while(runner.hasNext()) {
                if (current == runner.next()) runner.remove();
            }
        }

        return list;
    }
}
