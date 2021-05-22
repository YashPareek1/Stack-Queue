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

}
