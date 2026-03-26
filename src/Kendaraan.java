public abstract class Kendaraan {
    private String merk;
    private int tahun;

    public Kendaraan(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }

    public String getMerk() { return merk; }
    public int getTahun()    { return tahun; }

    public abstract double hitungBiaya();

    public void tampilInfo() {
        System.out.println("Merek : " + merk);
        System.out.println("Tahun : " + tahun);
        System.out.println("Tarif : Rp " + hitungBiaya() + "/menit");
    }
}