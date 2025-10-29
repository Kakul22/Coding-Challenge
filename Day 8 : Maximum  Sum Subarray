// Maximum Sum  Subarray using Kadene's Algorithm

class Solution {
    int maxSubarraySum(int[] arr) {
        int maxending=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){                                   // track the maxending and res of the elements of an array arr[0]+arr[1]  ... 
            maxending=Math.max(arr[i], maxending+arr[i]);               // in built function to find maximum of any array 
            res=Math.max(res,maxending);      
        }
        return res;                                                      // return the maximum sum
        
    }
}
