package StringExercise;

public class StringExercise2 {

	public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // move forward
        }

        return count;
    }

    public static void main(String[] args) {
        String main = "java is fun java is easy java";
        String sub = "java";

        int result = countOccurrences(main, sub);
        System.out.println("Occurrences: " + result);
    }
}