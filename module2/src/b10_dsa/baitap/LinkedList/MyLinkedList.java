package b10_dsa.baitap.LinkedList;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //Phan tu dau tien cua danh sach lien ket
    private Node head;
    //Mo ta so luong phan tu co trong danh sach
    private int numNodes = 0;

    public MyLinkedList() {
    }

    //Them phan tu vao dau danh sach
    public void addFirst(E element) {
        //Khai 1 gia tri temp tro den gia tri cua head
        Node temp = head;
        //Bien head se nhan gia tri cua 1 node moi
        head = new Node(element);
        //head.next tro den temp
        head.next = temp;
        numNodes++;
    }

    //Them phan tu cuoi cung vao danh sach
    public void addLast(E element) {
        //Khai bao 1 bien temp de tro den head
        Node temp = head;
        //Se cho con tro dem phan tu cuoi cung cua danh sach
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    //Them phan tu vao vi tri index cua mang
    public void add(int index, E element) {
        //Khai bao bien temp tro den head
        Node temp = head;
        //Khai bao 1 node la holder
        Node holder;
        //Cho con tro chay den index -1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //Cho holder tham chieu den vi tri index
        holder = temp.next;
        //Node tai vi tri index - 1 se tro toi node moi
        temp.next = new Node(element);
        //Node moi nay se tro den holder
        temp.next.next = holder;
        //Tang so luong danh sach len 1
        numNodes++;
    }

    public Object get(int index) {
        //Khai bao bien temp tro toi head
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    //Kich thuoc cua mang
    public int size() {
        return numNodes;
    }

    //Xoa phan tu tai vi tri index trong mang
    public E remove(int index) {
        //Kiem tra dieu kien index
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Error index: " + index);
        }
        //Khai bao bien temp tro den head
        Node temp = head;
        //Khai bao 1 doi tuong Object de return ve
        Object data;
        //Neu nhu index = 0 -> data hien tai
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }

    //remove voi 1 doi tuong truyen vao chu k phai la index
    public boolean remove(E element) {
        //Viet lenh remove doi tuong neu element head
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            //Khai bao 1 node tro den head
            Node temp = head;
            while (temp.next != null) {
                //Neu nhu ton tai 1 phan tu co data bang data truyen vao thi node do se bi remove
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        //Kiem tra LinkedList co phan tu hay khong
        if (numNodes == 0) {
            throw new IndexOutOfBoundsException("This LinkList null");
        }
        //Khai bao LinkedList tra ve
        MyLinkedList<E> returnMyLinkedList = new MyLinkedList<>();
        //Khai bao 1 temp tro den head
        Node temp = head;
        //Add temp vao danh sach tra ve de no lam head
        returnMyLinkedList.addFirst((E) temp.data);
        temp = temp.next;
        while (temp != null) {
            returnMyLinkedList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnMyLinkedList;
    }

    //Kiem tra phan tu co trong danh sach hay k
    public boolean constrain(E element){
        Node temp = head;
        while(temp.next != null){
            if(temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //Tra ve vi tri phan tu trong danh sach
    public int indexOf(E element){
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if(temp.getData().equals(element)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
}
