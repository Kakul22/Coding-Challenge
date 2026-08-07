class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++ ){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[] {-1,-1};


// second method two pointer 
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int sum=nums[start]+nums[end];
            if(sum==target){
                return new int[] {start+1,end+1};
            }
            else if (sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
