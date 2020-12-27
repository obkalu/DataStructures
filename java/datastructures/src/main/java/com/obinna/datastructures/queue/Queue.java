package com.obinna.datastructures.queue;

/**
 * Created by obi on 2017-06-28.
 */
public class Queue<E> implements IQueue<E> {
    private E head;
    private E tail;

    private Object[] array;
    private int capacity;
    private int currentIndex = -1;
    private boolean empty;
    private boolean full;
    private int size;

    public Queue() {
        this.array = new Object[10];
        this.capacity = 10;
        this.currentIndex = -1;
        this.empty = true;
        this.full = false;
        this.size = currentIndex+1;
    }

    public void enqueue(Object o) {

    }

    public void dequeue() {

    }
}
