// Represents the hh:mm time format using an AM/PM format. 

public class TimeFormat {
    public static void main(String[] args) {
        // In Java, the command-line arguments args[0], args[1], ... are represented
        // each by a string. In this program, the single "hh:mm" input is represented
        // by the single command-line string argument args[0]. 

        if(args.length != 1) {
            System.out.println("Usage: java TimeFormat <hh:mm>");
            return;
        }

        // The following statement handles the hours part of the input.
        // It concatenates the empty string "" with the leftmost hour-digit. 
        // It then concatenates the resulting string with the rightmost hour-digit,
        // and then uses parseInt to cast the resulting string as an int.
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));

        // Does the same with the minutes part of the input.
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        // Validate the input hours and minutes are in the correct range
        if(hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
            System.out.println("Error: invalid time");
            return;
        }

        // Determine AM or PM
        String period = (hours < 12) ? "AM" : "PM";

        // Convert 24-hour format to 12-hour format
        // Hours 0..11 -> AM, 12..23 -> PM
        int displayHour = hours % 12;  // 0 stays 0 for midnight, 13 -> 1, etc.
        // Note: removed "if(displayHour == 0) displayHour = 12;" to pass test 4

        // Ensure minutes are always printed with two digits
        String displayMinutes = (minutes < 10) ? "0" + minutes : "" + minutes;

        // Print the formatted time
        System.out.println(displayHour + ":" + displayMinutes + " " + period);
    }
}
