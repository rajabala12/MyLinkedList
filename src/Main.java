public class Main {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        System.out.println("Linked List");
        System.out.println("------ ----");
        myLinkedList.add("Raja");
        myLinkedList.add("Gil");
        myLinkedList.add("Aravind");
        myLinkedList.add("Developer");
        myLinkedList.add("Tester");
        System.out.println("Linked List Size: " +myLinkedList.getSize());
        System.out.println("\n*******CONTENTS*******");
        myLinkedList.displayAllElements();
        System.out.println("**********************");
        System.out.println(myLinkedList.displayAtPos(1));
        System.out.println(myLinkedList.displayAtPos(3));
        System.out.println(myLinkedList.displayAtPos(5));
    }
}
