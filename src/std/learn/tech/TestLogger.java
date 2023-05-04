package std.learn.tech;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogger {

	private static final Logger logger = Logger.getLogger("Test Logger");
	
	public TestLogger() {
		logger.setLevel(Level.FINE);
	}
	
	public void methodSevere() {
		logger.severe("Severe Error");
	}
	
	public void methodWarning() {
		logger.warning("Warning Message");
	}
	
	public void methodInfo() {
		logger.info("Info Message");
	}
	
	public static void main(String[] args) {
		
		/*
		 * Logger's are used to log the message or information to track the execution of code 
		 * Loggers are present in the java.util.logging package 
		 * Logger is implemented through handler, formatter 
		 * Application logs are passed onto Logger -> handler -> formatter 
		 * Logger adds the extra information like date and time 
		 * handler is used to determine the type of source output like console/file/socket 
		 * formatter is used to beautify the logs
		 * We can add filters to set the log level to display or allow only certain log levels
		 * Loggers follow a hierarchy Severe, Warning, Info, Fine, Finer, Finest
		 * Loggers can also be used to log the configuration and we can use config level
		 * By default loggers are printed on the console, it uses consoleHandler
		 * 
		 */
		
		var testLogger = new TestLogger();
		
		testLogger.methodSevere();
		testLogger.methodWarning();
		testLogger.methodInfo();
	}
}
