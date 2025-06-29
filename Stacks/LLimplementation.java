class Stack{
public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node top;
    public static Node tail;
    public static int size;


    //push
    public void stackPush(int x){
        Node element=new Node(x);
        element.next=top;
        top=element;
        System.out.println("Element pushed");
        size++;
    }

    //pop
    public int stackPop(){
        if(top==null){
            return -1;
        }
        int topData=top.data;
        Node temp=top;
        top=top.next;
        size--;
        return topData;
    }

    //size
    public int stackSize(){
        return size;
    }

    //isEmpty
    public boolean stackIsEmpty() {
    return top == null;
  }
  public void printStack() {
    Node current = top;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }
}

public class LLimplementation{
  public static void main(String args[]) {
    Stack s = new Stack();
    s.stackPush(10);
    s.stackPush(20);
    s.printStack();
    System.out.println("Element popped " + s.stackPop());
    System.out.println("Stack size: " + s.stackSize());
    System.out.println("Stack is empty or not: " + s.stackIsEmpty());

  }
}

