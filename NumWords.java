// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    if (args.length!=1)// מוודא שיש קלט יחיד
		{
			System.out.println("error");
			return;
		}
		int input = Integer.parseInt(args[0]);
		int hundreds = input/100; // ספרת מאות
		int tens = (input/10)%10;// ספרת עשרות
		int ones = input % 10; // ספרת יחידות
		System.out.println("hundreds" + hundreds + " tens" + tens + " ones" + ones );
	}
}
