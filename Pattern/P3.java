package Pattern;
import java.util.Scanner;
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
for(int i=n;i>0;i--) {
	for(int j=0;j<i;j++) {
		System.out.print("* ");
	}
	System.out.println();
}
	}

}
