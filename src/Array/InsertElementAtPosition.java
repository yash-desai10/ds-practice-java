package Array;

public class InsertElementAtPosition {
	
	public static void Insertion(int[] originalArray, int[] resultantArray, int position, int elementToInsert)
	{
		for(int i=0;i<=resultantArray.length-1;i++)
		{
			if(i<=position-1)
			{
				resultantArray[i]=originalArray[i];
			}
			else if(i==3)
			{
				resultantArray[i]=elementToInsert;
			}
			else
			{
				resultantArray[i]=originalArray[i-1];
			}
		}
		
		for(int i=0;i<=resultantArray.length-1;i++)
		{
			System.out.print(resultantArray[i] + " ");
		}
		
	}

	public static void main(String[] args) {
		int[] originalArray=new int[] {1,2,3,4,5};
		int[] resultantArray=new int[6];
		int position=3;
		int elementToInsert=6;
		
		Insertion(originalArray,resultantArray,position,elementToInsert);

	}

}
