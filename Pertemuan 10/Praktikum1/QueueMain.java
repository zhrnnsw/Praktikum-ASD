package Praktikum1;

import java.util.Scanner;

public class QueueMain {

    public static void menu() {
        System.out.println("Masukkan operasi yang diiinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Cari antrian data");
        System.out.println("7. Cari data pada antrian");
        System.out.println("0. Exit");
        System.out.println("====================");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int n = sc.nextInt();

        Queue Q = new Queue(n);

        int pilih;
        boolean ulang = true;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    if (Q.IsFull()) {
                        System.out.println("Queue sudah penuh");
                        ulang = false;
                        break;
                    }
                    System.out.println("Masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    if (Q.IsEmpty()) {
                        System.out.println("Queue masih kosong");
                        ulang = false;
                        break;
                    }
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                case 6:
                    System.out.println("Masukkan nilai yang dicari : ");
                    int cari = sc.nextInt();
                    Q.peekPosition(cari);
                    break;
                case 7:
                    System.out.println("Masukkan posisi antrian yang anda cari : ");
                    int p = sc.nextInt();
                    Q.peekAt(p);
                    break;
                case 0:
                    ulang = false;
            }
        } while ( ulang == true);
        System.out.println("--------SELESAI--------");
    }
}