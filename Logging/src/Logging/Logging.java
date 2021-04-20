package alexlog;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
 
public class Hello {
	Logger logger;
 
	public Hello() throws SecurityException, IOException  
	{
		logger = Logger.getLogger(this.getClass().getName());
 
		FileHandler handler
        = new FileHandler("logs.txt");
		handler.setFormatter(new SimpleFormatter());
 
		logger.addHandler(handler);
		logger.setLevel(Level.FINE);
 
		logger.info("This is");
		logger.severe("This is an error message");
		logger.fine("Here is a debug message");
	}
 
 
	public static void main(String[] args) 
	{
		try 
		{ 
			new Hello();
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
