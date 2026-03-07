package Module5;

class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            int num = 10 / 1;
        }
        catch (ArithmeticException e) {
            System.out.println("Exception caught");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}