package JAVA;

import java.util.*;

public class Euler0003 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long d = 2;
            long maxPF = 0;
            while (n > 1) {
                while (n % d == 0) {
                    if (d > maxPF) {
                        maxPF = d;
                    }
                    n /= d;
                }
                if (d % 2 == 0) {
                    d += 1;
                } else {
                    d += 2;
                }
                if (d*d > n) {
                    if (n > 1) {
                        if (d > maxPF) {
                            maxPF = n;
                        }
                    }
                    break;
                }
                  
            } 
            System.out.println(maxPF);   
        }
        in.close();
    }

}
