class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j = 0;
        Stack<Integer> S = new Stack<>();
        for(int input : pushed){
            S.push(input);
        while(!S.isEmpty() && S.peek() == popped[j]){
            S.pop();
            j++;
        }
        }
        return S.isEmpty();
    }
}