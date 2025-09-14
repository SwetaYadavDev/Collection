package org.sweta;
import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Creating a PriorityQueue of Integers
        // By default, it's a Min-Heap → smallest element at head
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1. add(E e) → Inserts element into the queue
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        // 2. offer(E e) → Similar to add, but returns false if insertion fails (add throws exception)
        pq.offer(50);

        System.out.println("Initial PriorityQueue: " + pq);
        // Output might be unordered because PQ internally uses a heap, not sorted order.

        // 3. peek() → Returns head element (smallest), null if empty
        System.out.println("Head element using peek(): " + pq.peek());

        // 4. element() → Same as peek but throws exception if empty
        System.out.println("Head element using element(): " + pq.element());

        // 5. poll() → Retrieves & removes head element; null if empty
        System.out.println("Polling head: " + pq.poll());
        System.out.println("After poll: " + pq);

        // 6. remove() → Retrieves & removes head; throws exception if empty
        System.out.println("Removing head: " + pq.remove());
        System.out.println("After remove: " + pq);

        // 7. remove(Object o) → Removes a specific element by value
        pq.remove(30);
        System.out.println("After removing 30: " + pq);

        // 8. contains(Object o) → Checks if element exists
        System.out.println("Contains 20? " + pq.contains(20));

        // 9. size() → Number of elements in queue
        System.out.println("Size of queue: " + pq.size());

        // 10. isEmpty() → True if queue is empty
        System.out.println("Is queue empty? " + pq.isEmpty());

        // 11. toArray() → Convert PQ to array
        Object[] arr = pq.toArray();
        System.out.println("Converted to Array: " + Arrays.toString(arr));

        // 12. iterator() → Iterate through PQ elements (not in priority order)
        System.out.println("Iterating using iterator():");
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 13. clear() → Removes all elements
        pq.clear();
        System.out.println("After clear(), queue: " + pq);

        // 14. comparator() → Returns comparator used; null if natural ordering
        System.out.println("Comparator used: " + pq.comparator());
    }
}
