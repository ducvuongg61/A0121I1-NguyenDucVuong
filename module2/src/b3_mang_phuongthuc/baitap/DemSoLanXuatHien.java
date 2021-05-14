package b3_mang_phuongthuc.baitap;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void DemKyTu(String str){
        int dem[] = new int[256];
        int doDai  = str.length();
        for (int i = 0; i < doDai; i++) {
            dem[str.charAt(i)]++;
        }
        char array[] = new char[str.length()];
        for (int i = 0; i < doDai; i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i  ; j++) {
                if(str.charAt(i) == array[j]){
                    flag++;
                }
            }
            if(flag == 1){
                System.out.println("So lan xuat hien cua " + str.charAt(i) + " trong chuoi " + dem[str.charAt(i)]);

            }
        }
    }

    public static void main(String[] args) {
        String str = "Khong phai dang vua dau";
        System.out.println("Chuoi la : " + str);
        DemKyTu(str);
    }
}
