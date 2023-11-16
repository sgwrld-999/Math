import java.util.Scanner;

class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0 ;
        int num2 = 0 ;

        for(int i = 1 ; i <= n ; i++){
            if(i%m != 0) num1 += i ;
            else if(i%m == 0) num2 += i ;
        }

        return (num1-num2);
    }
}

public class DivisibleandNonDivisibleSumsDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.differenceOfSums(n, m));
    }
}