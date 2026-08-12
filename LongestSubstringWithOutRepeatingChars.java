// LC: 3
// Longest Substring Without Repeating Characters

import java.util.Arrays;

public class LongestSubstringWithOutRepeatingChars {

    // finds longest String with repeating char in a window
    public static int getLongest(String s){
        int longest = 0;

        int[] temp = new int[128];
        Arrays.fill(temp,-1);

        int st = 0;
        for(int end = 0;end<s.length();end++){
            char ch = s.charAt(end);

            // imp part we checking " if the visited character present inside valid window means if its true then we already saw same char inside 
            // our valid window so move valid window to that char position + 1.
            if(temp[ch]>=st){
                st = temp[ch]+1;
            }

            temp[ch] = end;
            longest = Math.max(longest,end-st+1);

        }
        return longest;
    }
    public static void main(String[] args) {
        System.out.println(getLongest("abbabcdb"));
    }
}