import java.util.Scanner;

public class problem_code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[][] array = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                array[i][j] = in.nextInt();
            }
        }

        int[][] a_sum = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                a_sum[i][j] = a_sum[i - 1][j] + a_sum[i][j - 1] - a_sum[i - 1][j - 1] + array[i][j];
            }
        }   

        for (int i = 0; i < M; i++) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            int sum = a_sum[x2][y2] - a_sum[x1 - 1][y2] - a_sum[x2][y1 - 1] + a_sum[x1 - 1][y1 - 1];
            System.out.println(sum);
        }

        in.close();
    }
}
