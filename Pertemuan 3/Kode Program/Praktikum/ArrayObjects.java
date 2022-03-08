import java.util.Scanner;
public class ArrayObjects {
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        System.out.print("Masukkan banyak persegi panjang: ");
        int n = zh.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[n];

        ppArray[0] = new PersegiPanjang();
        for (int i=0; i<ppArray.length; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-"+i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = zh.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = zh.nextInt();
        }
        System.out.println();
        for (int i=0; i<ppArray.length; i++){
            System.out.println("Persegi Panjang ke-"+i);
            System.out.println("Panjang: "+ ppArray[i].panjang + ", lebar: "+ ppArray[i].lebar);
        }
        System.out.println();
        PersegiPanjang[][] ddArray = new PersegiPanjang[2][2];
        ddArray[0][1] = new PersegiPanjang();
        ddArray[0][1].panjang = 112;
        ddArray[0][1].lebar = 39;

        System.out.println("Persegi Panjang Array 2 Dimensi, panjang: " + ddArray[0][1].panjang + ", lebar " + ddArray[0][1].lebar);
    }
}
