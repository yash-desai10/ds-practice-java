package Array;


//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].


public class ArrayShuffle {
	
public static int[] shuffle(int[] nums, int n) {
	int[] nums1=new int[n];
	int[] nums2=new int[n];
	int[] resultantArray=new int[nums.length];
	int oddCount=0;
	int evenCount=0;
	
	for(int i=0;i<n;i++)
	{
		nums1[i]=nums[i];
	}
	
	for(int i=n;i<=nums.length-1;i++)
	{
		nums2[i-n]=nums[i];
	}
	
	for(int i=0;i<=resultantArray.length-1;i++)
	{
		
		
		if(i==0)
		{
			resultantArray[i]=nums[i];
			evenCount++;
		}
		else if(i%2!=0) //odd
		{
			resultantArray[i]=nums2[oddCount];
			oddCount++;
		}
		else // even
		{
			resultantArray[i]=nums1[evenCount];
			evenCount++;
		}
		System.out.print(resultantArray[i]);
	}
	
	
	return resultantArray;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[] {1,1,2,2};
		shuffle(nums, 2);

	}

}
