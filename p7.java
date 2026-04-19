package LinkedList;

import java.util.*;

public class p7 {

    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("green");   // ✅ fixed
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        System.out.println("Reverse using ListIterator:");

        // Start from end
        ListIterator<String> listIterator = ls.listIterator(ls.size());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("\nReverse using descendingIterator:");

        Iterator<String> iterator = ls.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}