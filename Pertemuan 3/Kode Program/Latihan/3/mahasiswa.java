public class mahasiswa {
  String nama, nim;
  char jenisKelamin;
  double ipk;
  
  mahasiswa(String nm, String nim, char jk, double ipk){
    nama = nm;
    this.nim = nim;
    jenisKelamin = jk;
    this.ipk = ipk;
  }

  void tampilData(){
    System.out.println("Nama : " + nama);
    System.out.println("NIM  : " + nim);
    System.out.println("Jenis Kelamin : " + jenisKelamin);
    System.out.println("Nilai IPK : " + ipk);
  }
}
