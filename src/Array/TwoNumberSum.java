package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoNumberSum {

	public static int[] twoNumberSum(int[] array, int targetSum)
	{
		for(int i=0;i<array.length-1;i++)
		{
			int firstNum=array[i];
			for(int j=1;j<array.length;j++)
			{
				int secondNum=array[j];
				if(firstNum!= secondNum && firstNum + secondNum == targetSum)
				{
					System.out.println(firstNum + secondNum);
					return new int[] {firstNum,secondNum};
				}
			}
			
			
		}
		System.out.println("Error");
		return new int[0];
				
	}
	
	public static void main(String[] args) {
		int[] arr=new int[] {3,3};
		
		
		twoNumberSum(arr,6);

	}

}
