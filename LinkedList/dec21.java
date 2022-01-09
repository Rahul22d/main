package LinkedList;

public class dec21 {
Node Head;
class Node{
	Node next;
	int data;
	Node prev;
	Node(int data){
		this.data=data;
	}
}
	void add(int data) {
		Node newnode=new Node(data);
		newnode.data=data;
		if(Head==null) {
			Head=newnode;
		}
		else {
			Node temp=Head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
			newnode.prev=temp;
		}
	}
	
	
	void replace(int old,int newdata) {
		Node temp=Head;
		while(temp.data!=old) {
			temp=temp.next;
		}
		temp.data=newdata;
	}
	void showList() {
		Node temp=Head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
dec21 node=new dec21();
node.add(34);
node.add(46);
node.add(45);
node.showList();
System.out.println("after replace");
node.replace(46, 40);
node.showList();

	}

}
