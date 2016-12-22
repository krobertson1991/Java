/**
 * 
 */
package Intro;

/**
 * @author kelseyr
 *
 */
public class Intro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getAvailableCredit(2500, 30);
		getAvailableCredit(50, 60);

	}
	
	private static void getAvailableCredit(int maxCredit, int usedCredit){
		int availableCredit = maxCredit - usedCredit;
		System.out.println("Maximum Credit: " + maxCredit);
		System.out.println("Credit Used: " + usedCredit);
		if(availableCredit < 0){
			System.out.println("OVER CREDIT LIMIT! " + availableCredit + " over the credit limit");
			System.out.println();
		}else{
			System.out.println("Available Credit for Use: " + availableCredit);
			System.out.println();
		}
	}

}
