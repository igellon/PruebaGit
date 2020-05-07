package ejemplo1;

public class B extends A 
{
    String f (B x)
    {
    	return "BB"+ (x.n--);
    }
	public static void main(String[] args) 
	{
		A a = new A();
		A b = new B();
        System.out.println(a.f(b));
        System.out.println(b.f(b)); 
        System.out.println(a.f((B)b));
        System.out.println(b.f((B)b));
	}

}
