package Arrays;
import java.util.Scanner;
public class peak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter array size");
int size=s.nextInt();
int array[]=new int[size];

System.out.println("enter array");
for(int i=0;i<size;i++) {
	array[i]=s.nextInt();
}
System.out.println("array");
for(int i=0; i<size; i++) {
	System.out.println("  "+array[i]);
}

for(int i=1; i<=size;i++) {
	if(array[i]>=array[i-1]&&array[i]>=array[i+1])
	{
		System.out.println("peak elemeent "+array[i]);
	}
     
}

	}

}
