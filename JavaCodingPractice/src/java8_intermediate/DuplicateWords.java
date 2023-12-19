package java8_intermediate;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class DuplicateWords {
  public static String removeDuplicates(String s) {
    // Split the input strings into individual words.
    String[] words = s.split(" ");

    // Create a `LinkedHashMap` to store unique words while preserving the insertion order.
    LinkedHashMap<String, String> uniqueWords = new LinkedHashMap<>();

    // Iterate through each word in the sentence.
    for (int i = 0; i < words.length; i++) {
      // Convert the word to lowercase for case-insensitive comparison.
      String word = words[i].toLowerCase();

      // Check if the word is not already present in the `uniqueWords` map.
      if (!uniqueWords.containsKey(word)) {
        // If not present, add it to the map with its original casing.
        uniqueWords.put(word, words[i]);
      }
    }

    // Create a list containing the values (original casing) from the `uniqueWords` map.
    List<String> values = new ArrayList<>(uniqueWords.values());

    // Join the unique words back into the sentence and return it.
    return String.join(" ", values);
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    // Read the number of input sentences.
    int numOfSentences = input.nextInt();
    // Consume the newline character after reading the number.
    input.nextLine();

    // Process each sentence and remove duplicates.
    for (int i = 0; i < numOfSentences; i++) {
      String s = input.nextLine();
      System.out.println(removeDuplicates(s));
    }
  }
}