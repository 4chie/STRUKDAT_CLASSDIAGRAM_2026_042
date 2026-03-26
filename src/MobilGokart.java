public class MobilGokart extends Kendaraan {
    private String kategori;
    private boolean dipakai;

    public MobilGokart(String merk, int tahun, String kategori) {
        super(merk, tahun);
        this.kategori = kategori;
        this.dipakai  = false;
    }

    @Override
    public double hitungBiaya() {
        if (kategori.equals("JUNIOR")) return 2000;
        if (kategori.equals("PRO"))    return 5000;
        return 3000;
    }

    public void mulaiPakai() {
        if (!dipakai) {
            dipakai = true;
            System.out.println("Gokart " + getMerk() + " mulai dipakai.");
        } else {
            System.out.println("Gokart sedang dipakai!");
        }
    }

    public void selesaiPakai() {
        dipakai = false;
        System.out.println("Gokart selesai dipakai.");
    }

    public String getKategori()  { return kategori; }
    public boolean isDipakai()   { return dipakai; }
}