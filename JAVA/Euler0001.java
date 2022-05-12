package JAVA;

import java.util.*;

public class Euler0001 {

    public static long getMultiplesOf3and5(long n) {
        long t1 = 3 * ((n / 3) * ((n / 3) + 1)) / 2;
        long t2 = 5 * ((n / 5) * ((n / 5) + 1)) / 2;
        long t3 = 15 * ((n / 15) * ((n / 15) + 1)) / 2;
        return t1+t2-t3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            System.out.println(getMultiplesOf3and5(n-1));  
        }
        in.close();
    }
}
