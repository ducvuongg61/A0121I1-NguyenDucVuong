package b10_dsa.baitap.MyList;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Phuong thuc khoi tao constructor voi suc chua duoc truyen vao
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IndexOutOfBoundsException("Capacity : " + capacity);
        }
    }

    //Phuong thuc tra ve so luong phan tu
    public int size() {
        return this.size;
    }

    //Phuong thuc clear 1 mang
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    //Phuong thuc add 1 phan tu vao mang
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    //phuong thuc tang kich thuoc cua mang
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IndexOutOfBoundsException("MinCapacity : " + minCapacity);
        }
    }

    //Phuong thuc add 1 phan tu vao 1 vi tri trong mang
    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IndexOutOfBoundsException("index : " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }

        if (elements[index] == null) {
            elements[Math.min(index, size)] = element;
            size++;
        } else {
            for (int i = size; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    //Phuong thuc lay 1 element tai vi tri index
    public E get(int index) {
        return (E) elements[index];
    }

    //Phuong thuc lay index cua 1 phan tu
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    //Phuong thuc kiem tra phan tu co ton tai trong mang hay k
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    //Sao chep 1 mang sang mang moi
    public MyArrayList<E> clone() {
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }

    //Phuong thuc xoa 1 phan tu tai vi tri index
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Error Index: " + index);
        }
        E element = (E) elements[index];
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}

