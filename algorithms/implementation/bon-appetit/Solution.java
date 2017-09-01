import java.io.*;
import java.util.*;

public class Solution {
    
    static int bonAppetit(int k, int b, int[]ar){
        int sum = 0;
        for(int i=0; i<ar.length; i++){
            if(i != k){ sum += ar[i];}
        }
        int b_a = sum/2;
        return b - b_a;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int []ar = new int[n];
        for(int i=0; i< n; i++){
            ar[i] = in.nextInt();
        }
        int b = in.nextInt();
        if(bonAppetit(k,b,ar) > 0){
            System.out.println(bonAppetit(k,b,ar));
        }else{
            System.out.println("Bon Appetit");
        }
    }

}
