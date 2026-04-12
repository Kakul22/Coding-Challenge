#move all zeroes to end 
class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int temp;                   
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {  
                temp = nums[i];              # swapping all the non zero numbers first
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
        }

    }
}
