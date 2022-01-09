package Arrays;
import java.util.Scanner;
public class nth_largest_And_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter size");
int size=s.nextInt();
int array[]=new int [size];

System.out.println("enter array");
for(int i=0; i<size; i++) {
	array[i]=s.nextInt();
}

System.out.println("array is");
for(int i=0; i<size; i++) {
	System.out.println(array[i]);
}

//nth smallest number
System.out.println("enter nth number");
int n=s.nextInt();
int temp=array[0];
for(int i=0; i<n; i++) {
	if(temp>array[i]) {
		temp=array[i];
	}
}
System.out.println(n+"th smallest number "+temp);

//nth largest number
for(int i=0; i<n; i++) {
	if(temp<array[i]) {
		temp=array[i];
	}
}
System.out.println(n+"th largest number "+temp);

	}

}
