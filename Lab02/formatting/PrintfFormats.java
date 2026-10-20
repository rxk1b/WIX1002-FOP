package formatting;

import java.util.Locale;

// Display the same number using 15 different printf formats.
public class PrintfFormats {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double number = 1234.56789;

        System.out.println("WIX1002 - Printf Formatting Task");
        System.out.println("Matric number: 26068372");
        System.out.println("Same number: " + number);
        System.out.println();

        // The bars make spaces and alignment visible.
        System.out.printf("01. %%f          |%f|%n", number);
        System.out.printf("02. %%.0f        |%.0f|%n", number);
        System.out.printf("03. %%.1f        |%.1f|%n", number);
        System.out.printf("04. %%.2f        |%.2f|%n", number);
        System.out.printf("05. %%.4f        |%.4f|%n", number);
        System.out.printf("06. %%15.2f      |%15.2f|%n", number);
        System.out.printf("07. %%-15.2f     |%-15.2f|%n", number);
        System.out.printf("08. %%015.2f     |%015.2f|%n", number);
        System.out.printf("09. %%+.2f       |%+.2f|%n", number);
        System.out.printf("10. %%,.2f       |%,.2f|%n", number);
        System.out.printf("11. %%e          |%e|%n", number);
        System.out.printf("12. %%.3e        |%.3e|%n", number);
        System.out.printf("13. %%E          |%E|%n", number);
        System.out.printf("14. %%.3g        |%.3g|%n", number);
        System.out.printf("15. %%a          |%a|%n", number);
    }
}
