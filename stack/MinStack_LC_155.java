class MinStack {

    Stack<Integer> st=new Stack<>(); // main stack
    Stack<Integer> minst=new Stack<>(); // min tracker

    public void push(int val) {
        st.push(val);
        if (minst.isEmpty()||val<=minst.peek()) {
            minst.push(val);
        }
    }

    public void pop() {
        int val=st.pop();
        if (val==minst.peek()) {
            minst.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minst.peek(); // O(1)
    }
}
