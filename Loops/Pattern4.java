package Loops;
import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int num1=1, num2=1, num3=1;
		for(int i=n; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("* ");
			}
			
			for(int q=1; q<=n-i; q++) {
				System.out.print("  ");
			}
			System.out.print(" ");
			for(int w=1; w<=n-i; w++) {
				System.out.print("  ");
			}
				for (int a=i; a>=1; a--) {
					System.out.print(" *");
				}
				System.out.println();
			}
			 for(int i=1; i<=2*n+1; i++) {
					 System.out.print("  ");
				 }
			 System.out.println();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.print(" ");
			for(int w=1; w<=n-i; w++) {
				System.out.print("  ");
			}
			for(int q=1; q<=n-i; q++) {
				System.out.print("  ");
			}
		
				for(int j=1; j<=i; j++) {
					System.out.print(" *");
				}
			System.out.println();
		}
		
		
		
		for(int i=n; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("  ");
			}
			
			for(int q=1; q<=n-i; q++) {
				System.out.print(num1++ +" ");
			}
			
			System.out.print(num3++ +" ");
			for(int w=1; w<=n-i; w++) {
				System.out.print(num3++ +" ");
			}
				for (int a=i; a>=1; a--) {
					System.out.print("  ");
				}
				System.out.println();
			}
		}

	
}
