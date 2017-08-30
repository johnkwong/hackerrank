import java.io.*;
import java.util.*;

public class Solution {
   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int[][] matrix = new int[n][n];
      int difference = 0;
      for(int i = 0; i < n; i ++){
         for(int j=0; j < n; j++){
            matrix[i][j] = s.nextInt();
         }
      }
      for(int i = 0; i < n; i++){
         int ii = n - i - 1;
         difference += matrix[i][i] - matrix[i][ii];
      }
      System.out.print(Math.abs(difference));
   }
}

