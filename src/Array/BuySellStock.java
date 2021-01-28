package Array;

public class BuySellStock {
	static int temp=0;
	static int profit=0;
	
	public static int maxProfit(int[] prices) {
	        for(int buyingDay=0;buyingDay<=prices.length-1;buyingDay++)
	        {
	        	for(int sellingDay=buyingDay+1;sellingDay<=prices.length-1;sellingDay++)
	        	{
	        		if(prices[buyingDay]<prices[sellingDay])
	        		{
	        			int value=prices[sellingDay]-prices[buyingDay];
	        			temp=Math.max(value, temp);
	        			profit=temp;
	        		}	
	        	}
	        }
	        System.out.println(profit);
        	return profit;	    
        	}

	public static void main(String[] args) {

		int[] stocks=new int[] {10,22,87,41,9,12120,457812,0,1};
		maxProfit(stocks);
		
	}

}
