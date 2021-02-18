
public class App {
	
	static Logger logger;

	public static void main(String[] args) {
		
		Logger astreriskLogger = new AstreriskLogger();
		Logger spaceLogger = new SpaceLogger();
		
		astreriskLogger.log("Hello, Thank you for Logging in!");
		astreriskLogger.error("Your message could not be completed");
		spaceLogger.log("Hello, Thank you for Logging in!");
		spaceLogger.error("Your message could not be completed");
		

	}

}
