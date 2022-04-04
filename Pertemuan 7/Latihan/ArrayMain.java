package Latihan;

public class ArrayMain {
    public static void main(String[] args) {
        int data[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        Array arr = new Array(data);
        
        int jum = 10;
        int max = 0;
        
        System.out.println("-------------- DATA -------------");
        arr.tampil();
        arr.bubblesort();
        System.out.println();
        System.out.println("Setelah di sorting");
        arr.tampil();
        arr.nilaiTerbesar();
        arr.Searching(max, 0, jum - 1);
        arr.tampilPosisi(max);
    }

}
