package Tugas2;

import java.util.Scanner;

public class queue {
    String nim ;
    public mahasiswa[] antrian;
    int front, rear, size, max;

    queue (int n){
        max = n;
        antrian = new mahasiswa[max];
        size = 0;
        front = rear = -1; 
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        } else{
            return false;
        }
    }

    public boolean isFull(){
        if(size == max){
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(mahasiswa antri){
        if (isFull()){
            System.out.println("Queue telah penuh");
        } else {
            if(isEmpty()){
                front = rear = 0;
            }else {
                if(rear == max-1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size ++;
        }
    }

    public mahasiswa dequeue(){
        mahasiswa dt = new mahasiswa(null, null, 0, 0);
        if (isEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if(isEmpty()){
                front = rear = -1;
            }else{
                if(front == max-1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Queue masih kosong");
        } else{
            int i = front;
            while(i != rear){
                System.out.println(antrian[i].nim + " " + antrian[i].nama +" "+antrian[i].absen +" "+antrian[i].ipk);
                i = (i+1) % max;
            }
            System.out.println(antrian[i].nim + " " + antrian[i].nama +" "+antrian[i].absen +" "+antrian[i].ipk);
            System.out.println("Jumlah elemen = "+ size);
        }
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println("Elemen terdepan: "+ antrian[front].nim + " " + antrian[front].nama +" "+antrian[front].absen +" "+antrian[front].ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear(){
        if(!isEmpty()){
            System.out.println("Elemen terbelakang: "+ antrian[rear].nim + " " + antrian[rear].nama +" "+antrian[rear].absen +" "+antrian[rear].ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nim){
        if(!isEmpty()){
            int id = -1;
            int posisi;
            for(int i = 0; i < max; i++){
                if(antrian[i].nim.equals(nim)){
                    id = i;
                    break;
                }
            }
            if(id != -1){
                if(rear>=front){
                    posisi = (id+1) - front;
                    System.out.println(nim+ " ditemukan pada antrian ke " + posisi);
                }else if(rear<front){
                    posisi = max + (id+1) - front;
                    System.out.println(nim+ " ditemukan pada antrian ke " + posisi);
                }else if(id == rear){
                    System.out.println(nim+ " ditemukan pada antrian terakhir");   
                }

            }else{
                System.out.println(nim+ " tidak ditemukan pada antrian ");
            }
            
        }else{
            System.out.println("Queue masih kosong");
        }

    }

    public void printMahasiswa (int posisi){
        int id;
        if (rear >= front){
        id = posisi - 1;
        }else {
            id = posisi + front -1;
            if(id>max){
                id -= max;
            }
        }
        System.out.println(antrian[id].nim + " " + antrian[id].nama +" "+antrian[id].absen +" "+antrian[id].ipk);
    }
}
