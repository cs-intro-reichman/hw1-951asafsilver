// Computes the future value of a saving investment.
public class FVCalc {
    public static void main(String[] args){
        if (args.length != 3) // מוודא שנקלטים רק 3 ארגומנטים
        {
            System.out.println("error");
            return;
        }

        int CurrentValue = Integer.parseInt(args[0]);
        double Grow = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);

        if (CurrentValue < 0 || Grow < 0 || Grow > 100 || years < 0) // בודק שכל הארגומנטים תקינים
        {   
            System.out.println("error");
            return;
        }

        double rateDecimal = Grow / 100; // אחוז הגדילה לחישוב
        double futureVal = CurrentValue * Math.pow(1 + rateDecimal, years); // מכפיל את הערך הראשוני באחוז הגדילה בחזקת השנים
        int roundvalue = (int) futureVal; // מעגל את המספר
        String roundrate = String.format("%.1f", Grow); // פורמט אחוז

        System.out.println("After " + years + " years, $" + CurrentValue + 
                           " saved at " + roundrate + "% will yield $" + roundvalue);
    }
}
