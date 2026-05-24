class Solution {
    public int minimumSwaps(int[] nums) {
        int min=0;
        int swap=0;
        for(int num:nums){
            if(num==0){
                swap++;
            }
        }
        for(int i=nums.length-swap;i<nums.length;i++){
            if(nums[i]!=0){
                min++;
            }
        }
        return min;
    }
}
