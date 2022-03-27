package penjualanTiket;

public class tiketService {
    tiket[] tikets = new tiket[8];
    int idx;

    void tambah(tiket t){
        if(idx<tikets.length){
            tikets[idx] = t;
            idx++;
        }else{
            System.out.println("Daaftar sudah penuh!");
        }
    }

    void tampilAll(){
        for(tiket t : tikets){
            System.out.println(t.maskapai);
            System.out.println(t.asal+" - "+t.tujuan);
            System.out.println("Harga : Rp."+t.harga);
            System.out.println();
        }
    }

    void bubbleShort(){  //ascending, kecil ke besar
        for(int i=0; i<tikets.length-1;i++){
            for(int j=1; j<tikets.length-1; j++){
                if(tikets[j].harga>tikets[j-1].harga){
                    tiket tmp = tikets[j];
                    tikets[j] = tikets[j-1];
                    tikets[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){ //descending
        for(int i=0; i<tikets.length-1; i++){
            int idxMax = i;
            for(int j=i+1; j<tikets.length; j++){
                if(tikets[j].harga > tikets[idxMax].harga){
                    idxMax = j;
                }
            }
            tiket tmp = tikets[idxMax];
            tikets[idxMax] = tikets[i];
            tikets[i] = tmp;
        }
    }
}
