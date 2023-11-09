package polymorph_2;

public class CRUD {
    private laundry laundryManager;

    public CRUD(laundry laundryManager) {
        this.laundryManager = laundryManager;
    }

    // INSERT Master Data
    public void insertMasterData(String jenisCuci, String metode, int harga) {
        laundry masterData = new laundry(jenisCuci, metode, harga);
        laundryManager.insertMasterData(masterData);
    }

    // INSERT Transaksi
    public void insertTransaksi(String jenisCuci, String metode, int harga, String kode, String namaPelanggan, String tglCuci, String tglAmbil, int berat) {
        TransaksiLaundry transaksi = new TransaksiLaundry(jenisCuci, metode, harga, kode, namaPelanggan, tglCuci, tglAmbil, berat);
        laundryManager.tambahTransaksi(transaksi);
    }
    public void cariData(String kode) {
        TransaksiLaundry transaksi = laundryManager.tambahTransaksi(kode);
        if (transaksi != null) {
            System.out.println("Data ditemukan:");
            System.out.println("Kode Transaksi: " + transaksi.getKode());
            System.out.println("Nama Pelanggan: " + transaksi.getNamaPelanggan());
            System.out.println("Jenis Cuci: " + ((laundry) transaksi).getJenisCuci());
            System.out.println("Metode: " + ((laundry) transaksi).getMetode());
            System.out.println("Harga: " + ((laundry) transaksi).getHarga());
            System.out.println("Tanggal Cuci: " + transaksi.getTglCuci());
            System.out.println("Tanggal Ambil: " + transaksi.getTglAmbil());
            System.out.println("Berat: " + transaksi.getBerat());
            System.out.println("Subtotal: " + transaksi.getTotal());
            System.out.println("Total: " + transaksi.cuciExpress());
        } else {
            System.out.println("Data dengan kode " + kode + " tidak ditemukan.");
        }
    }
}
