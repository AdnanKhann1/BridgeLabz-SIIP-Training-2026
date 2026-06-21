import java.util.HashMap;
import java.util.Map;

public class SpyDecoder {

    public static String reverseMessage(String message) {
        return new StringBuilder(message).reverse().toString();
    }

    public static boolean isPalindrome(String message) {
        String cleaned = message.replaceAll("[^a-zA-Z0-String0-9]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static int[] countVowelsAndConsonants(String message) {
        int vowels = 0;
        int consonants = 0;
        String normalized = message.toLowerCase();

        for (int i = 0; i < normalized.length(); i++) {
            char ch = normalized.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }

    public static boolean areAnagrams(String intercept1, String intercept2) {
        String cleaned1 = intercept1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String cleaned2 = intercept2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleaned1.length() != cleaned2.length()) {
            return false;
        }

        Map<Character, Integer> charCounts = new HashMap<>();
        for (char ch : cleaned1.toCharArray()) {
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }

        for (char ch : cleaned2.toCharArray()) {
            if (!charCounts.containsKey(ch)) {
                return false;
            }
            int count = charCounts.get(ch);
            if (count == 1) {
                charCounts.remove(ch);
            } else {
                charCounts.put(ch, count - 1);
            }
        }

        return charCounts.isEmpty();
    }

    public static Character firstNonRepeatingCharacter(String log) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : log.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }
        for (char ch : log.toCharArray()) {
            if (counts.get(ch) == 1) {
                return ch;
            }
        }
        return null;
    }
}