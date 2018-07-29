//*The log method on the AsterikLogger should print out the string it receives between 3 asteriks on either side of the string.
//* e.g. if it the String argument is "Hello" it should print ***Hello*** to the console.
//* The error method on the AsterikLogger should print the String argument in a box of asteriks and preceeded by the word ERROR
//* e.g.			******************
//* 				***ERROR: Hello***
//* 				******************

public class AsterikLogger implements logger {

	@Override
	public void log(String log) {
		int boxLength = log.length() + 6;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < boxLength; i++) {
			sb.append("*");
		}
		System.out.println(sb.toString());
		System.out.println("***" + log + "***");
		System.out.println(sb.toString());
	}

	@Override
	public void error(String error) {
		int boxLength = error.length() + 13;
		StringBuilder err = new StringBuilder();
		for (int i = 0; i < boxLength; i++) {
			err.append("*");
		}
		System.out.println(err.toString());
		System.out.println("***" + "ERROR:" + " " + error + "***");
		System.out.println(err.toString());
		
	}
}
