package introductionpractise;

import java.util.Scanner;

public class IfElsePractise {
	public static void main(String[] args) 
	{
	int num1,num2;
	Scanner ie=new Scanner(System.in);
	System.out.println("enter num1:");
	num1=ie.nextInt();
	System.out.println("enter num2:");
	num2=ie.nextInt();
	if(num1<num2)
	{
		System.out.println("this is greater");
	
	}
	else
	{
		System.out.println("this is smaller");
	}
	

	}

}
