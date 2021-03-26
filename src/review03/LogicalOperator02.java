package review03;

public class LogicalOperator02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		number = 1000;
		/* if the variable number contais a value between 0to 100 print ("0 to 100") otherwise
		 * print("out of range")
		 */

		if (number>=0) {
			if (number <=100) {
				System.out.println("0");
				
			}
		}else {
			System.out.println("Out of range");
		}
		
	///; these two examples are the same	
		if (number>=0 && number <=100) {
			System.out.println("0 to 100");
		}else {
			System.out.println("Out of Range");
		}
		
		
		if(number>=0 && number<=100) {
			System.out.println("Checking");
		System.out.println("Checking");
		}
	}

}
