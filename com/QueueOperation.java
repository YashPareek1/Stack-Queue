package com;

public class QueueOperation<K extends Comparable<K>> {

    private final MyLinkedList<K> myLinkedList;
    public QueueOperation() {
        //Using linked list to do operations
        myLinkedList = new MyLinkedList<K>();
    }

    //using append enqueue
    public void enqueue(INode<K> MyNode) {
        myLinkedList.append(MyNode);
    }
    
  //Ability to dequeue
    //used linked list to do operatsions

    public INode<K> dequeue() {
        return myLinkedList.pop();
    }
    
    public INode<K> peak() {
        return myLinkedList.head;
    }

    public void printQueue() {
        myLinkedList.printMyNode();
    }
}