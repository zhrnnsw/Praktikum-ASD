package Praktikum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");

        for(String fruit : fruits){
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n"+ fruits.toString());

        while(!fruits.empty()){
            System.out.printf("%s ", fruits.pop());
        }

        fruits.push("Melon");
        fruits.push("Durian");
       
        System.out.println("");
        for(Iterator<String> it = fruits.iterator(); it.hasNext();){
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }

        fruits.set(fruits.size()-1, "Strawberry");

        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ",e);
        });

        fruits.push("Manggo");
        fruits.push("Guava");
        fruits.push("Avocado");
        Collections.sort(fruits);
        System.out.println("");
        for(int i = 0; i<fruits.size(); i++){
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
