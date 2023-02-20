import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b, tinggi;

        System.out.println("Masukkan tinggi segitiga: ");
        tinggi = input.nextInt();


        for (a =1; a<= tinggi; a++){
            for (b= 1; b <= a; b++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for (a =1; a<= tinggi; a++){
            for (b=a; b <= tinggi; b++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
