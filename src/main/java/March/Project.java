package March;

public class Project
{
	
public static void addition()
{
int a=10;
int b=20;

    int c=a+b;
	System.out.println("addition value is" +c);

}
public static void subtraction()
{ 
	int a=10;
	int b=20;
    int c=a-b;
	System.out.println("subtraction value is" +c);
			
}
public static void Multiplication()
{
	
		int a=10;
		int b=20;
	
	int c=a*b;
	System.out.println("multiplication value is" +c);
	
}
	

public static void Division()
{
  int a=10;
  int b=20;
  
		int c=a/b;
		System.out.println("Division value is" +c);
	
		
}
public static void main(String args[])
{
      
      calc f=new calc();
      f.addition(10,20);
      Division();
      Multiplication();
      addition();
      subtraction();
      overload d=new overload();
      d.display(10);
      d.display(10,10);
}
      
}
      
class calc extends Project
{

public static void addition(int a , int b)
 {
       
       int c=a+b;
	   System.out.println("addition value is" +c);
	   
 }
} 
class overload extends Project
{
int a,b,c;

public static void display(int a)
	{
	System.out.println("entered value is" +a);
}
public static void display(int a, int b)
{
System.out.println(a+b);
}
}