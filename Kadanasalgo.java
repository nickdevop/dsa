package javadsa;

public class Kadanasalgo {

	public static void main(String[] args) {


		int[] arr= {-2,1,3,4,-1,2,1,-5,4};
	
	int sum=kadanas(arr);
	System.out.println(sum);
	
	}
static int kadanas(int[] arr)
{
	//important to note for single element in an array
	int maxsum=Integer.MIN_VALUE;
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum=sum+arr[i];
		
		if(maxsum<sum)
		{
			maxsum=sum;
		}
		
	 if(sum<0)
		{
	sum=0;
		}
		}
	
	
	
	return maxsum;
}

}

