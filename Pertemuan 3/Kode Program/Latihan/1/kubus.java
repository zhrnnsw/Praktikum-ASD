public class kubus {
    int sisi;

    kubus(){
        System.out.println("Kubus");
    }

    kubus(int s){
        sisi=s;
    }

    int luas (){
        return 6*sisi*sisi;
    }

    int volume(){
        return sisi*sisi*sisi;
    }

    void tampil(){
        System.out.println("Sisi : "+ sisi);
        System.out.println("Luas Permukaan : " + luas());
        System.out.println("Volume : " + volume());
    }
}
