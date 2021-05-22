package com;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StackOperationTest {

	@Test
	 public void given3Numbers_whenAddedToStack_ShouldHaveLastAddedNode() {
        StackOperation<Integer> myStack = new StackOperation<>();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode<Integer> peak = myStack.peak();
        myStack.printStack();
        Assertions.assertEquals(myThirdNode, peak);
    }

    @Test
    public void given3Numbers_whenPoppedFromStack_ShouldMatchLastAddedNode() {
        StackOperation<Integer> myStack = new StackOperation<>();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode<Integer> popped1 = myStack.pop();
        myStack.printStack();
        Assertions.assertEquals(myThirdNode, popped1);
        INode<Integer> myNode = myStack.peak();
        myStack.printStack();
        Assertions.assertEquals(mySecondNode, myNode);
        INode<Integer> popped2 = myStack.pop();
        myStack.printStack();
        Assertions.assertEquals(mySecondNode, popped2);
        INode<Integer> popped3 = myStack.pop();
        Assertions.assertEquals(myFirstNode, popped3);
}
}
