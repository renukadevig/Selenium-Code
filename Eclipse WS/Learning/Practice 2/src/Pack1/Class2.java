package Pack1;

public class Class2
{
	static Class1 obj=new Class1();
	public static void main(String args[])
	{
		int a,b,c;
		a=2;
		b=3;
		//Class1 obj=new Class1();
		c=obj.mul(a, b);
		System.out.println("Call from other class result-mul:"+c);
	}
	
	public static void test()
	{
		int a=1,b=2;
		System.out.println(obj.add(a, b));
	}
	
	
}
