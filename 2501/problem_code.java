import java.util.ArrayList;
import java.util.Scanner;

public class problem_code {
    public static void main(string[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int N = in.nextInt();
        int K = in.nextInt();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                a.add(i);
            }
        }

        if (a.size() >= K) {
            System.out.println(a.get(K-1));
        }else {
            System.out.println(-1);
        }
    }
}