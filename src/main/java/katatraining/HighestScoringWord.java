package katatraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HighestScoringWord {

    public static void main(String[] args) {

        System.out.println(high("b aa"));
    }

    /*
    * Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.
    * */
    public static String high(String s) {

        String highestWord = "";
        int biggest = 0;
        String result = "";
        String[] words = s.split("\\s");
        List<String> wordsList = new ArrayList<>(Arrays.asList(words));
        for (int i = 0; i < wordsList.size() ; i++) {
            // getting the individual letter within the individual word
            int sum = 0;
            for (int j = 0; j < wordsList.get(i).length() ; j++) {
                char ch = wordsList.get(i).charAt(j);
                sum += ch -96;
            }
            if (sum > biggest){
                biggest = sum;
                highestWord = wordsList.get(i);
            }
        }
        return highestWord;
    }
}
