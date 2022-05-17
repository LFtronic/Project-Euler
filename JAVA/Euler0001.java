package JAVA;

import java.util.*;

public class Euler0001 {

    public static long getMultiplesOf(int a, int b, long n) {
        long t1 = a * ((n / a) * ((n / a) + 1)) / 2;
        long t2 = b * ((n / b) * ((n / b) + 1)) / 2;
        long t3 = a*b * ((n / a*b) * ((n / a*b) + 1)) / 2;
        return t1+t2-t3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            int a = 3;
            int b = 5;
            System.out.println(getMultiplesOf(a, b, n-1));  
        }
        in.close();
    }
}
