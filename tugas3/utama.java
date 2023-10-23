package tugas3;

import java.util.Scanner;

public class utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Username: ");
        String username = scanner.next();
        System.out.print("Masukkan Password: ");
        String password = scanner.next();

        Tiket tiket = new Tiket(username, password);

        if (tiket.login(username, password)) {
            System.out.println("Login berhasil.");
            int pilihan = 0;

            while (pilihan != 3) {
                tiket.showMenu();
                System.out.print("Pilih menu (1/2/3): ");
                pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        tiket.inputDataTransaksi(scanner);
                        break;
                    case 2:
                        tiket.lihatDataTiket();
                        break;
                    case 3:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                        break;
                }
            }
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }

        scanner.close();
    }
}