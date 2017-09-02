import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[]h = new int[26];
        for(int i = 0; i < 26; i++){
            h[i] = in.nextInt();
        }
        String words = in.next();
        char [] words_ar = words.toCharArray();
        int w_h = 0;
        for(char c : words_ar){
            if(h[c-97] > w_h){
                w_h = h[c-97];
            }
        }
        System.out.println(w_h * words_ar.length);
    }
}
