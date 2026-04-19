package StringExercise;

public class StringExercise3 {
	public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {
        String input = "Hello";

        String output = reverseString(input);
        System.out.println("Reversed string: " + output);
    }
}

