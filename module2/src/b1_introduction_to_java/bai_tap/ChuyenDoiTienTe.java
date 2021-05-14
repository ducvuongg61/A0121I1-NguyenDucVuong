import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double money;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a money : ");
        money = sc.nextDouble();
        double VND;
        VND = money * 23000;

        System.out.println("Convert to VND : " + VND);


    }
}
