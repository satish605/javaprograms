import java.util.Scanner;

public class StarPat
{

	public static void main(String[] args)
	{
int n; 
Scanner sg=new Scanner(System.in);
System.out.println("enter number of rows:");
n=sg.nextInt();
for(int i=0; i<n; i++) 
{   
    for(int j=0; j<=i; j++) 
    { 
       
        System.out.print("* "); 
    } 
 
    System.out.println(); 
} 
}
}
