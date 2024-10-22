package DataStructures.NonLinear;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class treeNode {
    int val;
    treeNode left,right;
    treeNode (int num) {
        val = num;
        left = null;
        right = null;
    }
}

public class LevelWiseBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Queue<treeNode> input = new LinkedList<>();
        treeNode root = new treeNode(num);
        input.add(root);
        while(!input.isEmpty()) {
            treeNode node = input.poll();
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                node.left = new treeNode(leftVal);
                input.add(node.left);
            }
            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                node.right = new treeNode(rightVal);
                input.add(node.right);
            }
        }
        printInorder(root);
    }

    public static void printInorder(treeNode node) {
        if(node == null){
            return;
        }
        printInorder(node.left);
        System.out.println(node.val + " ");
        printInorder(node.right);
    }
}
