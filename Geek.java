package introductionpractise;

public class Geek 
{
	
	    public void geekIdentity(String name,  int id){ 
	           
	        System.out.println("geekName :"+ name +" "+"Id :"+ id); 
	    } 
	       
	    public void geekIdentity(int id, String name)
	  { 
	           
	        System.out.println("geekName :"+ name +" "+"Id :"+ id); 
	    } 

	    public static void main (String[] args) { 
	           
	        Geek geek = new Geek(); 
	           
	        geek.geekIdentity("Satish", 1); 
	        geek.geekIdentity("kumar", 2); 
	           
	    } 
	} 