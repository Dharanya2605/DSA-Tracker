class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> ch=new Stack<>();
        String op="+-/*";
        for(int i=0;i<tokens.length;i++){
            String token=tokens[i];
            int res=0;
            if(op.contains(token)){
                int b=ch.pop();
                int a=ch.pop();
                if(token.equals("+")) res=a+b;
                else if(token.equals("-")) res=a-b;
                else if(token.equals("*")) res=a*b;
                else if(token.equals("/")) res=a/b;
                ch.add(res);
            }
            else ch.push(Integer.parseInt(token));
        }
       return ch.pop();
    }
}