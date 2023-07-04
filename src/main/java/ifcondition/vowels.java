package ifcondition;

public class vowels {
	
public void vowelscheck(char n)
{
	
	if(n=='a'|| n=='e'|| n=='i'||n=='o'|| n=='u')
	{
		System.out.println("It is a vowel");
	}
	else 
	{
		System.out.println("It is not a vowel");
	}
}
public static void main (String args[])
{
	vowels b=new vowels();
	b.vowelscheck('A');
	
}
}
