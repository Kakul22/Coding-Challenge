class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int num:nums){
            ans^=num;
        }
        return ans;
    }
}


Input: nums = [2,2,1]     Output: 1
Input: nums = [4,1,2,1,2] Output: 4
