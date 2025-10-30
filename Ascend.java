	public class Ascend {
    public static void main(String[] args) {

        int limit = Integer.parseInt(args[0]);// מקבל מספר לטווח
        int a = (int)(Math.random() * limit);// מגריל מספרים בטווח
        int b = (int)(Math.random() * limit);
        int c = (int)(Math.random() * limit);

        System.out.println(a + " " + b + " " + c); // מדפיס בסדר מקורי

        int max = Math.max(a, Math.max(b, c)); //בוחר מקסימלי
        int min = Math.min(a, Math.min(b, c));// בוחר מינימאלי
        int middle = a + b + c - max - min;//מחדב אמצעי

        System.out.println (min + " " + middle + " " + max);
    }
}