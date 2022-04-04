package TestSearching;
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        Scanner sc =  new Scanner(System.in);

        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumMhs = zh.nextInt();
        PencarianMhs data = new PencarianMhs(jumMhs);
        

        System.out.println("-----------------------------------------------");
        System.out.println("Masukkan data mahasiswa :");
        for(int i=0; i<jumMhs; i++){
            System.out.println("-----------------");
            System.out.print("Nim\t : ");
            int nim = zh.nextInt();
            System.out.print("Nama\t : ");
            String nama = sc.nextLine();
            System.out.print("Umur\t : ");
            int umur = zh.nextInt();
            System.out.print("IPK\t : ");
            double ipk = zh.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }
        
        System.out.println("-----------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("________________________________________________");
        System.out.println("Pilihan Pencarian Data Berdasarkan: ");
        System.out.println("1. NIM");
        System.out.println("2. Nama");
        System.out.print("Masukkan piihan (1/2): ");
        int pil = zh.nextInt();
        System.out.println("=========================================");
        switch (pil) {
            case 1:
                data.insertionSort();
                System.out.println("Data keseluruhan Mahasiswa"); 
                System.out.println("setelah pengurutan secara descending :"); 
                data.tampil();
                System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
                System.out.print("NIM : ");
                int cariNim = zh.nextInt();
                System.out.println("menggunakan binary Search");
                int posisi = data.FindBinarySearch(cariNim, 0, jumMhs-1);
                data.TampilPosisi(posisi);
                data.TampilData(posisi);
                break;
            case 2: //sequential
                System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
                System.err.print("Nama : ");
                String cariNama = sc.nextLine();
                System.out.println("menggunakan sequential Search");
                posisi = data.FindSeqSearch(cariNama);
                data.TampilPosisi(posisi);
                data.TampilData(posisi);
            break;
            default: 
                System.out.println("Pilihan tidak tersedia!");
                break;
        }
        

        
    }
}
