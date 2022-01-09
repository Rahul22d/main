package LinkedList;

import LinkedList.atBegining.Node;

public class Add {
		Node head;
		/// Node next;
		class Node{
			int data;
			Node next;
			Node(int data){
				this.data=data;
				next=null;
			}
		}
		
		void add(int data) {
			Node new_node =new Node(data);
			
			 if(head==null) {
				 head=new_node;
				 new_node.data=data;
				
			 }
			 else {
				Node temp=head;
				 while(temp.next!=null) {
					 temp=temp.next;
				 }
					temp.next=new_node;
				 new_node.data=data;
		
			 }
		}
		
		void remove(Node node) {
			if(head==null) {
				System.out.println("list empty");
			}
			Node temp=head;
		head=head.next;
		}
		
		void removeGiven(int key) {
			Node temp1=null, temp=head;
			if(head==null) {
				System.out.println("list empty");
			}
			else if(temp!=null&&temp.data==key) {
				head=head.next;
			}
			
			while(temp!=null&&temp.data!=key) {
				temp1=temp;
				temp=temp.next;
			}
			if(temp==null) {
				System.out.println("data not exist");
				return;
				}
			temp1.next=temp.next;
			
		}
		
		 void show() {
				Node temp=head;
				 while(temp!=null) {
					 System.out.println(temp.data);
					 temp=temp.next;
				 }
				 System.out.println();
			 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Add a=new Add();
a.add(233);
a.add(1234);
a.add(43342);
//a.add(345);
//a.add(343);
//a.add(43);
//a.add(24);
//a.add(2323);
a.show();
//a.remove(a.head);
//a.show();
System.out.println("s");
a.removeGiven(43342);
a.show();
System.out.println("d");
a.removeGiven(342);
a.show();
	}

}
