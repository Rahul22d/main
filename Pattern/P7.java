package Pattern;
import java.util.Scanner;
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
for(int i=0;i<n;i++) {
	for(int j=n;j>i;j--) {
		System.out.print(" ");
	}
	for(int k=0;k<i;k++) {
		System.out.print("* ");
	}
	
	System.out.println();
}
for(int i=n;i>0;i--) {
	for(int j=n;j>i;j--) {
		System.out.print(" ");
	}
	for(int k=i;k>0;k--) {
		System.out.print("* ");
	}
	System.out.println();
}
	}

}
