//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends



class Solution
{

    public static int[] calculateSpan(int price[], int n) {
        int span[] = new int[n];
        Stack<Integer> sn = new Stack<>();

        span[0] = 1;
        sn.push(0);

        for (int i = 1; i < n; i++) {
            int currentprice = price[i];

            while (!sn.isEmpty() && currentprice >= price[sn.peek()]) {
                sn.pop();
            }
            if (sn.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevhigh = sn.peek();
                span[i] = i - prevhigh;
            }
            sn.push(i);
        }
        return span;
    }
}