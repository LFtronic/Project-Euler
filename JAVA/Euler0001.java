package JAVA;

import java.util.*;

public class Euler0001 {

    public static long getTotalMultiplesOf(int a, int b, long n) {
        long tA = 0; // count of multiples of a
        long tB = 0; // count of multiples of b
        long tLCM = 0; // count of multiples of least common multiple of a and b 
        if (a < b) {
            if (b % a == 0) {
                tA = a * ((n / a) * ((n / a) + 1)) / 2;
            } else {
                tA = a * ((n / a) * ((n / a) + 1)) / 2;
                tB = b * ((n / b) * ((n / b) + 1)) / 2;
                tLCM = a*b * ((n / a*b) * ((n / a*b) + 1)) / 2;
            }
        } else if (a > b) {
            if (a % b == 0) {
                tB = b * ((n / b) * ((n / b) + 1)) / 2;
            } else {
                tA = a * ((n / a) * ((n / a) + 1)) / 2;
                tB = b * ((n / b) * ((n / b) + 1)) / 2;
                tLCM = a*b * ((n / a*b) * ((n / a*b) + 1)) / 2;
            }
        } else { // if (a == b) 
            tA = a * ((n / a) * ((n / a) + 1)) / 2;
        }
        return tA+tB-tLCM;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            int a = 3;
            int b = 5;
            System.out.println(getTotalMultiplesOf(a, b, n-1));  
        }
        in.close();
    }
}
