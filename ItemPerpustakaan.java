//abstrak class diagram atas

public abstract class ItemPerpustakaan {

    protected String judul;
    protected String penerbit;
    protected int tahunTerbit;

    public ItemPerpustakaan(String judul, String penerbit, int tahunTerbit) {
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public abstract void infoItem();
}
