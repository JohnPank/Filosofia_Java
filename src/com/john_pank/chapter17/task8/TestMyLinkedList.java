package com.john_pank.chapter17.task8;

/**
 * Filosofia_Java
 * Created by John Pank on 24.01.2017.
 */

class MyLinkedList<T>{
    MyIterator mi;
    Node head;
    public MyLinkedList(){
        head = new Node();
        mi = new MyIterator(head);
    }

    class Node{
        T a;
        Node next;

        public Node(){
            this.a = null;
            this.next = null;
        }

    }

    class MyIterator{
        private Node tempNode;

        public MyIterator(Node n){
            tempNode = n;
        }

        public boolean hasNext(){

            if(tempNode.next == null)
                return false;
            return true;

        }

        public T next(){
            tempNode = tempNode.next;
            return tempNode.a;
        }

        public void add(T t){
            Node newNode = new Node();
            newNode.a = t;
            newNode.next = null;
            tempNode.next = newNode;
            tempNode = newNode;
        }

        public boolean remove(T r){
            Node tempRemovalNode = head;
            Node nextTempRemovalNode = head.next;

            if(head.a == r){
                head = head.next;
                return true;
            }
            while (nextTempRemovalNode != null) {
                if (nextTempRemovalNode.a == r && nextTempRemovalNode.next != null) {
                    tempRemovalNode.next = nextTempRemovalNode.next;
                    return true;
                }

                if (nextTempRemovalNode.a == r && nextTempRemovalNode.next == null) {
                    tempRemovalNode.next = null;

                }
                tempRemovalNode = nextTempRemovalNode;
                nextTempRemovalNode = nextTempRemovalNode.next;
            }

            return false;
        }

    }

    public String toString(){
        MyIterator tempIterator = new MyIterator(head);
        String result = "";

        while (tempIterator.hasNext()){
            //System.out.println(tempIterator.next());
            result = result + tempIterator.next().toString() + " ";
        }
        return result;
    }

    public MyIterator iterator(){
        return mi;
    }
}

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> mll = new MyLinkedList<>();
        MyLinkedList.MyIterator myIterator = mll.iterator();
        myIterator.add(2);
        myIterator.add(5);
        myIterator.add(8);
        myIterator.add(4);
        myIterator.add(6);
        myIterator.add(8);
        myIterator.add(25);
        System.out.println(mll);
        myIterator.remove(25);
        System.out.println(mll);
    }

}
