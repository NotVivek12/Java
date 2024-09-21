package DataStructures.Linear.Queue;

import java.util.Scanner;

class Queue {
    int front, rear, capacity;
    int[] queue;
    Queue(int c) {
        front = 0;
        rear = -1;
        capacity = c;
        queue = new int[capacity];
    }

    void enqueue(int data) {

        if (rear == capacity - 1) {
            System.out.println("Stack is full");
            return;
        }
        queue[++rear] = data;
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
    }
    void display() {
        if(front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = 0; i <= rear; i++) {
            System.out.println(queue[i] + " <- ");
        }
        System.out.println();
    }
    void front() {
        if (rear == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Front Element is: " + queue[front]);
    }
}

public class queueUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue queue = new Queue(n);
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            queue.enqueue(a);
        }
        queue.display();

        System.out.print("Do you want to dequeue? Y?N:");
        char ch = sc.next().charAt(0);
        if(Character.toLowerCase(ch) == 'y') {
            queue.dequeue();
            queue.display();
        }
        queue.front();
    }
}
