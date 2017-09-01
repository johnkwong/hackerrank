import java.io.*;
import java.util.*;
import java.math.*;
public class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i =0; i< n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            if(Math.abs(z - x) < Math.abs(z - y)){
                System.out.println("Cat A");
            }else if(Math.abs(z - x) > Math.abs(z - y)){
                System.out.println("Cat B");
            }else{
                System.out.println("Mouse C");
            }
        }
    }
}
