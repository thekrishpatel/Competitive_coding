class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack();
        String str="+-*/";
        for(String s:tokens)
        {
            if(str.contains(s)&&!stack.isEmpty()){
              int a=stack.pop();
              int b=stack.pop();
              int ans = 0;
              switch (s) {
                        case "+":
                            ans = b + a;
                            break;
                        case "-":
                            ans = b - a;
                            break;
                        case "/":
                            ans = b / a;
                            break;
                        case "*":
                            ans = b * a;
                            break;
                    }
              stack.push(ans);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();

    }
}