import java.util.Scanner;

public class CalculatorIf 
{

	public static void main(String[] args)
	{
	double num1,num2;
	int choose;
		Scanner Sat=new Scanner(System.in);
		System.out.println("enter  number1:");
		num1=Sat.nextDouble();
		System.out.println("enter  number2:");
		num2=Sat.nextDouble();
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.modular division");
		System.out.println("enter your choose");
		choose=Sat.nextInt();
		
		if(choose==1)
		{
			System.out.println("addition of two numbers is "+ (float)(num1+num2));
		}
		 else if(choose==2)
		 {
			 System.out.println("substraction of two numbers is "+ (float)(num1-num2));
		 }
		 else if(choose==3)
		 {
			 System.out.println("multiplication of two numbers is "+ (float)(num1*num2));
		 }
		 else if(choose==4)
		 {
			 System.out.println("division of two numbers is "+  (float) (num1/num2));
		 }

		 else if(choose==5)
		 {
			 System.out.println("modular divison of two numbers is "+  (float) (num1%num2));
		 }
		}

}

