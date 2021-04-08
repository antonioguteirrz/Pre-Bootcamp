package DojoAssignments.JavaFun.SingleLinkedList;


public class ListTester {
    public static void main(String[] args) {
        System.out.println("hello");
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        //sll.printValues();
        System.out.println(sll);
    }
}
