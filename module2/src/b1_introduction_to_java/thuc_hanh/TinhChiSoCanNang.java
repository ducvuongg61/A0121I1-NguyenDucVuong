package b1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
        double chieucao;
        double cannang;
        double bmi;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao : ");
        chieucao = sc.nextDouble();
        System.out.println("Nhap vao can nang : ");
        cannang = sc.nextDouble();
        bmi = cannang / ((chieucao)*(chieucao));
        if(bmi < 18.5){
            System.out.println("Thieu can");
        } else  if(bmi <= 25){
            System.out.println("Binh thuong");
        } else if(bmi <= 35){
            System.out.println("Thua can");
        } else {
            System.out.println("Beo phi");
        }
    }
}
