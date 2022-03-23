package minggu5;
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        
        System.out.println("========================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah Perusahaan :");
        int n = zh.nextInt();
        Sum[] prs = new Sum[n];
        for(int i = 0; i<n; i++){
            System.out.println("Perusahaan ke-"+(i+1));
            System.out.print("Masukkan jumlah bulan : ");
            int elm = zh.nextInt();
            prs[i] = new Sum(elm);
            
        }
        System.out.println("========================================================================");
        for(int i=0; i<prs.length; i++){
            for(int j=0; j<prs[i].elemen; j++){
            System.out.print("Masukkan untung bulan ke-"+(j+1)+" perusahaan ke-"+(i+1)+" = ");
            prs[i].keuntungan[j]=zh.nextDouble();
            }
            System.out.println();
        }

        System.out.println("========================================================================");
        System.out.println("Algoritma Brute Force");
        for(int i=0; i<prs.length; i++){
        System.out.printf("Total keuntungan perusahaan ke-"+(i+1)+ " selama "+ prs[i].elemen+ " bulan adalah = %.2f",prs[i].totalBF(prs[i].keuntungan));
        System.out.println();
        }
        System.out.println("========================================================================");
        System.out.println("Algoritma Devide and Conquar");
        for(int i=0; i<prs.length; i++){
        System.out.printf("Total keuntungan perusahaan ke-"+(i+1)+ " selama "+ prs[i].elemen+ " bulan adalah = %.2f",prs[i].totalDC(prs[i].keuntungan,0,prs[i].elemen-1));
        System.out.println();
        }
    }
    
}
