package LinkedList;
public class New061121 {
Node head;
class Node{
	String data;
	 Node next;
	Node(String data){
		this.data=data;
	}
}
 void add(String data) {
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
	 }
 }
 void addGiven(String d,String data) {
	 Node new_node=new Node(data) ;
		 new_node.data=data;
	 if(head==null) {
		 head=new_node;
	 }
	 else {
		 Node temp=head;
		 while(temp.data!=d) {
			 temp=temp.next;
		 }
		 new_node.next=temp.next;
		 temp.next=new_node;
	 }
 }
 void replace(String key,String data) {
	 Node temp=head;
	 while(temp.data!=key) {
		 temp=temp.next;
	 }
	 temp.data=data;
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
New061121 a=new New061121();
a.add("ad");
a.add("adaddd");
a.show();
System.out.println(" ***add given ****");
a.addGiven("ad", "gd");
a.show();
System.out.println("after replace");
a.replace("ad", "add");//first data store in list ,given to find which node store the data and second data replace first data:
a.show();
	}

}
