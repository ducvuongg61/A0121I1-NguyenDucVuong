package b3_mang_phuongthuc.baitap;

public class Max2Chieu {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {7, 8, 9}};
        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[1].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
