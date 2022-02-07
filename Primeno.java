package javadsa;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		System.out.print("enter the no u wanna check is it prime or not :  ");
		int number=sc.nextInt();
		boolean notprime=false;
		
		if(number==1 ||number==2)
		{
	notprime=false;
	
		}
			for(int i=2;i<=number/2;i++)
			{
		if(number%i==0)
		{
			notprime=true;
			break;
		}
				
			}
		
	if(!notprime)
	{
		System.out.println(number +" is a prime number ");
	}

	
	else
	{
		System.out.println(number +" is not a prime number ");
	}
sc.close();
}
}