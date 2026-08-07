#move all zeroes to end 
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        for(int i=0,j=0;j<n;j++){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        
        
    }
}
