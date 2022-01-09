package Pattern;
import java.util.Scanner;
public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
System.out.println("enter number");
int n=s.nextInt();
int count=n;
for(int i=0;i<n;i++) {
	for(int j=i;j<n;j++) {
		System.out.print(count);
	}
	count--;
	System.out.println();
}
	}

}
