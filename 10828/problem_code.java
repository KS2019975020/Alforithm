import java.util.Scanner;

public class problem_code {
    private int[] stack;
    private int size;
    
    public ArrayStack(int maxSize) {
        stack = new int[maxSize];
        size = 0;
    }

    public void push(int value) {
        if (size < stack.length) {
            stack[size++] = value;
        }
    }

    public int top() {
        return isEmpty() ? -1 : stack[size - 1];
    }

    public int size() {
        return size;
    }

    public int empty() {
        return isEmpty() ? 1 : 0;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ArrayStack as = new ArrayStack(num);

        for(int i = 0; i < num; i++) {
            String com = in.next();
        }

        if (com.equals("push")) {
            int number = in.nextInt();
            as.push(num);
        } else if (com.equals("pop")) {
            System.out.println(as.pop());
        } else if (com.equals("size")) {
            System.out.println(as.size());
        } else if (com.equals("empty")) {
            System.out.println(as.empty());
        } else if (com.equals("top")) {
            System.out.println(as.top());
        }
    }
}