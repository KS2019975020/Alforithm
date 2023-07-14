import java.util.Scanner;

public class problem_code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int[] array = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            array[i] = in.nextInt();
        }

        int[] sum = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            sum[i] = sum[i - 1] + array[i];
        }

        for (int i = 0; i < M; i++) {
            int si = in.nextInt();
            int ei = in.nextInt();
            System.out.println(sum[ei] - sum[si - 1]);
        }

        in.close();
    }
}