package tugas2;
import java.util.Scanner;

public class dllMain {
    public static void main(String[] args) throws Exception {
        dll df = new dll();
        Scanner zh = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        boolean ulang = true;

        do {
            System.out.println("================================");
            System.out.println("     DATA FILM LAYAR LEBAR");
            System.out.println("================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Indeks Tertentu");
            System.out.println("4. Hapus Data Awal");
            System.out.println("5. Hapus Data Akhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("================================");

            int menu = zh.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.println("ID Film:");
                    int id = zh.nextInt();
                    System.out.println("Judul Film:");
                    String jud = sc.nextLine();
                    System.out.println("Rating Film:");
                    double rat = zh.nextDouble();
                    film f = new film(id, jud, rat);
                    df.addFirst(f);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.println("ID Film:");
                    int id2 = zh.nextInt();
                    System.out.println("Judul Film:");
                    String jud2 = sc.nextLine();
                    System.out.println("Rating Film:");
                    double rat2 = zh.nextDouble();
                    film f2 = new film(id2, jud2, rat2);
                    df.addLast(f2);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film ");
                    System.out.println("Indeks ke-");
                    System.out.println("ID Film:");
                    int id3 = zh.nextInt();
                    System.out.println("Judul Film:");
                    String jud3 = sc.nextLine();
                    System.out.println("Rating Film:");
                    double rat3 = zh.nextDouble();
                    System.out.println("Data Film ini akan masuk di indeks ke-");
                    int indeks = zh.nextInt();
                    film f3 = new film(id3, jud3, rat3);
                    df.add(f3, indeks);
                    break;
                case 4:
                    df.removeFirst();
                    break;
                case 5: 
                    df.removeLast();
                    break;
                case 6:
                    System.out.println("Masukkan indeks data film yang akan di hapus");
                    System.out.println("Indeks: ");
                    int ind = zh.nextInt();
                    df.remove(ind);
                    break;
                case 7:
                    System.out.println("Cetak Data");
                    df.print();
                    break;
                case 8:
                    System.out.println("Cari Data");
                    System.out.println("Masukkan ID Film yang dicari");
                    int idf = zh.nextInt();
                    film hasil = df.searching(idf);
                    System.out.println("IDENTITAS:");
                    System.out.println("\tID Film : "+hasil.id);
                    System.out.println("\tJudul Film : "+hasil.judul);
                    System.out.println("\tRating : "+hasil.rating);
                    break;
                case 9:
                    System.out.println("Data Terurut");
                    df.sorting();
                    
                    break;
                case 10:
                    ulang = false;
                    System.out.println("------SELESAI------");
                    break;
                default:
                    break;
            }
            
        } while (ulang);

    }
}
