package LinkedList;
class Link{
	Node Head;
	//int data;
	//Node next=null;
	class Node{
		int data;
		Node next;
		Node(int d){
			d=data;
			next=null;
		}
	}
	
	
	public void push(int new_data) {
		Node new_node=new Node(new_data);
		new_node.data=new_data;
		new_node.next=Head;
		Head=new_node;
		
	}
	
	
	public void addEnd(int new_data) {
		Node new_node=new Node(new_data);
		new_node.data=new_data;
		if(Head==null) {
			Head=new Node(new_data);
			new_node.data=new_data;
			//new_node.next=null;
		}
		
		Node temp=Head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=new_node;
		new_node.next=null;
		
	}
	
	public void addGiven(Node prev_node, int data) {
		Node new_node=new Node(data);
		
		if(prev_node==null) {
			System.out.println("given node  not found");
		}
		Node temp=Head;
		while(temp.next==prev_node) {
			temp=temp.next;
		}
		new_node.data=data;
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	
	}
	
	public void display() {
		Node temp=Head;
		while(temp.next!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	
	
	
}
public class Inserrtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Link list=new Link();

list.push(33);

list.push(223);

list.push(34);
list.display();

System.out.println("new");
list.addEnd(23);
list.display();
System.out.println("new");
list.push(45);
list.display();
System.out.println("new");
list.addGiven(list.Head.next.next,67);

list.display();
	}

}
