package Pattern;
import java.util.Scanner;
public class P9 {
public static void main(String [] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	int n=s.nextInt();
	for(int i=0;i<n;i++) {
		for(int j=i;j<n;j++) {
			System.out.print("  ");
		}
		for(int k=n;k>0;k--) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
