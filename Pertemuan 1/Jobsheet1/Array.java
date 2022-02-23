import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        String bunga[] = {"Algonema", "Keladi", "Alocasia", "Mawar"};
        int harga[] = {75000, 50000, 60000, 10000};
        int stock[][] = {{10, 5, 15, 7},
                    {6, 11, 9, 12},
                    {2, 10, 10, 5},
                    {5, 7, 12, 9}};
        int total = 0;

        System.out.println("===================");
        System.out.println("   Royale Garden   ");
        System.out.println("===================");
        System.out.println("Nama Bunga :");
        System.out.println("1. Algonema");
        System.out.println("2. Keladi");
        System.out.println("3. Alocasia");
        System.out.println("4. Mawar");
        System.out.print("Cek Stok Bunga (1-4) : ");
        int bng = zh.nextInt();
        switch(bng){
            case 1 :
                int stok1 = 0;
                for(int i=0; i<4; i++){
                stok1 += stock[i][0];
                }
                System.out.println("Total stok bunga " + bunga[bng-1]+" di seluruh cabang : "+ stok1);
                break;
            case 2 :
                int stok2 = 0;
                for(int i=0; i<4; i++){
                stok2 += stock[i][1];
                }
                System.out.println("Total stok bunga " + bunga[bng-1]+" di seluruh cabang : "+ stok2);
                break;
            case 3 :
                int stok3 = 0;
                for(int i=0; i<4; i++){
                stok3 += stock[i][2];
                }
                System.out.println("Total stok bunga " + bunga[bng-1]+" di seluruh cabang : "+ stok3);
                break;
            case 4 :
                int stok4 = 0;
                for(int i=0; i<4; i++){
                stok4 += stock[i][3];
                }
                System.out.println("Total stok bunga " + bunga[bng-1]+" di seluruh cabang : "+ stok4);
                break;
            default :
                System.out.println("Pilihan tidak sesuai");
        }
        System.out.println("==================================");
        System.out.println("Pengurangan stok cabang RoyalGarden 1 ");
        System.out.println("==================================");
        for(int i=0; i<4; i++){
            System.out.print(bunga[i] + " : ");
            int a =zh.nextInt();
            stock[0][i] -= a;
        }
        System.out.println("==================================");
        System.out.println("Stok Cabang RoyalGarden1 ");
        System.out.println("==================================");
        for(int i=0; i<4; i++){
            total += stock[0][i]*harga[i];
            System.out.println(bunga[i]+ " : " + stock[0][i]);
            
        }

        System.out.println("Total pendapatan  RoyalGarden 1 jika semua bunga terjual habis adalah "+ total);
    }
    
}
