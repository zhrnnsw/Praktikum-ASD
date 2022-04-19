package Praktikum1;
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack (5);
        char pilih;
        boolean ulang = true;
    do{
        System.out.println();
        System.out.println("------Menu-----");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Print");
        System.out.println("5. Get Min");
        System.out.println("6. Stop Program");
        System.out.print("Makukkan piliihan operasi (1-6) : ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
            do{
                System.out.println();
                System.out.println("Masukkan data barang");
                System.out.print("Jenis: ");
                String jenis = zh.nextLine();
                System.out.print("Warna: ");
                String warna = zh.nextLine();
                System.out.print("Merk: ");
                String merk = zh.nextLine();
                System.out.print("Ukuran: ");
                String ukuran = zh.nextLine();
                System.out.print("Harga: ");
                double harga = zh.nextDouble();

                Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
                pilih = zh.next().charAt(0);
                zh.nextLine();
                stk.push(p);
            }while(pilih == 'y');
                if (pilih== 'n'){
            }
                break;
            case 2:
            stk.pop();
                break;
            case 3:
            stk.peek();
                break;
            case 4:
            stk.print();
                break;
            case 5:
            stk.getMin();
                break;
            case 6:
            ulang = false;
            default:
            System.out.println("------Selesai-----");
                break;
            }
        } while(ulang);
    }
}
