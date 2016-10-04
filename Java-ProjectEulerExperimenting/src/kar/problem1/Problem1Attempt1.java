/**
 * 
 */
package kar.problem1;

/**
 * <strong>Multiples of 3 and 5: Attempt 1</strong>
 * <p>If we listed all the natural numbers below 10 that are multiples of 3 or 5, we 
 * get 3, 5, 6, and 9.  The sum of these multiples is 23. </br> Find the sum of all the
 * multiples of 3 or 5 below 1000.</p>
 * @author Kelsey Robertson
 *
 */
public class Problem1Attempt1 {
	/**
	 * @variables output: to print out the answers
	 */
	public static Integer output;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		calculate(1000);
		System.out.print(output);
	}
	
	public static Integer getAnswer(){
		return output;
	}
	
	public static void calculate(Integer maxLimit){
		Integer sum = 0;
		for (int i = 0; i < maxLimit; i++){
			if(i%3 == 0){
				sum += i;
			}else if (i%5 == 0){
				sum += i;
			}
		}
		
		output = sum;
	}

}
