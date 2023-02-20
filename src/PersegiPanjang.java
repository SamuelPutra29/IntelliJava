import java.util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a,b, lebar, panjang;

        System.out.println("Masukkan lebar: ");
        lebar = input.nextInt();
        System.out.println("Masukkan panjang: ");
        panjang = input.nextInt();

        for (a=1; a <= lebar; a++ ){
            for (b=1; b <= panjang; b++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
