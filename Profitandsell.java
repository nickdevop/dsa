package javadsa;

import java.util.Scanner;

public class Profitandsell {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("enter size");
int size=sc.nextInt();
System.out.println("enter elements");
//	int[] arr= {2,3,9,1,6,3,9};
	int[] arr= new int[size];
	for(int i=0;i<arr.length;i++)
	{
	arr[i]=sc.nextInt();
	}
	
	System.out.println("");
	int profit=maxminprofit(arr);
	System.out.println(profit);
	sc.close();
	}
	
	static int maxminprofit(int[]arr)
	{
		int n=arr.length;
		int maxprofit=0;
		int j=0;
		
		for(int i=1;i<n;i++)
		{
			
			
			if(arr[j]<arr[i])
			{
				int profit=arr[i]-arr[j];
				if(maxprofit<profit)
				{
			maxprofit=Math.max(profit,maxprofit);
			}}
			
			else
			{j=i;}
		}
		
		
		return maxprofit;
		
	}
	
	
	
}
