package org.sweta;


import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {

        // ✅ Creating an ArrayList of Strings
        List<String> list = new ArrayList<>();

        // 1. add(E e) – Adds an element to the list
        list.add("Java");
        list.add("Spring");
        list.add("Hibernate");
        list.add("Microservices");
        System.out.println("After add(): " + list);

        // 2. add(int index, E element) – Inserts element at specific position
        list.add(2, "JPA");
        System.out.println("After add(index, element): " + list);

        // 3. get(int index) – Returns element at given index
        System.out.println("Element at index 1: " + list.get(1));

        // 4. set(int index, E element) – Replaces element at index
        list.set(1, "Spring Boot");
        System.out.println("After set(): " + list);

        // 5. remove(Object o) – Removes first occurrence of element
        list.remove("Hibernate");
        System.out.println("After remove(Object): " + list);

        // 6. remove(int index) – Removes element at index
        list.remove(2);
        System.out.println("After remove(index): " + list);

        // 7. size() – Returns number of elements
        System.out.println("Size of list: " + list.size());

        // 8. contains(Object o) – Checks if element exists
        System.out.println("Contains 'Java'? " + list.contains("Java"));

        // 9. isEmpty() – Checks if list is empty
        System.out.println("Is list empty? " + list.isEmpty());

        // 10. indexOf(Object o) – Returns first index of element
        System.out.println("Index of 'Java': " + list.indexOf("Java"));

        // 11. lastIndexOf(Object o) – Returns last index of element
        list.add("Java"); // duplicate
        System.out.println("Last index of 'Java': " + list.lastIndexOf("Java"));

        // 12. subList(int fromIndex, int toIndex) – Returns view of portion of list
        System.out.println("SubList(0,2): " + list.subList(0, 2));

        // 13. clear() – Removes all elements
        list.clear();
        System.out.println("After clear(): " + list);

        // 14. addAll(Collection c) – Adds all elements of another collection
        List<String> newList = new ArrayList<>();
        newList.add("DSA");
        newList.add("System Design");
        list.addAll(newList);
        System.out.println("After addAll(): " + list);

        // 15. removeAll(Collection c) – Removes all elements present in another collection
        list.removeAll(newList);
        System.out.println("After removeAll(): " + list);

        // 16. retainAll(Collection c) – Retains only matching elements
        list.add("Java");
        list.add("Spring Boot");
        list.add("Microservices");
        list.retainAll(List.of("Java", "Microservices"));
        System.out.println("After retainAll(): " + list);

        // 17. toArray() – Converts list to Object array
        Object[] arr = list.toArray();
        System.out.println("Array elements: ");
        for(Object o : arr){
            System.out.println(o);
        }

        // 18. forEach() – Iterate using lambda
        System.out.println("Iterating with forEach(): ");
        list.forEach(System.out::println);
    }
}

