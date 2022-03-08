import java.util.Scanner;
public class mahasiswaMain {
    public static void main(String[] args) {
    Scanner zh = new Scanner(System.in);
    mahasiswa[] ms = new mahasiswa [3];
    String nm, nim;
    char jk;
    double ipk;

    for (int i=0; i<3; i++){
        System.out.println("Masukkan data mahasiswa ke-"+(i+1));
        System.out.print("Masukkan nama : ");
        nm = zh.next();
        System.out.print("Masukkan NIM : ");
        nim = zh.next();
        System.out.print("Masukkan jenis kelamin (L/P) : ");
        jk = zh.next().charAt(0);
        System.out.print("Masukkan IPK : ");
        ipk = zh.nextDouble();
        ms[i] = new mahasiswa(nm, nim, jk, ipk);
        System.out.println();
    }
    System.out.println();
    for (int i=0; i<3; i++){
        System.out.println("Data Mahasiswa ke-"+ (i+1));
        ms[i].tampilData();
    }
    }
}
