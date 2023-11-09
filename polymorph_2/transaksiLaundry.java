
package polymorph_2;

public class TransaksiLaundry extends Laundry{

    private String kode, namaPelanggan, tglCuci, tglAmbil;
    private int berat;

    //constructor
    public transaksiLaundry(String jenisCuci, String metode, int harga, String kode, String namaPelanggan, String tglCuci, String tglAmbil, int berat) {
    super(jenisCuci, metode, harga);
    this.kode = kode;
    this.namaPelanggan = namaPelanggan;
    this.tglCuci = tglCuci;
    this.tglAmbil = tglAmbil;
    this.berat = berat;
}

    
    //getter
    public String getKode() {
        return kode;
    }
    
    public String getNamaPelanggan() {
        return namaPelanggan;
    }
    
    public String getTglCuci() {
        return tglCuci;
    }
    
    public String getTglAmbil() {
        return tglAmbil;
    }
    
    public int getBerat() {
        return berat;
    }
    
//method --> getTotal, overloading method
    public int getTotal() {
        //menghitung sub total jasa cuci
        return getBerat()*super.getHarga();
    }

//overloading method --> method statis
    public void transaksi() {
        System.out.println("Nama pelanggan : " + getNamaPelanggan());
        System.out.println("Jenis cuci : " + getJenisCuci());
        System.out.println("Metode (Reguler/Express) : " + getMetode());
        System.out.println("Harga jasa : " + getHarga());
        System.out.println("Tanggal cuci : " + getTglCuci());
        System.out.println("Tanggal ambil : " + getTglAmbil());
        System.out.println("Berat cucican : " + getBerat());
        System.out.println("Sub total : " + getTotal()); //sub total (hrg*berat)
        System.out.println("Total : " + super.cuciExpress());
 //+jasa express
    }

//overriding --> method dinamis
    @Override
    public int cuciExpress() {
        //menjumlahkan sub total dengan biaya express
        //misal: sub total = 16000 + 5000, shg total = 21000
        //boleh memanggil fungsi di dalam fungsi
        int total = getTotal();
        if (getMetode().equalsIgnoreCase("express")){
            total += super.cuciExpress();
//16000 = 16000 + 5000
        }
        return total;
    }

    //searching data --> tau dulu kode transaksinya
    public void transaksi(String kode){
        System.out.println("Nama pelanggan : " + getNamaPelanggan());
        System.out.println("Jenis cuci : " + getJenisCuci());
        System.out.println("Metode (Reguler/Express) : " + getMetode());
        System.out.println("Harga jasa : " + getHarga());
        System.out.println("Tanggal cuci : " + getTglCuci());
        System.out.println("Tanggal ambil : " + getTglAmbil());
        System.out.println("Berat cucican : " + getBerat());
        System.out.println("Sub total : " + getTotal()); //sub total (hrg*berat)
        System.out.println("Total : " + super.cuciExpress());
 //+jasa express
    }
}
