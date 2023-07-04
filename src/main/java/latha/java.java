package latha;

public class java
{
	int a,b,c;
	
	void display(int a)
		{
		System.out.println("entered value is"+a);
	}
	void display(int a, int b)
	{
	System.out.println(a+b);
	}
	public static void main(String args[])
	{
		java a=new java();
		a.display(10);
		a.display(10,10);
	}
	}