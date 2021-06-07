package b12_javaCollection.optional.thuchanh;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("Smith");
        tree.insert("Michael");
        tree.insert("16Ty");
        tree.insert("Andee");
        tree.insert("MTP");
        tree.insert("Jack");
        tree.insert("Tom");

        System.out.println("Inorder (sorted) : ");
        tree.inorder();
        System.out.println("The number of nodes is : " + tree.getSize());
    }
}
