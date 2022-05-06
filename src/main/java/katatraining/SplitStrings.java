package katatraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStrings {

    /*Complete the solution so that it splits the string into pairs of two characters.
    If the string contains an odd number of characters
    then it should replace the missing second character of the final pair with an underscore ('_').
    kyu 6
    */

    /*
    * * 'abc' =>  ['ab', 'c_']
     * 'abcdef' => ['ab', 'cd', 'ef']
     * */

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution("abcdefg")));
    }

    public static String[] solution(String s)
    {
        List<String> results = new ArrayList<>();

            if (s.length()%2 == 1){
                s = s+"_";
            }
        for (int i = 0; i < s.length(); i+=2){
            results.add(s.substring(i, Math.min(s.length(), i + 2)));
            }

        return results.toArray(new String[0]);

        /*// if it's blank, then return
        if (s.length()==0) return new String[0];

        // if not even, then add an underscore to the end
        if (s.length()%2!=0) {
            s+="_";
        }

        // determine the space needed for the return array
        int spaceNeeded = s.length()/2;

        // create a new array to populate and return
        String[] out = new String[spaceNeeded];

        // create an builder index
        int j = 0;

        // loop through the input string
        for (int i=0; i<s.length(); i++) {

            // create a new string to build
            StringBuilder sb = new StringBuilder();
            // add the current item
            sb.append(s.charAt(i));
            // add the next item
            sb.append(s.charAt(i+1));

            // populate our output string as we go
            out[j] = sb.toString();

            // increment both counters
            i++;
            j++;
        }

        // return the built string
        return out;*/
    }
}
