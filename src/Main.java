/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import java.util.*;
public class Main {
     public static void main(String[] args) {

        // Q1
        System.out.println(AssignmentFunctions2.reverseString("DATA"));

        // Q2
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(2);
        System.out.println(AssignmentFunctions2.sortStack(stack));

        // Q3
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(AssignmentFunctions2.reverseQueue(queue));

        // Q4
        PriorityQueue<Integer> pq = AssignmentFunctions2.createPriorityQueue();
        pq.add(5);
        pq.add(1);
        pq.add(3);
        System.out.println(pq.poll()); // smallest element

        // Q5
        Queue<Integer> q1 = new LinkedList<>(List.of(1, 3, 5));
        Queue<Integer> q2 = new LinkedList<>(List.of(2, 4, 6));
        System.out.println(AssignmentFunctions2.mergeSortedQueues(q1, q2));
    }
}
