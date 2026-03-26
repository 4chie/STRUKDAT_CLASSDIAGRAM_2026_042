public class SesiBalap {
    private Pembalap pembalap;
    private MobilGokart gokart;
    private int durasi;

    public SesiBalap(Pembalap pembalap, MobilGokart gokart, int durasi) {
        this.pembalap = pembalap;
        this.gokart   = gokart;
        this.durasi   = durasi;
    }

    public void cetakStruk() {
        System.out.println("=== STRUK SESI GOKART ===");
        System.out.println("Pembalap : " + pembalap.getNama());
        System.out.println("Gokart   : " + gokart.getMerk());
        System.out.println("Kategori : " + gokart.getKategori());
        System.out.println("Durasi   : " + durasi + " menit");
        System.out.println("Total    : Rp " + (gokart.hitungBiaya() * durasi));
        System.out.println("=========================");
    }
}