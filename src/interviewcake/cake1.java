package interviewcake;
//1. apple stock - make profit by buying and selling using yesterdays stock record

/*
******** Cake 1 *****
Writing programming interview questions hasn't made me rich. Maybe trading Apple stocks will.
Suppose we could access yesterday's stock prices as an array, where:

The values are the price in dollars of Apple stock.
A higher index indicates a later time.
So if the stock cost $500 at 10:30am and $550 at 11:00am, then:

stockPricesYesterday[60] = 500;

Write an efficient function that takes stockPricesYesterday and returns the best profit I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.

Gotcha: 
1. It is not sufficient to simply take the difference between the highest price and the lowest price, because the highest price may come before the lowest price. You must buy before you sell.
2. What if the stock value goes down all day? In that case, the best profit will be negative.
3. You can do this in O(n) time and O(1) space!

********************
pseudo code
stockPriceYesterday[] = {300,950,200,100,400,500,550,600}
find the lowest number and its index

 take first element - find the difference with next element, note the highest difference
 save the minimum - 
 
 
 buy
 sell
 
 max_gain
 min_buy
 





**/
public class cake1 {
	public static void main(String args[]){
		// int yesterdayStock[] = {300,350,400,200,250,400,500,100,700,800};
		int yesterdayStock[] = {900,850,700,600,550,400,300,200,110,100};
		int sell,max_gain = 0;
		int min_buy = yesterdayStock[0];
		
		for (int i=0;i < yesterdayStock.length -1 ;i++){
			sell = yesterdayStock[i+1];
			
			if((sell-min_buy > 0)  && (sell-min_buy) > max_gain){
				max_gain = sell - min_buy;
			} else if(sell < min_buy) {
				min_buy = sell;
			}	
		}	
		
		System.out.println("max_gain" + max_gain);
		System.out.println("min_buy" + min_buy);
		
	}

}




/***
 * 
 *   
 
public int getMaxProfit(int[] stockPricesYesterday) {

    // make sure we have at least 2 prices
    if (stockPricesYesterday.length < 2) {
        throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
    }

    // we'll greedily update minPrice and maxProfit, so we initialize
    // them to the first price and the first possible profit
    int minPrice = stockPricesYesterday[0];
    int maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];

    // start at the second (index 1) time
    // we can't sell at the first time, since we must buy first,
    // and we can't buy and sell at the same time!
    // if we started at index 0, we'd try to buy *and* sell at time 0.
    // this would give a profit of 0, which is a problem if our
    // maxProfit is supposed to be *negative*--we'd return 0!
    for (int i = 1; i < stockPricesYesterday.length; i++) {
        int currentPrice = stockPricesYesterday[i];

        // see what our profit would be if we bought at the
        // min price and sold at the current price
        int potentialProfit = currentPrice - minPrice;

        // update maxProfit if we can do better
        maxProfit = Math.max(maxProfit, potentialProfit);

        // update minPrice so it's always
        // the lowest price we've seen so far
        minPrice = Math.min(minPrice, currentPrice);
    }

    return maxProfit;
}



Complexity
O(n)O(n) time and O(1)O(1) space. We only loop through the array once.

What We Learned
This one's a good example of the greedy ↴ approach in action. Greedy approaches are great because they're fast (usually just one pass through the input). But they don't work for every problem.

How do you know if a problem will lend itself to a greedy approach? Best bet is to try it out and see if it works. Trying out a greedy approach should be one of the first ways you try to break down a new question.

To try it on a new problem, start by asking yourself:

"Suppose we could come up with the answer in one pass through the input, by simply updating the 'best answer so far' as we went. What additional values would we need to keep updated as we looked at each item in our set, in order to be able to update the 'best answer so far' in constant time?"

In this case:

The "best answer so far" is, of course, the max profit that we can get based on the prices we've seen so far.

The "additional value" is the minimum price we've seen so far. If we keep that updated, we can use it to calculate the new max profit so far in constant time. The max profit is the larger of:

The previous max profit
The max profit we can get by selling now (the current price minus the minimum price seen so far)
Try applying this greedy methodology to future questions.





 * 
 * 
 * 
 * */
