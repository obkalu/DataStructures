package com.obinna.datastructures.list.linkedlist.singlylinkedlist;

/**
 * ListNode for a SinglyLinkedList.
 * Created by obi on 2017-05-17.
 */
@SuppressWarnings("ALL")
public class SLListNode<E> {

    private SLListNode<E> next;
    private E value;

    // Constructors

    public SLListNode() {
    }

    public SLListNode(E value) {
        this.value = value;
    }

    public SLListNode(SLListNode<E> next, E value) {
        this.next = next;
        this.value = value;
    }

    SLListNode<E> getNext() {
        return next;
    }

    void setNext(SLListNode<E> next) {
        this.next = next;
    }

    E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
