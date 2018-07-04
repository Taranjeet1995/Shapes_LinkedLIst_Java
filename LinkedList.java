package com.TaranjeetSingh;

/**
* Linked List class with inner class Node
 */

public class LinkedList {

    public Node head;
    private int size;
    public int check_global;
    public int cc;


/**
* Check if linked list is empty or not ------------------------------------------------------------------------------
 */
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;}


 /**
 * Inserting shape type element at end--------------------------------------------------------------------------------
 */
    public void insertAtEnd(Shape data){
        /* 1. Allocate the Node &
       2. Put in the data
       3. Set next as null */
        Node new_node = new Node(data);

    /* 4. If the Linked List is empty, then make the
           new node as head */
        if (head == null)
        {
            head = new Node(data);
            return;
        }

    /* 4. This new node is going to be the last node, so
         make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }


/**
 *  Inserting data at beginning of Linked List----------------------------------------------------------------------
 */
    public void insertAtBeginning(Shape data){
        /* 1 & 2: Allocate the Node &
              Put in the data*/
        Node new_node = new Node(data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

/**
*  Printing tail node---------------------------------------------------------------------------------------------
 */
    public Node tail(){return findAtIndex(size);}

/**
 *  Getting length of linked list---------------------------------------------------------------------------------
 */
    public int length(){Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            size++;
            temp = temp.next;
        }
        this.size=count;
        return count;}

/**
 * Insert data at particular index-----------------------------------------------------------------------------------
 */
    void insertAtIndex(int idx, Shape data){
        Node dummy = new Node();
        dummy.next = head;

        Node runner = dummy;
        for (int i = 0; i < idx; ++i) {
            runner = runner.next;
        }

        Node node = new Node();
        node.data = data;
        node.next = runner.next;
        runner.next = node;

    }

/**
*  Finding element at given index-----------------------------------------------------------------------------------
 */
    Node findAtIndex(int idx){
        int i;
        Node currentNode;

        Node findit = null;
        // Traverse the links until we get to the
        // one just before the desired one.
        currentNode = head;
        for(i = 0; i < idx; i++) {

            if(i == size-1)
                return(currentNode);

            findit=currentNode;
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

/**
* Deleting element at given index------------------------------------------------------------------------------------
 */
    void deleteAtIndex(int idx){
        // If linked list is empty
        if (head == null)
            return;

        // Store head node
        Node temp = head;

        // If head needs to be removed
        if (idx == 0)
        {
            head = temp.next;   // Change head
            return;
        }

        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<idx-1; i++)
            temp = temp.next;

        // If position is more than number of ndoes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next;  // Unlink the deleted node from list
    }

/**
* Deleting data from linked list------------------------------------------------------------------------------------
 */
    void deleteData(Shape s) {
        Node current = head;    //Initialize current
        for(current=head;current!=null;current=current.next) {
            if (current.data == s) {
                this.cc++;
            }
        }
    }

/**
 * Returning Node in string type at a given index-------------------------------------------------------------------
 */
    public String print(int index){
        int i;
        Node currentNode;

        Node findit = null;
        // Traverse the links until we get to the
        // one just before the desired one.
        currentNode = head;
        for(i = 0; i < index; i++) {

            if(i == size-1)
                return " "+currentNode;

            findit=currentNode;
            currentNode = currentNode.getNext();
        }
        return " "+currentNode;
    }

    @Override
    public String toString() {Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        return " "+n.data;}

    public void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }


/**
* Inner class Node ---------------------------------------------------------------------------------->>>>>>>>>>>>>>
 */
    static class Node{

        private Shape data;

        private Node next;

        public Node(){
            this.data=null;
        }
        public Node(Shape data){
            this.data =data;
            this.next=null;
        }

        public Node(Shape data, Node next){
            this.data=data;
            this.next=next;
        }

        public void setNode(Shape data, Node next){
            this.data=data;
            this.next=next;
        }

        public void setData(Shape data){
            this.data=data;
        }

        public Shape getData(){return this.data;}

        public Node getNext(){return this.next;}

        public void setNext(Node next){this.next=next;}

        public Node getNode(){
            Node current_node = new LinkedList().head;
            return  current_node.next;}

        @Override

        public String toString() {
                return "Data" + this.data + "\nNext node:- " + this.next;
        }
        public boolean equals(Object obj) {return false;}

    }
}
