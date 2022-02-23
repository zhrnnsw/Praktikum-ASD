import java.util.Scanner;
public class Tugas2 {
    
    static double kecepatan(){
        Scanner zh = new Scanner(System.in);
        System.out.println("Masukkan jarak (m): ");
        int s = zh.nextInt();
        System.out.println("Masukkan waktu (s) : ");
        int t = zh.nextInt();
        double v = s / t;
        return v;
    }

    static double jarak(){
        Scanner zh = new Scanner(System.in);
        System.out.println("Masukkan kecepatan (m/s) : ");
        int v = zh.nextInt();
        System.out.println("Masukkan waktu (s): ");
        int t = zh.nextInt();
        double s = v * t;
        return s;
    }

    static double waktu(){
        Scanner zh = new Scanner(System.in);
        System.out.println("Masukkan jarak (m): ");
        int s = zh.nextInt();
        System.out.println("Masukkan kecepatan (m/s): ");
        int v = zh.nextInt();
        double t = s / v;
        return t;
    }
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("    PROGRAM HITUNG RUMUS    ");
        System.out.println("============================");

        System.out.println("MENU PENGHITUNGAN");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.print("Rumus yang akan di hitung (1-3): ");
        int a = zh.nextInt();
        double hasil = 0;
        if(a==1){
            hasil = kecepatan();
        } else if (a==2){
            hasil = jarak();
        } else if (a==3){
            hasil = waktu();
        } else {
            System.out.println("Inputan tidak sesuai");
        }
       
        System.out.println("Hasil perhitungan : " + hasil);
    }
}
