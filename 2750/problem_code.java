import java.util.Scanner;

public class problem_code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] num = new int[n];
        
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int key = num[i];
            int j = i-1;
            while (j >= 0 && num[j] > key) {
                num[j + 1] = num[j];
                j = j-1;
            }
            num[j + 1] = key;
        }

        for (int number : num) {
            System.out.println(number);
        }
    }
}
