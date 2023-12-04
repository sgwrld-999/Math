package Medium;

import java.util.Scanner;

/*
 * Problem name : Pow(x, n)
 * Problem link : https://leetcode.com/problems/powx-n/
 * Explanation :
 * Approach 1 : Brute Force -> Iterate n times and multiply x with itself
 *            Time Complexity : O(n)
 * Approach 2 : Divide and Conquer -> Divide n by 2 and multiply x with itself
 *           Time Complexity : O(logn)
 * Example :
 * 1:  x = 2, n = 10
 *          2^10 = 2^5 * 2^5
 *          2^5 = 2^2 * 2^2 * 2
 *          2^2 = 2 * 2
 *          2^1 = 2
 *          2^0 = 1
 * 2 : x = 3 , n = 9
 *      3^9 = 3^4 * 3^4 * 3
 *      3^4 = 3^2 * 3^2
 *      3^2 = 3 * 3
 *      3^1 = 3
 *      3^0 = 1
 */

class Solution {
    public double myPow(double x, int n) {
        if(n < 0){
            n = -n;
            x = 1 / x ;
        }
        double pow = 1;
        while( n != 0){
            if((n & 1) != 0){
                pow *= x;
            }
            x *= x;
            n >>>= 1;
        }
        return pow;
    }
}

class Solution2 {
    public double myPow(double x, int n) {
        if(n < 0){
            n = -n;
            x = 1 / x ;
        }
        double pow = 1;
        while( n != 0){
            if((n%2) != 0){
                pow *= x;
            }
            x *= x;
            n = n / 2 ;
        }
        return pow;
    }
}

public class PowXN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        Solution sol = new Solution();
        System.out.println(sol.myPow(x, n));
        sc.close();
    }
}