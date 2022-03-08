package ArraySegitiga;

public class Segitiga {
    public int alas;
    public int tinggi;
    public int sisi;

    Segitiga( int a, int t){
        alas = a;
        tinggi = t;
    }

    double hitungLuas(){
        return 0.5*alas*tinggi;
    }

    double hitungKeliling(){
        return alas+alas+alas;
    }
}
