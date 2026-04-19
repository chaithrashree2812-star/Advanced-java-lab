package StringExercise;

public class StringExercise5 {
	public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String input = "Java is very easy";

        String result = removeWhitespace(input);
        System.out.println("After removing whitespace: " + result);
    }
}