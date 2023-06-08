//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends

class Solution {

    public String reverse(String S) {
        Stack<String> s = new Stack<>();
        String ans = "";
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            s.push(c + "");
        }
        do {
            ans = ans + s.pop();
        } while (!s.isEmpty());
        return ans;
    }

}