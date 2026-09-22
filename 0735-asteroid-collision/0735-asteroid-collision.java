import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int ast : asteroids) {
            boolean exploded = false;
            while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
                if (stack.peek() < Math.abs(ast)) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == Math.abs(ast)) {
                    
                    stack.pop();
                    exploded = true;
                    break;
                } else {
                    
                    exploded = true;
                    break;
                }
            }
            
            
            if (!exploded) {
                stack.push(ast);
            }
        }
        
       
        int[] ans = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        
        return ans;
    }
}
