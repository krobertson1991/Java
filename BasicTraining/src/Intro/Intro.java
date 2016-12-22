/**
 * 
 */
package Intro;

/**
 * @author kelseyr
 *
 */
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
		
		getAccountBalance(81.99, 234.10, 67.89, 0.03);
		getAccountBalance(0.01, 20.56, 1000.01, 0.10);

	}
	
	private static void getAccountBalance(double startingBalance, double deposits, double withdrawals, double interestRate) {
		double endingBalance = (startingBalance + deposits + withdrawals) * (1 + (interestRate/100));
		
		if(withdrawals > (startingBalance + deposits)){
			System.out.println("You cannot withdraw $" + withdrawals + " from your account.  You do not have enought money in there.");
			System.out.println();
		}else{
			System.out.println("Starting Balance: $" + String.format("%.2f",startingBalance));
			System.out.println("Total Deposits: $" + String.format("%.2f",deposits));
			System.out.println("Total Withdrawals: $" + String.format("%.2f",withdrawals));
			System.out.println("Monthly Interest Rate: " + interestRate + "%");
			System.out.println("Ending Balance: $" + String.format("%.2f",endingBalance));
			System.out.println();
		}
	}

	private static void getSalesTax(double retailPrice, double percent) {
		double totalSale = 0.00;
		double salesTaxTotal = retailPrice * (percent/100);
		totalSale = retailPrice + salesTaxTotal;
		
		System.out.println("Retail Price: $" + retailPrice);
		System.out.println("Sales Tax Percentage: " + percent + "%");
		System.out.println("Sales Tax Total: $" + String.format("%.2f", salesTaxTotal));
		System.out.println("Total for Purchase: $" + String.format("%.2f",totalSale));
		System.out.println();
	}

	private static void getAvailableCredit(int maxCredit, int usedCredit){
		int availableCredit = maxCredit - usedCredit;
		System.out.println("Maximum Credit: $" + maxCredit);
		System.out.println("Credit Used: $" + usedCredit);
		if(availableCredit < 0){
			System.out.println("OVER CREDIT LIMIT! $" + (availableCredit * -1) + " over the credit limit");
			System.out.println();
		}else{
			System.out.println("Available Credit for Use: $" + availableCredit);
			System.out.println();
		}
	}

}
