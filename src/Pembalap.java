public class Pembalap {
    private String nama;
    private int umur;

    public Pembalap(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");
    }

    public String getNama() { return nama; }
    public int getUmur()    { return umur; }
}