package DataStructures.Linear.LinkedList;

import java.util.Scanner;

class Linked_list {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int element) {
            data = element;
            next = null;
        }
    }
    void createList(int ele) {
        Node newnode = new Node(ele);
        if(head == null) {
            head = newnode;
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    int maxElement() {
        Node temp = head;
        int max = head.data;
        while(temp!=null) {
            if(temp.data>max) max=temp.data;
            temp=temp.next;
        }
        return max;
    }
}

public class maxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linked_list list = new Linked_list();
        int elem=0;
        while(elem != -1)
        {
            elem = sc.nextInt();
            if(elem == -1)
            {
                break;
            }
            else
            {
                list.createList(elem);
            }
        }
        list.display();
        System.out.println(list.maxElement());
    }
}
