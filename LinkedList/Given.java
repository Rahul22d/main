package LinkedList;

public class Given {
    Node head;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}

void add(int data) {
	Node new_node=new Node(data);
	if(head==null) {
		head=new_node;
		new_node.data=data;
	}
	else {
		Node temp=head;
		while(temp!=null) {
			temp=temp.next;
		}
		temp.next=new_node;
		new_node.data=data;
	}
}

void addGiven(Node prev_node,int data) {
	Node new_node=new Node(data);
		
	if(prev_node==null) {
		head=new_node;
		new_node.data=data;
	}
	else {
		Node temp=head;
		while(temp==prev_node) {
			temp=temp.next;
		}
		new_node.data=data;
		new_node.next=prev_node.next;
		prev_node.next=new_node;

	}
}

void showList() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Given a=new Given();
//a.add(23);
a.addGiven(a.head,45);
a.addGiven(a.head,34);

a.addGiven(a.head.next, 12);
a.addGiven(a.head.next.next, 334);
a.showList();
	}

}
