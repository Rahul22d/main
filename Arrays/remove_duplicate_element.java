package Arrays;
import java.util.Scanner;
public class remove_duplicate_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter array size");
int size=s.nextInt();
int array[]=new int[size];
System.out.println("enter array");
for(int i=0; i<size; i++) 
{
	array[i]=s.nextInt();
}

//remove duplicate element
for (int i = 0; i <size; i++)
{
    for (int j = i + 1; j <size; j++) 
    {
        if (array[i] == array[j])
        {                  
            int shiftLeft = j;
//            delection jth index and move array index-1 position
            for (int k = j+1; k < size; k++, shiftLeft++) 
            {
                array[shiftLeft] = array[k];
            }
            size--;
            j--;
        }
    }
}
//new array
for(int k=0; k<size; k++) {
	System.out.print(array[k]+" ");
}
	}

}
