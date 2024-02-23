public class Buku21 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku21() {
    }

    public Buku21(String jud, String pg, int hal, int stk, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        stok = stk;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        stok -= jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}