package com.mousebrushstudio;

public class IntLinkedList {
    private Node head;

    public IntLinkedList(int item) {
        head = new Node();
        head.value = item;
        head.link = null;
    }

    public boolean insertItems(int item) {
        Node newNode = new Node();
        newNode.value = item;
        newNode.link = head;
        head = newNode;
        return true;
    }

    public void printList() {
        Node z = head;
        while (z != null) {
            System.out.println(z.value);
            z = z.link;
        }
    }

    public boolean deleteItem(int item) {
        if (head.value == item) {
            head = head.link;
            return true;
        } else {
            Node x = head;
            Node y = head.link;
            while (true) {
                if (y == null || y.value == item)
                    break;
                else {
                    x = y;
                    y = y.link;
                }
            }
            if (y != null) {
                x.link = y.link;
                return true;
            } else
                return false;
        }
    }

    class Node {
        private int value;
        private Node link;
    }
}
