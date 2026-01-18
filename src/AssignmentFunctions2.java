/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import java.util.*;
public class AssignmentFunctions2 {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray())
            stack.push(c);

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty())
            result.append(stack.pop());

        return result.toString();
    }

    // Q2: Sort Stack using another Stack
    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            int current = stack.pop();
            while (!temp.isEmpty() && temp.peek() > current)
                stack.push(temp.pop());
            temp.push(current);
        }
        return temp;
    }

    // Q3: Reverse Queue
    public static Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.poll());

        while (!stack.isEmpty())
            queue.add(stack.pop());

        return queue;
    }

    // Q4: Priority Queue (smallest first)
    public static PriorityQueue<Integer> createPriorityQueue() {
        return new PriorityQueue<>();
    }

    // Q5: Merge two sorted queues
    public static Queue<Integer> mergeSortedQueues(
            Queue<Integer> q1, Queue<Integer> q2) {

        Queue<Integer> result = new LinkedList<>();

        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.peek() <= q2.peek())
                result.add(q1.poll());
            else
                result.add(q2.poll());
        }

        while (!q1.isEmpty()) result.add(q1.poll());
        while (!q2.isEmpty()) result.add(q2.poll());

        return result;
    }
}
