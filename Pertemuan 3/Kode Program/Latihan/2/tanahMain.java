import java.util.Scanner;
public class tanahMain {
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        int n, p, l; 
        int terluas = 0;
        String simpan = " ";

        System.out.print("Masukkan jumlah tanah : ");
        n = zh.nextInt();
        tanah[] th = new tanah[n];
        System.out.println();
        for (int i=0; i<th.length; i++){
            System.out.println("Tanah ke-"+(i+1));
            System.out.print("Panjang : ");
            p = zh.nextInt();
            System.out.print("Lebar : ");
            l = zh.nextInt();
            th[i] = new tanah(p,l); 
        }
        System.out.println();
        for (int i=0; i<th.length; i++){
            System.out.println("Luas tanah ke-"+(i+1)+" : "+ th[i].luas());
        }
        System.out.println();
        for (int i=0; i<th.length; i++){
            if (th[i].luas()>terluas){
                simpan = "Tanah " +(i+1);
            }
        }
        System.out.println("Tanah terluas : "+simpan);
    }}
