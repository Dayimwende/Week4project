package week05;

import week05.AsteriskLogger;
import week05.Logger;
import week05.SpacedLogger;

public class App {

	public static void main(String[] args) {

		//instantiate an instance of each logger class
			Logger asteriskLogger = new AsteriskLogger();
			Logger spacedLogger = new SpacedLogger();
			
			
		// test of both methods
			asteriskLogger.log("Hello");
			asteriskLogger.error("Hello");
			
			spacedLogger.log("Hello");
			spacedLogger.error("Hello"); 
			

		
	
 }
}
	