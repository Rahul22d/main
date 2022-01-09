package Arrays;
import java.util.*;
public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter size");
int size=s.nextInt();
String name[]=new String[size];
s.skip(System.lineSeparator());
for(int i=0; i<size;i++) {
	System.out.println("enter name");
	name[i]=s.nextLine();
}
s.close();
for(int i=0; i<size;i++) {
	System.out.println("your "+(i+1)+" name :"+name[i]);
}
	}

}
