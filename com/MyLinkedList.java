package com;

public class MyLinkedList<K extends Comparable<K>> {
    public static INode head;
    public static INode tail;
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode<K> newNode) {
        if(this.tail == null && this.head == null) {
            this.tail = newNode;
            this.head = newNode;
        }
        else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void printMyNode() {
        StringBuffer myNodes = new StringBuffer("Nodes are: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))
                myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
    
    //Ability to pop from stack
    public INode<K> pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
}
