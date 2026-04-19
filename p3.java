package ArrayList;

import java.util.*;

public class p3 {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();  // ✅ use generics

        ls.add("Orange");
        ls.add("green");   // ✅ fixed
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        System.out.println("Before sorting:");
        System.out.println(ls);

        Collections.sort(ls);  // sorts alphabetically

        System.out.println("After sorting:");
        System.out.println(ls);
    }
}