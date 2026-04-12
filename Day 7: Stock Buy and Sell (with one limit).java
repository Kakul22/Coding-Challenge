// stock buy and sell with one limit

class Solution {
    public int maximumProfit(int prices[]) {
        int max_profit=0;
        int minprice=Integer.MAX_VALUE;    // or int minprice=prices[0]                     
        for(int price:prices){
            if(price<minprice)               // check if any price is less than the minprice
            {
                minprice=price;           
            } 
            else if(price-minprice > max_profit)               // check if the minprice and price makes a max profit if yes than store that value in max_profit
            {
                max_profit=price-minprice;    
            }
        }
        return max_profit;
        
    }
}
