public class Main {
    public static void main(String[] args) {

        MobilGokart mobil1 = new MobilGokart("Mercedes", 2022, "JUNIOR");
        MobilGokart mobil2 = new MobilGokart("Ferrari", 2023, "PRO");
        Pembalap pembalap1 = new Pembalap("Kimi", 10);

        Kendaraan[] daftarMobil = { mobil1, mobil2 };
        for (Kendaraan k : daftarMobil) {
            k.tampilInfo();
            System.out.println("---");
        }

        mobil1.mulaiPakai();
        SesiBalap sesi = new SesiBalap(pembalap1, mobil1, 10);
        sesi.cetakStruk();
        mobil1.selesaiPakai();
    }
}