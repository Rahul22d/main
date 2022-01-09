package LinkedList;
import java.util.Scanner;

class can{
	Scanner s=new Scanner(System.in);
	void admin_login() {
		String id;
		System.out.println("enter id");
		id=s.nextLine();
		
//	s.skip(System.lineSeparator());
//		if(id =="wert") {
			System.out.println("enter password");
			int pass=s.nextInt();
			if(pass==7761) {
				System.out.println("1.change password");
				System.out.println("2.add_food");
				int ope=s.nextInt();
				switch(ope) {
				case 1:
					
				}
			}
		}
	
	void change() {
		System.out.println("enter new password");
		int pass=s.nextInt();
		
	}
	public void main() {
		System.out.println("1.admin_login");
		System.out.println("2.take order");
		System.out.println("");
		System.out.println();
		
		int opetion=s.nextInt();
		switch(opetion) {
		case 1:
			admin_login();
			break;
		default:
			System.out.println("enter valid number");
		}
	}
}
public class canteen {
public static void main(String [] args) {
	can c=new can();
	c.main();
	
}
}
