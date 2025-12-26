import java.util.ArrayList;

public class AplikasiRental {
    public static void main(String[] args) {
        // 1. Buat daftar kendaraan yang tersedia
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();
        daftarKendaraan.add(new Mobil("Toyota", "Avanza", 2022, 4));
        daftarKendaraan.add(new Motor("Honda", "Vario", 2021, 2));
        daftarKendaraan.add(new Sepeda("Polygon", "Xtrada", 2023, "Gunung"));

        // 2. Menampilkan list kendaraan tersedia
        System.out.println("=== DAFTAR KENDARAAN TERSEDIA ===");
        for (Kendaraan k : daftarKendaraan) {
            k.tampilkanInfo();
        }

        // 3. Proses Penyewaan
        System.out.println("\n=== DAFTAR PENYEWA ===");
        ArrayList<Penyewa> daftarPenyewa = new ArrayList<>();
        
        // Budi menyewa Mobil Avanza (kendaraan index 0)
        daftarPenyewa.add(new Penyewa("Budi", daftarKendaraan.get(0)));
        // Ani menyewa Sepeda Polygon (kendaraan index 2)
        daftarPenyewa.add(new Penyewa("Ani", daftarKendaraan.get(2)));

        // 4. Menampilkan daftar penyewa
        for (Penyewa p : daftarPenyewa) {
            p.tampilkanDetailSewa();
        }
    }
}