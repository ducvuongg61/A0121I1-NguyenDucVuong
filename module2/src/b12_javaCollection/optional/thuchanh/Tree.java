package b12_javaCollection.optional.thuchanh;

public interface Tree<E> {
    public boolean insert(E e);

    public void inorder();

    public int getSize();
}
