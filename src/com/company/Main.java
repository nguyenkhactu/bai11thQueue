package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequaue();
        queue.dequaue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequaue().key);
    }// write your code here
}
