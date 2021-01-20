package Array;

public class ReverseArrayNew {
	
//	Reverse Array without using any new array
	
	public static int[] reverseArray(int[] array)
	{
		int n=Math.round(array.length/2);
		int counter=array.length-1;
		for(int i=0;i<=n;i++)
		{
		int temp=0;
		
		if(i==n)
		{
			array[i]=array[i];
		}
		else
		{
					
			temp=array[counter];
			array[counter]=array[i];
			array[i]=temp;
			counter--;
					
		}
		}
		
		for(int i=0;i<=array.length-1;i++)
		{
		System.out.print(array[i]);
		}
		
		return array;
	}

	public static void main(String[] args) {
		
		int[] array=new int[] {1,2,3,4,5,6,7,8};
		reverseArray(array);
	}

}
