package Medium;
import java.util.*;
/*
Problem name : Elimination Game
Problem Link : https://leetcode.com/problems/elimination-game/description/
Explanation : 
    There are two approaches to solve this problem. 
    1. Using ArrayList
    2. Using Recursion
    Both the approaches are explained below.
    Approach 1 : 
        In this approach, we use an ArrayList to store the numbers. 
        We start from the left and remove the numbers at even positions. 
        Then we reverse the list and remove the numbers at even positions. 
        We repeat this process until we are left with only one number.
        Time Complexity : O(n^2)
        Space Complexity : O(n)
    Approach 2 :  https://leetcode.com/problems/elimination-game/solutions/4277182/mathematical-approach-recursion-o-log-n/
*/
// Approach 1 : Using ArrayList and recusion

class Solution{
    public void solve(List<Integer> list,int flag){
        if(list.size() == 1){
            return;
        }
        if(flag == 1){
            for(int i = 0 ; i < list.size() ; i= i+2){
                list.remove(i);
            }
        } else{
            for(int i = list.size()-1 ; i >= 0 ; i = i-2){
                list.remove(i);
            }
        }
        if(flag == 1){
            solve(list,0);
        } else{
            solve(list,1);
        }
    }
    public int lastRemaining(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(i+1);
        }
        return list.get(0);
    }
}
//Approach 2 : Using Recursion
class Solution2 {
    public int lastRemaining(int n) {
        if(n==1) return 1;
        return (2*(n/2+1-lastRemaining(n/2)));
    }
}
public class EliminationGame{
    public static void main(String[] args){
        Solution sol = new Solution();
        int n = 9;
        System.out.println(sol.lastRemaining(n));
    }
}