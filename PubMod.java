package introductionpractise;

public class PubMod 
{
	
	    public int debugLevel = 1;
	    public void debug(String logLine){
	        System.out.println("Debug: "+logLine);
	    }
	    public void info(String logLine){
	        System.out.println("Info: "+logLine);
	    }
	}

//other program
package introductionpractise;

public class PunMain 
{

	    public static void main( String[] args )
	    {
	    	PubMod logger = new PubMod();
	        logger.debug("debug with level " + logger.debugLevel);
	        logger.debugLevel = 5;
	        logger.info("info with level " + logger.debugLevel);
	    }
	}
//the public class can be accessed in derived classs and also in separate packages 