package Module9;

public class SumOfDigits {
    static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Sum: " + sumDigits(num)); // Output: 10
    }
}