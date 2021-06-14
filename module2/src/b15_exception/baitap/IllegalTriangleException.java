package b15_exception.baitap;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(String s) {
        super("Khong phai 3 canh 1 tam giac!!!");
    }
}
