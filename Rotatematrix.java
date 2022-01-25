package javadsa;

public class Rotatematrix {

	public static void main(String[] args) {
	
		
		int[][] arr= { {5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		rotatematrix(arr);

	}

	static void rotatematrix(int [][]arr)
	{
		int row=arr.length;
		int col=arr[0].length;
		int [][]dmatrix=new int[row][col];
		
		for(int i=0;i<arr.length;i++)
		{		for(int j=0;j<arr[0].length;j++)
			{
			
		dmatrix[j][row-i-1]=arr[i][j];	
			
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{		for(int j=0;j<arr[0].length;j++)
			{
			
			System.out.print(dmatrix[i][j]);
			System.out.print(" ");
			}
		System.out.println(" ");
		}
		
	}
	
}
