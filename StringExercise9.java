package StringExercise;

import java.util.Random;

public class StringExercise9 {
	public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String result = "";
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            result += chars.charAt(random.nextInt(chars.length()));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Random String: " + generateRandomString(8));
    }
}