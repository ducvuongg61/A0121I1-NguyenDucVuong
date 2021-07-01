package Demo;

public class aaa {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap n : ");
//        int n = sc.nextInt();
//        int sum = 0;
//        while(n > 10){
//            System.out.print("Moi nhap lai so < 10 : ");
//            n = sc.nextInt();
//        }
//        System.out.println("OK");

//        do {
//            System.out.print("Enter a number : ");
//            n = sc.nextInt();
//            sum = sum + n;
//        } while (n > 10);
//        System.out.println("OK sum = " + sum);
        for (int i=0;i<3;i++){
            for (int j= 0;j<3;j++){
                if (i==j) continue;
                System.out.println(i + " " + j);
            }
        }
    }
}
