//* Create a class named App that has a main method.
//* In this class instantiate an instance of each of your classes that implement Logger.
//* Test both methods on each instance.

public class Application {

	public static void main(String[] args) {
		
		logger logger = new AsterikLogger();
		
		logger.log("Hi Keith!");
		logger.error("Hi Keith!");
				
		logger logger2 = new SpacedLogger();
		
		logger2.log("Hi Brantley!");
		logger2.error("Hi Brantley!");

	}
}