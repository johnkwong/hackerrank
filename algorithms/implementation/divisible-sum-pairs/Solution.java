import java.io.*;
import java.util.*;

public class Solution{
    static int divisibleSumPairs(int[] ar, int k){
        int count = 0;
        for(int i = 0; i < ar.length; i++){
            for(int j = 0; j < ar.length; j++){
                if(i < j && ((ar[i]+ar[j]) % k) == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int []ar = new int[n];
        for(int i = 0; i < n;i++){
            ar[i] = in.nextInt();
        }
        System.out.println(divisibleSumPairs(ar, k)); 
    } 
}
