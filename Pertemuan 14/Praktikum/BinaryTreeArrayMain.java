package Praktikum;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);
        System.out.println();
        System.out.println();

        System.out.println("   TUGAS 5");
        bta.add(8);
        bta.add(15);
        bta.add(18);
        bta.traversePreOrder(0);
        System.out.println();
        bta.traverseInOrder(0);
    }
}
