
package Tugas2;

public class SLLMain {
    public static void main(String[] args){
        
        SLL sl = new SLL();
        
        sl.addFirst("a");
        sl.print();
        sl.insertAfter("a", "b");
        sl.print();
        sl.insertAt(2, "c");
        sl.print();
        sl.addLast("e");
        sl.print();
        sl.insertAt(3, "d");
        sl.print();
        
    }
}
