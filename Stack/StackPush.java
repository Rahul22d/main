package Stack;
class Stack1{
	int size=10;
	int top;
	int array[]=new int[size];
	
	Stack1(){
		top=-1;
	}
	void push(int x) {
		if(top>=(size-1)) {
			System.out.println("stack overflow");
		}
		else {
			array[++top]=x;
			System.out.println("push into stack "+x);
		}
	}
}
public class StackPush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack1 s=new Stack1();
s.push(4);
s.push(5);
s.push(6);
s.push(7);
s.push(8);
s.push(9);
s.push(10);
s.push(1);
s.push(2);
s.push(3);
s.push(4);
s.push(5);
s.push(2);
System.out.println();
Stack d=new Stack();//this object is push class 
d.push(5);
	}

}
