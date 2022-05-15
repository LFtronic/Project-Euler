package JAVA;

import java.util.*;

public class Euler0005 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int smallNum = n;
            for (int i = n-1; i > 1; i--) {
                smallNum *= i;
            }
            System.out.println(smallNum);
        }
        in.close();
    }

}
