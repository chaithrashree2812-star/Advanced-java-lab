package StringExercise;

public class StringExercise6 {
	public static String capitalizeWords(String str) {
        String[] words = str.split("\\s+");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                result += Character.toUpperCase(word.charAt(0)) 
                        + word.substring(1).toLowerCase() + " ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String input = "java is easy";

        System.out.println("Output: " + capitalizeWords(input));
    }
}