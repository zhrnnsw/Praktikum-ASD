package minggu5;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = zh.nextInt();
        Pangkat[] png = new Pangkat[elemen];
        System.out.println();

        for(int i = 0; i<elemen; i++){
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            int n = zh.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-"+(i+1)+" : ");
            int p = zh.nextInt();
            png[i]= new Pangkat(n,p);
        }
        System.out.println("=============================================");
        System.out.println("Menu Hitung");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        int menu = zh.nextInt();
        System.out.println("=============================================");
        switch (menu) {
            case 1:
                for (int i = 0; i<elemen; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+ png[i].pangkat+" adalah "+png[i].PangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            
            case 2:
            for (int i=0; i<elemen; i++){
                System.out.println("Nilai "+png[i].nilai+" pangkat "+ png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
        
            default:
                System.out.println("Menu tidak tersedia");
                break;
        }
    }
}
