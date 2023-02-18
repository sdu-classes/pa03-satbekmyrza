import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(1, 0);
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