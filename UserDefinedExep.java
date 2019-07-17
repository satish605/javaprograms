
class Execption extends Exception{
	String str1;	   
	Execption(String str2)
	{
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1);
	   }
	}

	class UserDefinedExep
	{
	   public static void main(String args[])
	   {
		try
		{
			System.out.println("Starting of try block");
			
			throw new Execption("This is My error Message");
		}
		catch(Execption exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}