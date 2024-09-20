package DataStructures.Linear.LinkedList;

import java.io.*;
import java.util.*;

class Linked_List
{
    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int elem){
            data = elem;
            next = null;
        }
    }

    void insertEnd(int elem) {
        Node newnode = new Node(elem);
        if(head==null) {
            head = newnode;
        }else {
            Node last = head;
            while(last.next!=null) {
                last = last.next;
            }
            last.next = newnode;
        }
    }
    void insertAti(int val,int pos){
        Node newnode = new Node(val);
        int count =0;
        if(head==null){
            head = newnode;
        }else if (pos==0){
            newnode.next = head;
            head = newnode;
        }else {
            Node last = head;
            while(count<pos-1){
                last = last.next;
                count++;
            }
            newnode.next=last.next;
            last.next = newnode;
        }
    }

    void printList() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}

public class insertElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linked_List list = new Linked_List();
        int elem=0;
        while(elem!=-1) {
            elem = sc.nextInt();
            if(elem==-1)
                break;
            list.insertEnd(elem);
        }
        int pos = sc.nextInt();
        int val = sc.nextInt();
        list.insertAti(val,pos);
        list.printList();
    }
}