package org.sweta;

import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        ArrayDeque<String> queue = new ArrayDeque<>();

        // Adding student names (like queue in school)
        queue.add("Sweta");
        queue.add("Ananya");
        queue.add("Srishti");
        queue.addLast("Aman");
        queue.addFirst("Rahul");

        System.out.println("Student Queue: " + queue);

        // Accessing first and last
        System.out.println("First in queue: " + queue.getFirst());
        System.out.println("Last in queue: " + queue.getLast());

        // Removing students (like leaving the queue)
        System.out.println("Removed first: " + queue.removeFirst());
        System.out.println("Removed last: " + queue.removeLast());
        System.out.println("Queue after removal: " + queue);

        // Using as a Stack (LIFO) - like plates stacked in canteen
        queue.push("Plate1");
        queue.push("Plate2");
        queue.push("Plate3");
        System.out.println("Plates Stack: " + queue);

        System.out.println("Popped Plate: " + queue.pop());
        System.out.println("Stack after pop: " + queue);

        // Iterating (like calling roll number one by one)
        System.out.println("\nIterating through queue:");
        for (String name : queue) {
            System.out.println(name);
        }
    }
}

