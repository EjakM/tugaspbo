package tugas3;

import java.util.ArrayList;
import java.util.Scanner;

class Tiket {
    private String username;
    private String password;
    private boolean loggedIn;
    private ArrayList<Transaksi> transaksiList;

    public Tiket(String username, String password) {
        this.username = username;
        this.password = password;
        this.loggedIn = false;
        this.transaksiList = new ArrayList<>();
    }

    public boolean login(String enteredUsername, String enteredPassword) {
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            loggedIn = true;
            return true;
        }
        return false;
    }

    public void showMenu() {
        System.out.println("Menu:");
        System.out.println("1. Input Data Transaksi");
        System.out.println("2. Lihat Data Tiket");
        System.out.println("3. Keluar");
    }

    public void inputDataTransaksi(Scanner scanner) {
        if (loggedIn) {
            scanner.nextLine(); // Membuang karakter newline
            System.out.println("Masukkan Nama Hotel: ");
            String namaHotel = scanner.nextLine();
            System.out.println("Masukkan Jumlah Kamar: ");
            int jumlahKamar = scanner.nextInt();
            System.out.println("Masukkan Harga per Kamar: ");
            double hargaKamar = scanner.nextDouble();
            scanner.nextLine(); // Membuang karakter newline
            System.out.println("Masukkan Nama Pesawat: ");
            String namaPesawat = scanner.nextLine();
            System.out.println("Masukkan Jumlah Penumpang: ");
            int jumlahPenumpang = scanner.nextInt();
            System.out.println("Masukkan Harga Tiket Pesawat: ");
            double hargaTiketPesawat = scanner.nextDouble();
            scanner.nextLine(); // Membuang karakter newline
            System.out.println("Masukkan Tujuan: ");
            String tujuan = scanner.nextLine();

            double hargaTiket = hargaTiketPesawat * jumlahPenumpang;
            double asuransi = jumlahPenumpang * 29000.0;
            double total = hargaTiket + asuransi;

            double diskon = 0.45 * hargaKamar;
            double totalBiaya = (hargaKamar - diskon) * jumlahKamar;

            Transaksi transaksi = new Transaksi(namaHotel, jumlahKamar, hargaKamar, namaPesawat, jumlahPenumpang, hargaTiketPesawat, tujuan, total, totalBiaya);
            transaksiList.add(transaksi);
            System.out.println("Data transaksi telah ditambahkan.");
        } else {
            System.out.println("Silakan login terlebih dahulu.");
        }
    }

    public void lihatDataTiket() {
        if (loggedIn) {
            if (transaksiList.isEmpty()) {
                System.out.println("Belum ada data transaksi.");
            } else {
                System.out.println("Data Transaksi Tiket:");
                for (int i = 0; i < transaksiList.size(); i++) {
                    System.out.println("Transaksi ke-" + (i + 1));
                    System.out.println(transaksiList.get(i));
                }
            }
        } else {
            System.out.println("Silakan login terlebih dahulu.");
        }
    }
}

class Transaksi {
    private String namaHotel;
    private int jumlahKamar;
    private double hargaKamar;
    private String namaPesawat;
    private int jumlahPenumpang;
    private double hargaTiketPesawat;
    private String tujuan;
    private double totalHargaTiket;
    private double totalBiayaKamar;

    public Transaksi(String namaHotel, int jumlahKamar, double hargaKamar, String namaPesawat, int jumlahPenumpang, double hargaTiketPesawat, String tujuan, double totalHargaTiket, double totalBiayaKamar) {
        this.namaHotel = namaHotel;
        this.jumlahKamar = jumlahKamar;
        this.hargaKamar = hargaKamar;
        this.namaPesawat = namaPesawat;
        this.jumlahPenumpang = jumlahPenumpang;
        this.hargaTiketPesawat = hargaTiketPesawat;
        this.tujuan = tujuan;
        this.totalHargaTiket = totalHargaTiket;
        this.totalBiayaKamar = totalBiayaKamar;
    }

    @Override
    public String toString() {
        return "Nama Hotel: " + namaHotel + "\nJumlah Kamar: " + jumlahKamar + "\nHarga per Kamar: " + hargaKamar +
               "\nNama Pesawat: " + namaPesawat + "\nJumlah Penumpang: " + jumlahPenumpang + "\nHarga Tiket Pesawat: " +
               hargaTiketPesawat + "\nTujuan: " + tujuan + "\nTotal Harga Tiket: " + totalHargaTiket + "\nTotal Biaya Kamar: " + totalBiayaKamar;
    }
}
