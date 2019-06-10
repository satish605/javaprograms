package introductionpractise;

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args)
	{
		double pr,t,r,com;
		Scanner Smpi=new Scanner(System.in);
		System.out.println("enter principal amount pr:");
		pr=Smpi.nextDouble();
		System.out.println("enter time peroid t:");
		t=Smpi.nextDouble();
		System.out.println("enter rate of intrest r:");
		r=Smpi.nextDouble();
		com=pr * Math.pow(1.0+r/100.0,t) - pr;
		System.out.println("the compound intrest is "+com);
			
	}

}
