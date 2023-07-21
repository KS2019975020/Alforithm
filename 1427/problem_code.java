import java.util.Scanner;

public class problem_code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String num = Integer.toString(n);
        char[] digit = num.toCharArray();

        for (int i = 1; i < digit.length; i++) {
            char key = digit[i];
            int j = i - 1;

            while (j >= 0 && digit[j] < key) {
                digit[j + 1] = digit[j];
                j = j - 1;
            }
            
            digit[j + 1] = key;
        }

        String sort = new String(digit);
        int result = Integer.parseInt(sort);

        System.out.println(result);
    }
}
