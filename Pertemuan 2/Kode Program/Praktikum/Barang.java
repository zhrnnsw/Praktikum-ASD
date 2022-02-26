public class Barang{
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;

    Barang(){

    }
    Barang(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }

    void tampilBarang(){
        System.out.println("Nama = " + namaBarang);
        System.out.println("Jenis = " + jenisBarang);
        System.out.println("Stok = " + stok);
        System.out.println("Harga Satuan = " + hargaSatuan);
    }

    void tambahStok(int n){
        stok += n;
    }

    void kurangStok(int n){
        if (stok > 0)stok -= n;
        else System.out.println("Stok telah habis");
    }
    
    int hitungHargaTotal(int jml){
        return jml*hargaSatuan;
    }

}