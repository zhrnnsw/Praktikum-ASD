package tugas2;

public class nodeF {
    film data;
    nodeF prev,next;

    nodeF(nodeF prev, film d, nodeF next){
        this.data = d;
        this.prev = prev;
        this.next = next;
    }
}
