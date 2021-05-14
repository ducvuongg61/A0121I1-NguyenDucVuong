package b2_vong_lap.thuchanh;

import java.util.Scanner;

public class LaiSuat {
    public static void main(String[] args) {
        double tien = 1.0;
        int thang = 1;
        double lai = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien : " + tien);
        tien = sc.nextDouble();
        System.out.println("Nhap so thang : " + thang);
        thang = sc.nextInt();
        System.out.println("Nhap so tien lai : " + lai);
        lai = sc.nextDouble();

        double laiSuatNhanDuoc = 0;
        for(int i = 0 ; i < thang ; i++){
            laiSuatNhanDuoc += tien * (lai/100)/12 * thang;
        }
        System.out.println("Tong lai suat la : " + laiSuatNhanDuoc);
    }

}
