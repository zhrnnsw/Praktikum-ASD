package tugas1;

import doubleLinkedLists.Node;

public class QDLL {
    NodeV front, rear;
    int size;

    public QDLL(){
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void enqueue(String nm, int noA){
        if(isEmpty()){
            rear = new NodeV(null, nm, noA, null);
            front = rear;
        }else{
            NodeV current = front;
            while(current.next != null){
                current = current.next;
            }
            NodeV newNode = new NodeV(current, nm, noA, null);
            current.next = newNode;
            rear = current.next;
        }
        size++;
    }

    public void dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong!");
        }else{
            String tmp = front.nama;
            front = front.next;
            front.prev = null;
            size--;
            System.out.println(tmp +" telah selesai divaksinasi");
        }
        
    }

    public void print(){
        if(!isEmpty()){
            NodeV tmp = front;
            System.out.println("|No.\t|Nama\t|");
            while(tmp != null){
                System.out.println("|"
                +tmp.noAntrian+ "\t|" + tmp.nama +"\t|");
                tmp = tmp.next;
            }
            System.out.println("Sisa antrian: "+size);
        }else{
            System.out.println("Lingked Lists Kosong");
        }
    }
}
