package org.sweta;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        // ✅ Create a Stack of Strings
        Stack<String> stack = new Stack<>();

        // 1. push(E e) – Add elements
        stack.push("Java");
        stack.push("Spring");
        stack.push("Hibernate");
        stack.push("Python");
        System.out.println("Stack after push: " + stack);

        // 2. peek() – Get top element without removing
        System.out.println("Top element (peek): " + stack.peek());

        // 3. pop() – Remove top element
        System.out.println("Removed element (pop): " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // 4. search(Object o) – Find position (1-based index from top)
        System.out.println("Position of 'Java': " + stack.search("Java"));
        System.out.println("Position of 'C++': " + stack.search("C++")); // -1 if not found

        // 5. empty() – Check if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // 6. size() – Number of elements
        System.out.println("Stack size: " + stack.size());

        // 7. Iterating over Stack
        System.out.println("\nIterating with for-each:");
        for (String s : stack) {
            System.out.println(s);
        }

        System.out.println("\nIterating with Iterator:");
        Iterator<String> it = stack.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 8. Clear stack using pop
        while (!stack.empty()) {
            System.out.println("Removing: " + stack.pop());
        }
        System.out.println("Stack after clearing: " + stack);
    }
}

