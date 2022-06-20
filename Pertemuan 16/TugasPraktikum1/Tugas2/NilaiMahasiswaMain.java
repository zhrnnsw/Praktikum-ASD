package TugasPraktikum1.Tugas2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NilaiMahasiswaMain {
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        ArrayList<MataKuliah> mataKuliahs = new ArrayList<>();
        ArrayList<Nilai> nilais = new ArrayList<>();

        mahasiswas.add(new Mahasiswa("20001", "Thakhah" , "021xxx"));
        mahasiswas.add(new Mahasiswa("20002", "Zubair" , "021xxx"));
        mahasiswas.add(new Mahasiswa("20003", "Abdur-Rahman" , "021xxx"));
        mahasiswas.add(new Mahasiswa("20004", "Sa'ad" , "021xxx"));
        mahasiswas.add(new Mahasiswa("20005", "Sa'id" , "021xxx"));
        mahasiswas.add(new Mahasiswa("20006", "Ubaidah" , "021xxx"));
        mataKuliahs.add(new MataKuliah("00001", "Internet of Things", "3"));
        mataKuliahs.add(new MataKuliah("00002", "Algoritma Struktur Data", "2"));
        mataKuliahs.add(new MataKuliah("00003", "Algoritma dan Pemograman", "2"));
        mataKuliahs.add(new MataKuliah("00004", "Praktikum Algoritma Struktur Data", "3"));
        mataKuliahs.add(new MataKuliah("00005", "Praktikum Algoritma dan Pemograman", "3"));

        menu: while (true) {
            printMenu();
            System.out.print("Pilih: ");
            int pilih = zh.nextInt();
            zh.nextLine();
            switch (pilih) {
                case 1:
                    inputNilai(mahasiswas, mataKuliahs, nilais, zh);
                    break;
                case 2:
                    printNilai(nilais);
                    break;
                case 3:
                    findNilai(nilais, zh);
                    break;
                case 4:
                    nilais.sort((n1, n2) -> n1.nilai.compareTo(n2.nilai));
                    printNilai(nilais);
                    break;
                case 5:
                    break menu;
            }
        }
        zh.close();

    }
        
        static void printMenu(){
            System.out.println("************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("************************************************");
        }

        static void inputNilai(ArrayList<Mahasiswa> mahasiswas, ArrayList<MataKuliah> mataKuliahs, ArrayList<Nilai> nilais, Scanner zh){
            System.out.println("Masukkan data ");
            System.out.print("Nilai \t: ");
            double nilai = zh.nextDouble();
            zh.nextLine();

            //mencari mahasiswa
            System.out.println("\nDAFTAR MAHASISWA");
            System.out.println("************************************************");
            System.out.printf("%s\t%-15s\t%s\n", "NIM", "NAMA", "Telf");
            mahasiswas.forEach(mahasiswa -> System.out.println(mahasiswa));
            System.out.print("Pilih mahasiswa by nim: ");
            String nim = zh.nextLine();

            //cek ada tdknya mahasiswa
            mahasiswas.sort((m1, m2) -> m1.nim.compareTo(m2.nim));
            int idMahasiswa = Collections.binarySearch(mahasiswas, new Mahasiswa(nim, null, null), (m1, m2) -> {
                return m1.nim.compareTo(m2.nim);
            });
            if (idMahasiswa <0 ){
                System.out.println("Mahasiswa dengan nim tersebut tidak ditemukan\n");
                return;
            }
            String nama = mahasiswas.get(idMahasiswa).nama;

            //mencari mata kuliah
            System.out.println("\nDAFTAR MATA KULIAH");
            System.out.println("************************************************");
            System.out.printf("%s\t%-40s%s\n", "Kode", "Mata Kuliah", "SKS");
            mataKuliahs.forEach(mataKuliah -> System.out.println(mataKuliah));
            System.out.print("Pilih mata kuliah by kode: ");
            String kdMk = zh.nextLine();

            //cek ada tdknya mata kuliah
            mataKuliahs.sort((mk1, mk2) -> mk1.kdMk.compareTo(mk2.kdMk));
            int idMataKuliah = Collections.binarySearch(mataKuliahs, new MataKuliah(kdMk, null, null), (mk1, mk2) -> {
                return mk1.kdMk.compareTo(mk2.kdMk);
            });
            if (idMataKuliah <0 ){
                System.out.println("Mata kuliah dengan kode tersebut tidak ditemukan\n");
                return;
            }
            String namaMk = mataKuliahs.get(idMataKuliah).namaMk;
            String sks = mataKuliahs.get(idMataKuliah).sks;

            //tambah nilai
            nilais.add(new Nilai(nim, nama, namaMk, sks, nilai));
            System.out.println("Nilai berhasil ditambahkan\n");

        }

        static void printNilai(ArrayList<Nilai> nilais){
            System.out.println("\nDAFTAR NILAI MAHASISWA");
            System.out.println("************************************************");
            System.out.printf("%s\t%-15s\t%-40s%s\t%s\n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
            if(nilais.isEmpty())
                System.out.println("Belum ada nilai yang dimasukkan");
            nilais.forEach(nilai -> System.out.println(nilai));
            System.out.println();
        }

        static void findNilai(ArrayList<Nilai> nilais, Scanner zh){
            printNilai(nilais);
            System.out.print("Masukkan data mahasiswa[nim] : ");
            String nim = zh.nextLine();
            int sksTotal = 0;
            System.out.printf("%s\t%-15s\t%-40s%s\t%s\n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
            for (Nilai nilai : nilais){
                if(nilai.nim.equals(nim)){
                    System.out.println(nilai);
                    sksTotal += Integer.parseInt(nilai.sks);
                }
            }
            System.out.println("Total SKS "+ sksTotal + " telah diambil");
        }
        
}
