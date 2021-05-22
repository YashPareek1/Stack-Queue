package com;

public class StackOperation<K> {
    //Use LinkedList to do stack operations
    private final MyLinkedList myList;

    public StackOperation() {
        this.myList = new MyLinkedList<>();
    }

    //using push method to add node
    public void push(INode<K> myNode) {
        myList.add(myNode);
    }

    public INode<K> peak() {
        return myList.head;
    }

    public void printStack() {
        myList.printMyNode();
    }
}


