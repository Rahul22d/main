package Pattern;
import java.util.Scanner;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner n=new Scanner(System.in);
System.out.println("enter number");
int a=n.nextInt();
for(int i=0;i<=a;i++) {
	for(int j=i;j>0;j--) {
		System.out.print("* ");
	}
	System.out.println();
}
	}

}
