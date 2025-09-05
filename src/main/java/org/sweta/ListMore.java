package org.sweta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListMore {
    public static void main(String[] args) {
        // ✅ Create an ArrayList
        List<String> fruits = new ArrayList<>();

        // ✅ Add elements
        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");



        // 1️⃣ For loop with index
        System.out.println("\nIterating using for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Fruit is: " + fruits.get(i));
        }

        // 2️⃣ Enhanced for-each loop
        System.out.println("\nIterating using enhanced for-each loop:");
        for (String fruit : fruits) {
            System.out.println("Fruit is: " + fruit);
        }

        // 3️⃣ Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println("Fruit is: " + it.next());
        }

        // 4️⃣ forEach() method with lambda (Java 8+)
        System.out.println("\nIterating using forEach + lambda:");
        fruits.forEach(fruit -> System.out.println("Fruit is: " + fruit));

        // 5️⃣ Stream API (Java 8+)
        System.out.println("\nIterating using Stream API:");
        fruits.stream().forEach(fruit -> System.out.println("Fruit is: " + fruit));
    }
}
