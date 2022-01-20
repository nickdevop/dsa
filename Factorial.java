package javadsa;

public class Factorial {

	public static void main(String[] args) {
int n=3;
int number=fact(n);
//int n2=fact(n);

System.out.println();

System.out.println(number);
System.out.println();

{
	int n2=1;
	for(int i=1;i<=n;i++)	
	{
		System.out.print(i);
		n2*=i;
		
	}
	System.out.println();
	System.out.println(n2);
	
}
		
	}


static int fact(int n )
{
	
	if(n<2) 
	{		System.out.print(n);
	return n;
}

	System.out.print(n);	
	n= n*fact(n-1);
return n;
	
}


}