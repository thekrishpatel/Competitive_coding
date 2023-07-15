//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> s = new Stack<>();
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {

            if (!s.isEmpty()
                    && (S.charAt(i) == '+' || S.charAt(i) == '-' || S.charAt(i) == '/' || S.charAt(i) == '*')) {
                int a = s.pop();
                if (!s.isEmpty()) {
                    int b = s.pop();
                    switch (S.charAt(i)) {
                        case '+':
                            ans = b + a;
                            break;
                        case '-':
                            ans = b - a;
                            break;
                        case '/':
                            ans = b / a;
                            break;
                        case '*':
                            ans = b * a;
                            break;
                    }
                    s.push(ans);
                } else {
                    s.push(a);
                }
            } else {
                int a = S.charAt(i) - '0';
                s.push(a);
            }
        }
        return ans;
    }
}