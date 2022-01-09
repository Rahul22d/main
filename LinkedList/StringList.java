package LinkedList;
import java.util.*;
//import org.w3c.dom.Node;
import java.util.LinkedList;
public class StringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> a=new LinkedList <> ();
a.add("ram");
a.add("asd");
a.add(1,"sita");
a.add("ram");
a.add("sita");
a.add("ram");
a.set(2, "laxman");//set function replace item
System.out.println("list: "+a);
System.out.println("index on ram "+a.indexOf("ram")+
		a.lastIndexOf("ram")+a.contains("ram"));

String str=a.get(1);
System.out.println("index 1 :"+str);
LinkedList <Integer> i=new LinkedList<>();
i.add(4);
i.addLast(6);
i.add(5);
i.addLast(9);
i.add(2,5);//2 is a index number and 5 is a data to store
i.addFirst(7);

System.out.println("int list :"+i);
i.remove(2);//2 is index number 
i.removeFirst();
i.indexOf(5);
System.out.println("after remove "+i);

	ArrayList<Integer> r=new ArrayList<>();
	r.add(5);
	r.add(0,9);;
	System.out.println("Array : "+r);
	System.out.println("char linkedd list");
	
	LinkedList <Character> c=new LinkedList<>();
	c.add('h');
	c.add('a');
	c.add('b');
	c.add(3,'c');
	c.addLast('z');
	
	c.add('g');
	c.addFirst('f');
	System.out.println("char list is "+c);
	}

}
