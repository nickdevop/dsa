package javadsa;

public class linkedl {
	Node head;
	
		public static class Node{
		int data;
		Node next;
		Node(int data)
		{this.data=data;
			next=null;}}

	
	
	void  toadd(int data)
	{
	Node temp=head;
		Node neww = new Node(data);
		if(head ==null)
			{head=neww;
			return;}
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=neww;
		
	}
	
////////////////////////////////////////////////////////	
	void toprint()
	{
		Node temp=head;
		if (head==null || head.next==null)
		{
			System.out.println(head.data);
		}
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}}
	
////////////////////////////////////////////////////////////

void todeletend()
{
	Node temp=head;
	if(head==null || head.next==null) return;
	
	while(temp.next.next!=null)
	{
		temp=temp.next;
	}
	temp.next=temp.next.next;
	
	
}
void todeleteparticularnode(int pos)
{
	if(pos==1) {head=head.next;
	return;}
	Node temp=head;
	for(int i=1;i<pos-1;i++)
	{
		temp=temp.next;
	}
	temp.next=temp.next.next;
}
	
	void addfront(int data)
	{
		Node dat=new Node(data);
		Node temp=head;
		if(head==null) head=dat;
		else
		{
		dat.next=head;
		head=dat;
		}
		
	}
	
	void addanyplace(int data,int pos)
	{
		Node add=new Node(data);
		Node temp=head;
		if( head==null ||pos==1) {
				add.next=head;
				head=add;
		return;
	}
	for(int i=1;i<pos-1;i++)
	{
		temp=temp.next;
	}
	Node t=temp.next;
	temp.next=add;
	add.next=t;
	
	
	
	}
	
	
	
///////////////////////////////////////////////////////	
	public static void main(String[] args) {
		

		linkedl l=new linkedl();
//				l.toadd(2);
				l.toadd(21);
				l.toadd(12);
				l.toadd(31);
//				l.toadd(1);
		
//				l.toprint();
//				System.out.println("");
//				l.todeletend();
//				l.todeleteparticularnode(2);
//				l.addfront(3);
//				l.addfront(13);
//				l.addfront(1);
//				l.addfront(8);
				l.addanyplace(78, 1);
				
				l.toprint();
	}
	
	

}
