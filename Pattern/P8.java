package Pattern;
import java.util.Scanner;
public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
for(int i=n;i>0;i--) {
	for(int j=i;j>0;j--) {
		System.out.print("  ");
	}
	for(int k=n;k>0;k--) {
		System.out.print("* ");
	}
	System.out.println();
}
	}

}
