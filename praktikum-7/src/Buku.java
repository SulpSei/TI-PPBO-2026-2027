public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public String getJudul() {
        return judul;
    }
    public String getPengarang() {
        return pengarang;
    }
    public int getTahunPenerbit() {
        return tahunTerbit;
    }

    public Buku(String judul, String pengarang, int tahunTerbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
}
