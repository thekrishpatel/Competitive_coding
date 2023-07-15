//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String s;
            s = in.readLine().trim();

            Solution ob = new Solution();

            out.println(ob.reverseEqn(s));
        }
        out.close();
    }
}
// } Driver Code Ends

// User function Template for Java
class Solution {

    String reverseEqn(String S) {
        Stack<String> st = new Stack<>();
        String s = "";
        String answer = "";
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '+' || S.charAt(i) == '-' || S.charAt(i) == '*' || S.charAt(i) == '/') {
                st.push(s);
                st.push(S.charAt(i) + "");
                s = "";
            } else {
                s = s + "" + S.charAt(i) + "";
            }
        }
        st.push(s);
        while (!st.isEmpty()) {
            answer = answer + "" + st.pop();
        }

        return answer;
    }
}
