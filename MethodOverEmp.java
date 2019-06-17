package introductionpractise;

public class MethodOverEmp
{

	public void  string(String a,String b)
	 {
		 System.out.println("name of employee "+ a +" "+"address"+ " "+ b);
	 }
	 public void string(String a,String b,int c)
	 {
		 System.out.println("name of employee "+ a +" "+"address"+" "+ b +" "+ "emp id is"+  c);
	 }
	public static void main(String[] args)
	{
		MethodOverEmp obj= new MethodOverEmp();
		obj.string("Satish","hyderabad");
		obj.string("kumar","sathupally",12345);
		
	}

}