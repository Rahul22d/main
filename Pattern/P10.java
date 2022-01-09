package Pattern;
import java.util.Scanner;
public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
for(int i=0;i<n;i++) {
	for(int j=i;j>0;j--) {
System.out.print("* ");
}
System.out.println();
}
for(int j=n;j>0;j--) {
	for(int i=j;i>0;i--) {
	System.out.print("* ");
}
	System.out.println();
}
	}

}
