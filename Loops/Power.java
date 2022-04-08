package Loops;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner a=new Scanner(System.in);
 System.out.println("Enter number");
 int s=a.nextInt();
 System.out.println("Enter power");
 int b=a.nextInt();
 a.close();
 int result=1;
 for(int i=1; i<=b; i++) {
	 result*=s;
	 
 }
 System.out.println(result);
 
	}

}
