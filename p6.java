package LinkedList;

import java.util.*;

public class p6 {

    public static void main(String[] args) {

        List<String> ls = new LinkedList<>();

        ls.add("Orange");
        ls.add("green");   // ✅ fixed
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        // Start from index 2
        ListIterator<String> iterator = ls.listIterator(2);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}