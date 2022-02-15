package javadsa;

import java.util.Scanner;

public class BigSum {

	public static void main(String[] args) {
		System.out.println("enter the no.of element you want to enter");

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
		int ar[]=new int[n];
	long sum=0;
	System.out.println("enter the input's" );
	for (int i=0;i<n;i++)
	{
		ar[i]= sc.nextInt();
	}
	for (int j=0;j<n;j++)
	{
		sum+=ar[j];
	
	
	}	
	System.out.println("sum of elements is ");
	System.out.println(sum);		
		
		
		
		
		
		
		
		
		
	}

}
