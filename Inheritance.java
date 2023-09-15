class A
{
	public void m1()
	{
		System.out.println("Hii");
	}

}
class B extends A

{
	public void m2()
	{
		System.out.println("Byee");
	}
}

class Check
{
	public static void main(String[]args)
	{
	A a=new A();
	a.m1();

	B b =new B();
	b.m1();
	b.m2();
	}
}