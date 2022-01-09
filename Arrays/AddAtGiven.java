package Arrays;
import java.util.Scanner;

public class AddAtGiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		
		int size=sc.nextInt();
		int array[]=new int[size];

	for(int i=0;i<size-2; i++) {
		array[i]=sc.nextInt();
	}
	System.out.println("enter insertion index");
	int a=sc.nextInt();
	for(int i=size-1; i>a; i--) {
		
			array[i]=array[i+1];
		
         array[i]=array[i];
	}
	System.out.println("enter new insert number");
	int n=sc.nextInt();
	array[a]=n;
	
	for(int i=0; i<array.length; i++) {
		System.out.println(array[i]+" ");
	}
	}

}
