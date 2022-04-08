package Loops;
import java.util.*;
public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner (System.in);
		System.out.println("enter name");
		String name=s.nextLine();
		char a[]=name.toCharArray();
		int count=1;
        for(int i=0; i<a.length;i++) {
	        for(int j=0; j<count;j++) {
		     System.out.print(a[j]+" ");
	          }
	        System.out.println();
	        count++;
        }
		
		int count2=a.length-1;
		
		for(int k=0; k<a.length;k++) {
			for(int j=0; j<count2;j++) {
				System.out.print(a[j]+" ");
			}
			count2--;
			System.out.println();
		
	}
	}
}
