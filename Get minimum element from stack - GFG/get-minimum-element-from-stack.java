//{ Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}



// } Driver Code Ends

class GfG {
     private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public GfG() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);

        //get the minimum
        val = Math.min(val, minStack.isEmpty() ? val : minStack.peek());

        minStack.push(val);
    }
    
    public int pop() {
        if (!stack.isEmpty())
        {
        int x =stack.pop();
        minStack.pop();
        return x;
        }
        else
        {
            return -1;
        }
    }
    
    public int getMin() {
        if (!stack.isEmpty())
        return minStack.peek();
        else
        return -1;
    }
}
