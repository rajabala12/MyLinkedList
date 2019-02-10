public class MyLinkedList {
    private Node head;
    private Node tail;
    int size;

    public int getSize(){
        return size;
    }

    public void add (String data) {
        Node newNode = new Node(data, null);
        size++;

        if (head == null) {
            head = newNode;
            tail = head;
        }
        else {
            tail.setLink(newNode);
            tail = newNode;
        }
    }

    public void displayAllElements() {

        if (size == 0) {
            System.out.println("\n Linked List is EMPTY");
            return;
        }

        if (head.getLink() == null){
            System.out.println("Data : " +head.getData());
            return;
        }

        Node ptr = head;
        System.out.println(head.getData());
        ptr = head.getLink();

        while (ptr.getLink() != null){
            System.out.println(ptr.getData());
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "\n");
    }

    public String displayAtPos(int pos) {

        if (size == 0) {
            System.out.println("\n Linked List is EMPTY");
            return "Empty";
        }

        if (pos <= this.getSize()){
            int i = 1;
            Node tail = this.head;

            do{
                if (i==pos){
                    return "Value @ index " +pos +" is: " +tail.getData();
                }
                tail = tail.getLink();
                i++;
            }while (i <= size);
        }
        return "Out of bounds";
    }
}