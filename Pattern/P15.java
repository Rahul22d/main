package Pattern;
import java.util.Scanner;
public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
int count=1;
for(int i=n;i>0;i--) {
	for(int j=i;j<=n;j++) {
		System.out.print(count);
		count++;
	}
	count=1;
	System.out.println();
}

	}

}
