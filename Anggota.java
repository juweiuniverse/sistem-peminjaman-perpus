import java.util.ArrayList;
import java.util.List;

public class Anggota {
    private String idAnggota;
    private String nama;
    private int batasPinjam;
    private List<ItemPerpustakaan> itemDipinjam;

    public Anggota(String idAnggota, String nama, int batasPinjam) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.batasPinjam = batasPinjam;
        this.itemDipinjam = new ArrayList<>();
    }

    public void infoAnggota() {
        System.out.println("=== Data Anggota ===");
        System.out.println("ID Anggota   : " + this.idAnggota);
        System.out.println("Nama         : " + this.nama);
        System.out.println("Batas Pinjam : " + this.batasPinjam);
        System.out.println("Sedang Pinjam: " + this.itemDipinjam.size() + " item");
    }

    public boolean pinjamItem(ItemPerpustakaan i) {
        if (this.itemDipinjam.size() < this.batasPinjam) {
            this.itemDipinjam.add(i);
            System.out.println("Berhasil meminjam item.");
            return true;
        } else {
            System.out.println("Gagal: Melebihi batas pinjaman.");
            return false;
        }
    }

    public boolean kembalikanItem(ItemPerpustakaan i) {
        if (this.itemDipinjam.remove(i)) {
            System.out.println("Berhasil mengembalikan item.");
            return true;
        } else {
            System.out.println("Gagal: Item tidak ditemukan dalam daftar pinjaman.");
            return false;
        }
    }
 
    public String getNama() {
        return nama;
    }
}