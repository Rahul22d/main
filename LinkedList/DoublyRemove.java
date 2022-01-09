package LinkedList;

public class DoublyRemove {
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
	else {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		new_node.prev=temp;
		temp.next=new_node;
	}
}

void remove(Node node) {
	if(head==null) {
		System.out.println("list not exist");
	}
	else if(node==head) {
		head=head.next;
		head.prev=null;
	}
	
	else {
		Node temp=head,temp1=null;
		while(temp!=node) {
			temp1=temp;
			temp=temp.next;
		}
		temp1.next=temp.next;
		if(temp.next==null) {
			temp1.next=null;
		}
		else {
		temp.next.prev=temp.prev;
		
		}
	}
}

void removedata(int data) {
	if(head==null) {
		System.out.println("list empty");
	}
	Node temp=head;
	while(temp.data!=data) {
		temp=temp.next;
	}
	if(temp==head) {
		head=head.next;
		head.prev=null;
	}
	else if(temp.next==null) {
		temp.prev.next=null;
	}
	else {
		temp.prev.next=temp.next;
		temp.next.prev=temp.prev;
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
DoublyRemove n=new DoublyRemove();
n.add(34);
n.add(45);
n.add(56);
n.show();
System.out.println("after del");
n.remove(n.head.next);// head=34 and head.next=45
n.removedata(34);
n.show();

	}

}
