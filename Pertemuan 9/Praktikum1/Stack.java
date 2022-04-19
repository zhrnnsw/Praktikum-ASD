package Praktikum1;


public class Stack {
    int size;
    int top;
    Pakaian data[];

    public Stack(int size){
        this.size = size;
        data = new Pakaian[size];
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

    public void push(Pakaian pkn){
        if(!IsFull()){
            top++;
            data[top] = pkn;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop(){
        if (!IsEmpty()){
            Pakaian p = data[top];
            top--;
            System.out.println("Data yang keluar: "+p.jenis + " " + p.warna + " " + p.merk + " " + p.ukuran + " " + p.harga);
        }
    }

    public void peek(){
        System.out.println("Elemen teratas: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }

    public void print(){
        System.out.println("Isi stack: ");
        for(int i = top; i>=0; i--){
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga);
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

    public void getMin(){
        int min = 0;
        for(int i = 1; i <= top; i++){
            while( data[min].harga > data[i].harga){
                min = i;
            }
        }
        System.out.println("Pakaian dengan harga terendah : ");
        System.out.println(data[min].jenis + " " + data[min].warna + " " + data[min].merk + " " + data[min].ukuran + " " + data[min].harga);
    }
}
