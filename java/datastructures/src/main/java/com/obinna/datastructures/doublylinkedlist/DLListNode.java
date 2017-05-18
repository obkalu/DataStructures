package com.obinna.datastructures.doublylinkedlist;

/**
 * ListNode for a DoublyLinkedList.
 * Created by obi on 2017-05-16.
 */
public class DLListNode<E> {

    private DLListNode<E> next;
    private DLListNode<E> prev;
    private E value;

    public DLListNode() {
    }

    public DLListNode(E value) {
        this.value = value;
    }

    public DLListNode(DLListNode<E> next, DLListNode<E> prev, E value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public DLListNode<E> getNext() {
        return next;
    }

    public void setNext(DLListNode<E> next) {
        this.next = next;
    }

    public DLListNode<E> getPrev() {
        return prev;
    }

    public void setPrev(DLListNode<E> prev) {
        this.prev = prev;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
