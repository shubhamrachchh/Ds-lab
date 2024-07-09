import java.util.Scanner;

public class Stack {
    int top = -1;
    int n;
    int[] arr;

    Stack(int n) {
        this.n = n;
        arr = new int[n];
    }

    public void push(int x) {
        if (top >= (n - 1)) {
            System.out.println("Stack overflow");
        } else {
            top += 1;
            arr[top] = x;
            System.out.println("Pushed " + x);
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            int temp = arr[top];
            top -= 1;
            System.out.println("Popped " + temp);
            return temp;
        }
    }

    public void peep(int i) {
        if ((top - i + 1) < 0) {
            System.out.println("Stack underflow");
        } else {
            System.out.println("Element at position " + i + " is " + arr[top - i + 1]);
        }
    }

    public void change(int x, int i) {
        if ((top - i + 1) < 0) {
            System.out.println("Stack underflow");
        } else {
            arr[top - i + 1] = x;
            System.out.println("Changed element at position " + i + " to " + x);
        }
    }

    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int n = sc.nextInt();
        Stack s = new Stack(n);

        int query = 1;

        while (query != 0) {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peep");
            System.out.println("4. Change");
            System.out.println("5. Display");
            System.out.print("Enter your choice: ");
            int q = sc.nextInt();

            switch (q) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int x = sc.nextInt();
                    s.push(x);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    System.out.print("Enter position to peep: ");
                    int i = sc.nextInt();
                    s.peep(i);
                    break;
                case 4:
                    System.out.print("Enter new element value: ");
                    int newValue = sc.nextInt();
                    System.out.print("Enter position to change: ");
                    int pos = sc.nextInt();
                    s.change(newValue, pos);
                    break;
                case 5:
                    s.display();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }

            System.out.print("Do you want to perform more operations? (1 for Yes, 0 for No): ");
            query = sc.nextInt();
        }
        sc.close();
    }
}
 