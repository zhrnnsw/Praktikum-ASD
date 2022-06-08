package Praktikum;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BinaryTree {
    Node root;
    int jmlLeaf;

    public BinaryTree(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

    void add(int data){
        if(isEmpty()){ //tree kosong
            root = new Node(data);
        }else{
            Node current = root;
            while(true){
                if(data < current.data){
                    if(current.left != null){
                        current = current.left;
                    }else{
                        current.left = new Node(data);
                        break;
                    }
                }else if(data>current.data){
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                }else{ //data sudah ada
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean hasil = false;
        Node current = root;
        while(current != null){
            if(current.data == data){
                hasil = true;
                break;
            }else if(data < current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(Node node){
        if (node != null){
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" "+ node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del){ // del = anak
        Node successor = del.right;
        Node successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        } 
        return successor;
    }

    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree kosong");
            return;
        }
        //mencari node (current) yang akan di hapus
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){
                break;
            }else if(data<current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if (data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //deletion
        if(current == null){
            System.out.println("Tidak dapat menemukan data!");
            return;
        }else{
            //jika tidak ada child, simply delete it
            if(current.left == null && current.right == null){
                if(current==root){
                    root = null;
                }else{
                    if(isLeftChild){ // jika ada 1 child (left) 
                        parent.left = null;  
                    } else { 
                        parent.right = null; 
                    } 
                }
            }else if(current.left==null){//jika ada 1 child (right)
                if(current==root){
                    root = current.right;
                }else{
                    if(isLeftChild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right == null){//jika ada 1 child (left)
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                        parent.left = parent.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{//jika ada 2 child
                Node successor = getSuccessor(current);
                if(current == root){
                    root = successor;
                }else{
                    if(isLeftChild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    public static Node insert(Node current, int data)
    {
        if (current.left == null && current.right == null) {
            if (data< current.data){
                current.left = new Node(data);
            }else if (data > current.data){
                current.right = new Node(data);
            }
        }
        if (data< current.data) {
            current.left = insert(current.left, data);
        }
        if (data > current.data){
            current.right = insert(current.right, data);
        }
        return current;
    }

    void BigValue(Node node){
        Node current = root;
        
        while (current.left != null){
            current = current.left;
        }
        System.out.print("" + current.data);
    }

    void SmallValue(Node node){
        Node current = root;
        
        while(current.right != null){
            current = current.right;
        }
        System.out.println("" + current.data);
    }

    void printleaf(Node node){
        if (node == null) 
        return; 

        printleaf(node.left); 
        if(node.left == null && node.right == null){
            System.out.print(" "+node.data);
        }
        printleaf(node.right);
    }

    int hitungLeaf(Node node){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return 1;
        }else{
            return hitungLeaf(node.left) + hitungLeaf(node.right);
        }
        
    }
    int hitungLeaf(){
        return hitungLeaf(root);
    }

    //kalau ada return harus dipanggil lewat system out print
}
