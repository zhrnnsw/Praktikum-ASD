package Praktikum;

public class Mahasiswa {
    String nim, nama, notelp;

    public Mahasiswa(){

    }

    public Mahasiswa(String nim, String nama, String notelp){
        this.nama = nama;
        this.nim = nim;
        this.notelp = notelp;
    }

    @Override
    public String toString(){
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
}
