package com.tvt;

public class ArrayClass {

    private int[] arr;
    private int capacity = 0;

    public int getCapacity(){return capacity;}

    public void setCapacity(int newCapacity){this.capacity = newCapacity;}

    public ArrayClass(int[] arr) {
        this.arr = arr;
    }

    public boolean isEmpty() {
        return this.arr.length == 0;
    }

    public boolean isFull(){
        return this.arr.length == this.capacity;
    }

    public void addElement(int newElement){
        if(isEmpty()){
            this.arr = new int[10];
        }

        if(arr.length == capacity){
            // create new array double the length and copy everything
        }

        this.arr[capacity] = newElement;
    }

    public void removeElement(int element){

    }



}
