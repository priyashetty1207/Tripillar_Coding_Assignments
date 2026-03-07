package Module5;

class AgeExceptionDemo {
    public static void main(String[] args) {
        int age = 38;
        if (age <= 18) {
            throw new ArithmeticException("Age must be 18 or above");
        }
        else {
            System.out.println("Eligible");
        }
    }
}
