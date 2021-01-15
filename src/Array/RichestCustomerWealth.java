package Array;

import java.util.Scanner;

public class RichestCustomerWealth {

	
	public static int maximumWealth(int[][] accounts) {
		int max=0;
        for(int i=0;i<=accounts.length-1;i++)
        {
        	int temp=0;
        	for(int j=0;j<=accounts[i].length-1;j++)
        	{
            		temp+=accounts[i][j];
        	}
        	max=Math.max(max,temp);
        }
       
       
       System.out.println(max);
       return max;
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] accounts=new int[][] {{1,2,100},{0,3,111},{110,3,5}};
		
		maximumWealth(accounts);

	}

}
