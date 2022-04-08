import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char operator;
double num1,num2 ;
Scanner s=new Scanner(System.in);
num1=s.nextDouble();
operator=s.next().charAt(0);
num2=s.nextDouble();
s.close();
double result;
switch(operator) {
case'+':
	result =num1+num2;
	System.out.println("Sum="+result);
	break;
case'-':
	result=num1-num2;
	System.out.println("Subtract="+result);
	break;
case'*':
	result=num1*num2;
	System.out.println("Multipile="+result);
	break;
case'/':
    result=num1/num2;
	System.out.println("Divide="+result);
	break;
case'%':
	result=num1*num2/100;
	System.out.println("Percent="+result);
	break;
	default:
		System.out.println("invailid input");
}

	}

}
