import java.util.Scanner;

public class PerfectSquare 
{
	  static boolean isPerfectSquare(double x)  
	    { 
	          
	        double sr = Math.sqrt(x); 
	      
	       
	        return ((sr - Math.floor(sr)) == 0); 
	    } 
	     
	    public static void main(String[] args)  
	    { 
	        double x = 0; 
	        Scanner n=new Scanner(System.in);
	        System.out.println("enter a number to be checked ");
	        x=n.nextDouble();
	          
	        if (isPerfectSquare(x)) 
	            System.out.print("1"); 
	        else
	            System.out.print("0"); 
	    } 
	} 
	 
