public class ReverseLinkedList {
    static Node head;
    class Node{
        int data;
        Node next;
        Node(Node next,int data){
            this.data=data;
            this.next=next;
        }
    }
    void push(Node nodeRef, int newData){
        Node newNode = new Node(nodeRef,newData);
        head=newNode;
    }
    void printList(Node head){
        while(head!=null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.print("null");

    }
    void reverseList(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node nextTemp =curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextTemp;
        }
        while (prev!=null){
            System.out.print(prev.data+ "->");
            prev=prev.next;
        }
        System.out.print("null");
    }
    static void fun(Node head){
        if (head==null) return;
        System.out.print(head.data+"->");
        if(head.next!=null)
            fun(head.next.next);
        System.out.print(head.data+"->");

    }
    public static void main(String[] args) {
        ReverseLinkedList ll =new ReverseLinkedList();
        for(int i=6;i>0;i--){
            ll.push(head,i);
        }
        System.out.print("Before reverse: ");
        ll.printList(head);
        System.out.println();
        System.out.print("After reversed: ");
        ll.reverseList(head);
//        fun(head);
//        System.out.print("null");
    }
}
