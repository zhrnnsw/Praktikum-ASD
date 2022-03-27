package penjualanTiket;
import java.util.Scanner;

public class mainTiket {
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        tiketService list = new tiketService();
        System.out.println("======================================");
        System.out.println("   Pemesanan Tiket Pesawat");
        System.out.println("======================================");

        tiket t1 = new tiket("Garuda", 1090000, "Jakarta", "Denpasar");
        tiket t2 = new tiket("Lion Air", 750000, "Surabaya", "Banjarmasin");
        tiket t3 = new tiket("Garuda", 950000, "Surabaya", "Banyuwangi");
        tiket t4 = new tiket("Batik Air", 1500000, "Jakarta", "Balikpapan");
        tiket t5 = new tiket("Citilink", 950000, "Surabaya", "Balikpapan");
        tiket t6 = new tiket("Lion Air", 2550000, "Denpasar", "Ujung Padang");
        tiket t7 = new tiket("Citilink", 1750000, "Samarinda", "Lombok Praya");
        tiket t8 = new tiket("Citilink", 1200000, "Surabaya", "Denpasar");

        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);
        list.tambah(t6);
        list.tambah(t7);
        list.tambah(t8);

        System.out.println("Pengurutan tiket berdasarkan:");
        System.out.println("1. Harga Termurah");
        System.out.println("2. Harga Tertinggi");
        System.out.print("Masukkan pilihan (1/2) : ");
        int urut = zh.nextInt();

        switch (urut) {
            case 1:
                list.bubbleShort();
                break;
            case 2:
                list.selectionSort();
                break;
            default: System.out.println("Pilihan Tidak Tersedia!");
                break;
        }
        System.out.println();
        list.tampilAll();
    }
}
