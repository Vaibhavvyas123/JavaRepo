package Practice;

public class Calculator {
    public static void main(String[] args) {

        int num1 = 10, num2 = 0, res;

        res = num1 + num2;
        System.out.println("Addition Result = " + res);
        res = num1 - num2;
        System.out.println("Subtraction Result = " + res);
        res = num1 * num2;
        System.out.println("Multiplication Result = " + res);
        try {
            res = num1 / num2;
            System.out.println("Division Result = " + res);
        }
        catch (ArithmeticException e) {
            // Exception handler
            System.out.println
                    (e.getMessage());
        }

    }
}
