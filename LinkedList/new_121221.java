package LinkedList;
import java.util.Scanner;
public class new_121221 {
Node head;
class Node{
	Node next;
	String name;
	int age;
	String town;
	String collage;
	Node(String name,int age,String town,String collage){
		this.name=name;
		this.age=age;
		this.town=town;
		this.collage=collage;
	}
}
void add(String name,int age, String town,String collage) {
        Node new_node=new Node(name,age,town,collage);
        new_node.name=name;
        new_node.age=age;
        new_node.town=town;
        new_node.collage=collage;
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
int count =1;
void show() {
	Node temp=head;
	while(temp!=null) {
		System.out.println("student"+count+ "  name  "+ " age  "+" town  "+" collage ");
		System.out.println("        " +temp.name +"  "+temp.age+"   "+temp.town+"   "+temp.collage);
		temp=temp.next;
		count++;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter name");
String name=s.nextLine();
System.out.println("enter age");
int age=s.nextInt();

s.skip(System.lineSeparator());
System.out.println("enter town");
String town=s.nextLine();
System.out.println("enter collage");
String collag=s.nextLine();
s.close();
new_121221 data=new new_121221();
data.add(name, age, town, collag);
data.add("jfsfj",23,"gfs","fsfs");
data.show();


	}

}
