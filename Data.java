package introductionpractise;
	public class Data 
	{
	    private String name;
		public String getName()
		{
	        return this.name;
	    }
	    public void setName(String name) 
	    {
	    	this.name = name;
	    }
	
	public static class Main
	{
	    public static void main(String[] main)
	    {
	        Data d = new Data();
	        d.setName("public access modifier works");
	        System.out.println(d.getName());
	    }
	}

	}
// private can be accessable with in the class only other than that class we can't access private members by using inheritance 