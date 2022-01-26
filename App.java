import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        Scanner kbin = new Scanner(System.in);
        System.out.println("How many gallons?: ");
        try{
        double gallons = kbin.nextDouble();
        double litpergallon = 3.78541;
        double liters = gallons * litpergallon;
        DecimalFormat df = new DecimalFormat("#0.00");
        String literstring = df.format(liters);
        System.out.println(gallons + " gallons is equivalent to " + literstring + " liters.");
        }catch(InputMismatchException e){
            System.out.println("Invalid Number: " + e);
        }
}
    }
    