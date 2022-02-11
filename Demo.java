import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo {
    public static void main(String[] args) {
        // Non-Class data types
        boolean likesPizza = true;
        boolean hatesCats = false;
        byte x = Byte.MAX_VALUE;
        byte xx = Byte.MIN_VALUE;
        x++;
        xx--;
        System.out.println(xx + " to " + x);
        
        short b = Short.MAX_VALUE;
        short bb = Short.MIN_VALUE;
        System.out.println(bb + " to " + b);

        short s = 1000;
        short ss = 32699;
        System.out.println(s + ss);

        int age = 0;

        long a = 9999999999L;
        System.out.println(a);


        float z = 0;
        double heightInInches = 75.2;
        
        char ch = 'c';
        char ch2 = 77;
        System.out.println(ch + " " + ch2);

        BigInteger aaa = new BigInteger("999999999");
        BigInteger bbb = new BigInteger("999999999");
        System.out.println(aaa.multiply(bbb));


        // Class data types
        String name = "Marc";
    
    
        BigDecimal bd = new BigDecimal("190.162999");
        System.out.println(bd.setScale(3, RoundingMode.HALF_UP));

       //double a = 190.162999; // 125.68
        double roundOff = (double) Math.round(a * 1000) / 1000;
        System.out.println(roundOff);


        System.out.println(Math.ceil(208.4));
    }
    
    
    
    }

