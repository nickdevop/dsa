package javadsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sumofsubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enetr elements");
int[]arr= {2,3};
//for(int i:arr) {
//	arr[i]=sc.nextInt();
//}
int sum=0;
List<Integer> l=new ArrayList<Integer>();
sumofsubset(arr,0,sum);

	}

	static void sumofsubset(int[]arr,int index,int sum)
	{
		int n=arr.length;
		if(index>=n)
		{
			
			System.out.println(sum);
			return;
		}	
		
		
			sumofsubset(arr,index+1 ,sum+arr[index]);
			sumofsubset(arr,index+1 ,sum);
		
		
	}
	
	
	
}
