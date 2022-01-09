package Pattern;
import java.util.Scanner;
public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
System.out.println("enter number ");
int n=s.nextInt();
for(int i=n;i>0;i--) {
	for(int j=i;j>0;j--) {
		System.out.print("* ");
	}
	for(int k=i;k<n;k++) {
		System.out.print("  ");
	}

		for(int j=n;j>i;j--) {
			System.out.print("  ");
		}
		for(int k=i;k>0;k--) {
			System.out.print("* ");
		}
		
	System.out.println();
}
for(int i=0;i<n;i++) {
   for(int j=0;j<=i;j++) {
	  System.out.print("* ");
   }
   for(int k=i;k<n-1;k++) {
	   System.out.print("  ");
   }
   for(int j=i;j<n-1;j++) {
	   System.out.print("  ");
   }
   for(int k=i;k>=0;k--) {
	   System.out.print("* ");
   }
   System.out.println();
}
	}

}
