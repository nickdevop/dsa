package javadsa;

public class queue {
int [] arr=new int [5];
int []qts=new int[5];
int top=0;
int topper=0;
public static void main(String[] args) {

queue q=new queue();
q.push(1);
q.push(2);
q.push(21);
q.push(4);
q.push(8);
q.print();
//q.peek();
System.out.println("");
q.qtos();
q.qtos();
q.qtos();
q.printqts();
System.out.println("");
q.qtppeek();
q.qtppop();
q.printqts();

	}

	
	
	public void push(int data)
	{
		arr[top]=data;
		top++;
		
	}
	
	public void pop()
	{
//		System.out.println("poped element is  " +arr[0]);
		for(int i=0;i<top-1;i++)
		{
			arr[i]=arr[i+1];
		}
		top--;
//		return arr[0];
	}
	public int firstIn()
	{
		return arr[0];
	}
	
	public void peek()
	{
		System.out.println("peek element is  " +arr[top-1]);
	}
	
	public void print()
	{
		for(int i=top-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	
	public void qtppeek()
	{
		System.out.println("peek element is  " +qts[topper-1]);
	}
	
	public void qtppop()
	{
		System.out.println("poped element is  " +qts[topper-1]);
		
		topper--;

	}
	public void qtos()
	{
		int data=firstIn();
		pop();
	qts[topper]=data;
		topper++;
	}
	
	
	
	public void printqts()
	{
		for(int i=0;i<topper;i++)
		{
			System.out.println(qts[i]);
		}
	}
	
	
}
