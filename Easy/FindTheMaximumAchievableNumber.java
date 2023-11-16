import java.util.Scanner;
/*
Problem Name : Find the Maximum Achievable Number
Problem URL : https://leetcode.com/problems/find-the-maximum-achievable-integer-after-k-operations/
*/

class Solution {
    public int theMaximumAchievableX(int num, int t) {
        return (num+(2*t));
    }
}

public class FindTheMaximumAchievableNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int t = sc.nextInt();

        sc.close();

        Solution sol = new Solution();
        System.out.println(sol.theMaximumAchievableX(num, t));
    }
}