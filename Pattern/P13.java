package Pattern;
import java.util.Scanner;
public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
for(int i=0;i<n;i++) {
	System.out.print("* ");
}
System.out.println();
for(int i=n-1;i>0;i--) {
	System.out.print("* ");
	for(int j=2;j<i;j++) {
		System.out.print("  ");
	}
	System.out.print("* ");
	System.out.println();
}

	}

}
