public class bola {
    int jari2;
    double phi = 3.14;
    bola(){
        System.out.println("Bola");
    }

    bola(int r){
        jari2 = r;
    }

    double luas(){
        return 4*phi*jari2*jari2;
    }

    double volume(){
        return 4/3*phi*jari2*jari2*jari2;
    }

    void tampil(){
        System.out.println("Jari-jari : "+jari2);
        System.out.println("Luas Permukaan : " + luas());
        System.out.println("Volume : " + volume());
    }
}
