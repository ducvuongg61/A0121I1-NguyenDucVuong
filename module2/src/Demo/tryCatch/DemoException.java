package Demo.tryCatch;

public class DemoException {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap vao so a : ");
//        int a = Integer.parseInt(sc.nextLine());
//        System.out.print("Nhap vao so b : ");
//        int b = Integer.parseInt(sc.nextLine());
//        try {
//            System.out.println("Ket qua a/b : " + (a / b));
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        } finally {
//            System.out.println("Final");
//        }
//
//        try {
//            int k = inputNumber(sc);
//        } catch (ZeroException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("Finish");
//    }
//
//    public static int inputNumber(Scanner sc) throws ZeroException {
//        System.out.print("Moi ban nhap so khac 0 : ");
//        int number = Integer.parseInt(sc.nextLine());
//        if (number == 0) {
//            throw new ZeroException();
//        }
//        return number;
        try {
            int x = 0;
            int y = 5 / x;
        }catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        }catch (Exception ae) {
            System.out.println("Exception");
        }
        System.out.println("finished");
    }
}
