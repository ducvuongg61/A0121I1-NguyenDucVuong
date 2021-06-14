package Demo.tryCatch;

public class ZeroException extends  Exception{
    @Override
    public String getMessage() {
        return "Nhap so bang 0";
    }
}
