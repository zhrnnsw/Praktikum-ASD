# Laporan Praktikum Pertemuan 16

**Zahra Annisa Wahono 1F-TI / 29**

## Jawaban Pertanyaan

### **Praktikum 1**

1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?

    **Jawab:** Karena pada instansiasi tidak dibatasi tipe data yang boleh dimasukkan, maka secara default tipe data yang digunakan adalah tipe data generic

2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!

    **Jawab:**

    <img src ="img/1.2.png">

3. **Jawab:**

    <img src ="img/1.3.png">

4. **Jawab:**

    <img src ="img/1.4.png">

5. **Jawab:**

    <img src ="img/1.5.png">

    Kita dapat membatasi tipe data yang akan dimasukkan dengan <*tipe data*>. Dengan menggunakan class Linkedlist kita dapat menggunakan methode linked list seperti push(), getFirst(), ataupun getLast() namun jika menggunakan class list tidak bisa


### **Praktikum 2**

1. Apakah perbedaan fungsi push() dan add() pada objek fruits?

    **Jawab:** Fungsi push() dan add() sama sama menambah kan elemen tertentu, namun push() merupakanfungsi dari interface stck sedangkan add() tidak

2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?

    **Jawab:** 

    <img src ="img/2.2.png">

    Hasilnya print out akan kosong karena stack kosong


3. Jelaskan fungsi dari baris 46-49?

    **Jawab:** Digunakan class iterator untuk menentukan indeks dan mengaksesnya satu persatu yang kemudian di print 


4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian?

    **Jawab:** 

    <img src ="img/2.4.png">

    Terjadi error pada pemanggulang fungsi push() dan empty() karene fungsi tersebut hanya dapat digunakan pada stack

5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!

    **Jawab:**

    <img src ="img/2.5.png">

    <img src ="img/2.5run.png">

6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!

    **Jawab:**

    <img src ="img/2.6.png">

    <img src ="img/2.6run.png">


### **Praktikum 3**

1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa?

    **Jawab:** Pada fungsi tambah() digunakan method addAll() dari collections yang dapat menambahkan element tanpa ada batas jumlah elemen yang ditambahkan

2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!

    **Jawab:** 

    <img src ="img/3.2.png">

3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!

    **Jawab:** 

    <img src ="img/3.3.png">

## TUGAS PRAKTIKUM

1. **Kode**

    Class Film
    <img src ="img/tugas1kode1.png">

    Class FilmMain
    <img src ="img/tugas1kode2.png">
    <img src ="img/tugas1kode3.png">


    **Output**

    Menu Awal dan  Tambah data (Push)
    <img src ="img/tugas1run1.png">

    Cetak Semua Data Film
    <img src ="img/tugas1run2.png">

    Cek Judul Film  Teratas
    <img src ="img/tugas1run3.png">

    Hapus Film Teratas
    <img src ="img/tugas1run4.png">


2. **Kode**

    Class Mahasiswa
    <img src ="img/tuga2kode1.png">

    Class MataKuliah
    <img src ="img/tuga2kode2.png">

    Class Nilai
    <img src ="img/tuga2kode3.png">

    Class NilaiMahaiswaMain
    <img src ="img/tuga2kode4.png">
    <img src ="img/tuga2kode5.png">
    <img src ="img/tuga2kode6.png">
    <img src ="img/tuga2kode7.png">
    <img src ="img/tuga2kode8.png">

    
    **Output**
    
    <img src ="img/tuga2run1.png">

    <img src ="img/tuga2run2.png">

    <img src ="img/tuga2run3.png">

    <img src ="img/tuga2run4.png">

    <img src ="img/tuga2run5.png">