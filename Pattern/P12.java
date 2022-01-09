package Pattern;
import java.util.Scanner;
public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
System.out.println("* ");
for(int i=2;i<n-1;i++) {
	System.out.print("* ");
	for(int j=1;j<=i-2;j++) {
		System.out.print("  ");
	}
	System.out.println("*");
}
for(int i=1;i<n;i++) {
	System.out.print("* ");
}
	}

}
