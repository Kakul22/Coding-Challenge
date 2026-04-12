// second largest element in an aaray  
class Solution {
    public int getSecondLargest(int[] arr) {
        if(arr.length<2){
            return -1;
        }
        int max=Integer.MIN_VALUE;             // assigning the minimum possible value i.e 2^31 (smallest value of integer type) 
        int sec_max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                sec_max=max;
                max=arr[i];
            }
            else if(arr[i]>sec_max && arr[i]!=max){
                sec_max=arr[i];
            }
        }
        
         return (sec_max==Integer.MIN_VALUE?-1:sec_max);
        
    }
    
}
