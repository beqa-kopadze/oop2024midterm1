package midterm.beka_kopadze_2.task4;

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Create a set of all different words
        Set<String> uniqueWords = new HashSet<>(fantasyFormatData);
        System.out.println("Set of all different words:");
        System.out.println(uniqueWords);

        // Create a map where the key is the length of the word and the value is the number of words with the corresponding length
        Map<Integer, Integer> wordLengthCount = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthCount.put(length, wordLengthCount.getOrDefault(length, 0) + 1);
        }
        System.out.println("\nMap of word lengths and their counts:");
        System.out.println(wordLengthCount);

        // Write the results to the "task4.txt" file
        try (FileWriter writer = new FileWriter("src/midterm/beka_kopadze_2/task4/task4.txt")) {
            writer.write(uniqueWords.toString() + "\n\n");
            writer.write(wordLengthCount.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
