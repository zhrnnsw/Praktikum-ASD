package BruteForceDivideConquer;
import java.util.Scanner;
public class MainFaktorial {
    public static void main(String[] args) {
        long awal = System.currentTimeMillis();
        
        Scanner zh = new Scanner(System.in);
        System.out.println("==========================================================================");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int elemen = zh.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for(int i = 0; i< elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai =zh.nextInt();
        }
        
        System.out.println("=============================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        long awalBF = System.currentTimeMillis();
        for(int i = 0; i < elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah "+fk[i].faktorialBF(fk[i].nilai));
        }
        long akhirBF = System.currentTimeMillis();
        long waktuBF = akhirBF - awalBF;
        System.out.println("Interval Waktu Brute Force: "+ String.valueOf(waktuBF)+" milidetik");
        System.out.println();
        System.out.println("=============================================");
        long awalDC = System.currentTimeMillis();
        System.out.println("Hasil Faktorial dengan Devide and Conquer");
        for(int i = 0; i< elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah "+fk[i].faktorialDC(fk[i].nilai));
        }
        long akhirDC = System.currentTimeMillis();
        long waktuBDC = akhirDC - awalDC;
        System.out.println("Interval Waktu Divide and Conquer: "+ String.valueOf(waktuBF)+" milidetik");
        System.out.println("=============================================");
        
        long akhir = System.currentTimeMillis();
        System.out.println("Waktu akhir :"+ String.valueOf(akhir)+" milidetik");

       
    }
}
