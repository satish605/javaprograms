import java.util.Scanner;

public class Amstrong
{
public static void main(String[] args)
{
	int num,temp,i,s = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a num=");
	num=sc.nextInt();
	i=num;
	while(i!=0)
	{
		temp=i%10;
		s=s+(temp*temp*temp);
		i/=10;
		
	}
	if(s == num)
        System.out.println(num + " is an Armstrong number");
    else
        System.out.println(num + " is not an Armstrong number");
}
}	
