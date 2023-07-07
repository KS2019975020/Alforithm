import java.util.ArrayList;
import java.util.Scanner;

public class problem_code {
    public static ArrayList<Integer> function(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (ture) {
            int n = in.nextInt();

            if (n == -1) {
                break;
            }

            ArrayList<Integer> list = function(n);
            int sum = 0;

            for (int l : list) {
                sum += l;
            }

            if (sum == n) {
                System.out.print(n+"=");
                for(int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i));
                    if (i < list.size() - 1) {
                        System.out.print("+");
                    }
                }
                System.out.println();
            }else {
                System.out.println(n + "is NOT perfect.");
            }
        }
    }
}