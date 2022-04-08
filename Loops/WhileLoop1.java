package Loops;

public class WhileLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks[] = {23,25,35,32,26};
int avg=0;
int sum=0;

for(int i=0; i<marks.length; i++) {
	sum +=marks[i];
	
}
System.out.println("sum of all marks="+sum);

avg=sum/marks.length;
System.out.println("avg of total marks="+avg);
	
	}
}
