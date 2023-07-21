import java.util.Scanner;

public class problem_code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }

        bubbleSort(num);

        for (int number : num) {
            System.out.println(number);
        }

        in.close();
    }

    public static void bubbleSort(int[] num) {
        int n = num.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (num[j] > num[j + 1]) {
                    int tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;
                }
            }
        }
    }
}