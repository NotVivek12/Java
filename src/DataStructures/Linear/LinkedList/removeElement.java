package DataStructures.Linear.LinkedList;

import java.util.*;

class linked_list {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int element) {
            data = element;
            next = null;
        }
    }
    void createList (int ele) {
        Node newnode = new Node(ele);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    void removeFromList(int n) {
        int i = 0;
        Node last = head;
        while (i < n-1 && last.next != null) {
            last = last.next;
            i++;
        }
        if(last.next != null) {
            last.next = last.next.next;
        }
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class removeElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linked_list list = new linked_list();
        int ele = 0;
        while (ele != -1) {
            ele = sc.nextInt();
            if (ele == -1) {
                break;
            }
            else {
                list.createList(ele);
            }
        }
        list.display();
        System.out.println("\n Element index to remove");
        int n = sc.nextInt();
        list.removeFromList(n);
        list.display();
    }
}
