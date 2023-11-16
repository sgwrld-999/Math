#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int reverse(int x) {
        long long temp = x; // Using long long to avoid overflow
        bool flag = false;
        if (temp < 0) {
            temp *= -1;
            flag = true;
        }
        int rem = 0;
        int t = 0;
        while (temp != 0) {
            rem = temp % 10;
            temp = temp / 10;
            if (t > INT_MAX / 10 || (t == INT_MAX / 10 && rem > 7)) return 0;
            if (t < INT_MIN / 10 || (t == INT_MIN / 10 && rem < -8)) return 0;
            t = t * 10 + rem;
        }
        if (!flag) return t;

        return (-1 * t);
    }
};
 
 int main(){
    int n ;
    cin >> n;
    Solution s;
    cout << s.reverse(n) << endl;
    return 0;
 }