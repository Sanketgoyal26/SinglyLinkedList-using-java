class ListNode
	{
		public ListNode(int data) {
		this.data=data;
	}
		ListNode next;
		int data;
	}
public class SinglyLinkedList {
	
	 ListNode head;
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("List Is Empty");
		}
		else
		{
		ListNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.print("null");
		}
	}

	public int length()
	{
		if (head==null)
		{
			return 0;
		}
		ListNode temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public void insertAtBeg(int val)
	{
          ListNode newnode=new ListNode(val);
          newnode.next=head;
          head=newnode;
         
	}
	
	public void insertAtLast(int val)
	{
		ListNode newnode=new ListNode(val);
		ListNode temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
	temp.next=newnode;
	
	}
	public void insertAtPos(int val,int pos)
	{
		ListNode newnode=new ListNode(val);
		int count=1;
		ListNode temp=head;
		while(count<pos-1)
		{
			temp=temp.next;
			count++;
		}
	
	newnode.next=temp.next;
	temp.next=newnode;
	}
	
	public void deleteAtFirst()
	{
		if(head==null)
		{
			System.out.println("List Is Empty cannot be delete");
		}
		
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		
	}
	
	public void deleteAtLast()
	{
		if(head==null)
		{
			System.out.println("List Is Empty cannot be delete");
		}
		
		ListNode temp=head;
		ListNode var=head;
		while(temp.next!=null)
		{
			var=temp;
			temp=temp.next;
		}
	var.next=null;
	}
public void deleteAtPos(int pos)
{
	if(head==null)
	{
		System.out.println("List Is Empty cannot be delete");
	}
	
	ListNode temp=head;
	int count=1;
	while(count<pos-1)
	{
		temp=temp.next;
		count++;
	}
ListNode var;
var=temp.next;
temp.next=var.next;
var.next=null;

}
	
	
public static void main(String[] args)
{
	SinglyLinkedList obj =new SinglyLinkedList();
//	obj.insertAtBeg(4);
//	obj.insertAtBeg(3);
//	obj.insertAtBeg(10);
//	obj.insertAtBeg(0);
//	obj.insertAtBeg(5);
//	obj.insertAtBeg(37);
//	obj.insertAtLast(41);
//	obj.insertAtPos(61,5);
	//System.out.println(obj.length());
//	obj.display();
	obj.deleteAtFirst();
	//obj.display();
	
	

}

}


