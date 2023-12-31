package gr.aueb.cf.ch6;

/**
 * LIFO last in first out.
 */
public class StackApp {

    static int[] myStack = new int[50];
    static int top = -1;

    public static void main(String[] args) {
        int num;
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);

        num = pop();
        traversStack();
    }

    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return myStack[top--];
//        int elementToReturn = myStack[top];
//        top--;
//        return elementToReturn;
    }

    public static void push(int num) {
        if (isFull()) {
            System.out.println("Stack if full");
            return;
        }
        myStack[++top] = num;
    }

    public static boolean isEmpty() {
        return (top == -1);
    }

    public static boolean isFull() {
        return (top == myStack.length - 1);
    }

    public static void  traversStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(myStack[i] + " ");
        }
        System.out.println();
    }


}
