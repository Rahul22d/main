package Stack;
class Stack{
	 int max=40;
	 int top;
	 int a[]=new int[max];
	 boolean isEmpty() {
		 return (top<0);
	 }
	 
	 Stack(){
		 top=-1;
	 }
	 void push(int x) {
		 if(top>=(max-1)) {
			 System.out.println("stack overflow");
		 }
		 else {
			// System.out.println(top);
			 a[++top]=x;
			 System.out.println("top index "+top);
			 System.out.println("push into stack "+x);
		 }
	 }
	 
	 void pop() {
		 if(top<0) {
			 System.out.println("stack underfflow");
		 }
			 else {
				int x=a[top--];
				 System.out.println("pop of stack "+x);
	   } 
	 }
	 
	 void peek() {
		 if(top<0) {
			 System.out.println("stack underflow");
		 }
		 else {
			 int x=a[top];
			 System.out.println("top of stack "+x);
		 }
	 }
	 void serch(Stack top,int x) {
		 int count=0;
		 for(int i=0;i<a.length;i++) {
			 if(a[i]==x) {
				 count++;
			 }
//			 else {
//				 System.out.println("number not found in stack"+a[i]);
//			 }
		 }
		 System.out.println("number "+x+" found "+count+" time");
	 }
}
public class Push {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s=new Stack();
s.push(4);
s.push(6);
s.push(2);
s.push(4);
s.push(4);
s.serch(s,4);
s.pop();
s.peek();
	}

}
