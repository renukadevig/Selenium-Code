package Package2;
import Package1.*;

public class Class2 
{

	public static void main(String args[])
	{
		System.out.println("Class2");
		Class1 obj=new Class1();
		obj.test(3,4);
		System.out.println(obj.test(4, 5));
	}
}
