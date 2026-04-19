class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st= new Stack<>();
        for (int i = 0; i < op.length; i++) {
            switch (op[i]) {             // fix 1: Switch → switch
                case "+":
                    int n1 = st.pop();
                    int n2 = st.peek();
                    st.push(n1);
                    st.push(n1 + n2);
                    break;
                case "C":
                    st.pop();
                    break;
                case "D":
                    st.push(2 * st.peek()); // fix 2: pop() → peek() ← KEY FIX
                    break;
                default:
                    st.push(Integer.parseInt(op[i]));
                    break;
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
        
    }
}
