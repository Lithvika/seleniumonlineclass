package ifcondition;

public class Conditions

{

public void whileloop(int i,int j)
{
	int n=i+j;
	do
	{
		System.out.println(i);
		i=i+2;
	}
while(i<n+1);

}

public static void main(String []args)
{
Conditions h=new Conditions();
h.whileloop(70,5);
}
}

