package std.learn.tech;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileHandlerExample {

	private final Logger logger;

	public FileHandlerExample() {
		LogManager manager = LogManager.getLogManager();
		String loggerName = Logger.GLOBAL_LOGGER_NAME;
		logger = manager.getLogger(loggerName);
		logger.setLevel(Level.ALL);

		try {
			// Create Handler
			FileHandler fileHandler = new FileHandler("C:\\log\\TestLog_%g.log", 1000, 10);
			
			// Setting log level to Info
			fileHandler.setLevel(Level.INFO);

			// Adding File Handler to Logger
			logger.addHandler(fileHandler);

			// Setting Formatter to Simple Formatter
			fileHandler.setFormatter(new SimpleFormatter());

		} catch (IOException ex) {
			Logger.getLogger(FileHandlerExample.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SecurityException ex) {
			Logger.getLogger(FileHandlerExample.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	public void testLogs() {
		for (int i = 0; i < 10; i++) {
			// Test Logs with Different Logging level
			logger.log(Level.SEVERE, "Fatal Error 1: Message");
			logger.log(Level.WARNING, "Warning 1: Warning Message");
			logger.log(Level.WARNING, "Warning 2: Warning Message");
			logger.log(Level.INFO, "Info 1: The Message");
			logger.log(Level.INFO, "Info 2: The Message");
			logger.log(Level.INFO, "Info 3: The Message");
			logger.log(Level.INFO, "Info 4: The Message");
			logger.log(Level.INFO, "Info 5: The Message");
			logger.log(Level.INFO, "Info 6: The Message");
			logger.log(Level.FINE, "Fine 1: The Message");
			logger.log(Level.FINE, "Fine 2: The Message");
			logger.log(Level.FINE, "Fine 3: The Message");
		}
	}

	public static void main(String[] args) {
		var fileHandlerExample = new FileHandlerExample();
		fileHandlerExample.testLogs();
	}
}
