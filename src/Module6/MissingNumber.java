package Module6;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        int expectedSum = n * (n + 1) / 2;

        System.out.println("Missing Number = " + (expectedSum - sum));
    }
}