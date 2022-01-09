package Pattern;
import java.util.Scanner;
public class P20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number ");
int n=s.nextInt();
for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		if(i%2==0) {
			System.out.print("0 ");
		}
		else {
			System.out.print("1 ");
		}
	}
	System.out.println();
}
	}

}
