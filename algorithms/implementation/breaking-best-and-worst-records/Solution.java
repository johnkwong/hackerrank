import java.io.*;
import java.util.*;

public class Solution {

    static int[] getRecord(int[]s){
        int h_score = s[0];
        int l_score = s[0];
        int h_b = 0;
        int l_b =0;
        for(int i=0;i<s.length;i++){
            if(s[i]>h_score){
                h_score = s[i];
                h_b++;
            }
            if(s[i]<l_score){
                l_score = s[i];
                l_b++;
            }
        }
        return new int[] {h_b, l_b};
    }

    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]s = new int[n];
        for(int i_s=0; i_s<n; i_s++){
           s[i_s] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for(Integer val : result){
            System.out.print(separator + val);
            separator = delimiter;
        }
        
    }
}
