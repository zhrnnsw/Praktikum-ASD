package Praktikum;

import javax.print.attribute.standard.Destination;

public class Graph {
    int vertex;
    LinkedLists list[];

    public Graph(int vertex){
        this.vertex = vertex;
        list = new LinkedLists[vertex];
        for (int i = 0; i < vertex; i++){
            list[i] = new LinkedLists();
        }
    }

    public void addEdge(int source, int destination){
        //add edge
        list[source].addFirst(destination);
        //add back edge (for undirected)
        list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception{
        if(graphType()){
            //degreee indirected graph
            System.out.println("degree vertex "+source + " :  "+list[source].size());
        }else{
           //degree directed graph
            //in degree
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++){
                for (int j = 0; j < list[i].size(); j++){
                    if(list[i].get(j)==source)
                        ++totalIn;
                }
                //out degree
            for (k=0; k<list[source].size(); k++){
                list[source].get(k);
            }
            totalOut = k;
            } 
            System.out.println("Indegree dari vertex "+source+" : "+totalIn);
            System.out.println("Outdegree dari vertex "+source+" : "+totalOut);
            System.out.println("degree vertex "+source+" : "+(totalIn+totalOut));
        }
        
        
    }

    public void removeEdge(int source, int destination) throws Exception{
        for(int i=0; i < vertex; i++){
            if(i == destination){
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdge(){
        for(int i=0; i<vertex; i++){
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception{
        String kota=" ";
        for(int i = 0; i<vertex; i++){
            if(list[i].size()>0){
                if (i==1){
                    kota = "Malang";
                }else if(i==2){
                    kota = "Surabaya";
                }else if(i==3){
                    kota ="Gresik";
                }else if(i==4){
                    kota ="Bandung";
                }else if(i==5){
                    kota = "Banyuwangi";
                }
                System.out.print("Vertex "+ kota + " terhubung dengan: ");
            for(int j = 0; j<list[i].size(); j++){
                if (list[i].get(j)==1){
                    kota = "Malang";
                }else if(list[i].get(j)==2){
                    kota = "Surabaya";
                }else if(list[i].get(j)==3){
                    kota ="Gresik";
                }else if(list[i].get(j)==4){
                    kota ="Bandung";
                }else if(list[i].get(j)==5){
                    kota = "Banyuwangi";
                }
                System.out.print(kota+", ");
            }
            System.out.println("");
            }
        }
        System.out.println(" ");
    }

    public boolean graphType() throws Exception{
        int a = 0, h = 0;
        for(int z=0; z<vertex;z++){
            int k, totalIn = 0, totalOut = 0;
            for (int i = 0; i < vertex; i++){
                for (int j = 0; j < list[i].size(); j++){
                    if(list[i].get(j)==z)
                        ++totalIn;
                }
                //out degree
            for (k=0; k<list[z].size(); k++){
                list[z].get(k);
            }
            totalOut = k;
            }
            a = totalIn;
            h = totalOut;
        }
        if (a == h){
            return true;//indirect
        }else return false;
    }

    public void print() throws Exception{
        String kota=" ";
        for(int i=0; i<vertex; i++){
            try{
                if(list[i].size() > 0){
                    if (i==1){
                        kota = "Malang";
                    }else if(i==2){
                        kota = "Surabaya";
                    }else if(i==3){
                        kota ="Gresik";
                    }else if(i==4){
                        kota ="Bandung";
                    }else if(i==5){
                        kota = "Banyuwangi";
                    }
                }
            }
            finally{
                System.out.println("Baris di dalam finally akan dieksekusi");
            }
        }
    }
}
