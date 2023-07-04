package Inheritance;

public class SrinivasaHotel extends Price

{
	public void Selectfood(String food,int count)
{
	
	System.out.println("Hotel Sri Srinivasa sweets and snacks"  );
	System.out.println(" No.20,Abc Nagar,Redhills,Ch-90 ");
	
}
public int itemrate(int Amount, String food)
{
	System.out.println(food);
String [] rate= {"idly-10","Dosa-20","Vada-40","Chapathi-50"};
for(String eachvalue : rate)
{
	String[] itemvalue= eachvalue.split("-");
if( itemvalue[0].equalsIgnoreCase(food))
{
	System.out.println("Food rate is" +itemvalue[1]);
	return Integer.parseInt(itemvalue[0]);
}
	
} 
 return 0;

}
		
public void discount(double total)
{
	double discount=total*.012;
	System.out.printf("Discounted price" ,+discount);
	
}
}
