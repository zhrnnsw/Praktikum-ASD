package minggu5;

public class Sum {
    public int elemen;
    public double keuntungan[];
    public double total;

    Sum(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double [elemen];
        this.total = 0;
    }

    double totalBF(double arr[]){
        for (int i = 0; i < elemen; i++){
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r){
        if(l==r)
            return arr[l];
        else if (l<r){
            int mid = (l+r)/2;  //untuk membagi array mjd 2 bagian
            double lsum = totalDC(arr, l, mid-1); //lsum adalah nilai nilai yang indeksnya ada di kiri mid selain nilai ke 0 1l
            double rsum = totalDC(arr, mid+1, r); // rsum adalah nilai nilai yang indeksnya ada di kanan mid
            return lsum+rsum+arr[mid];
        }
        return 0;
    }
}
