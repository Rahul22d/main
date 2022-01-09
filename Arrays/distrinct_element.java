package Arrays;
import java.util.Scanner;
public class distrinct_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter array size");
int size=s.nextInt();
int array[]=new int[size];
 System.out.println("enter array");
for(int k=0; k<size; k++) {
	array[k]=s.nextInt();
}
//distrinct
for(int i=0; i<=size-1; i++) {
	for(int j=i+1; j<size; j++) {
		if(array[i]==array[j]) {
		   for(int k=j; k<size-1; k++) {
			   array[k]=array[k+1];
		   }
		   size=size-1;
		}
	}
}

for(int i=0; i<size; i++) {
	System.out.println(array[i]);
}
	}

}
