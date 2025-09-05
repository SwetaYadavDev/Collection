package org.sweta;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        // ✅ Creating a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // 1. add(E e) – Add elements
        list.add("Java");
        list.add("Spring");
        list.add("Hibernate");
        System.out.println("After add(): " + list);

        // 2. addFirst(E e) – Insert at beginning
        list.addFirst("C++");
        System.out.println("After addFirst(): " + list);

        // 3. addLast(E e) – Insert at end
        list.addLast("Python");
        System.out.println("After addLast(): " + list);

        // 4. getFirst() & getLast()
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // 5. get(int index) – Retrieve element
        System.out.println("Element at index 2: " + list.get(2));

        // 6. set(int index, E element) – Replace element
        list.set(2, "Spring Boot");
        System.out.println("After set(): " + list);

        // 7. remove(Object o) – Remove element by value
        list.remove("Hibernate");
        System.out.println("After remove(Object): " + list);

        // 8. remove(int index) – Remove by index
        list.remove(1);
        System.out.println("After remove(index): " + list);

        // 9. removeFirst() & removeLast()
        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst() & removeLast(): " + list);

        // 10. contains(Object o) – Check if element exists
        System.out.println("Contains 'Java'? " + list.contains("Java"));

        // 11. size() – Number of elements
        System.out.println("Size: " + list.size());

        // 12. Iterating with for-each
        System.out.println("\nIterating with for-each:");
        for (String s : list) {
            System.out.println(s);
        }

        // 13. Iterating with Iterator
        System.out.println("\nIterating with Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 14. Using as Queue
        list.add("Go");
        list.add("Rust");
        System.out.println("\nQueue Operations:");
        System.out.println("Peek: " + list.peek());     // first element
        System.out.println("Poll: " + list.poll());     // removes first
        System.out.println("After poll: " + list);

        // 15. clear() – Remove all elements
        list.clear();
        System.out.println("\nAfter clear(): " + list);
    }
}

