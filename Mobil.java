public class Mobil extends Kendaraan {
    private int jumlahRoda;

    public Mobil(String merk, String model, int tahunProduksi, int jumlahRoda) {
        super(merk, model, tahunProduksi); // Memanggil constructor induk
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println(", Jenis: Mobil, Roda: " + jumlahRoda);
    }
}