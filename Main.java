package com.TaranjeetSingh;

public class Main {

/**
*  Developed By Taranjeet Singh
 *  Hanson ID - H10001225
 */

/**
 *  Testing Class
 */
    public static void main(String[] args) {

        Shape s1=new Circle();
        s1.getPerimeter();
        System.out.println(s1.toString());
        System.out.println(s1.hashCode());
        System.out.println(s1.equals(s1));

        LinkedList llist = new LinkedList();

        llist.head=new LinkedList.Node(s1);
        System.out.println(llist.head);
        LinkedList.Node second=new LinkedList.Node(new Rectangle());
        LinkedList.Node third =new LinkedList.Node(new Square());
        LinkedList.Node fourth =new LinkedList.Node(new Triangle());

        llist.head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);

        System.out.println(second.getData());
        System.out.println(second.getNext());

        llist.print();

        llist.insertAtBeginning(new Triangle());
        System.out.println();
        llist.print();

        llist.insertAtIndex(3,new Triangle());
        System.out.println();
        llist.print();

        llist.deleteAtIndex(3);
        System.out.println();
        llist.print();

        System.out.println("\n\nTotal length of linked list :"+" "+llist.length()+"\n......................." +
                "....................................................................\n"+llist.findAtIndex(2));

        llist.insertAtEnd(new Square());
        llist.print();
        if(llist.isEmpty()){
            System.out.println("\nLinked List is empty");
        }
        else{
            System.out.println("\nLinked List is not empty");
        }

        System.out.println(llist.tail());

        Shape ss=new Rectangle();
        llist.deleteData(new Rectangle());
        llist.deleteAtIndex(llist.cc);
        System.out.println();
        llist.print();

        System.out.println("\nPrint String method"+llist.print(5));



    }
}
