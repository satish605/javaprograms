package introductionpractise;

import java.util.Scanner;

public class CubesWhile {

	public static void main(String[] args)
	{
	int i,cubes,a;
	Scanner add=new Scanner(System.in);
	System.out.println("enter a value for i");
	i=add.nextInt();
	while(i<10)
	{
		System.out.println("enter a value for a");
		a=add.nextInt();
		cubes=a*a*a;
		System.out.println(cubes);
		break;
	}
	}
	

}