public class Buku extends ItemPerpustakaan {

    public Buku(String judul, String penerbit, int tahunTerbit) {
        super(judul, penerbit, tahunTerbit);
    }

    @Override
    public void infoItem() {
        System.out.println("=== Info Buku ===");
        System.out.println("Judul       : " + judul);
        System.out.println("Penerbit    : " + penerbit);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}
