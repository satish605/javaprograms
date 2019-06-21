package introductionpractise;
class Bike
{  
void stop()
{
	System.out.println("Stoping...");
}
}
class Twowheeler extends Bike
{  
	void start()
{
	System.out.println("starting...");
	}  
}  
class TestInheritance
{  
public static void main(String args[])
{  
Bike d=new Bike(); 
d.start();  
d.stop();  
}
}