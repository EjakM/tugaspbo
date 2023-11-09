package polymorph_2;
import java.io.*;
public class MainClass {
    public static void main(String[] args, String jenisCuci) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String metode;
        int harga;
        laundry master = new laundry("", "", 0);
        transaksiLaundry transaksi = new transaksiLaundry(null, null, 0, null, null, null, null);

        

        do {
            System.out.println("Laundryku");
            System.out.println("1. Menu Master");
            System.out.println("2. Menu Transaksi");
            System.out.println("3. Menu Cari Data");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan");
            int menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    System.out.println("1.Menu master data");
                    break;
                case 2:
                    System.out.println("2.Menu Transaksi");
                    break;
                case 3:
                    System.out.println("3.Menu cari data");
                    break;
                default:
                    System.exit(menu);
                    break;
            }

        } while(true);
    }
}
