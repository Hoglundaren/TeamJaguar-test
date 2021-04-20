package knuteslog;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
 
public class LogTest {
	Logger logger =  Logger.getLogger(this.getClass().getName());
	private File log;
	private String send;
	FileHandler fh;
 
	public LogTest()  
	{
		log = new File("log.txt");
		try {
 
			if(log.exists()==false) {
				testMetod();
			}
 
			fh = new FileHandler (log.toString());
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);
			logger.info("My first log");
		}catch (Exception e) {
			e.printStackTrace();
		}
 
		logger.info("This is");
		logger.severe("This is an error message");
		logger.fine("Here is a debug message");
 
		//Lösning hittad: https://stackoverflow.com/questions/15758685/how-to-write-logs-in-text-file-when-using-java-util-logging-logger 
	}
	public static void main(String[] args) {
		new LogTest();
	}
	public void testMetod() {
		try {
			FileWriter fstream = new FileWriter(log);
			fstream.write("");
			fstream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
