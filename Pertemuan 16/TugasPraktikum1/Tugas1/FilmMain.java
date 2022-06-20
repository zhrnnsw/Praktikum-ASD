package TugasPraktikum1.Tugas1;
import java.util.Scanner;
import java.util.Stack;

public class FilmMain {
    public static void menu(){
        System.out.println("=====================================");
        System.out.println("Data Film Layar Lebar Sepanjang Masa");
        System.out.println("=====================================");
        System.out.println("1. Input Judul Film");
        System.out.println("2. Hapus Data Film Teratas");
        System.out.println("3. Cek Judul Film Teratas");
        System.out.println("4. Info Semua Judul Film");
        System.out.println("5. Keluar");
        System.out.println("=====================================");
    }

    public static void inputFilm (Stack<Film> films, Scanner zh){
        System.out.print("ID Film: ");
        String idFilm = zh.nextLine();
        System.out.print("Judul Film: ");
        String judulFilm = zh.nextLine();
        System.out.print("Tahun Tayang: ");
        String tahunTayang = zh.nextLine();
        System.out.print("Director: ");
        String director = zh.nextLine();
        films.push(new Film(idFilm, judulFilm, tahunTayang, director));
    }
    public static void main(String[] args) {
        Scanner zh = new Scanner(System.in);
        Stack<Film> films = new Stack<>();

        mainLoop: while (true) {
            menu();
            System.out.print("Pilih: ");
            int pilih = zh.nextInt();
            zh.nextLine();
            switch (pilih) {
                case 1:
                    inputFilm(films, zh);
                    break;
                case 2:
                    if(!films.empty())
                        System.out.println(films.pop());
                    break;
                case 3:
                    if(!films.empty())
                        System.out.println(films.peek());
                    break;
                case 4:
                    films.stream().forEach(it -> {
                        System.out.println(it);
                    });
                    break;
                case 5:
                    break mainLoop;
            }
        }
        zh.close(); 
    }
}
