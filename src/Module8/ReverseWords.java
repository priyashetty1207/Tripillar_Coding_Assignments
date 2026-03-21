package Module8;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Hello World";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse().toString()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
