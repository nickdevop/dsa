package javadsa;

import java.util.*;

public class TwoPointer {

	public static void main(String[] args) {
		
	

	Scanner sc=new Scanner(System.in);	
	int n=sc.nextInt();
	int a[]=new int[n];
	
	for (int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	triplet g=new triplet();
	if(g.findtriplet( a,n)) {
		System.out.println("1");
	}
	else
	{
		System.out.println("0");
	}
	
	
}
	}
class triplet
{
	public boolean findtriplet(int[] arr,int n)
	{
		Arrays.sort(arr);
		for(int i=0;i<n-2;i++)
		{
			
//	arr simple array he
//	-arr[i]=x
			
//			i+1=i
		if(twosum(arr,-arr[i],i+1))
		
		
	return true;
	}
			return false;
	
	}
//	two sum algorithm
public boolean twosum(int a[],int x,int i)
{
	int j=a.length-1;
	while(i<j)
	{
	
	if(a[i]+a[j]<x)
	{
		i++;
	}
	else if(a[i]+a[j]>x)
	{
		j--;
	}
	else {
		return true;
	}
	}
return false;
}
}


