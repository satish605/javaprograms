package introductionpractise;

public class Test
{
	   final static int value = 10;

	   public static void main(String[] args)
	   {
	   final int BOXWIDTH = 6;
	   final String TITLE = "Manager";
	   
	   {
	      value = 12;   
	   }
}
}
/* this code will not execute because ocnce a value is defined as final it can't be changed 
in this program value is decleared as 10 and in the main methos it is defined as 12 so,the code gives an error*/