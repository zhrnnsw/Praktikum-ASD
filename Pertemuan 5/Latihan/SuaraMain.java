package Latihan;
import java.util.Scanner;
public class SuaraMain {
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);

        System.out.print("Masukkan jumlah kandidat: ");
        int n = zh.nextInt();
        zh.nextLine();
        Suara mayoritas = new Suara(n);
        
        for(int i=0; i< mayoritas.hasilPemilihan.length; i++){
            System.out.print("Masukkan hasil pemilihan suara kandidat ke-"+(i+1)+" : ");
            mayoritas.hasilPemilihan[i] = zh.nextLine();
        }
        System.out.println("Mayoritas suara terbanyak yang diperoleh adalah: "+ mayoritas.cariMayoritas(mayoritas.hasilPemilihan, 0, mayoritas.hasilPemilihan.length-1));
    }

    
}
