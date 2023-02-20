/*
    Konstanta adalah sebuah tempat atau container dari suatu nilai.
    Dan ditulis sebelum main method
    Konstanta bersifat tetap atau konstan dan tidak bisa diubah sepanjang program berjalan.
    Yang membedakan dengan variabel adalah karena tidak bisa diubah.
    Cara memnbuatnya -> tambahkan "public static final"
    Contoh:
        public static final int nilai_konstanta = 10;

access_modifier: Adalah salah satu dari keyword public, protected atau private. Karena kita belum membahas tentang access modifier ini, silahkan pakai public saja. Access modifier akan dibahas di materi tentang pemrograman object (OOP).
static: Merupakan keyword untuk membuat variabel yang bisa diakses langsung dari dalam class (tanpa harus membuat object).
final: Ditambahkan agar variabel ini bersifat final dan nilainya tidak bisa ditimpa.
tipe_data: Tipe data dari konstanta.
NAMA_KONSTANTA: Adalah tempat menulis nama konstanta. Aturan nama konstanta ini sama seperti aturan identifier yang pernah kita bahas di Aturan Dasar Penulisan Kode Program Bahasa Java. Yakni bisa terdiri dari huruf, angka dan underscore. Angka tidak bisa menjadi karakter pertama. Selain itu kebiasaan programmer Java, nama konstanta ini ditulis dalam huruf besar semua (SNAKE_CASE).
nilai_konstanta: Nilai yang akan diisi ke dalam konstanta.
*/
public class Konstanta {

    public static final int Nilai_Integer_Konstanta = 10;
    public static final String Nilai_String_Konstanta = "Samuel da best ";
    public static final double Nilai_Float_Konstanta = 10.5;

    public static void main(String[] args) {
        System.out.println(Nilai_Integer_Konstanta);
        System.out.println(Nilai_String_Konstanta);
        System.out.println(Nilai_Float_Konstanta);



    }





}
