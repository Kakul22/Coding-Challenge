lass StockSpanner {

    Stack<int[]> st;
    int idx;
    // Stack mein store karenge [index, price] pairs
    // decreasing stack — top pe hamesha sabse bada price

    public StockSpanner() {
        st=new Stack<>();
        idx=0;
        
    }
    public int next(int price) {
        while(!st.isEmpty() && st.peek()[1]<=price){// jo bhi stack mein price <= current price hai → pop karo
            st.pop();
        }
        int span=0;
        if(st.isEmpty()){
            span=idx+1;
        }
        else{
            span=idx-st.peek()[0];       // span = current index - index of last greater price
        }

        st.push(new int[]{idx, price}); // current ko push karo
        idx++;                         // next call ke liye index badhao


        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
