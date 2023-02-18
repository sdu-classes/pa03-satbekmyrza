public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        if (this.a < 0 || this.b < 0) {
            throw new ArithmeticException(String.format("One of the number is negative: %d, %d", this.a, this.b));
        }
        System.out.println(this.a + this.b);
    }

    public void sub() {
        if (this.a < 0 || this.b < 0) {
            throw new ArithmeticException(String.format("One of the number is negative: %d, %d", this.a, this.b));
        }
        System.out.println(this.a - this.b);
    }

    public void mul() {
        if (this.a == 0 || this.b == 0) {
            throw new ArithmeticException(String.format("One of the numbers is zero: %d, %d", this.a, this.b));
        }
        System.out.println(this.a * this.b);
    }

    public void div() {
        if (this.a == 0 || this.b == 0) {
            throw new ArithmeticException(String.format("One of the numbers is zero: %d, %d", this.a, this.b));
        }
        System.out.println(this.a / this.b);
    }
}