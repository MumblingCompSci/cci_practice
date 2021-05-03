package cci_practice.TreesAndGraphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MinimalTree {
    /** 4.2
     * Minimal Tree:
     * Given a sorted (increasing order) array with unique integer elements,
     * write an algorithm to create a binary search tree with minimal height.
     */

    public class Node {
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public class Tree {
        Node root;
        ArrayList<Integer> values;

        /* this should be put into the testing file */
//        public int getMinHeight() {
//            int height = 0;
//            if (values.size() == 0) return height;
//
//            height = (int) Math.ceil(Math.log(values.size())/Math.log(2.00));
//            return height;
//        }
        /**
         * should I store the tree as an array or just as references?
         */

        // let's try as references
        public void addEntries(int[] input) {
            // since the input is already sorted, just break up the array into an order
            //  that assembles nicely in the tree
//            int[] resorted = sortInput(input);
        }

        public void sortNode(Node parent, Node insert) {
            if (parent.data == insert.data) return;
            if (insert.data < parent.data) {
                if (parent.left == null ) parent.left = insert;
                else sortNode(parent.left, insert);
            } else {
                if (insert.data > parent.data) {
                    if (parent.right == null) parent.right = insert;
                    else sortNode(parent.right, insert);
                }
            }
        }



        /**
         * this will return the height of any tree with a root at node
         * @param node root of tree to be checked
         * @return height of tree rooted at node
         */
        public int checkHeight(Node node) {
            if (node == null) return -1;

            int left = checkHeight(node.left);
            int right = checkHeight(node.right);
            if (left > right) return left + 1;
            else return right + 1;
        }
    }
}
