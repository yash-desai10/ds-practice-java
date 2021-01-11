package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoNumberSum {

	public static int[] twoNumberSum(int[] array, int targetSum)
	{
		for(int i=0;i<array.length-1;i++)
		{
			int firstNum=array[i];
			for(int j=i+1;j<array.length;j++)
			{
				int secondNum=array[j];
				if(firstNum!= secondNum && firstNum + secondNum == targetSum)
				{
					return new int[] {firstNum,secondNum};
				}
			}
			
			
		}
		System.out.println("Error");
		return new int[0];
				
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {-2,8,11,15};
		
		
		twoNumberSum(arr,9);

	}

}
