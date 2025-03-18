package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet1002 {
    
    // This will arrange the characters in ascending order.
    public static String ascending(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static List<String> commonChars(String[] words) {
        // Initialize the frequency array with the first word's character frequencies
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for (String word : words) {
            int[] charCount = new int[26];
            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }
            // Update the minFreq array to keep the minimum frequency of each character
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], charCount[i]);
            }
        }

        // Construct the result list based on the minFreq array
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minFreq[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        System.out.println(commonChars(words));
    }
}
