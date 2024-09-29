class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> s = new Stack<>();
        int[] r = new int[t.length];
        for (int i=0; i<t.length; i++) {
            while(!s.isEmpty() && t[s.peek()]<t[i]) {
                r[s.peek()] = i-s.peek();
                s.pop();
            }
            s.push(i);
        }
        return r;
    }
}
