import java.util.Scanner;

public class SumOfn
{


	public static void main(String[] args) 
	{
		int sum = 0,i,n;
		Scanner fd=new Scanner(System.in);
		System.out.println("enter a value for n:");
		n=fd.nextInt();
		for( i=0;i<=n;i++)
         sum=sum+i;
		System.out.println("the sum of n numbers is"+ sum);
	}

}

