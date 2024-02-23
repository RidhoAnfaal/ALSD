// BukuMain.java
public class BukuMain21 {
    public static void main(String[] args) {
        // Membuat objek bk1 menggunakan konstruktor default
        Buku21 bk1 = new Buku21();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        // Menampilkan informasi, menjual, dan mengganti harga buku bk1
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        // Membuat objek bk2 menggunakan konstruktor berparameter
        Buku21 bk2 = new Buku21("Self Reward", "Maheera Ayesha", 160, 29, 59000);

        // Menjual buku bk2 dan menampilkan informasinya
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}