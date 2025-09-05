package org.sweta;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        // ✅ Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // 1. add(E e) → Insert elements
        queue.add("Java");
        queue.add("Spring");
        queue.add("Hibernate");
        queue.add("Python");
        System.out.println("Queue after add: " + queue);

        // 2. offer(E e) → Safe insertion
        queue.offer("C++");
        System.out.println("Queue after offer: " + queue);

        // 3. element() → Get head element (throws exception if empty)
        System.out.println("Head element (element): " + queue.element());

        // 4. peek() → Get head element (returns null if empty)
        System.out.println("Head element (peek): " + queue.peek());

        // 5. remove() → Remove head element (throws exception if empty)
        System.out.println("Removed element (remove): " + queue.remove());
        System.out.println("Queue after remove: " + queue);

        // 6. poll() → Remove head element (returns null if empty)
        System.out.println("Removed element (poll): " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // 7. size() → Get queue size
        System.out.println("Queue size: " + queue.size());

        // 8. isEmpty() → Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // 9. Iterating over queue
        System.out.println("\nIterating using for-each:");
        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 10. Clear the queue
        queue.clear();
        System.out.println("Queue after clear: " + queue);
    }
}
