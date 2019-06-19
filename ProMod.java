package introductionpractise;

public class ProMod
 {
	    protected void debug(String logLine){
	        System.out.println("Debug line: "+logLine);
	    }
	}



//other program
package introductionpractise;


	import introductionpractise.ProMod;

	public class Main extends ProMod {

	    public static void main(String [] args){
	        Main ProMod = new Main();

	        ProMod.debug("Proteced modifier ");
	    }
	}

//by using inheritance only protected classes can access in separate packages 