package com;

public class QueueOperation<K extends Comparable<K>> {

    private final MyLinkedList<K> myLinkedList;
    public QueueOperation() {
        //Using linked list to do operations
        myLinkedList = new MyLinkedList<K>();
    }

    //using append 
    public void enqueue(INode<K> MyNode) {
        myLinkedList.append(MyNode);
    }
    public INode<K> peak() {
        return myLinkedList.head;
    }

    public void printQueue() {
        myLinkedList.printMyNode();
    }
}