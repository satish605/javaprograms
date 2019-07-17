
public class Cls1
{
		
	    void add(int p,int q)
	    {
	        System.out.println(p+q);
	    }
	}
	class Cls2 extends Cls1

	{
		void mul(int p,int q)
	{
		 System.out.println(p*q);
	}

	void task(int a,int b)
	{
		System.out.println(a*a+b*b);
		
	}
	public static void main(String[] args)
	{
	  Cls2 pr=new Cls2();
	  pr.add(10,12);
	  pr.mul(5,4);
	  pr.task(10, 10);
	}
	}


