package javadsa;

public class Middlenev {

	public static void main(String[] args) {

		int [] arr= {11,5,-3,1,-2,6};
		int a2[]=new int [arr.length];
		int c=0;
		for(int i=0;i<arr.length;i++ )
		{
			if(arr[i]>-1)
			{
				a2[c]=arr[i];
				c++;
			}
		}

		if(c%2==0) System.out.print(a2[c/2-1]);
		else System.out.print(a2[c/2]);
	}

}
