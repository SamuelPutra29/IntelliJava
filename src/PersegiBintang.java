import java.util.Scanner;

public class PersegiBintang {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, sisi;

        System.out.println("Masukkan nilai sisi persegi: ");
        sisi = input.nextInt();

        for (a=1; a <= sisi; a++) {
            for (b = 1; b <= sisi; b++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
