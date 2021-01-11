package Array;

public class ReverseArray {
	
	public static void reverseArray(int[] array)
	{
		int temp=0;
		int[] resultantArray=new int[array.length];
		for(int i=array.length-1;i>=0;i--)
		{
			temp=array[i];
			resultantArray[(array.length-1)-i]=temp;
		}
		//		print
		for(int j=0;j<=resultantArray.length-1;j++)
		{
			System.out.print(resultantArray[j] + " ");
		}
	}

	public static void main(String[] args) {
		int[] inputArray=new int[]{1,29,3,-3,5,90,22,-100,123};
		reverseArray(inputArray);
	}

}
