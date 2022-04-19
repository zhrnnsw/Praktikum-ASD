package StrukBelanja;
import java.util.Scanner;

public class stackMain {
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        stack stk = new stack(8);
        char pilih;

        do {
            System.out.println("Masukkan Informasi Struk Belanja");
            System.out.print("Nomor Transaksi: ");
            int noTransaksi = zh.nextInt();
            System.out.print("Tanggal pembelian: ");
            String tanggal = sc.nextLine();
            System.out.print("Jumlah barang yang dibeli: ");
            int jmlBarang = zh.nextInt();
            System.out.print("Total harga bayar: ");
            double totalHarga = zh.nextDouble();

            struk s = new struk(noTransaksi, tanggal, jmlBarang, totalHarga);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = zh.next().charAt(0);
            zh.nextLine();
            stk.push(s);
            System.out.println();
        } while (pilih == 'y' && !stk.IsFull());

        stk.print();

        System.out.print("Masukkan jumlah struk yang akan diambil: ");
        int jml = zh.nextInt();
        for(int i=0; i<jml; i++){
            stk.pop();
        }

        stk.peek();
        stk.print();

    }    
}
