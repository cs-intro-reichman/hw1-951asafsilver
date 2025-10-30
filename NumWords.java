// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    if (args.length!=1)
		{
			System.out.println("error");
			return;
		}
		int input = Integer.parseInt(args[0]);
		int hundreds = input/100;
		int tens = (input/10)%10;
		int ones = input % 10; 
		System.out.println("hundreds" + hundreds + " tens" + tens + " ones" + ones );
	}
}
