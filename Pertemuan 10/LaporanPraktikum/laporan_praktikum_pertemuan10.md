# Laporan Praktikum Pertemuan 10

Zahra Annisa Wahono 1F - TI / 29

## Jawaban Pertanyaan

### **Praktikum 1**

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?

    **Jawab:** Karena saat awal dibuat dan antrian masih kosong, front dan rearnya masih di luar array yang mana diwakili dengan indeks -1 (tidak dalam array). Size menunjukkan jumlah antrian yang ada, pada awal pembuatan antrian masih 0.

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!

            if(rear == max - 1){
                rear = 0;

    **Jawab:** Jika rear telah memenuhi indeks terakhir dari array, maka rear selanjutnya akan berapa pada indeks ke 0

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!

            if(front == max - 1){
                front = 0;

    **Jawab:** Jika front telah memenuhi indeks terakhir dari array, maka rear selanjutnya akan berapa pada indeks ke 0

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?

    **Jawab:** Karena pada i = 0 belum tentu merupakan antrian pertama atau bahkan kosong

5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!

            i = i + 1 % max;

    **Jawab:** Itu merupakan increment dari i agar pertambahan i selaras dengan kapasitas maksimal array

6. Tunjukkan potongan kode program yang merupakan queue overflow!

    **Jawab:** 
            