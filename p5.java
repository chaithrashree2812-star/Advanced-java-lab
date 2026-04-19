package ArrayList;

import java.util.*;

public class p5 {

    public static void main(String[] args) {

        List<String> ls = new ArrayList<>();

        ls.add("Orange");
        ls.add("green");
        ls.add("pink");
        ls.add("red");
        ls.add("Blue");

        String str = "green";

        System.out.println("Original List: " + ls);

        System.out.println("Removing element: " + str + " -> " + ls.remove(str));

        System.out.println("After removal: " + ls);
    }
}