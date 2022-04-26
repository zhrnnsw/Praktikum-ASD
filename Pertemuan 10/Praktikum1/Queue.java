package Praktikum1;

import java.net.IDN;

public class Queue {

    int data[];
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan : " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(int n) {
        if(!IsEmpty()){
            int id = -1;
            int posisi;
            for(int i = 0; i < max; i++){
                if(data[i] == n){
                    id = i;
                    break;
                }
            }
            if(id != -1){
                if(rear>=front){
                    posisi = (id+1) - front;
                    System.out.print(n + " ditemukan pada antrian ke " + posisi);
                }else if(rear<front){
                    posisi = max + (id+1) - front;
                    System.out.print(n + " ditemukan pada antrian ke " + posisi);
                }else if(id == rear){
                    System.out.print(n + " ditemukan pada antrian terakhir");   
                }
                System.out.println(" indeks ke-"+ id);
            }else{
                System.out.println(n + " tidak ditemukan pada antrian ");
            }
            
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void peekAt(int posisi) {
        int id;
        if (!IsEmpty()){
            if (rear >= front){
            id = posisi - 1;
            }else {
                id = posisi + front -1;
                if(id>max){
                    id -= max;
                }
            }
            System.out.println("Pada antrian ke-" + posisi + "(indeks "+ id+" )"+ "terdapat data : " + data[id]);
        } else {
            System.out.println("Queue masih kosong"); 
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt) {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
    }

    public int Dequeue() {
        int dt = 0;
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    rear++;
                }
            }
        return dt;
    }
}