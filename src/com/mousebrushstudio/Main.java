package com.mousebrushstudio;

public class Main {

    public static void main(String[] args) {
//        IntStack intStack = new IntStack();
//        if(!intStack.isFull()) {
//            intStack.push(2);
//            intStack.push(4);
//            intStack.push(6);
//            intStack.push(9);
//        }
//
//        System.out.println(intStack.pop());

//        Person person1 = new Person("Adedotun", "123");
//        Person person2 = new Person("Oladapo", "456");
//
//        PersonStack stack = new PersonStack();
//
//        stack.push(person1);
//        stack.push(person2);
//
//        System.out.println(stack.pop().toString());

//        IntQueue queue = new IntQueue();
//        queue.enqueue(1);
//        queue.enqueue(4);
//        queue.enqueue(6);
//
//        System.out.println(queue.dequeue());
//        queue.showAll();

//        PersonQueue queue = new PersonQueue();
//        queue.enqueue(new Person("Adedotun", "123"));
//        queue.enqueue(new Person("Oladapo", "456"));
//
//        queue.showAll();

        IntLinkedList list = new IntLinkedList(3);
        list.insertItems(5);
        list.insertItems(8);
        list.printList();

        list.deleteItem(5);
        list.printList();

    }
}
