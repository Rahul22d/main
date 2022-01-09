package Arrays;
import java.util.Scanner;

public class minOrMax {
void min_value(int array[] , int size) {
	int temp=array[0];
	
	for(int i=0; i<size; i++) {
	
		if(array[i]<temp) {
		 temp=array[i];
		}
	}
	System.out.println("min value is "+temp);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

System.out.println("enter array size");
int size=s.nextInt();

int array[]=new int [size];

System.out.println("enter array");
for(int i=0; i<size; i++) {
	array[i]=s.nextInt();
}

System.out.println("array is");
for (int i=0; i<size; i++) {
	System.out.println(array[i]);
	
}


// Find minimum value direct 
int temp=array[0];
for (int i=0; i<size; i++) {
	if (array[i]<temp) {
		temp=array[i];
	}
}
System.out.println("min value is "+temp);


//Find max value
/**int temp1=array[0];
for (int i=0; i<size; i++) {
	if(array[i]>temp1) {
		temp1=array[i];
	}
}
System.out.println("max value is " +temp1);**/


//function through find minimum value
minOrMax  m=new minOrMax();
m.min_value(array, size);
}
}