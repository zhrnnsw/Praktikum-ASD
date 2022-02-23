import java.util.Scanner;
import java.security.DrbgParameters.NextBytes;
import java.util.Arrays;
public class Tugas1 {
    public static void main(String[] args) {
        int total = 0;
        int tarif = 4500;
        Scanner zh = new Scanner (System.in);
        String pelanggan[][] = {{"Ani", "4"}, {"Budi", "15"}, {"Bina", "6"}, {"Cita", "11"}}; //baris untuk nama dan kolom untuk berat (kg)
        System.out.println("=========================");
        System.out.println("      SMILE LAUNDRY      ");
        System.out.println("=========================");
        System.out.println("DAFTAR PELANGGAN");
        for(int i = 0; i<4; i++){
        System.out.println(pelanggan[i][0]+ " => "+ pelanggan[i][1]+ " kg");
        }
        for(int i = 0; i<4; i++){
            int berat = Integer.parseInt(pelanggan[i][1]);
            if (berat > 10){
                berat *= 0.5;
            }
            total += berat * tarif;
        }

        System.out.println("Total Pendapatan : " + total);
    }
}
