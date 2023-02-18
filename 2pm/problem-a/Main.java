import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            Calculator c = new Calculator(4, '3');
            c.add();
            c.sub();
            c.mul();
            c.div();
        } catch (RuntimeException exc) {
            System.out.println(exc.getMessage());
        }
        
        Calculator calc = null;
        
        try {
            calc = new Calculator(2, 3);
        } catch (NumberFormatException exc) {
            System.out.println(exc.getMessage());
            System.exit(1);
        }

        try {
            calc.add();
        } catch(ArithmeticException exc) {
            System.out.println(exc.getMessage());
        }
        try {
            calc.sub();
        } catch(ArithmeticException exc) {
            System.out.println(exc.getMessage());
        }
        try {
            calc.mul();
        } catch(ArithmeticException exc) {
            System.out.println(exc.getMessage());
        }
        try {
            calc.div();
        } catch(ArithmeticException exc) {
            System.out.println(exc.getMessage());
        }
        System.out.println("many things happening here..");
    }
}