import java.time.LocalDate;

public class PeminjamanBuku {

    private ItemPerpustakaan item;
    private String namaPeminjam;
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;

    public PeminjamanBuku(ItemPerpustakaan item, String namaPeminjam,
                          LocalDate tanggalPinjam, LocalDate tanggalKembali) {
        this.item = item;
        this.namaPeminjam = namaPeminjam;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public ItemPerpustakaan getItem() {
        return item;
    }

    public void setItem(ItemPerpustakaan item) {
        this.item = item;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public void setNamaPeminjam(String namaPeminjam) {
        this.namaPeminjam = namaPeminjam;
    }

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(LocalDate tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(LocalDate tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public void infoPeminjaman() {
        System.out.println("=== Informasi Peminjaman ===");
        System.out.println("Judul Item     : " + item.getJudul());
        System.out.println("Peminjam       : " + namaPeminjam);
        System.out.println("Tanggal Pinjam : " + tanggalPinjam);
        System.out.println("Tanggal Kembali: " + tanggalKembali);
    }
}

