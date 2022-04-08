package Loops;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1; i<=7; i++) {
	if(i<=4) {
		for(int j=1; j<=i; j++) {
			System.out.print("* ");
		}
		System.out.println();
				}
	else {
		for(int j=1; j<=7-i+1; j++) {
			
			System.out.print("* ");
		}
System.out.println();
	}
}
	}

}
