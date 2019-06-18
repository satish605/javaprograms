package introductionpractise;

import java.util.Scanner;

public class PracWhile 
{
	public static void main(String[] args) 
	{
		
	
	int a,b, i, sum;
	Scanner add=new Scanner(System.in);
	System.out.println("enter a value for i");
	i=add.nextInt();
	
	
		while(i<=5)
		{
			System.out.println("enter a value for a");
			a=add.nextInt();
			System.out.println("enter a value for b");
			b=add.nextInt();
			sum=a+b;
			System.out.println(sum);
			break;
			
		}
		
	}

}