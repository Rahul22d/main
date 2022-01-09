package Arrays;
import java.util.Scanner;
public class move_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter array size");
int size=s.nextInt();
int array[]=new int[size];

System.out.println("enter array");
for(int i=0; i<size; i++) {
	array[i]=s.nextInt();
}

//negative value move
for(int i=0; i<size; i++) {
	for(int j=i+1; j<size; j++) {
		if(array[i]<0) {
			int temp=array[j-1];
			array[i]=array[j];
			array[j]=temp;
		}
	}
}

System.out.println("new array");
for(int k=0; k<size; k++) {
	System.out.println(array[k]+" ");
}
	}

}
