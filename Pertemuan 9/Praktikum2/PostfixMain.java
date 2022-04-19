package Praktikum2;
import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        String P,Q;
        System.out.println("Masukkan ekspresi matematika (inflix)");
        Q = zh.nextLine();
        Q = Q.trim(); // untuk menghapus spasi didepan atau dibelakang teks
        Q = Q + ")";

        int total = Q.length();
        Postfix post = new Postfix(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
