package Arrays;
import java.util.Scanner;

public class sort_0s1s2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);
System.out.println("enter size");
int size=s.nextInt();
int array[]=new int[size];

System.out.println("enter array element");
for(int i=0; i<size; i++) {
	array[i]=s.nextInt();
	
}

//Sort 0s 1s 2s

for(int i=0; i<size; i++) {
	for(int j=0; j<size; j++) {
		if(array[i]<array[j]) {
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
	}
}
System.out.println("sorted array");
for(int k=0; k<size; k++) {
	System.out.print(" "+array[k]);
}
	}

}
