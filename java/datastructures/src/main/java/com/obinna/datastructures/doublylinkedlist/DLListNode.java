package com.obinna.datastructures.doublylinkedlist;

/**
 * ListNode for a DoublyLinkedList.
 * Created by obi on 2017-05-16.
 */
public class DLListNode<T> {

    private DLListNode<T> next;
    private DLListNode<T> prev;
    private T value;

    public DLListNode() {
    }

    public DLListNode(T value) {
        this.value = value;
    }

    public DLListNode(DLListNode<T> next, DLListNode<T> prev, T value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public DLListNode<T> getNext() {
        return next;
    }

    public void setNext(DLListNode<T> next) {
        this.next = next;
    }

    public DLListNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DLListNode<T> prev) {
        this.prev = prev;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
