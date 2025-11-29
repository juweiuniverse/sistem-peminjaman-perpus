import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ItemPerpustakaan buku1 = new Buku("Pemrograman Java", "Erlangga", 2020);
        ItemPerpustakaan buku2 = new Buku("Struktur Data", "Gramedia", 2018);

        Anggota anggota1 = new Anggota("A001", "Lisa", 3);
        Anggota anggota2 = new Anggota("A002", "Jennie", 2);

        anggota1.infoAnggota();
        System.out.println();
        anggota2.infoAnggota();
        System.out.println();
      
        System.out.println("=== Proses Peminjaman ===");
        anggota1.pinjamItem(buku1);
        anggota1.pinjamItem(buku2);

        PeminjamanBuku peminjaman1 = new PeminjamanBuku(
                buku1,
                anggota1.getNama(),
                LocalDate.now(),
                LocalDate.now().plusDays(7)
        );

        System.out.println();
        peminjaman1.infoPeminjaman();

        System.out.println("\n=== Proses Pengembalian ===");
        anggota1.kembalikanItem(buku1);

        System.out.println();
        anggota1.infoAnggota();
    }
}
