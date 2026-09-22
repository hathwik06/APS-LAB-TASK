
class MinStack {
    
    private Stack<Integer> s;
    private Stack<Integer> ms;

    public MinStack() {
        s = new Stack<>();
        ms = new Stack<>();
    }
    
    public void push(int val) { 
        s.push(val);
        if (ms.isEmpty()) { 
            ms.push(val);
        } else {
            int min = Math.min(val, ms.peek());
            ms.push(min);
        }
    }
    
    public void pop() {
        s.pop();
        ms.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return ms.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */