package Loops;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
for(int i=1; i<=n; i++) {
	
	for(int j=1; j<=i-1; j++) {
		System.out.print("  ");
	}
	for(int a=1; a<=n-i+1; a++) {
		System.out.print("* ");
	}
	System.out.println();


	
}

	}

}
