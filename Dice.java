import java.util.Scanner;

public class Dice 
{
	public static void main (String[] args) 
	{
		int face;
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter a number for face:");
	         face=s.nextInt();
	        if (face==3)
	        {
	            System.out.println(4);  
	        }
	        else if (face==4)
	        {
	            System.out.println(3);
	        }
	        else if (face==1)
	        {
	            System.out.println(6);
	        }
	        else if (face==6)
	        {
	            System.out.println(1);
	        }
	        else if (face==2)
	        {
	            System.out.println(5);
	        }
	        else
	        {
	            System.out.println(2);
	        }
	    }
		
	}


