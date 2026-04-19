package StringExercise;

public class StringExercise7 {

	
		// User-defined function
	    public static String truncate(String str, int length) {
	        if (str.length() <= length) {
	            return str;
	        }
	        return str.substring(0, length) + "...";
	    }

	    public static void main(String[] args) {
	        String input = "Java Programming Language";

	        System.out.println("Output: " + truncate(input, 10));
	    }
	}