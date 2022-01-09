package Stack;
import java.util.Scanner;
import java.util.Stack;
class S{
	int top;
	int size=4;
	String s[]=new String[size];
boolean isEmpty() {
	return (top>0);
}

void push(String x) {
	if(top==(size-1)) {
		System.out.println("stack is full");
	}
	else {
		s[top]=x;
		System.out.println("push "+x);
		top++;
	}
}

}
public class StringStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
S t=new S();
t.push("fhhg");
t.push("jhh");
System.out.println("stsck id "+t);
	
}
	
}
