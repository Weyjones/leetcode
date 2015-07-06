public class Solution {
    public boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<Character>();
		//comment
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(ch.isAlphabetic(ch) || ch.isDigit(ch)){
                stack.add(ch);
                queue.add(ch);
            }
        }
        while(stack.size()!=0){
            if(stack.pop() != queue.poll())
                return false;
        }
        return true;
    }
}
