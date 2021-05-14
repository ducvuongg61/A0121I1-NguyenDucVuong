package b2_vong_lap.baitap;

public class SoNguyenTo20 {
    public static void main(String[] args) {
        int a = 20;
        int n = 2;
        while(n <= a){
            if(checkPrime(n)){
                System.out.print(n + " ");
            }
            n++;
        }

    }
    public static boolean checkPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
