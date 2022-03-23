package Latihan;


public class Suara{
    String[] hasilPemilihan;

    Suara(int n){
        hasilPemilihan = new String[n];
    }
    
    public String cariMayoritas(String[] hasilPemilihan, int f, int l) {
        if (f == l) {
            return hasilPemilihan[f];
        } else {
            int mid = (f + l) / 2;
            String temp1 = cariMayoritas(hasilPemilihan, f, mid);
            String temp2 = cariMayoritas(hasilPemilihan, mid + 1, l);
            String nm = "No Mayoritas";
            if (temp1.equalsIgnoreCase(nm)) return temp2;
            if (temp2.equalsIgnoreCase(nm)) return temp1;
            return (temp1.equalsIgnoreCase(temp2) ? temp1 : nm);
        }
        
    }
}