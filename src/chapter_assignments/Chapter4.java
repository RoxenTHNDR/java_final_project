package src.chapter_assignments;
import java.math.BigInteger;
import java.util.Scanner;

import src.utilities.*;

public class Chapter4 {
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 2 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2", "Exercise 3", "Exercise 4","Exercise 5", "Exercise 6", "Exercise 7", "Exercise 8"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    exercise1();
                    break;
                case 2:
                    exercise2();
                    break;
                case 3:
                    exercise3();
                    break;
                case 4:
                    exercise4();
                    break;
                case 5:
                    exercise5();
                    break;
                case 6:
                    exercise6();
                    break;
                case 7:
                    exercise7();
                    break;
                case 8:
                    exercise8(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 3 Menu.");
    }


    public void exercise1() {
        UIUtility.showMenuTitle("Exercise 1");
        // Your code here

        //         Exercise 1

        // Instantiate a new Fraction object using the default constructor.

        Fraction obj = new Fraction();

        // Print the Fraction object. When you run the code it should print "1/1"
    
        System.out.println(obj);
    
    }


    public void exercise2() {
        UIUtility.showMenuTitle("Exercise 2");
        // Your code here

        // Instantiate a new Fraction object using the parameterized constructor. Pass the number 27 as the numerator 
        // and 6 as the denominator.

        Fraction obj = new Fraction(27,6);

        // Print the Fraction object. When you run the code it should print "27/6".

        System.out.println(obj);

        // Use the Fraction object to call the getNumerator method. Print the value returned. It should print "27".

        System.out.println("Numerator: " + obj.getNumerator());

        // Use the Fraction object to call the getDenominator method. Print the value returned. It should print "6".

        System.out.println("Denominator: " + obj.getDenominator());

        // Use the Fraction object to call the setNumerator method, passing the number 30.

        obj.setNumerator(30);

        // Use the Fraction object to call the setDenominator method, passing the number 45.

        obj.setDenominator(45);

        // Print the Fraction object. When you run the code it should print "30/45".

        System.out.println(obj.toString());

    }

    public void exercise3() {
        UIUtility.showMenuTitle("Exercise 3");
        // Your code here

        // Create a try-catch statement.
        try {

            // Inside the try statement instantiate a new Fraction object using the parameterized constructor. 
            // Pass the number 3 as the numerator and 0 as the denominator.

            Fraction obj = new Fraction(3,0);
                
        } catch (IllegalArgumentException err) {
            // Inside the catch statement print the IllegalArgumentException's message by calling the getMessage method.

            System.out.println(err.getMessage());

        }
            
        // Instantiate a new Fraction object using the default constructor.

        Fraction frac = new Fraction();

        // Create another try-catch statement.

        try {

            // Inside the try statement call the setDenominator method using the second Fraction object. 
            // Pass the number 0 as the denominator.

            frac.setDenominator(0);
            
        } catch (IllegalArgumentException err) {
            // Inside the catch statement print the IllegalArgumentException's message by calling the getMessage method.

            System.out.println(err.getMessage());

        }

        // When you run this exercise it should print "Denominator cannot be zero" twice.
    
    }

    public void exercise4() {
        UIUtility.showMenuTitle("Exercise 4");
        // Your code here

        // Call the static greatestCommonDivisor method. Pass the numbers 75 and 45. Print the value returned. It should print "15".

        System.out.println(Fraction.greatestCommonDivisor(75, 45));

        // Call the static greatestCommonDivisor method. Pass the numbers 2 and 4. Print the value returned. It should print "2".
        
        System.out.println(Fraction.greatestCommonDivisor(2, 4));

        // Call the static greatestCommonDivisor method. Pass the numbers 5 and 7. Print the value returned. It should print "1".

        System.out.println(Fraction.greatestCommonDivisor(5, 7));
    
    }

    public void exercise5() {
        UIUtility.showMenuTitle("Exercise 5");
        // Your code here

        // Instantiate a new Fraction object using the parameterized constructor. 
        // Pass the number 75 as the numerator and 45 as the denominator.

        Fraction frac1 = new Fraction(75,45);
        
        // Call the simplify method. Print the value returned. It should print "5/3".

        System.out.println(frac1.simplify());
        
        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number 2 as the numerator and 4 as the denominator.

        Fraction frac2 = new Fraction(2,4);
        
        // Call the simplify method. Print the value returned. It should print "1/2".
        
        System.out.println(frac2.simplify());

        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number 5 as the numerator and 7 as the denominator.

        Fraction frac3 = new Fraction(5,7);
        
        // Call the simplify method. Print the value returned. It should print "5/7".

        System.out.println(frac3.simplify());
        
        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number -2 as the numerator and 4 as the denominator.

        Fraction frac4 = new Fraction(-2,4);
        
        // Call the simplify method. Print the value returned. It should print "-1/2".

        System.out.println(frac4.simplify());
        
        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number 2 as the numerator and -4 as the denominator.

        Fraction frac5 = new Fraction(2,-4);
        
        // Call the simplify method. Print the value returned. It should print "-1/2".

        System.out.println(frac5.simplify());
        
        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number -2 as the numerator and -4 as the denominator.

        Fraction frac6 = new Fraction(-2,-4);
        
        // Call the simplify method. Print the value returned. It should print "1/2".

        System.out.println(frac6.simplify());
    
    }

    public void exercise6() {
        UIUtility.showMenuTitle("Exercise 6");
        // Your code here

        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number 4 as the numerator and 1 as the denominator.
        
        Fraction frac1 = new Fraction(4,1);
        
        // Call the mixedNumber method. Print the value returned. It should print "4".
        
        System.out.println(frac1.mixedNumber());
        
        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number 0 as the numerator and 4 as the denominator.
        
        Fraction frac2 = new Fraction(0,4);
        
        // Call the mixedNumber method. Print the value returned. It should print "0".
        
        System.out.println(frac2.mixedNumber());
        
        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number 4 as the numerator and 4 as the denominator.
        
        Fraction frac3 = new Fraction(4,4);
        
        // Call the mixedNumber method. Print the value returned. It should print "1".
        
        System.out.println(frac3.mixedNumber());
        
        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number 8 as the numerator and 4 as the denominator.
        
        Fraction frac4 = new Fraction(8,4);
        
        // Call the mixedNumber method. Print the value returned. It should print "2".
        
        System.out.println(frac4.mixedNumber());
        
        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number 4 as the numerator and 8 as the denominator.
        
        Fraction frac5 = new Fraction(4,8);
        
        // Call the mixedNumber method. Print the value returned. It should print "1/2".
        
        System.out.println(frac5.mixedNumber());
        
        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number 13 as the numerator and 5 as the denominator.
        
        Fraction frac6 = new Fraction(13,5);
        
        // Call the mixedNumber method. Print the value returned. It should print "2 3/5".
        
        System.out.println(frac6.mixedNumber());
        
        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number -13 as the numerator and 5 as the denominator.
        
        Fraction frac7 = new Fraction(-13,5);
        
        // Call the mixedNumber method. Print the value returned. It should print "-2 3/5".
        
        System.out.println(frac7.mixedNumber());
        
        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number 13 as the numerator and -5 as the denominator.
        
        Fraction frac8 = new Fraction(13,-5);
        
        // Call the mixedNumber method. Print the value returned. It should print "-2 3/5".
        
        System.out.println(frac8.mixedNumber());
        
        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number -13 as the numerator and -5 as the denominator.
        
        Fraction frac9 = new Fraction(-13,-5);
        
        // Call the mixedNumber method. Print the value returned. It should print "2 3/5".

        System.out.println(frac9.mixedNumber());


        Fraction fraction10 = new Fraction(-2, 3);
        System.out.println(fraction10.mixedNumber());
    
    }

    public void exercise7() {
        UIUtility.showMenuTitle("Exercise 7");
        // Your code here

        // Instantiate a new Fraction object using the parameterized constructor. 
        // Pass the number 13 as the numerator and 5 as the denominator.

        Fraction frac1 = new Fraction(13,5);        
        
        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number 4 as the numerator and 8 as the denominator.
        
        Fraction frac2 = new Fraction(4,8);
        
        // Use the first Fraction object to call the add method, passing the second Fraction as its parameter.
        // Print the value returned. It should print "2 3/5 + 1/2 = 3 1/10".
        
        System.out.println(frac1.add(frac2));
        
        // Instantiate a new Fraction object using the parameterized constructor.
        // Pass the number -13 as the numerator and -5 as the denominator.
        
        Fraction frac3 = new Fraction(-13,-5);
        
        // Instantiate another new Fraction object using the parameterized constructor.
        // Pass the number 13 as the numerator and -5 as the denominator.
        
        Fraction frac4 = new Fraction(13,-5);
        
        // Use the third Fraction object to call the add method, passing the fourth Fraction as its parameter.
        // Print the value returned. It should print "2 3/5 + -2 3/5 = 0".

        System.out.println(frac3.add(frac4));
    
    }

    public void exercise8(Scanner in) {
        UIUtility.showMenuTitle("Exercise 8");
        // Your code here

        Fraction frac1 = null;
        Fraction frac2 = null;

        int choice = 0;
        String menuTitle = "Operations";
        String prompt = "Select an operation";
        String[] menuOptions = {
                "Addition", "Subtraction", "Multiplication", "Division"
        };
        
        try {

            frac1 = new Fraction(InputUtility.getInt("Enter the first numerator", in),
                InputUtility.getInt("Enter the first denomiator", in));
                
        } catch (IllegalArgumentException err) {

            System.out.println(err.getMessage());
            return;

        }

        try {

            frac2 = new Fraction(InputUtility.getInt("Enter the second numerator", in),
                InputUtility.getInt("Enter the second denomiator", in));
                
        } catch (IllegalArgumentException err) {

            System.out.println(err.getMessage());
            return;

        }
        
        
            
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            switch (choice) {
                case 1:
                    System.out.println("\n" + frac1.add(frac2) + "\n");
                    break;
                case 2:
                    System.out.println("\n" + frac1.subtract(frac2) + "\n");
                    break;
                case 3:
                    System.out.println("\n" + frac1.multiply(frac2) + "\n");
                    break;
                case 4:
                    System.out.println("\n" + frac1.divide(frac2) + "\n");
                    break;
                
            }        
        
    }


    public class Fraction {
        
        // Part 1
        
        int numerator;
        int denominator;

        public Fraction(){
            numerator = 1;
            denominator = 1;
        }

        public String toString(){
            return numerator + "/" + denominator;
        }

        // Part 2

        public Fraction(int numerator, int denominator){
            validateDenominator(denominator);
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public int getNumerator(){
            return numerator;
        }

        public void setNumerator(int numerator){
            this.numerator = numerator;
        }

        public int getDenominator(){
            return denominator;
        }

        public void setDenominator(int denominator){
            validateDenominator(denominator);
            this.denominator = denominator;
        }

        // Part 3

        private void validateDenominator(int denominator){
            if (denominator == 0){
                throw new IllegalArgumentException("Denominator cannot be zero");
            }
        }

        // Part 4

        public static int greatestCommonDivisor(int num1, int num2){
            return BigInteger.valueOf(num1).gcd(BigInteger.valueOf(num2)).intValue();
        }
        
        // Part 5

        public Fraction simplify(){

            int gcd = greatestCommonDivisor(numerator, denominator);

            Fraction simpleFrac = new Fraction(numerator / gcd, denominator / gcd);

            if ((simpleFrac.numerator >= 0 && simpleFrac.denominator < 0) || (simpleFrac.numerator < 0 && simpleFrac.denominator < 0))
            {
                simpleFrac.numerator *= -1;
                simpleFrac.denominator *= -1;
            }

            return simpleFrac;
        }

        // Part 6
      
        public String mixedNumber(){

            Fraction simpleFrac = this.simplify();
            
            if (simpleFrac.denominator == 1){
                return Integer.toString(simpleFrac.numerator);
            }

            else if (simpleFrac.numerator == 0){
                return Integer.toString(0);
            }

            else if (Math.abs(simpleFrac.numerator) > simpleFrac.denominator){
                int whole = simpleFrac.numerator / simpleFrac.denominator;
                int left = simpleFrac.numerator % simpleFrac.denominator;

                if(left < 0){
                    left *= -1;
                }

                return whole + " " + left + "/" + simpleFrac.denominator;
            }

            else{
                return simpleFrac.toString();
            }

        }

        // Part 7

        public String add(Fraction other){
            
            Fraction sumFrac = new Fraction((this.numerator * other.denominator) + (this.denominator * other.numerator),
            this.denominator * other.denominator);
            
            return this.mixedNumber() + " + " + other.mixedNumber() + " = " + sumFrac.mixedNumber();
        }

        // Extra Credit

        public String subtract(Fraction other){
            
            Fraction diffFrac = new Fraction((this.numerator * other.denominator) - (this.denominator * other.numerator),
            this.denominator * other.denominator);
            
            return this.mixedNumber() + " - " + other.mixedNumber() + " = " + diffFrac.mixedNumber();
        }

        public String multiply(Fraction other){
            

            Fraction multiFrac = new Fraction(this.numerator * other.numerator,this.denominator * other.denominator);
            
            return this.mixedNumber() + " * " + other.mixedNumber() + " = " + multiFrac.mixedNumber();
        }

        public String divide(Fraction other){
            

            Fraction divFrac = new Fraction(this.numerator * other.denominator, this.denominator * other.numerator);
            
            return this.mixedNumber() + " / " + other.mixedNumber() + " = " + divFrac.mixedNumber();
        }

    }

}