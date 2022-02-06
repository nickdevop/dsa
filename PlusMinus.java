package javadsa;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	double positive=0;
	double negative=0;
	double zero=0;
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		if(arr[i]>0)
		{
			positive+=1;
		}

		if(arr[i]<0)
		{
			negative+=1;
		}

		if(arr[i]==0)
		{
			zero+=1;
		}
	
	
	}
	
	
//System.out.println(positive/n +" "+negative/n+" "+zero/n);	
//	printf is aformating string
System.out.printf("\n%.6f", positive/n);
System.out.printf("\n%.6f" ,negative/n);
System.out.printf("\n%.6f", zero/n);
	
	
	
	
	}

}
