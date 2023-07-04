package ifcondition;

public class CheckAge 
{

	public void ifcondition(int age)
	
{
		
			if (age<20)
			{
				System.out.println("Teenaged Person");
				
			}
			
			else if (age>21 && age<35)
			{
				System.out.println("you are men or women");
				
			}
			
			else if(age>35 && age<60)
			{
				System.out.println("you are about to become old");
				
	          }
			else if(age>61)
			{
				System.out.println("you are senior citizen");
				
			}
		}


		
		public static void main (String args[])
		{
			CheckAge h=new CheckAge();
			h.ifcondition(65);
			
		}
	}

