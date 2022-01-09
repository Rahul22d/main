package LinkedList;

public class End {
Node head;
class Node{
	int data;
    Node next;
    Node(int data){
    	this.data=data;
    	next=null;
    }
}

int addEnd(int data) {
	Node new_node=new Node(data);
	if (head==null) {
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
	
	return 0;
}

void show() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
End e=new End();
e.addEnd(66);
e.addEnd(34);
e.addEnd(32);
e.addEnd(324);
e.show();

	}

}
