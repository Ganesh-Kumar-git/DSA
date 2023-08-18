package linkedList;

public class linked1 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node head;

    public void display(){
        System.out.println("------------------");
        Node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void addFirst(int d){
        Node nn=new Node(d);
        nn.next=head;
        this.head=nn;
    }

    public void remove(int index){
        Node temp=this.head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    public void addAt(int data,int idx){
        Node nn=new Node(data);
        Node temp=this.head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        nn.next=temp.next;
        temp.next=nn;

    }
}
