package introductionpractise;
class Bike
{  
void stop()
{

	System.out.println("stoping...");
	}  
}  
class Bikes extends Bike
{  
void slow()
{
	System.out.println("slowdown...");
	}  
}  
class  Bike1 extends Bikes
{  
void start()
{
	System.out.println("starting...");
}  
}  
class TestInheritance2
{  
public static void main(String[] args)
{  
Bike1 d=new Bike1();  
d.start();  
d.slow();  
d.stop();  
}
}