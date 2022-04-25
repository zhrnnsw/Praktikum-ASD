package Tugas2;
import java.util.Scanner;
public class queueMahasiswaMain {
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasistas queue: ");
        int n = zh.nextInt();
        queue antri = new queue(n);

        char pilih;
        boolean ulang = true;

        do {
            System.out.println();
            System.out.println("--------Menu-------");
            System.out.println("1. Antrian Baru");
            System.out.println("2. Antrian Keluar");
            System.out.println("3. Cek Antrian terdepan");
            System.out.println("4. Cek Antrian terakhir");
            System.out.println("5. Cek Posisi antrian");
            System.out.println("6. Cek Data mahasiswa berdasarkan antrian");
            System.out.println("7. Stop Program");
            System.out.print("Masukkan pilihan menu (1-7): ");
            int menu = zh.nextInt();

            switch (menu) {
                case 1:
                do{
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama =  sc.nextLine();
                    System.out.print("Absen : ");
                    int absen = zh.nextInt();
                    System.out.print("IPK : ");
                    double ipk = zh.nextDouble();
                    mahasiswa mh = new mahasiswa(nim, nama, absen, ipk);
                    System.out.println("Apakah Anda akan menambahkan antrian baru ? (y/n)");
                    pilih = sc.next().charAt(0);
                    sc.nextLine();
                    antri.enqueue(mh);
                }while (pilih == 'y');
                    break;
                case 2 :
                   mahasiswa data = antri.dequeue();
                   if(!"".equals(data.nim)&& !"".equals(data.nama) && data.absen != 0 && data.ipk != 0){
                    System.out.println("Antrian yang keluar : " + data.nim + " " + data.nama + " " + data.absen + 
                    " " + data.ipk);
                   } 
                    break;
                case 3 :
                    antri.peek();
                    break;
                case 4 :
                    antri.peekRear();
                    break;
                case 5 :
                    System.out.println("Masukkan NIM yang akan dicek : ");
                    String cari = sc.nextLine();
                    antri.peekPosition(cari);
                    break;
                case 6 :
                    System.out.println("Masukkan Posisi antrian yang akan dicek : ");
                    int posisi = zh.nextInt();
                    antri.printMahasiswa(posisi);
                    break;
                case 7 :
                    ulang = false;
                default:
                    System.out.println("---------Selesai-----------");
                    break;
            }

        } while (ulang);
    }  
}
