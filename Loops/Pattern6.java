package Loops;
import java.util.*;
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int num=1;
		for (int i=n; i>=0; i--) {
			for(int j=i; j>=1; j--) {
			System.out.print(" -");
			
			}
			System.out.print(num++);
			for(int j=1; j<=n-i; j++) {
				for(int a=1; a<=j; a++) {
					System.out.print(" 0");
				}
				
			
			}
			
			System.out.print(" "+ ++num);
			for(int k=n; k>1; k--) {
				for(int j=k; j>1; j--) {
					System.out.print("--");
				}
			}
			System.out.println();
		}
		
			
		}
	}
	


