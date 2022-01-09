package Stack;
class link{
	//Node head;
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data=data;
		}
	}
	Node top;
//	void stacklinked() {
//		this.top=null;
//	}
	void push(String x) {
		Node new_node=new Node(x);
//		Node temp=head;
//		if(top==null) {
//			System.out.println("");
//		}
		
	
			new_node.data=x;
			new_node.next=top;
			top = new_node;
		
	}
	void pop() {
		if(top==null) {
			System.out.println("under flow");
		}
		else {
			System.out.println(top.data+" ");
			top=top.next;
		}
	}
	void peek() {
		if(top==null) {
			System.out.println("stack are empty");
		}
		else {
			System.out.println(top.data);
		}
	}
	
	void pushgiven(String x,String d) {
		Node new_node=new Node(d);
		new_node.data=d;
		Node temp=top;
		//Node temp1=null;
		while(temp.data!=x) {
		//	temp1=temp;
			temp=temp.next;
		}
		new_node.next=temp.next;
		temp.next=new_node;
	}
	void show() {
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
}
public class LinkStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
link l=new link();
l.push("a");
l.push("b");
l.push("c");
l.push("d");
System.out.println("peek data");
l.peek();
System.out.println("show all data");
l.show();
System.out.println("after insert given node");
l.pushgiven("a", "d");
l.show();
System.out.println("after pop");
l.pop();
l.pop();

	}

}
