class Solution {
    public boolean isValid(String s) {
        Deque<Character> dq=new ArrayDeque<>();
        for(char ch:s.toCharArray()){
            if(dq.isEmpty() || (ch=='(' || ch=='{' || ch=='[')){
                dq.push(ch);
            }
            else if(dq.peek()=='(' && ch==')'){
                dq.pop();
            }
            else if(dq.peek()=='{' && ch=='}'){
                dq.pop();
            }
            else if(dq.peek()=='[' && ch==']'){
                dq.pop();
            }
            else{
                return false;
            }

        }
        return dq.isEmpty();
    }
}