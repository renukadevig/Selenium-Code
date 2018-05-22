package Pack1;

public interface interface1 
{
	public static void main(String args[])
	{
		int x,y,z,d;
		x=4;y=2;		
		
		z= sub(x,y);
		d= div(x,y);
	
				
		System.out.println("Result from method sub:"+z);
		System.out.println("Result from method div:"+d);
		System.out.println("Extend class addtion result:" + extend_class.add(x,y));
	}
	
	public static int sub(int a,int b)
	{
		int c=a-b;
		System.out.println("subtraction result:"+c);
		return c;
	}
	
	public static int div(int a,int b)
	{
		int c=a/b;
		System.out.println("division result:"+c);
		return c;
	}
}
