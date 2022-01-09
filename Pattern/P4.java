package Pattern;
import java.util.Scanner;
public class P4 {
public static void main (String [] arg) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	int n=s.nextInt();
	for(int i=0;i<n;i++) {
		for(int j=0;j<i;j++) {
			System.out.print("  ");
		}
		for(int k=n;k>i;k--) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
