package javadsa;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {

	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of row u want");
	int R=sc.nextInt();
	System.out.println("enter the number of coloumn u want");
	int C=sc.nextInt();
	int Matrix[][]=new int[R][C];
	System.out.println("enter the no's in matrix " +R +"*"+C);
	for (int i=0;i<R;i++)
	{
		for (int j=0;j<C;j++)
		{
			Matrix[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("matrix without rotation");
	for (int k=0;k<R;k++)
	{
		for (int j=0;j<C;j++)
			
		{
			
			System.out.print(Matrix[k][j]+" ");
			
		}
		System.out.println();
	}
	

System.out.println();
System.out.println("matrix with rotation");
int	Rotate[][]=new int[R][C];
		for (int k=0;k<R;k++)
		{
			for (int j=0;j<C;j++)
				
			{
				Rotate[k][j]=Matrix[j][k];
				System.out.print(Rotate[k][j]+" ");
				
			}
			System.out.println();
		}
	}
	
	
	
	
	

	
	
	
	
	
	}
	
	
	
	
	
	
	
	
