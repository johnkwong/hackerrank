import java.io.*;
import java.util.*;

public class Solution {

   public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      for(int i = 0; i < n; i++){
         for(int j = 0; j < n; j++){
            if(j < (n - i - 1)){ System.out.print(' ');}
            else{ System.out.print('#');}
         }
         System.out.println();
      }
   }
}
