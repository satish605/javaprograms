package introductionpractise;

import java.util.Scanner;

public class SumOfAll {

	public static void main(String[] args) 
	{
		int sum = 0,average=0,i,n;
		Scanner fd=new Scanner(System.in);
		System.out.println("enter a value for n:");
		n=fd.nextInt();
		for( i=0;i<=n;i++)
         sum=sum+i;
		average=sum/n;
		System.out.println("the sum of n numbers is"+ sum);
		System.out.println("the average of number is"+ average);
	}

}