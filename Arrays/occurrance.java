package Arrays;
import java.util.*;
public class occurrance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("enter array size");
        int size=s.nextInt();
        int array[]=new int[size];
        
        System.out.println("enter array element");
        for(int i=0; i<size; i++) {
        	array[i]=s.nextInt();
        	
        }
        
        System.out.println("array");
        for(int i=0; i<size; i++) {
        	System.out.println(array[i]+ " ");
        }
        
        System.out.println("enter number to find");
        int e=s.nextInt();
        int count=0;
        for(int i=0; i<size; i++) {
        	if(array[i]==e) {
        		count++;
        	}
        }
        System.out.println(e+" number occure "+count +" time");
	}

}
