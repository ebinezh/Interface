import java.io.*;
import java.util.*;

interface MyInterface {
    int n = 20;

    public void pop();

    public void push();

    public void peek();

    public void display();
}

class StackImplementation implements MyInterface {
    int arr[] = new int[n];
    int top = -1;

    public void push() {
        try {
            DataInputStream dis = new DataInputStream(System.in);
            System.out.println("Enter Element");
            int ele = Integer.parseInt(dis.readLine());
            arr[++top] = ele;
        } catch (Exception e) {
            System.out.println("e");
        }
    }

    public void pop() {
        int popper = arr[top];
        top--;
        System.out.println("popped element " + popper);
    }

    public void peek() {
        int popper = arr[top];
        System.out.println("popped element " + popper);
    }

    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return;
        } else {
            String str = " ";
            for (int i = 0; i <= top; i++)
                str = str + " " + arr[i];
            System.out.println("Elements are " + str);
        }
    }
}

class interfaceEx4 {
    public static void main(String arg[]) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        StackImplementation stk = new StackImplementation();
        int menu = 0;
        do {
            System.out.println("1.push \n2.pop \n3.peek \n4.display \n5.Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            menu = Integer.parseInt(dis.readLine());
            switch (menu) {
                case 1:
                    stk.push();
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.display();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (menu <= 5);
        System.out.println();
    }
}
