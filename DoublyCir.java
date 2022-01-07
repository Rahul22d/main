package LinkedList;

public class DoublyCir {
Node head;
class Node{
	int data;
	Node next;
	Node prev;
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
	//Node temp=head;
	head.prev=new_node;
	head.next=new_node;
	new_node.next=head;
	new_node.prev=head;
	}
	else {
		new_node.prev=head.prev;
		head.prev=new_node;
		new_node.next=head;
		head=new_node;
	}	
}
void addFirst(int data) {
	Node newnode=new Node(data);
	newnode.data=data;
	if(head==null) {
		head=newnode;
	}
	
	else  {
	Node temp=head;
	while(temp.next!=head) {
		temp=temp.next;
	
	}
	temp.next=newnode;
	newnode.prev=head.prev;
	newnode.next=head;
	head.prev=newnode;
	
	head=newnode;
//	else {
//		System.out.println("add more node");
//	}
	}
}
void display() {
	Node temp=head;
	do {
		System.out.println(temp.data+" ");
		temp=temp.next;
	}while(temp!=head);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DoublyCir d=new DoublyCir();
d.add(34);
d.add(45);
d.addFirst(56);
d.display();
	}

}
