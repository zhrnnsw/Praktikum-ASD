package Tugas3;

public class StackMain{
    public static void main(String[] args){

        Stack st = new Stack();        
        st.print();
        st.push("Bahasa");
        st.print();
        st.push("Android");
        st.print();
        st.push("Komputer");
        st.print();
        st.push("Basis Data");
        st.print();
        st.push("Matematika");
        st.print();
        st.push("Algoritma");
        st.print();
        st.push("Statistika");
        st.print();
        st.push("Multimedia");
        st.print();
        st.peek();
        st.pop();
        st.print();
        st.clear();
        st.print();
    }
}
