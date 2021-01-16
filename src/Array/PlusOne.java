package Array;

//Question

//Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
//The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
//You may assume the integer does not contain any leading zero, except the number 0 itself.

public class PlusOne {
	
	public static int[] plusOne(int[] digits) {
		for(int i=digits.length-1;i>=0;i--)
		{
			if(digits.length==0)
			{
				System.out.println("Empty Array");
			}
			
			if(digits[i]<9)
			{
				int temp=0;
				temp=digits[i]+1;
				digits[i]=temp;
				return digits;
			}
			else
			{
				digits[i]=0;
			}
		}
		int[] resultantArray=new int[digits.length+1];
		resultantArray[0]=1;
		for(int i=0;i<=resultantArray.length-1;i++)
		{
			System.out.print(resultantArray[i]);
		}
		return resultantArray;
		
	}

	public static void main(String[] args) {
		
		int[] digits=new int[] {9,9};
		plusOne(digits);

	}

}
