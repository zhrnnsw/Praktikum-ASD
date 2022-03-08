import java.util.Scanner;
public class bangunRuangMain {
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        int s, r, t, n;
 //kubus 
        System.out.println("--------------------------------------");
        System.out.println("                KUBUS");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.print("Masukkan banyak Kubus : ");
        n = zh.nextInt();
        kubus[] kb = new kubus[n];
        for (int i=0; i<kb.length; i++){
            System.out.println("Kubus ke-"+(i+1));
            System.out.print("Masukkan sisi : ");
            s = zh.nextInt();
            kb[i] = new kubus(s); 
        }
        System.out.println();
        for (int i=0; i<kb.length; i++){
            System.out.println("Kubus ke-"+(i+1));
            kb[i].tampil();
        }
        System.out.println();
//tabung
        System.out.println("--------------------------------------");
        System.out.println("               TABUNG");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.print("Masukkan banyak Tabung : ");
        n = zh.nextInt();
        tabung[] tb = new tabung[n];
        for (int i=0; i<tb.length; i++){
        System.out.println("Tabung ke-"+(i+1));
        System.out.print("Masukkan jari-jari : ");
        r = zh.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = zh.nextInt();
        tb[i] = new tabung (r,t);
        }
        System.out.println();
        for (int i=0; i<tb.length; i++){
            System.out.println("Tabung ke-"+(i+1));
            tb[i].tampil();
        }
        System.out.println();
//bola
        System.out.println("--------------------------------------");
        System.out.println("                 BOLA");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.print("Masukkan banyak Bola : ");
        n = zh.nextInt();
        bola[] b = new bola[n];
        for (int i=0; i<b.length; i++){
        System.out.println("Bola ke-"+(i+1));
        System.out.print("Masukkan jari-jari : ");
        r = zh.nextInt();
        b[i] = new bola(r);
        }
        System.out.println();
        for (int i=0; i<b.length; i++){
            System.out.println("Bola ke-"+(i+1));
            b[i].tampil();
        }

    }
}
