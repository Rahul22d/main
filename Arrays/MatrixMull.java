package Arrays;
import java.util.Scanner;
public class MatrixMull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("enter rows1");
int rows1=sc.nextInt();
System.out.println("enter cols1");
int cols1=sc.nextInt();
System.out.println("enter rows2");
int rows2=sc.nextInt();
System.out.println("enter cols2");
int cols2=sc.nextInt();

if(rows1!=cols2) {
	System.out.println("not availid matrix:");
}
int a[][]=new int[rows1][cols1];
int b[][]=new int[rows2][cols2];
int c[][]=new int[rows1][cols2];

System.out.println("enter array a");
for(int i=0; i<rows1; i++) {
	for(int j=0; j<cols1; j++) {
		a[i][j]=sc.nextInt();
	}
}

System.out.println("enter array b");
for(int i=0; i<rows2; i++) {
	for(int j=0; j<cols2; j++) {
		b[i][j]=sc.nextInt();
	}
}

System.out.println("Array c is");
for(int i=0; i<rows1; i++) {
	for(int j=0; j<cols2; j++) {
		c[i][j]=0;
		for(int l=0; l<=cols1; l++) {
		c[i][j]=a[i][l] * b[l][j];
	}
		System.out.print(c[i][j]+" ");
		
	}
	System.out.println();
}

		



System.out.println("Enter values for matrix A : \n");
for (int i = 0; i < rows1; i++) {
    for (int j = 0; j < cols1; j++) 
        a[i][j] = sc.nextInt();
}
System.out.println("Enter values for matrix B : \n");
for (int i = 0; i < rows2; i++) {
    for (int j = 0; j < cols2; j++) 
        b[i][j] = sc.nextInt();
}

System.out.println("Matrix multiplication is : \n");
for(int i = 0; i < rows1; i++) {    
    for(int j = 0; j < cols2; j++){    
      c[i][j]=0;      
      for(int k = 0; k < cols1; k++){      
        c[i][j] = a[i][k] * b[k][j];      
      }
      System.out.print(c[i][j] + " ");  
    }
    System.out.println();
}    
}
}
	


