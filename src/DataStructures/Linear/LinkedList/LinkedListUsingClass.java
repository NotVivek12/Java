package DataStructures.Linear.LinkedList;

import java.util.Scanner;

class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public LinkedList insert(LinkedList list, int ele) {
        Node newNode = new Node(ele);
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public static void printList(LinkedList list){
        Node currNode = list.head;
        System.out.print("Linked List: ");

        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }
}

public class LinkedListUsingClass {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list = list.insert(list,a);
        }
        list.printList(list);
    }
}
