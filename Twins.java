package javadsa;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
	
	
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
	int n=sc.nextInt();
	int currentsum=0;
	int allsum=0;
	int count=0;
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
		allsum+=a[i];
	}
	Arrays.sort(a);
	for(int i=n-1;i>0;i--)
	{
		currentsum+=a[i];
		if(currentsum>allsum/2)
		{
			
			break;
		}
count++;
	}
	System.out.println(count+1);

	
	
	
	
	
	
	
	
	}

}
