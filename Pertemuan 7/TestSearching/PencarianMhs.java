package TestSearching;

public class PencarianMhs {
    int idx;
    int elemen;
    Mahasiswa listMhs[];

    public PencarianMhs(int jml){
        elemen = jml;
        listMhs = new Mahasiswa[elemen];
    }

    void tambah(Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx] = m;
            idx ++;
        }else{
            System.out.println("Data sudah penuh !");
        }
    }

    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("--------------------------");
        }
    }

    public int FindSeqSearch(String cari){
        int posisi = -1;
        for (int j=0; j<elemen; j++){
            if(listMhs[j].nama.equalsIgnoreCase(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch (int cari, int left, int right){
        int mid; // desc besar ke kecil (menurun)
        if(right >= left){
            mid = (left+right)/2;
            if(cari == listMhs[mid].nim){
                return mid;
            }else if (listMhs[mid].nim < cari){
                return FindBinarySearch(cari, left, mid -1);
            }else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    //algoritma sort desc
    public void insertionSort(){
        for(int i =1; i< listMhs.length; i++){
            Mahasiswa temp = listMhs[i];
            int j = i;
            while(j>0 && listMhs[j-1].nim < temp.nim){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    public void TampilPosisi(int pos){
        if(pos!=-1){
            System.out.println("data ditemukan pada indeks "+pos);
        }else{
            System.out.println("data tidak ditemukan");
        }
    }

    public void TampilData( int pos){
        if (pos!=-1){
            System.out.println("Nim\t : "+ listMhs[pos].nim);
            System.out.println("Nama\t : "+listMhs[pos].nama);
            System.out.println("Umur\t : "+listMhs[pos].umur);
            System.out.println("IPK\t : "+listMhs[pos].ipk);
        }else{
            System.out.println("data tidak ditemukan");
        }
    }
}
