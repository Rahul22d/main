package LinkedList;

public class AddTheFirst {
Node head;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}
void addFirst(int data) {
	Node new_node=new Node(data);
	if (head==null) {
		head=new_node;
		new_node.data=data;
	}
	else {
		new_node.next=head;
		head=new_node;
		
	}
}
void showData() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.data);
		temp=temp.next;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AddTheFirst r=new AddTheFirst();
r.addFirst(35);
r.addFirst(34);
r.addFirst(35);
r.addFirst(37);
r.showData();
	}

}
