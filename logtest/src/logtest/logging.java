package logtest;
import java.util.logging.Logger; 

public class logging 
{
	Logger logger = Logger.getLogger(this.getClass().getName());
	
	public logging()
	{
		logger.info("Logging...");
		logger.severe("This is an error message");
		logger.fine("Here is a debug message");
	}
	
	public void metod()
	{
		
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new logging();
	}
}
