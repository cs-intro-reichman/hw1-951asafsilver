// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// קולט את שלושת השמות וסכום
	    String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
		String BillTotal = args [3];
		// ממיר את הסכום לINT
		int IntTotal = Integer.parseInt(BillTotal);
		// מחלק את הסכום לשלוש ושומר כDOUBLE
		double SharePrice = (double) IntTotal / 3.0;
		double UpPrice = Math.ceil(SharePrice);
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + UpPrice + " Shekels each");
		

		

	}
}
