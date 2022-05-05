

import java.util.Scanner;

 public class reverseLinkedList
{
		static Node head;
		
		static class Node
		{
			int data;
	 		Node next;
			public Node(int data)
			{
				this.data = data;
				this.next = null;
			}
		}

		public void addData(int data)
		{
			Node new_node = new Node(data);
			
			new_node.next=head;
			head = new_node;
		}
		
		Node reverse(Node node)
		{
			Node prev = null;
			Node current = node;
			Node next = null;
			while(current != null)
			{
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			node = prev;
			return node;	
		}
		
		public void display()
		{
			System.out.println("output :");
			Node tnode = head;
			
			
			while(tnode != null)
			{
				System.out.print(tnode.data+" ");
				tnode = tnode.next;
			}
			/* while(tnode!=head)
			{
				System.out.print(tnode.data+" ");
				tnode = tnode.next;
			} */
		}

		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int size = sc.nextInt();
			
			reverseLinkedList list = new reverseLinkedList();
			
			for(int i=0;i<size;i++)
			{
				int p = sc.nextInt();
				list.addData(p);
			}
			
			 head = list.reverse(head);
			
			list.display();

		}
}

