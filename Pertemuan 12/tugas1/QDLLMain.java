package tugas1;
import java.util.Scanner;


public class QDLLMain {
   public static void main(String[] args) throws Exception {
       Scanner zh = new Scanner(System.in);
       Scanner sc = new Scanner(System.in);
       QDLL dll = new QDLL();
       boolean ulang = true;
       do {
           System.out.println("++++++++++++++++++++++++++++++++++");
           System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
           System.out.println("++++++++++++++++++++++++++++++++++");
           System.out.println();
           System.out.println("1. Tambah Data Penerima Vaksin");
           System.out.println("2. Hapus Data Pengantri Vaksin");
           System.out.println("3. Daftar Penerima Vaksin");
           System.out.println("4. Keluar");
           System.out.println("++++++++++++++++++++++++++++++++++");
           int menu = zh.nextInt();

           switch (menu) {
               case 1:
                   System.out.println("=====================================");
                   System.out.println("Masukkan Data Penerima Vaksin");
                   System.out.println("=====================================");
                   System.out.println("Nomor Antrian: ");
                   int no = zh.nextInt();
                   System.out.println("Nama Penerima: ");
                   String nam = sc.nextLine();
                   System.out.println();
                   dll.enqueue(nam, no);
                   break;

                case 2:
                    dll.dequeue();
                    break;
                
                case 3:
                    dll.print();
                    break;

                case 4:
                    ulang = false;
                    System.out.println("--SELESAI--");
                    break;
               default:
                    System.out.println("Pilihan diluar batas!");
                   break;
           }
       } while (ulang);
   } 
}
