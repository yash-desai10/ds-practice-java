package Array;
import java.util.Scanner;

public class ArrayPractice {

//	Matrix Multiplication
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter rows for 1");
		int rows1=sc.nextInt();
		System.out.println("Enter column for 1");
		int columns1=sc.nextInt();

		
		System.out.println("Enter rows for 2");
		int rows2=sc.nextInt();
		System.out.println("Enter column for 2");
		int columns2=sc.nextInt();
		
		int[][] a=new int[rows1][columns1];
		int[][] b=new int[rows2][columns2];
		int[][] result=new int[rows1][columns2];
		
		
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<columns1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix1");
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<columns1;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0;i<rows2;i++)
		{
			for(int j=0;j<columns2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix2");
		for(int i=0;i<rows2;i++)
		{
			for(int j=0;j<columns2;j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		if(columns1==rows2)
		{
			for(int i=0;i<rows1;i++)
			{
				for(int j=0;j<columns2;j++)
				{
					for(int k=0;k<b.length;k++)
					{
					
					result[i][j]+=a[i][k]*b[k][j] ;
					}
				}
			}
		}
		
		System.out.println("Resultant Matrix");
		for(int i=0;i<rows1;i++)
		{
			for(int j=0;j<columns2;j++)
			{
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
