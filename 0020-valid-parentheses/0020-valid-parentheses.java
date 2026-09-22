import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> St = new Stack<>(); 
        
        for (char ch : s.toCharArray()) { 
            if (ch == '[' || ch == '{' || ch == '(') { 
                St.push(ch);
            }
            else if (St.isEmpty()) {
                return false;
            }
            else if ((ch == ']' && St.peek() != '[') || 
                     (ch == '}' && St.peek() != '{') || 
                     (ch == ')' && St.peek() != '(')) {
                return false;
            }
            else {
                St.pop(); 
            }
        }
        return St.isEmpty(); 
    }
}
