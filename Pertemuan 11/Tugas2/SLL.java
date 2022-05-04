package Tugas2;

public class SLL {
    Node2 head; 
    Node2 tail; 
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void print(){
        if(!isEmpty()){
            Node2 tmp = head;
            System.out.println("Isi Linked List: ");
            while (tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Lingked list kosong");
        }
    }
    
    public void addFirst(String input) {
        Node2 ndInput = new Node2(input,null);
        if (isEmpty()){ 
            head = ndInput; 
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    public void addLast(String input){
        Node2 ndInput = new Node2(input, null);
        if(isEmpty()){
            head = ndInput; 
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    
    public void insertAfter(String key, String input){
        Node2 ndInput = new Node2(input, null);
        Node2 temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next==null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    
    
    public void insertAt(int index, String input){
        if(index < 0){
            System.out.println("Indeks Salah");
        } else if (index == 0){
            addFirst(input);
        } else {
            Node2 temp = head;
            for (int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node2(input, temp.next);
            if(temp.next.next==null) tail = temp.next;
        }
    }
}
