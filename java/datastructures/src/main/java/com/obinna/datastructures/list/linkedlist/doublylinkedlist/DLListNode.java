package com.obinna.datastructures.list.linkedlist.doublylinkedlist;

/**
 * ListNode for a DoublyLinkedList.
 * Created by obi on 2017-05-16.
 */
@SuppressWarnings("ALL")
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

    DLListNode<E> getNext() {
        return next;
    }

    void setNext(DLListNode<E> next) {
        this.next = next;
    }

    DLListNode<E> getPrev() {
        return prev;
    }

    void setPrev(DLListNode<E> prev) {
        this.prev = prev;
    }

    E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
