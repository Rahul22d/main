package LinkedList;

public class Doubly_Link_List {

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
	if (head==null) {
		head=new_node;
		new_node.data=data;
		
	}
	else {
		new_node.data=data;
head.prev=new_node;
//new_node.prev=null;
new_node.next=head;
head=new_node;	
	}
}

void given(Node prev_node,int data) {
	Node new_node=new Node(data);
	
	if(prev_node==null) {
		System.out.println("node not exist");
	}
	else if(head==null) {
		new_node.data=data;
		head=new_node;
	}
	
	else {
	new_node.data=data;
	Node temp=head;
	while(temp!=prev_node) {
		 temp=temp.next;
	}
	new_node.next=temp.next;
	if(temp.next!=null) {
	temp.next.prev=new_node;
	}
	else {
		temp.next=new_node;
	}
	temp.next=new_node;
	new_node.prev=temp;
	}
}

void addend(int data) {
	Node new_node=new Node(data);
	new_node.data=data;
	if(head==null) {
		head=new_node;
	}
	else {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=new_node;
		new_node.prev=temp;
		
	}
}

void show(){
	Node temp= head;
	while(temp!=null) {
		System.out.println(temp.data+" ");
		temp=temp.next;
	}
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Doubly_Link_List n1=new Doubly_Link_List();

n1.addend(23);
n1.show();
System.out.println("add first");
n1.add(32);
n1.show();
System.out.println("add given");
n1.given(n1.head, 340);
n1.show();
System.out.println("add end");
n1.addend(56);
n1.show();
}
}
