package Lab;

public class LinkList {

    private Node head;
    private Node tail;

//    Now we need to define the methods we can perform on a linkedlist

//    add

    public void addNode(String data){
        if(head == null){
            Node temp = new Node(data);
            head = temp;
            tail = temp;
        } else{
            tail.setNext(new Node(data));
            tail = tail.getNext();
        }
    }

//    remove


//    print values

    public void printList(){
        System.out.println();
        Node temp = head;
        while(temp != null){
            System.out.println(" "+temp.getData());
            temp = temp.getNext();
        }
    }








}
