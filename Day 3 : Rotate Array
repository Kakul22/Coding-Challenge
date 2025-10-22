//rotate an array by d steps in clockwise direction


class Solution {
    static void reverse(int arr[],int start,int end){           //swapping the element at start and end indexes
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
    }
    }
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int  n = arr.length;
        d%=n;
        if(d==0||n<=1){
            return ;
        }
        reverse(arr,0,d-1);                 // reverse the first part   (move elements to end)
        reverse(arr,d,n-1);                 // reverse the second part  (move elements to front)
        reverse(arr,0,n-1);                 // reverse both parts togeather
        
            
        }
    
    
}
