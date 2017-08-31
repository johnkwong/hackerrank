import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = s.next();
        }
        int q = s.nextInt();
        String[] qstr = new String[q]; 
        for(int i = 0; i<q;i++){
            qstr[i] = s.next();
        }
        
        for(int i = 0; i<q;i++){
            int count = 0; 
            for(int j = 0; j < n;j++){
                if(str[j].equals(qstr[i])){count++;}
            }
            System.out.println(count);
        }
    }
}
