package cci_practice;

import java.util.*;

public class TreesAndGraphs {

    public class BinaryNode<T> {
        BinaryNode left = null;
        BinaryNode right = null;

        T data;
    }

    public class Node {
        ArrayList<Node> adjList;
        int data;
        boolean visited;

        public Node(int data) {
            this.data = data;
            visited = false;
            adjList = new ArrayList<>();
        }
    }

    /** 4.1
     * Route Between Nodes:
     * Given a directed graph and two nodes (S and E), design an algorithm
     * to find out whether there is a route from S to E.
     */
    public static boolean routeBetweenDFS(Node start, Node end) {
        if (start.equals(end)) return true;
        if (start.visited) return false;

        for (Node n : start.adjList) {
            if (routeBetweenDFS(n, end)) return true;
        }

        return false;
    }
    public static boolean routeBetweenBFS(Node start, Node end) {

        if (start.equals(end)) return true;

        // initialize the queue
        start.visited = true;
        Queue<Node> visitQueue = new LinkedList<>(start.adjList);

        while(!visitQueue.isEmpty()) {
            // get the next node to visit and mark it
            Node current = visitQueue.poll();
            current.visited = true;

            // if it's the end, we're done
            if (current.equals(end)) return true;
            else {
                // otherwise add it's neighbors to the queue to come back to
                for (Node n : current.adjList) {
                    if (!n.visited) visitQueue.add(n);
                }
            }
        }

        return false;
    }
    public static boolean routeBetweenBiDir(Node start, Node end) {

        return false;
    }

    /** 4.2
     * Minimal Tree:
     * Given a sorted (increasing order) array with unique integer elements,
     * write an algorithm to create a binary search tree with minimal height.
     */

    /** 4.3
     * List of Depths:
     * Given a binary tree, design an algorithm which creates a linked list of all
     * the nodes at each depth (e.g., if you have a tree with D depth, you'll have D lists).
     */

    /** 4.4
     * Check Balanced:
     * Implement a function to check if a binary tree is balanced. For the
     * purposes of this question, a balanced tree is defined to be a tree such that
     * the heights of the two subtrees of any node never differ by more than one.
     */

    /** 4.5
     * Validate BST:
     * Implement a function to check if a binary tree is a binary search tree.
     */

    /** 4.6
     * Successor:
     * Write an algorithm to find the "next" node (i.e., in-order successor) of a given
     * node in a binary search tree. You may assume that each node has a link
     * to its parent.
     */

    /** 4.7
     * Build Order:
     * You are given a list of projects and a list of dependencies (which is a list
     * of pairs of projects, where the second project is dependent on the first project).
     * All of a project's dependencies must be built before the project is. Find a
     * build order that will allow the projects to be built.
     * If there is no valid build order, return an error.
     */

    /** 4.8
     * First Common Ancestor:
     * Design an algorithm to find the first common ancestor of two nodes in a binary tree.
     * Avoid storing additional nodes in a data structure.
     * Note: This is not necessarily a binary search tree.
     */

    /** 4.9
     * BST Sequences:
     * A binary search tree was created by traversing through an array from left to right
     * and inserting each element. Given a binary search tree with distinct elements,
     * print all possible arrays that could have led to this tree.
     */
}
