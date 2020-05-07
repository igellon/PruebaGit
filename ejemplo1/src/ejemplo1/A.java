package ejemplo1;

public class A 
{
	static int n=0;
	String f(A x)
	{
		 return "AA"+ (x.n++);
	}
	String f(B x)
	{
		 return "AB"+ (x.n--);
	}

}
