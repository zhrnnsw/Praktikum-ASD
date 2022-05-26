package tugas1;

public class NodeV {
    NodeV prev, next;
    String nama;
    int noAntrian;

    NodeV(NodeV prev,  String nama, int noAntrian, NodeV next){
        this.noAntrian = noAntrian;
        this.nama = nama;
        this.prev = prev;
        this.next = next;
    }
}
