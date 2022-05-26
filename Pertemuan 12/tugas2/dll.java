package tugas2;

public class dll {
    nodeF head;
    int size;

    public dll(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(film item){
        if(isEmpty()){
            head = new nodeF(null, item, null);
        }else{
            nodeF newNode = new nodeF(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(film tmp){
        if(isEmpty()){
            addFirst(tmp);
        }else{
            nodeF current = head;
            while(current.next != null){
                current = current.next;
            }
            nodeF newNode = new nodeF(current, tmp, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(film item, int index) throws Exception{
        if(isEmpty()){
            addFirst(item);
        }else if(index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            nodeF current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            if (current.prev == null){
                nodeF newNode = new nodeF(null, item, current);
                current.prev = newNode;
                head = newNode;
            }else{
                nodeF newNode = new nodeF(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }else if(size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }else if(head.next == null){
            head = null;
            size--;
            return;
        }
        nodeF current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        }else if (index == 0){
            removeFirst();
        }else{
            nodeF current = head;
            int i = 0;
            while (i<index){
                current = current.next;
                i++;
            }
            if (current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Lingked Lists Kosong");
        }else{
            nodeF tmp = head;
            while(tmp != null){
                System.out.println("ID: " + tmp.data.id);
                System.out.println("\tJudul Film: "+ tmp.data.judul);
                System.out.println("\tRating Film: "+ tmp.data.rating);
                tmp = tmp.next;
            }
        }
    }

    public film searching (int id){
        nodeF tmp = head;
        for(int i = 0; i < size; i++){
            if(tmp.data.id == id){
                System.out.println("Data id film "+id+ " berada di node ke-"+i);
                break;
            }
            tmp = tmp.next;  
        }
        return tmp.data;
    }

    public void sorting() throws Exception{
        if (!isEmpty()) {
            film[] urut = new film[size];
            nodeF current = head;
            int counter = 0;
            // Store data from list to array
            while (true) {
                if (counter == size) break;
                urut[counter] = current.data;
                counter++;
                current = current.next;
            }
            // Sort array
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (urut[i].rating < urut[j].rating) {
                        film temp = urut[i];
                        urut[i] = urut[j];
                        urut[j] = temp;
                    }
                }
            }
            // Print array
            System.out.println("Cetak Data Film Berdasarkan Rating Desc");
            for (int i = 0; i < size; i++) {
                System.out.println("ID: " + urut[i].id);
                System.out.println("\tJudul Film: "+ urut[i].judul);
                System.out.println("\tRating Film: "+ urut[i].rating);
            }
        } else {
            System.out.println("List masih kosong");
        }
    } 
}


