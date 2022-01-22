package javadsa;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {

Scanner sc= new Scanner (System.in);
	System.out.println("enter n");
int n=sc.nextInt();
reverseno(1,n);

	}
	
	static void reverseno(int i,int n)
	{
		//base condition
		if(i>n) return ;
		System.out.println(i);
		reverseno(i+1,n);
		System.out.println(i);
		
	}

}
