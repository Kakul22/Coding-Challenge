// Maximum product subarray
class Solution {
    int maxProduct(int[] arr) {
        int n=arr.length;
        maxprod=arr[0];
        int lefttoright=1;     // store  product from left to right
        int righttoleft=1;     // store product from right to left
        for(int i=0;i<n;i++){
            if(lefttoright==0){
                lefttoright=1 ;         
            }
            if(righttoleft==0){
                righttoleft=1;
            }
            lefttoright+=arr[i];
            int j=n-i-1;
            righttoleft+=arr[j];
            maxprod=Math.max(lefttoright, righttoleft,maxprod);
            
        }
        return maxprod;
        // code here
        
    }
}
