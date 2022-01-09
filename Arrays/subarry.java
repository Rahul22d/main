package Arrays;
import java.util.Scanner;
public class subarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s=new Scanner(System.in);
   System.out.println("enter array size");
   int size=s.nextInt();
    
   int array[]=new int[size];
   System.out.println("enter array ");
   for(int i=0; i<size; i++) {
	   array[i]=s.nextInt();
   }
   
   System.out.println("enter sum value");
   int sum=s.nextInt();
   
   for(int i=0; i<size; i++) {
	   for(int j=i+1; j<size; j++) {
		   int sum1=array[i]+array[j];
		   if(sum1==sum) {
			   System.out.println("subarry index "+i+" "+j);
		   }
	   }
   }
	}

}
