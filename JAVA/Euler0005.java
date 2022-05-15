package JAVA;

import java.util.*;

public class Euler0005 {

    public static int getSmallestDivisible(int n, int f) {
        int r = n;
        System.out.println(r + " eike");
        if (n >= f) {
            r *= getSmallestDivisible(n-1, f+1);
            int x = n - f;
            if (n % 2 == 0 && x % 2 == 0 && n >= 3) {
                return r / 2;
            } else {
                return r;
            }
        }
        return r;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int f = Math.floorDiv(n, 2);
            int smallNum = getSmallestDivisible(n, f);
            System.out.println(smallNum);
        }
        in.close();
    }

}
