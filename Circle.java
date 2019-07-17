import java.util.Scanner;

public class Circle 

	{ 
	static int circle(int x1, int y1, int x2, int y2, int r1, int r2) 

		{ 
			int distSq = (x1 - x2) * (x1 - x2) + 
						(y1 - y2) * (y1 - y2); 
			int radSumSq = (r1 + r2) * (r1 + r2); 
			if (distSq == radSumSq) 
				return 1; 
			else if (distSq > radSumSq) 
				return -1; 
			else
				return 0; 
		} 
		public static void main (String[] args) 
		{ 
			int x1,x2,y1,y2,r1,r2;
			Scanner sg=new Scanner(System.in);
			System.out.println("enter value for x1:");
			x1=sg.nextInt();
			System.out.println("enter value for x2:");
			x2=sg.nextInt();
			System.out.println("enter value for y1:");
			y1=sg.nextInt();
			System.out.println("enter value for y2:");
			y2=sg.nextInt();
			System.out.println("enter value for r1:");
			r1=sg.nextInt();
			System.out.println("enter value for r2:");
			r2=sg.nextInt();
			int t = circle(x1, y1, x2, 
						y2, r1, r2); 
			if (t == 1) 
				System.out.println ( "Circle touch to" + 
									" each other."); 
			else if (t < 0) 
				System.out.println ( "Circle not touch" + 
									" to each other."); 
			else
				System.out.println ( "Circle intersect" + 
									" to each other."); 
				
		} 
	}


