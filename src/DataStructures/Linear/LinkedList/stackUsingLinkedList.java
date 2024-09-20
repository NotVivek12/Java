package DataStructures.Linear.LinkedList;

import java.util.Scanner;

class StackNode {
    int data;
    StackNode next;
    StackNode(int val) {
        data = val; 
        next = null;
    }
}

class Stack {
    StackNode top = null;
    int size = 0;

    public void push(int data) {
        StackNode node = new StackNode(data);
        node.next = top; // Set the new node's next to the current top
        top = node; // Update top to the new node
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            // System.out.print("Stack underflow");
            return -1;
        } else {
            int res = top.data;
            top = top.next;
            size--;
            return res;
        }
    }

    public int peek() {
        if (isEmpty()) {
            // System.out.print("Stack underflow");
            return -1;
        }
        return top.data;
    }

    public int getSize() { // Renamed to avoid conflict with the variable size
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}


public class stackUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int q = sc.nextInt();
        while (q-- > 0) {
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    int data = sc.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    System.out.println(stack.pop());
                    break;
                case 3:
                    System.out.println(stack.peek());
                    break;
                case 4:
                    System.out.println(stack.getSize()); // Updated method call
                    break;
                case 5:
                    System.out.println(stack.isEmpty());
                    break;
            }
        }
        sc.close();

    }
}
