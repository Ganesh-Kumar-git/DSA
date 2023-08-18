package linkedList;

public class linkedlisttest {
    public static void main(String[] args) {
        linked1 ll=new linked1();
        ll.addFirst(25);
        ll.addFirst(34);
        ll.addFirst(44);
        ll.addFirst(354);
        ll.addFirst(36);
        ll.display();
        ll.remove(3);
        ll.display();
        ll.addAt(3333,1);
        ll.display();

    }

}
