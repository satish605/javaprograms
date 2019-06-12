package introductionpractise;
import java.util.Scanner;
public class ReverseNumbers {

	public static void main(String[] args)
	{
	        int num, reversed = 0;
	        Scanner rev=new Scanner(System.in);
	        System.out.println("enter a number:");
	        num=rev.nextInt();
	        while(num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }

	        System.out.println("Reversed Number: " + reversed);

	}

}