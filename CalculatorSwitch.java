import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args)
	{
		int a,b,choice,result = 0;
		Scanner cal=new Scanner(System.in);
		System.out.println("enter number a:");
		a=cal.nextInt();
		System.out.println("enter number b");
		b=cal.nextInt();
		System.out.println("enter your choice");
		choice=cal.nextInt();
		switch(choice)
		{ 
		case 1:
			result=a+b;
			break;
		case 2:
			result=a-b;
			break;
		case 3:
			result=a*b;
			break;
		case 4:
			result=a/b;
			break;
		case 5:
			result=a%b;
			break;
			default:
				System.out.println("invalid selection");
				break;
				
		}
			System.out.println(result);
		}
      

}
