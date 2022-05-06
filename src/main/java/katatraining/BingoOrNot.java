package katatraining;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class BingoOrNot {

    public static void main(String[] args) {

        int[] loseInput ={1,2,3,4,5,6,7,8,9,10};
        int[] winInput ={21,13,2,7,5,14,7,15,9,10};
        int[] codeWarsInput ={14, 29, 15, 14, 8, 17, 7, 26, 2, 11};

        System.out.println(bingo(codeWarsInput));
    }

    public static String bingo(int[] numberArray) {

        Set<Integer> integerSet = Arrays.stream(numberArray).boxed().collect(Collectors.toSet());

        int count = 0;

        for (Integer i : integerSet) {

            if (i == 2) {
                count++;
            }
            if (i == 7) {
                count++;
            }
            if (i == 9) {
                count++;
            }
            if (i == 14) {
                count++;
            }
            if (i == 15) {
                count++;
            }
        }
        return count < 5 ? "LOSE" : "WIN";
    }
}
