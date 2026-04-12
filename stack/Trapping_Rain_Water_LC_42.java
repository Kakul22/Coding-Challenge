class Solution {
    public int trap(int[] height) {
        Stack<Integer>st= new Stack<>();
        int ans=0;
        int n=height.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && height[i]>height[st.peek()]){
                int mid=st.pop();  // beech wala element jha paani fill hoga 
                if(st.isEmpty()){
                    break;
                }
                int l=st.peek();
                //int width =i-st.peek()-1; // width= left and right k beech k gap
                int h = Math.min(height[i]-height[mid],height[l]-height[mid]);//  height/h= min(left boundary,right boundary)-mid
                int w=i-l-1;
                ans+=(h*w);
                
            }
            st.push(i);
            }
            
        
        return ans;
    }
        
    
}
