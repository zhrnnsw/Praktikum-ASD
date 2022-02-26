# Laporan Praktikum Pertemuan 2

Zahra Annisa Wahono (2141720016) 1F - TI

## Jawaban Pertanyaan

### **2.2 Deklarasi Class, Atribut dan Method**
1. Karakteristik class/ objek :

    a. Memiliki atribut

    b. Dapat melakukan method

2. Kata kunci deklarasi class adalah **class**
    > class namaClass{
    >   
    >}

3. Pada class Barang terdapat 4 atribut, yaitu _namaBarang, jenisBarang, stok, dan hargaSatuan_ yang di deklarasi pada baris 13 dan 14
4. Class Barang memiliki 4 method, yaitu _tampilBarang()_ di line 16, _tambahStok()_ di line 23, _kurangiStok()_ di line 27, dan _hitungHargaTota()l_ di line 31
5. <img src = "p1.png">
6. Method __tambahStok()_ memiliki 1 parameter int karena membutuhkan data dari luar berapa stok yang akan ditambahkan
7. Method _hitungHargaTotal()_ memiliki tipe data int karena method ini melakukan penghitungan antara *jumlah* dan *hargaSatuan* yang keduanya bertipe int dan hasil penghitungannya juga int
8. method tambahStok() memiliki tipe data void karena tidak ada output yang harus dikeluarkan dari method tersebut

### **2.3 Instansiasi Objek dan Mengakses Atribut & Method**
1. Pada class _BarangMain_, instansiasi dilakukan pada baris ke-15 dengan nama objek **b1**
2. Mengakses atribut :
    > namaObjek.namaAtribut = nilai;
    
    Contoh 
    
    <img src = "p2.png"> 
    
   Mengakses method :
    > namaObjek.namaClass(parameter); 
    
    Contoh 
    
    <img src = "p3.png">

### **2.4 Membuat Konstruktor**
1. Deklarasi konstruktor ada pada baris 15 dan 25
2. Pada baris ini dilakukan instansiasi konstruktor berparameter yang berisikan "Logitech", "Wireless Mouse", 150000, dan 25
3. <img src = "p4.png">


### **Latihan**
**1. Objek Barang**

<img src = "l1.png">
<img src = "l2.png">
<img src = "l3.png">

Output
        
<img src = "hasil1.png">


**2. Objek PacMan**

<img src = "l4.png">
<img src = "l5.png">
<img src = "l6.png">

Output
        
<img src = "hasil2.png">