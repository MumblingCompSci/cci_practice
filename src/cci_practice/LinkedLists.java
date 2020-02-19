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

    /** 2.2
     * Implement an algorithm to find the Kth to last element in a singly linked list.
     *
     * ...What would we want to do if the list is shorter than K elements?...
     */
    public static int kthToLast(LinkedList<Integer> list, int k) {
        ListIterator<Integer> walker = list.listIterator();
        ListIterator<Integer> runner = list.listIterator();

        // put the runner ahead by K steps
        for (int i = 0; i < k; i++) runner.next();

        // keep both going until runner reaches the end
        while(runner.hasNext()) {
            runner.next();
            walker.next();
        }

        return walker.next();
    }
}
