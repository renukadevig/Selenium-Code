package Pack1;

public class Class1 {

	public static void main(String[] args) 
	{
		int x,y,z,m;
		x=1;y=2;		
		
		Class1 obj=new Class1();
		
		print();
		z= add(x,y);
		m= obj.mul(x,y);
		
		System.out.println("Result from method add:"+z);
		System.out.println("Result from method mul:"+m);
		
		
	}
	
	public static int add(int a,int b)
	{
		int c=a+b;
		System.out.println("addition result:"+c);
		return c;
	}
	
	public int mul(int a,int b)
	{
		int c=a*b;
		System.out.println("multiplication result:"+c);
		return c;
	}
	
	public static void print()
	{
		System.out.println("Welcome");
	}

}
