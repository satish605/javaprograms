package introductionpractise;

import java.util.Scanner;

public class NestedIfPractise 
{
public static void main(String[]args) 
{
int age;
Scanner sc = new Scanner(System.in);		
System.out.println("Please Enter you Age: ");
age = sc.nextInt();
if (age < 18)
 {
System.out.println("You are Minor.");					
}
else  
{
if (age >= 18 && age <= 60 )
  {
System.out.println("You are major");
}
else  
{
System.out.println("You are senoir citizen");
}
}
}				