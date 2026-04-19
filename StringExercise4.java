package StringExercise;

public class StringExercise4 {
	 public static boolean isPalindrome(String str) {
	        // Remove punctuation and spaces, convert to lowercase
	        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        String input = "Madam, I’m Adam";

	        if (isPalindrome(input)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }
	    }
	}