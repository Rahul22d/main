package Arrays;
import java.util.*;
public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
 
System.out.println("enter size");
int size=s.nextInt();
int array []=new int[size];

System.out.println("enter array");
for(int i=0; i<size; i++) {
	array[i]=s.nextInt();
	
}

//sorting
for(int i=0; i<size; i++) {
	for(int j=0; j<size; j++) {
		if(array[i]<array[j]) {
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
	}
}

System.out.println("after sorting");
for(int k=0; k<array.length; k++) {
	System.out.println(array[k]);
}
//binary search
int low=0;
int high=size-1;
int key=7;

while(low<=high) {
	int	mid=(low+high)/2;
	if(array[mid]==key) {
		System.out.println("key position in array "+(mid+1));
		break;
	}
	if(key<array[mid]) {
		high=mid-1;
	}
	if(key>array[mid]) {
		low=mid+1;
	}
	else if(low>high /*low==mid*/) {
		System.out.println("not found");
	}
}
	}

}
