import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char answer = (char)ThreadLocalRandom.current().nextInt(65, 91);
        char ch;
        System.out.println("Can you think of the letter I'm guessing?");
        while(true) {
            System.out.print("Enter a letter: ");
            String str = scanner.nextLine();
            ch = str.charAt(0);
            if(ch > 90) {
                ch -= 32;
            }
            if(ch == answer) {
                break;
            } else {
                if(ch < answer) {
                    System.out.println("Too low");
                } else {
                    System.out.println("Too high");
                }
            }
        }
        System.out.println("Correct! I was thinking the letter " + answer);


    }
}
