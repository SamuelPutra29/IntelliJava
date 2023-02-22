import java.util.Scanner;

public class FunsiJava {

    static Scanner input = new Scanner(System.in);

    // Ini adalah basic pembuatan fungsi pada java
    static void fungsi_pertama(){
        System.out.println("Nama saya Sam");}

    // Fungsi dengan menggunakan parameter
    static void fungsi_parameter (String nama){
        System.out.println("Nama anda adalah: " + nama);
    }

    // Fungsi dengan pengembalian nilai (return)
     static int fungsi_return() {

        System.out.println("Masukkan nilai a: ");
        int a = input.nextInt();
        System.out.println("Masukkan nilai b: ");
        int b = input.nextInt();

        int total = a + b;
        System.out.println("Nilai total a dan b adalah:" + total);
        return total;

    }




    public static void main(String[] args) {
        fungsi_pertama();
        fungsi_parameter("Indah");
        fungsi_return();

    }
}
