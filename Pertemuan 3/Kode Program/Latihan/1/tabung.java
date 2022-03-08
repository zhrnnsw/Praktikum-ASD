public class tabung {
    int jari2, tinggi;
    double phi = 3.14;

    tabung (){
       System.out.println("Tabung"); 
    }

    tabung (int r, int t){
        jari2 = r ;
        tinggi = t;
    }

    double luas(){
        double lSelimut = 2*phi*jari2*tinggi;
        double lLingkaran = 2*phi*jari2*jari2;
        return lSelimut*lLingkaran;
    }

    double volume(){
        return phi*jari2*jari2*tinggi;
    }

    void tampil(){
        System.out.println("Jari-jari : "+jari2);
        System.out.println("Tinggi : "+tinggi);
        System.out.println("Luas Permukaan : " + luas());
        System.out.println("Volume : " + volume());
    }
}
