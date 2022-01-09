package Pattern;
import java.util.Scanner;
public class P21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
for(int i=0;i<n;i++) {
	for(int j=1;j<=n-i;j++) {
		System.out.print(" ");
	}
	for(int k=i-1;k>=0;k--) {
		if(k%2==0) {
			System.out.print("1 ");
		}
		else {
			System.out.print("0 ");
		}
	}
	System.out.println();
}

	}

}
