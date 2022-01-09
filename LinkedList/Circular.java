package LinkedList;

public class Circular {
Node head;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
void add(int data) {
	Node new_node=new Node(data);
	new_node.data=data;
	if(head==null) {
		head=new_node;
	}
	
	else if(head.next==null) {
		head.next=new_node;
		new_node.next=head;
	}
	
	else {
		Node temp=head;
		while(temp.next!=head) {
			temp=temp.next;
		}
		temp.next=new_node;
		new_node.next=head;	
	}
}

void addgiven(Node node ,int dat) {
	Node new_node=new Node(dat);
	new_node.data=dat;
	if(head==null) {
		head=new_node;
	}
	
//	else if(head.next==null) {
//		head.next=new_node;
//		new_node.next=head;
//	}
	
	else {
		Node temp=head,temp1=null;
	while(temp.next!=node) {
		//temp1=temp;
		temp=temp.next;
	}
	if(temp.next==head) {
		temp.next=new_node;
		new_node.next=head;
	}
	else {
	new_node.next=temp.next;
	temp.next=new_node;
	}
	}
	
}
 


void show() {
	Node temp=head;
	do {
		System.out.println(temp.data+" ");
		temp=temp.next;
	}while(temp!=head);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circular c=new Circular();
System.out.println("list");
c.add(34);
//c.add(35);
//c.add(344);
c.show();
System.out.println("after insertion");
c.addgiven(c.head, 30);
c.show();
	}

}
