package Praktikum;
import java.util.Scanner;
public class GraphMain {
    public static void main(String[] args) throws Exception{
        Scanner zh = new Scanner(System.in);
        Graph graph = new Graph(6);

        System.out.print("Masukkan Vertex: ");
        int vertex = zh.nextInt();

        System.out.print("Masukkan Edge: ");
        int edge = zh.nextInt();
        System.out.println("==========================");
        System.out.println("1 = Malang");
        System.out.println("2 = Surabaya");
        System.out.println("3 = Gresik");
        System.out.println("4 = Bandung");
        System.out.println("5 = Banyuwangi");
        System.out.println("==========================");
        for(int i=0; i<edge; i++){
            System.out.print("Masukkan Source: ");
            int source = zh.nextInt();
            System.out.println();
            System.out.print("Masukkan Destination: ");
            int desti= zh.nextInt();

            graph.addEdge(source,desti);
            graph.printGraph();
        }
        
        graph.degree(2);
        System.out.println("");

        graph.removeEdge(2,1);
        graph.printGraph();
    }
}
