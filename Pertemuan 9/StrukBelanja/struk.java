package StrukBelanja;

public class struk {
    int noTransaksi, jmlBarang;
    String tanggal;
    double totalHarga;

    public struk(int noTransaksi, String tanggal, int jmlBarang, double totalHarga){
        this.noTransaksi = noTransaksi;
        this.tanggal = tanggal;
        this.jmlBarang = jmlBarang;
        this.totalHarga = totalHarga;
    }
}
