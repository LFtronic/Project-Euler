package JAVA;

import java.util.*;

public class Euler0002 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            if (n < 2) {
                System.out.println(0);
            } else {
                long t1 = 0, t2 = 2;
                long sum = t1 + t2;
                while (t2 <= n) {
                    long t3 = 4 * t2 + t1;
                    if (t3 > n)
                        break;
                    t1 = t2;
                    t2 = t3;
                    sum += t2;
                }
                System.out.println(sum);
            }
        }
        in.close();
    }
}