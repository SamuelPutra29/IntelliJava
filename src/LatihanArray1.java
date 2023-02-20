import java.util.Scanner;

// Ini adalah latihan array pertama
// Membaca input tipe data array
public class LatihanArray1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] nilai = new String[3];

        System.out.println("Masukkan nama anak pertama: ");
        nilai[0] = input.nextLine();

        System.out.println("Masukkan nama anak kedua: ");
        nilai[1] = input.nextLine();

        System.out.println("Masukkan nama anak ketiga: ");
        nilai[2] = input.nextLine();

        System.out.println("Maka urutannya: " + nilai[0] + " " + nilai[1]+ " " + nilai[2]);





    }



}
