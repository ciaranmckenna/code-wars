package katatraining;

import java.util.List;
import java.util.stream.Collectors;

public class RansomNote {

    public static void main(String[] args) {

        System.out.println(canConstructLetter("The quick brown fox jumps over the lazy dog", "visa"));
    }

    // return true or false if the note can be constructed from the text
    public static boolean canConstructLetter(String text, String note) {

        if(note==null){
            return false;
        }
        if(note.length() > text.length()){
            return false;
        }

        List<Character> textList = text.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> noteList = note.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        if (textList.containsAll(noteList)){
            return true;
        }
        return false;

    }
}
