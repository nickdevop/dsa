package javadsa;

import java.util.Scanner;

public class Sort012 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
//		System.out.println("enter size");
//		int size=sc.nextInt();
//		System.out.println("enter elements");
			int[] arr= {2,0,1,0,2,2,1,2,0,0,2,1,0,0,2,2};
//			int[] arr= new int[size];
//			for(int i=0;i<arr.length;i++)
//			{
//			arr[i]=sc.nextInt();
//			}
			

			sort012(arr);
		sortfast(arr);
			sc.close();

	}
static void sort012(int [] arr)
	{
	int [] dummyarray=new int[3];
	
	for(int i=0;i<arr.length;i++)
	{
		dummyarray[arr[i]]+=1;
	}
	
	for(int i=0;i<dummyarray[0];i++)
	{
		arr[i]=0;
	}
		
	for(int i=dummyarray[0];i<dummyarray[1]+dummyarray[0];i++)
	{
		arr[i]=1;
	}
	for(int i=dummyarray[1]+dummyarray[0];i<dummyarray[2]+dummyarray[1]+dummyarray[0];i++)
	{
		arr[i]=2;
	}

	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]);
	System.out.print(" ");
	}
	System.out.println(" ");
	}

static void sortfast(int[]arr)
{
	int m=0;
	int l=0;
	int h=arr.length-1;
	int temp;
	while(m<=h)
	{
		switch(arr[l])
		{
		case 0: 
		 temp=arr[m];
			arr[m]=arr[l];
			arr[l]=temp;
			m++; l++;
			break;
		case 1: m++;
		break;
		case 2: 
		 temp=arr[m];
			arr[m]=arr[h];
			arr[h]=temp;
			h--;
		break;
		
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]);
	System.out.print(" ");
	}
	
	
}

}
