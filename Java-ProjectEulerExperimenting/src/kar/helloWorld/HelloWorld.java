package kar.helloWorld;
/**
 * 
 */

/**
 * @author Kelsey Robertson
 *
 */
public class HelloWorld {
	public static String printedSaying;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		setString("Hello World!");
		System.out.print(getString());
	}
	
	public static String getString(){
		return printedSaying;
	}
	
	public static void setString(String sTemp){
		printedSaying = sTemp;
	}

}
