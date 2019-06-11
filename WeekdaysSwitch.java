package introductionpractise;
import java.util.Scanner;
public class WeekdaysSwitch 
{
	public static void main(String[] args) 
	{
		int day;
		String daystring;
		Scanner Sat=new Scanner(System.in);
		System.out.println("enter your choice:");
		day=Sat.nextInt();
		switch (day)
		{ 
        case 1: 
            daystring = "Monday"; 
            break; 
        case 2: 
            daystring = "Tuesday"; 
            break; 
        case 3: 
            daystring = "Wednesday"; 
            break; 
        case 4: 
            daystring = "Thursday"; 
            break; 
        case 5: 
            daystring = "Friday"; 
            break; 
        case 6: 
            daystring = "Saturday"; 
            break; 
        case 7: 
            daystring = "Sunday"; 
            break; 
        default: 
            daystring = "Invalid day"; 
            break; 
        } 
        System.out.println(daystring); 	

	}

}
