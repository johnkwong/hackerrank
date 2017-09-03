import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 5;
        int like =0 , dislike = 0, total_like = 0;
        for(int i = 0; i < n; i++){
            like = (int)Math.floor(m/2);
            dislike = m - like;
            m = like * 3;
            total_like += like;        
        }
        System.out.println(total_like);

    }

}
