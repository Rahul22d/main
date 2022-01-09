package Arrays;
import java.util.Scanner;
public class AddFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int a=sc.nextInt();
		int arr[]=new int[a+1];
		System.out.println("enter "+(a)+" element");
		for(int i=0; i<a;i++) {
			arr[i]=sc.nextInt();
		}
		//arr[0]=45;
		System.out.println("before insert");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		//a++;
		System.out.println("\nenter index");
		int index=sc.nextInt();
		for(int i=a-1; i>=index; i--) {
			arr[i+1]=arr[i];
		}
System.out.println("Enter the element which want to insert");
int n=sc.nextInt();

arr[index]=n;
System.out.println("after insertion");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//System.out.print(arr[a]);
	}

}
