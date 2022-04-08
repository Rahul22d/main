package Loops;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner (System.in);
int n=s.nextInt();

boolean isPrime=true;

for(int i=2; i<n; i++) {
	if(n  % i == 0) {
		
 //isPrime = false;
 
 System.out.println("Not Prime");
	break;
	}
	else {
		
	System.out.println("Prime number");
	break;
}
}
if(n<2) {
	isPrime=false;
}
//System.out.println("isPrime  "+ isPrime);

if(n<2) {
	System.out.println("not a prime");
}
	}
	}


