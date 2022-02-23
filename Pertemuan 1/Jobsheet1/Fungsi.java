import java.util.Scanner;
import java.util.Arrays;
public class Fungsi {
    static String bunga[] = new String [4];
    static int harga[] = new int [4];
    static int stock[][] = new int [4][4];
    static int total = 0;

    public static void inisiasi(){
        bunga[0] = "Algonema"; 
        bunga[1] = "Keladi";
        bunga[2] = "Alocasia";
        bunga[3] = "Mawar";

        harga[0] = 75000;
        harga[1] = 50000;
        harga[2] = 60000;
        harga[3] = 10000;

        stock[0][0] = 10;
        stock[0][1] = 5;
        stock[0][2] = 15;
        stock[0][3] = 7;

        stock[1][0] = 6;
        stock[1][1] = 11;
        stock[1][2] = 9;
        stock[1][3] = 12;

        stock[2][0] = 2;
        stock[2][1] = 10;
        stock[2][2] = 10;
        stock[2][3] = 5;
                    
        stock[3][0] = 5;
        stock[3][1] = 7;
        stock[3][2] = 12;
        stock[3][3] = 9;
    }
    static void cekStok() {
        int stok1 = 0;
            for(int i=0; i<4; i++){
                for(int j=0; j<4; j++){
                 stok1 += stock[i][j];   
                }
                System.out.println("Total stok bunga " + bunga[i]+" di seluruh cabang : "+ stok1);
            }
              
    }
    static void pengurangan(){
        System.out.println("==================================");
        System.out.println("Pengurangan stok cabang RoyalGarden 1 ");
        System.out.println("==================================");
        int a[] = { 1, 2, 0, 5};
        for(int i=0; i<4; i++){
            System.out.print(bunga[i] + " : ");
            stock[0][i] -= a[i] ;
            System.out.println(bunga[i] + " -" + a[i] );
        }
    }
    static void pendapatan(){
        System.out.println("==================================");
        System.out.println("     Stok Cabang RoyalGarden1 ");
        System.out.println("==================================");
        for(int i=0; i<4; i++){
            total += stock[0][i]*harga[i];
            System.out.println(bunga[i]+ " : " + stock[0][i]);  
        }
        System.out.println("Total pendapatan  RoyalGarden 1 jika semua bunga terjual habis adalah "+ total);
    }
    public static void main(String[] args) {
        inisiasi();
        System.out.println("===================");
        System.out.println("   Royale Garden   ");
        System.out.println("===================");
        cekStok();
        pengurangan();
        pendapatan();
    }
    
    
}
