package Package1;

public class Class1 {

	public static void main (String args[])
	{
		int x=2,y=3;
		Class1 obj=new Class1();
		System.out.println("Helloworld");
		System.out.println(obj.test(x, y));
		}
	
	public int test(int x, int y)
	{
		int z=x+y;
		System.out.println("Hellodubai " + z);
		return z;
			
	}
	
}
