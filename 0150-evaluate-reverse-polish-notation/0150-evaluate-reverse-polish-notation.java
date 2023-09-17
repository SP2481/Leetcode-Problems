class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token:tokens){
            if(token.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(token.equals("-")){
                int a = (int) stack.pop();
                int b = (int) stack.pop();
                stack.add(b - a);
            }else if(token.equals("/")){
                int a = (int) stack.pop();
                int b = (int) stack.pop();
                stack.add(b/a);
            }else if(token.equals("*")){
                stack.add(stack.pop() * stack.pop());
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}