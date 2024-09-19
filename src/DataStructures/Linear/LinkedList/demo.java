package DataStructures.Linear.LinkedList;

import java.util.Scanner;

class linkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node (int element) {
            data = element;
            next = null;
        }
    }
    void createList(int ele) {
        Node newNode = new Node(ele);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedList list = new linkedList();
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
    }
}
