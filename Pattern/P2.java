package Pattern;
import java.util.Scanner;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int a=s.nextInt();
for(int i=1;i<a;i++) {
	for(int j=a;j>i;j--) {
		System.out.print("- ");
	}
	for(int k=0;k<i;k++) {
		System.out.print("* ");
	} 
	System.out.println();
}
	}

}
