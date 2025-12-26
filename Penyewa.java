public class Penyewa {
    private String namaPenyewa;
    private Kendaraan kendaraanYangDisewa;

    public Penyewa(String namaPenyewa, Kendaraan kendaraanYangDisewa) {
        this.namaPenyewa = namaPenyewa;
        this.kendaraanYangDisewa = kendaraanYangDisewa;
    }

    public void tampilkanDetailSewa() {
        System.out.println("Nama Penyewa: " + namaPenyewa);
        System.out.print("Detail Kendaraan -> ");
        kendaraanYangDisewa.tampilkanInfo();
        System.out.println("------------------------------------");
    }
}