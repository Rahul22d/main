package Arrays;

import java.util.Scanner;

public class Shorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int w[]=new int[n];
		for(int i=0; i<n; i++) {
			w[i]=sc.nextInt();
		}
	//int a[]= {2,5,-2,6,1};
	//int s=a.length;
	int temp;
	for(int i=0;i<n-1; i++) {
		for(int j=0; j<n-1;j++) {
			if(w[j]>w[j+1]) {
				temp=w[j];
				w[j]=w[j+1];
				w[j+1]=temp;
			}
		
		}
		int ass[]= {3,5,4,7};
	}
	for(int item:w) {
		System.out.print(item+" ");
	}
	}
}
	




