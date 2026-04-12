// multiple trasactions are allowed 
class Solution{
    public int maximumProfit(int[] prices){
        int profit=0; 
        for(int i=1;i<prices.length;i++){                        //till the end of the prices array 
            if(prices[i]>prices[i-1]){                           // check if values of one prices is greater than prices of the the privios one 
                profit+=prices[i]-prices[i-1];                   // increase the profit 
            }
        }
        return profit;
    }
        
}
