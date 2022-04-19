package StrukBelanja;

public class stack {
    int size;
    int top;
    struk data[];

    public stack(int size){
        this.size = size;
        data = new struk[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if (top == -1){
            return true;
        }else {
            return false;
        }
    }

    public boolean IsFull(){
        if (top == size - 1){
            return true;
        }else {
            return false;
        }
    }

    public void push(struk s){
        if(!IsFull()){
            top++;
            data[top] = s;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop(){
        if (!IsEmpty()){
            struk s = data[top];
            top--;
            System.out.println("Data yang keluar: " + s.noTransaksi + " " +s.tanggal+" "+s.jmlBarang+" " +s.totalHarga);
        }
    }

    public void peek(){
        System.out.println("Elemen teratas: "+ data[top].noTransaksi+" "+data[top].tanggal+" "+data[top].jmlBarang+" "+data[top].totalHarga);
    }

    public void print(){
        System.out.println("Isi stack: ");
        for(int i = top; i>=0; i--){
            System.out.println(data[i].noTransaksi+" "+data[i].tanggal+" "+data[i].jmlBarang+" "+data[i].totalHarga);
        }
        System.out.println();
    }

    public void clear(){
        if(!IsEmpty()){
            for(int i = top; i>=0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Stack masih kosong");
        }
    }

}
