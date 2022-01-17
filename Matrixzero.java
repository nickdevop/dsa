package javadsa;

import java.util.Scanner;

public class Matrixzero {
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
//		System.out.println("enter size");
//		int size=sc.nextInt();
//		System.out.println("enter elements");
//			int[][] arr= {{1,1,1},{1,0,1},{1,1,1}};
//			int[][] darr= {{1,1,1},{1,0,1},{1,1,1}};
int[][] arr= {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
			
			int[][] darr={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
//			

	matrixzero(arr,darr);
	System.out.println("ye mera laptop he");
	System.out.println("or fulll on coding chl rahi he..");
	matrixzero1(arr);

}
	
static void matrixzero(int[][]arr,int[][]darr)
{
	
	for(int i=0;i<arr.length;i++)
	{		for(int j=0;j<arr[0].length;j++)
		{
		if(arr[i][j]==0)
		{
			for(int c=0;c<arr[0].length;c++)
			{	
				darr[i][c]=0;
			}
				
				for(int r=0;r<arr.length;r++)
				{
					darr[r][j]=0;
				}
				
		
		}
		}}

for(int i=0;i<arr.length;i++)
{		for(int j=0;j<arr[0].length;j++)
	{
	
	System.out.print(darr[i][j]);
	
	}
System.out.println("");
}
}



//second method using two dummy array

static void matrixzero1(int[][]arr)
{
	int[]dummyrow=new int[arr.length];
	int[]dummycol=new int[arr[0].length];
	for(int i=0;i<arr.length;i++)
	{		for(int j=0;j<arr[0].length;j++)
		{
		if(arr[i][j]==0)
		{
			dummyrow[i]=-1;
			dummycol[j]=-1;
				
		
		}
		}}
	
	//for making rows elements zero
			for(int i=0;i<dummyrow.length;i++)
		{
		for(int j=0;j<dummycol.length;j++)
		{
			if(dummyrow[i]==-1||dummycol[j]==-1)
			{
				arr[i][j]=0;
			}
		}
		
		
		}
		
	
			
			
	
	
			for(int i=0;i<arr.length;i++)
			{		for(int j=0;j<arr[0].length;j++)
				{
				
				System.out.print(arr[i][j]);
				
				}
			System.out.println("");
			}
}



}
