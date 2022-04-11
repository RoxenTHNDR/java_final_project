
class Calculator {
    /* Your code goes here */
    double sum (double num1, double num2){

        return num1 + num2;

    }
}

public class MyClass {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        double result = c.sum(3.5, 2);
        System.out.println(result);
    }
}
