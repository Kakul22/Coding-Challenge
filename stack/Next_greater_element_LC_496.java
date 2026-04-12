class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();  // value  -> next greater value
        Stack<Integer> st = new Stack<>();      // it will store not index  
        for (int i=0;i<nums2.length;i++) {
            while (!st.isEmpty()&&st.peek()<nums2[i]) {
                map.put(st.pop(),nums2[i]);      // found next greater for popped value
            }
            st.push(nums2[i]);                         // push the value itself
        }
        int[] ans = new int[nums1.length];
        for (int i=0;i<nums1.length; i++) {
            ans[i]=map.getOrDefault(nums1[i], -1);  // -1 if no greater found
        }
        return ans;
        
    }
}
