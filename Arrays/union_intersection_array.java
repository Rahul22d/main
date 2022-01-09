package Arrays;
import java.util.Scanner;
public class union_intersection_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter 1st array size");
int size1=s.nextInt();

int array1[]=new int [size1];
System.out.println("enter 1st array");
for(int j=0; j<size1; j++) {
	array1[j]=s.nextInt();
}
System.out.println("enter 2nd array size");
int size2=s.nextInt();

int array2[]=new int [size2];
System.out.println("enter 2nd array");
for(int i=0; i<size2; i++) {
	array2[i]=s.nextInt();
}
for(int i=0; i<size1; i++) {
	for(int j=0; j<size1; j++) {
		if(array1[i]<array1[j]) {
			int temp=array1[i];
			array1[i]=array1[j];
			array1[j]=temp;
		}
	}
}
for(int i=0; i<size2; i++) {
	for(int j=0; j<size2; j++) {
		if(array2[i]<array2[j]) {
			int temp=array1[i];
			array2[i]=array2[j];
			array2[j]=temp;
		}
	}
}
//union
int i=0;
int j=0;
System.out.println("union");
while( i<size1 &&  j<size2) {
	if(array1[i]<array2[j]) {
		System.out.print(array1[i]+" ");
		i++;
	}
	else if(array1[i]>array2[j]) {
		System.out.print(array2[j]+" ");
		j++;
	}
	else {
		System.out.print(array1[i]+" ");
		i++;
		j++;
	}
}
while(i<size1) {
	System.out.print(array1[i]+"");
	i++;
}
while(j<size2) {
	System.out.print(array2[j]+" ");
	j++;
}

	}

}
