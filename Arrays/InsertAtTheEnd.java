package Arrays;
import java.util.Scanner;
public class InsertAtTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sd=new Scanner(System.in);
System.out.println("enter size of array");
int max=sd.nextInt();
System.out.println("enter array");
int arr[]=new int[max];
for(int i=0; i<max-1;i++) {
	arr[i]=sd.nextInt();
}
System.out.println("before insert");
for(int i=0; i<max;i++) {
	System.out.println(arr[i]);
}

if(arr[max-1]==0) {
arr[max-1]=23;
}
else {
	System.out.println("array is full");
}
System.out.println("after insert");

for(int i=0; i<arr.length; i++) {
	System.out.println(arr[i]);
}
}

}
