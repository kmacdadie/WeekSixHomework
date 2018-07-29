//*The SpacedLogger will add spaces between each character in the String argument passed in.
//* The log method on the SpacedLogger should print the following if the argument were "Hello"
//* H e l l o
//* The error method on the SpacedLogger should print the following if the argument were "Hello"
//* ERROR: H e l l o 

public class SpacedLogger implements logger {

	@Override
	public void log(String log) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
		    if (i > 0) {
		    result.append(" ");
		}
		    result.append(log.charAt(i));
		}
			System.out.println(result.toString());
				
	}

	@Override
	public void error(String error) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			    if (i > 0) {
			    result.append(" ");
			}
			    result.append(error.charAt(i));
			}
				System.out.println("ERROR:" + " " + result.toString());
				
	}
}