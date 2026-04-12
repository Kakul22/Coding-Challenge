//  smallest missing values 
int missingNumber(int arr[], int n) {
    
    int i=0;
    while(i<n){
        int value=arr[i];
        int correctidx=value-1;
        if(value>=1&& value<=n&&value!=arr[correctidx]){
            int temp=arr[correctidx];
            arr[correctidx]=value;
            arr[i]=temp;
        }
        else{
            i++;
        }
    }
    for(i=0;i<n;i++){
        if(arr[i]!=i+1){
            return i+1;
        }
    }
    return n+1;
    }
    // code here
    


