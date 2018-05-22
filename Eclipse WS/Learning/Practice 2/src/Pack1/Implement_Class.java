package Pack1;

public class Implement_Class implements interface1,Interface2 
{

	public static void main(String[] args) 
	{
		int a=2,b=2;
		float c=2,d=2;
		interface1.sub(a, b);
		Interface2.printline();
		System.out.println(addfloatresult(c,d));
				
	}
	
	public static float addfloatresult(float x,float y)
	{
		
		float c=Interface2.add(x, y);
		return c;
	}

}
