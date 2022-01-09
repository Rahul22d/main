package LinkedList;
import java.io.*;
public class Remove {
Node head;
class Node{
	int data;
	Node next=null;
	Node(int data){
		this.data=data;
	}
}
	 void add(int data) {
		 Node new_node=new Node(data);
//		 new_node.data=data;
		 
		 if(head==null) {
			 new_node.data=data;
			 head=new_node;
		 }
		 else {
		 new_node.data=data;
		 Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
			
		}
		temp.next=new_node;
		 }
	 }


void remove(int key) {
	if(head==null) {
		System.out.println("list empty");
	}
	Node temp=head,temp1=null;
	 while(temp.data!=key) {
	temp1=temp;
	temp=temp.next;
	
	}
	 if(temp==head) {
		head=temp.next;
	 }
	 else {
		 if(temp.next==null) {
			 temp1.next=null;
		 }
		 else {
			 temp1.next=temp.next;
			 
		 }
	 }
}
void show() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.data+" ");
		temp=temp.next;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Remove n=new Remove();
n.add(34);
n.add(22);
n.add(45);
n.add(67);
n.show();
System.out.println("after deletion");
n.remove(45);

n.show();
	}
}
