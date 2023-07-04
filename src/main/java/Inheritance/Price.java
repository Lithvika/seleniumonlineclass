package Inheritance;

public class Price {

	public int cgst(int ctotal)
	{
	double cgst=ctotal*.09;
	System.out.println("cgst ; " +cgst);
	return ctotal;
	
	}
	public int sgst(int stotal)
	{
	double sgst=stotal*.09;
	System.out.println("cgst ; " +sgst);
	return stotal;
	
	}
public int Gtotal(int ctotal,int stotal)
{
	int Gtotal=ctotal+stotal;
	return Gtotal;
	
	
}


}

