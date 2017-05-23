package com.obinna.datastructures.list.arraylist;

/**
 * ArrayList
 * An ArrayList implementation - List datastructure backed by an array
 *
 * Created by obi on 2017-05-22.
 */
public class ArrayList<E> {
    private Object[] array;
    private int capacity;
    private int currentIndex = -1;
    private boolean empty;
    private boolean full;
    private int size;

    // Constructors

    /**
     * Creates an empty ArrayList with default initial capacity for ten elements
     */
    public ArrayList() {
        this.array = new Object[10];
        this.capacity = 10;
        this.currentIndex = -1;
        this.empty = true;
        this.full = false;
        this.size = currentIndex+1;
    }

    /**
     * Creates an empty ArrayList with the specified initial capacity
     * @param capacity the initial capacity
     */
    public ArrayList(int capacity) {
        if(capacity >= 0) {
            this.array = new Object[capacity];
            this.capacity = capacity;
            this.currentIndex = -1;
            this.empty = true;
            this.full = false;
            this.size = currentIndex+1;
        } else {
            throw new IllegalArgumentException("Capacity must be non-negative integer");
        }
    }

    /**
     * Creates an ArrayList and populates it with data from specified feeder-array
     * @param feeder_array the specified feeder-array
     */
    public ArrayList(Object[] feeder_array) {
        // make the backing array be of size that doubles the feeder-array's capacity
        this.array = new Object[feeder_array.length*2];
        // populate the backing array with elements from the feeder-array
        for(int i=0; i<feeder_array.length; i++) {
            this.array[i] = feeder_array[i];
            this.currentIndex++;
        }
        this.capacity = feeder_array.length*2;
        this.empty = (this.currentIndex == -1);
        this.full = (this.currentIndex == this.capacity-1);
        this.size = currentIndex+1;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] feeder_array) {
        // make the backing array be of size that doubles the feeder-array's capacity
        this.array = new Object[feeder_array.length*2];
        // populate the backing array with elements from the feeder-array
        for(int i=0; i<feeder_array.length; i++) {
            this.array[i] = feeder_array[i];
            this.currentIndex++;
        }
        this.capacity = feeder_array.length*2;
        this.empty = (this.currentIndex == -1);
        this.full = (this.currentIndex == this.capacity-1);
        this.size = currentIndex+1;
    }

    public int getCapacity() {
        return capacity;
    }

//    public void setCapacity(int capacity) {
//        // Prevent doing this
//    }

    public int getCurrentIndex() {
        return currentIndex;
    }

//    public void setCurrentIndex(int currentIndex) {
//        // Do nothing here. So as to make the list's currentIndex immutable
//        // to prevent its alteration from outside
//    }

    public boolean isEmpty() {
        return empty;
    }

//    public void setEmpty(boolean empty) {
//        // Prevent this
//    }

    public boolean isFull() {
        return full;
    }

//    public void setFull(boolean full) {
//        // Prevent this
//    }

    public int getSize() {
        return size;
    }

    // List operation functions

    /**
     * Adds a new element to the ArrayList
     * @param newElement the new element to be added
     */
    public void add(E newElement) {
        // If the backing array is not yet full i.e. there is still 1 or more empty slots within
        if(!this.full) {
            this.array[++this.currentIndex] = newElement;
        } else {
            // double the capacity of the backing array
            this.capacity *= 2;
            Object[] newArray = new Object[this.capacity];
            int nextIndexStart = this.array.length;
            // Transfer all existing elements to the newArray
            // Consider using System.arraycopy()
            for (int i = 0; i < nextIndexStart; i++) {
                newArray[i] = this.array[i];
            }
            // Now, add the new  element to the tail of the newArray
            newArray[nextIndexStart] = newElement;
            this.currentIndex = nextIndexStart;
            // Now, abandon old, full array and point backing-array to newArray
            this.array = newArray;
        }
        this.empty = (this.currentIndex == -1);
        this.full = (this.currentIndex == this.capacity-1);
        this.size = currentIndex+1;
    }

    /**
     * Reverses the order of the elements in the ArrayList such that the first
     * becomes the last and the last becomes the first. This version of the reverse method
     * reverses the arrayList by traversing its elements from the last to the first.
     */
    public void reverse() {
        // Do nothing if ArrayList is empty or has only one element
        if(this.currentIndex >= 0) {
            // Make an array of same capacity
            Object[] newArray = new Object[this.capacity];
            // Transfer all existing elements in reverse order
            int newCurrentIndex = 0;
            for (int i = this.currentIndex; i >= 0 ; i--) {
                newArray[newCurrentIndex++] = this.array[i];
            }
            this.array = newArray;
        }
    }

    /**
     * Reverses the order of the elements in the ArrayList such that the first
     * becomes the last and the last becomes the first. This version of the reverse method
     * reverses the arrayList by traversing its elements from the first to the last.
     */
    public void reverse2() {
        // Do nothing if ArrayList is empty or has only one element
        if(this.currentIndex >= 0) {
            // Make an array of same capacity
            Object[] newArray = new Object[this.capacity];
            // Transfer all existing elements in reverse order
            int counter = this.currentIndex;
            for (int i = 0; i <= this.currentIndex; i++) {
                newArray[counter--] = this.array[i];
            }
            this.array = newArray;
        }
    }

    /**
     * Prints out the all the elements contained in the ArrayList
     * in order of index from first to last
     */
    public void printList() {
        if(!this.empty) {
            for (int i=0; i < this.size; i++) {
                System.out.print(this.array[i].toString() + " ");
            }
            System.out.println();
        } else {
            System.out.printf("Empty ArrayList. Object id is %s \n", this);
        }
    }
}
