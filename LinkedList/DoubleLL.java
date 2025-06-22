public class DoubleLL{

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    //add
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }


    //reverse
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }

    //print
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
        }
        System.out.println("null");
    }
    
     
     public static void main(String args[]){
      DoubleLL dll=new DoubleLL();
      dll.addFirst(3);
      dll.addFirst(2);
      dll.addFirst(1);
      dll.print();
     }
}