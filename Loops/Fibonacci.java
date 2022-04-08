package Loops;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		
int a=0;
int b=1;
int c;
System.out.print(a+" ");
System.out.print(b+" ");
for(int i=0; i<=n-2; i++) {
	c=a+b;
	System.out.print(c+" ");
	a=b;
	b=c;
}


	}

}
