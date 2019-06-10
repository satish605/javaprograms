package introductionpractise;

import java.util.Scanner;

public class SimpleIntrestInputUser 
{
public static void main(String[]args)
{
	double p,t,r,si;
	Scanner Smpi=new Scanner(System.in);
	System.out.println("enter principal amount p:");
	p=Smpi.nextDouble();
	System.out.println("enter time peroid t:");
	t=Smpi.nextDouble();
	System.out.println("enter rate of intrest r:");
	r=Smpi.nextDouble();
	si=(p*t*r)/100;
	System.out.println("the simple intrest is "+si);
	
}
}
