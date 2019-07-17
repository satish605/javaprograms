import java.util.Scanner;

public class Swap {

	public static void main(String[] args)
	{
int a,b;
Scanner sa=new Scanner(System.in);
System.out.println("enter number a: ");
a=sa.nextInt();
System.out.println("enter number b: ");
b=sa.nextInt();

a=a-b;
b=a+b;
a=b-a;
System.out.println(a);
System.out.println(b);
		
	}

}
