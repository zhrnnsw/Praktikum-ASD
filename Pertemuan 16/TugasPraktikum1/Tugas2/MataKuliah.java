package TugasPraktikum1.Tugas2;

public class MataKuliah {
    String kdMk, namaMk, sks;

    public MataKuliah(String kdMk, String namaMk, String sks){
        this.kdMk = kdMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }

    public String toString(){
        return String.format("%s\t%-40s%s", kdMk, namaMk, sks);
    }
}
