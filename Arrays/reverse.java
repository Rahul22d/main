package Arrays;
import java.util.*;
public class reverse {
  public static void main(String [] args) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("enter size");
	  int size=s.nextInt();
	  int array[]=new int [size];
	   
	  System.out.println("enter array");
	  for (int i=0; i<size; i++) {
		  array[i]=s.nextInt();
	  }
	  
	  System.out.println("array is");
	  for (int i=0; i<size; i++) {
		  System.out.println(array[i]);
	  }
	  
//	  reverse array 
	  int rev[]=new int [size];
	  for(int i=size-1; i>=0; i--) {
		  rev[size-1-i]=array[i];//size value (ex-4) so 4-1 is array size and 4-1-i index number (ex- i=3, 4-1 -3=0 rev[0]=array[3]
	  }
	  
	  System.out.println("reverse array");
	  for(int i=0; i<size; i++) {
		  System.out.println(rev[i]);
	  }
  }
}
