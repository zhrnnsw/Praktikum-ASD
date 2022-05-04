package Tugas3;
public class Stack{
    NodeS top;  
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public void print(){
        if(!isEmpty()){
            NodeS tmp = top;
            System.out.println("List Mata Kuliah: ");
            while (tmp != null){
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
    public void push(String input) {
        NodeS ndInput = new NodeS(input,null);
        if (isEmpty()){
            top = ndInput; 
        } else {
            ndInput.next = top;
            top = ndInput;
        }
    }
    
    public void peek(){
        System.out.println("Elemen teratas: "+ top.data);
    }

    public void pop(){
        if(!isEmpty()){
            NodeS temp = top;
            top = temp.next;
            top.next = temp.next.next;
            System.out.println("Data yang keluar : " + temp.data);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void clear(){
        if(!isEmpty()){
            NodeS temp = top;
            top = temp.next;
            top.next = temp.next.next;
        } else {
            System.out.println("Stack masih kosong");
        }
        
    }
}
