import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) 
	{
	    
	          int rows;
	          Scanner sc=new Scanner(System.in);
	          System.out.println("enter number of rows:");
	          rows=sc.nextInt();
	            for(int i = rows; i >= 1; --i) {
	                for(int j = 1; j <= i; ++j) {
	                    System.out.print("* ");
	                }
	                System.out.println();
	            }
	        }
	    

	}


