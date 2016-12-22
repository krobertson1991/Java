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
		
		getSalesTax(15.99, 7);
		getSalesTax(320.81, 10);

	}
	
	private static void getSalesTax(double retailPrice, double percent) {
		double totalSale = 0.00;
		double salesTaxTotal = retailPrice * (percent/100);
		totalSale = retailPrice + salesTaxTotal;
		
		System.out.println("Retail Price: " + retailPrice);
		System.out.println("Sales Tax Percentage: " + percent + "%");
		System.out.println("Sales Tax Total: " + String.format("%.2f", salesTaxTotal));
		System.out.println("Total for Purchase: " + String.format("%.2f",totalSale));
		System.out.println();
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
