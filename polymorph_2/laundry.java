
package polymorph_2;

public class laundry {
    //atribut: jenis cuci, metode
    
    private String jenisCuci, metode;
    private int harga;
    
    //constructor

    public laundry(String jenisCuci, String metode, int harga) {
        this.jenisCuci = jenisCuci;
        this.metode = metode;
        this.harga = harga;
    }

    public String getJenisCuci() {
        return jenisCuci;
    }

    public String getMetode() {
        return metode;
    }

    public int getHarga() {
        return harga;
    }
    
    //method
    public int cuciExpress() {
        //set harga express 5000
        return + 5000;
    }
    
}
