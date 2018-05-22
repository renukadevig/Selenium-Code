package Pack1;

public interface Interface2 
{
	static extend_class obj=new extend_class();
	
	public static void main(String args[])
	{
		float x,y;
		x=(float) 2.1;
		y=(float) 3.2;
		printline();
		System.out.println(add(x,y));
		
	}
	
	public static float add(float a, float b)
	{
		float c=a+b;
		return c;
	}
	
	public static void printline()
	{
		obj.print();
	}

}
