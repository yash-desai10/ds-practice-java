package LinkedList;

public class LinkedListPractice {
	
	 Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	void printList()
	{
		Node traversal=head;
		while(traversal!=null)
		{
			System.out.print(traversal.data + "->");
			traversal=traversal.next;
		}
	}
	

	void insertAtHead(int data)
	{
		Node node4=new Node(data);
		node4.next=head;
		head=node4;
	}
	
	void insertAtEnd(int data)
	{
		Node node5=new Node(data);
		Node traversal=head;
		
		while(traversal.next!=null)
		{
			traversal=traversal.next;
		}
		traversal.next=node5;
	}
	
	void insertAfter(int prev_data, int new_data)
	{
		Node node6=new Node(new_data);
		Node traversal=head;
		
		while(traversal.data!=prev_data)
		{
			traversal=traversal.next;
		}
		node6.next=traversal.next;
		traversal.next=node6;	
	}

	public static void main(String[] args) {
		LinkedListPractice ll=new LinkedListPractice();
		ll.head=new Node(1);
		Node node2=new Node(2);
		Node node3=new Node(3);
		
		ll.head.next=node2;
		node2.next=node3;
		node3.next=null;
		
		ll.insertAtHead(4);
		ll.insertAtEnd(5);
		ll.insertAfter(2, 6);
		ll.printList();
	}

}
