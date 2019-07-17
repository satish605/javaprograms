import java.util.Scanner;

public class NameLargest
{

	public static void main(String[] args)
	{
    Scanner x = new Scanner(System.in);
    String[] names = new String[5];
    System.out.print("Enter 5 names :");
    names[0] = x.nextLine();
    names[1] = x.nextLine();
    names[2] = x.nextLine();
    names[3] = x.nextLine();
    names[4] = x.nextLine();
    String lengthyName = "";
    for (String name : names) {
       
        if (name != null && name.length() > lengthyName.length()) {
            lengthyName = name;
        }
    }
    System.out.println("Longest name is " + lengthyName);
}
}