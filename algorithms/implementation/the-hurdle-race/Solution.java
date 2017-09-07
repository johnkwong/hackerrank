import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int [n];
        int max  = 0;
        for(int i = 0; i < n; i++){
            height[i] = in.nextInt();
            if(height[i] > k && height[i] > max)
                max = height[i];
        }
        System.out.println((k > max) ? 0 : max - k);
    }

}
