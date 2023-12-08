package Medium;
import java.util.*;
/*
 * Problem name : Count Primes
 * Problem link : https://leetcode.com/problems/count-primes/
 * Explanation :
 * Approach 1 : Brute Force -> Iterate from 2 to n-1 and check if the number is prime or not
 *           Time Complexity : O(n^2)
 * Approach 2 : Sieve of Eratosthenes -> Mark all the multiples of a number as not prime
 *             Flow of code :
 *              - Create a boolean array of size n+1 and mark all the numbers as prime
 *              - Mark 0 and 1 as not prime
 *              - Iterate from 2 to sqrt(n) and mark all the multiples of a number as not prime 
 *              - Count the number of primes
 *              Time Complexity : O(nloglogn)
 */
class Solution {
    public int countPrimes(int n) {

        if(n==1 || n==0)
        return 0;

        
        return primeNumbersTillN(n);
    }

    public int primeNumbersTillN(int n)
    {
     
        boolean isPrime[] = new boolean[n+1];

        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2;i*i<=n;i++){

            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }

        }

        int cnt=0;

        for(int i=2;i<isPrime.length-1;i++){
            if(isPrime[i]){
                cnt++;
            }
        }

        return cnt;
    }
}
public class countPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
        System.out.println(sol.countPrimes(n));
        sc.close();
    }    
}

//_______________________________________________________________________________________________________________________________
/*
GFG : Count primnes in a range
Problem link : https://practice.geeksforgeeks.org/problems/prime-number-in-a-range/0/?track=md-mathematics&batchId=144
Code in C++ ; 
//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    int totalPrimes(int l, int r) {
        vector<bool> isPrime(r + 1, true);
        isPrime[0] = false;
        isPrime[1] = false;

        int ctr = 0;
        for (int i = 2; i <= sqrt(r); i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j <= r; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = l; i <= r; i++) {
            if (isPrime[i]) ctr++;
        }

        return ctr;
    }

    int countPrimes(int L, int R) {
        if (R <= 2) return 0;
        if (R == 3) return 1;
        if (L <= 2) return totalPrimes(2, R);

        return totalPrimes(L, R);
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int L, R;
        cin >> L >> R;
        Solution ob;
        int ans = ob.countPrimes(L, R);
        cout << ans << "\n";
    }
}
// } Driver Code Ends 

 */