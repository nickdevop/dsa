package javadsa;

public class Nextpermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,3,5,5};
	permutation(arr);
	
	}
	
	static void permutation(int []arr)
	{
		
		int i=arr.length-2;
		if(arr== null ||arr.length<=1) System.out.print(arr[0]);
		while(i>=0 && arr[i]>=arr[i+1])
		{
			i--;
		}
		
		if(i>=0) // beacuse if we consider 2 element 1,2 so i starts from 0 i.e 2-2
		{
			int j=arr.length-1;
			while(j>=0 && arr[i]>=arr[j])j--;
			swap(arr,i,j);
		}
	 reverse(arr,i+1,arr.length-1);
		
	 for(int i1=0;i1<arr.length;i1++)
		{
			System.out.print(arr[i1]);
		}
		
	}
	static void swap(int[]arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
	static void reverse(int[]arr,int i, int j)
	{
		while(i<=j) swap(arr,i++,j--);
	}
	

}
