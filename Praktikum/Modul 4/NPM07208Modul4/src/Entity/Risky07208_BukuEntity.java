package Entity;

public class Risky07208_BukuEntity {
    private String judulbuku,tahunterbit,kodebuku,pengarang;
    int indexkategoripilbuku,stok;
    // Constructor
    public Risky07208_BukuEntity(String judulbuku,String kodebuku, String tahunterbit,
             String pengarang,int indexkategoripilbuku, int stok){
        
        this.judulbuku = judulbuku;
        this.kodebuku = kodebuku;
        this.tahunterbit = tahunterbit;
        this.pengarang = pengarang;
        this.indexkategoripilbuku=indexkategoripilbuku;
        this.stok = stok;
    }
    public Risky07208_BukuEntity(){
        
    }
    public void setJudulbuku(String judulbuku) {
        this.judulbuku = judulbuku;
    }

    public void setTahunterbit(String tahunterbit) {
        this.tahunterbit = tahunterbit;
    }

    public void setKodebuku(String kodebuku) {
        this.kodebuku = kodebuku;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setIndexkategoripilbuku(int indexkategoripilbuku) {
        this.indexkategoripilbuku = indexkategoripilbuku;
    }
    public void setStokBuku(int stok){
        this.stok = stok;
    }

    public String getJudulbuku() {
        return judulbuku;
    }

    public String getTahunterbit() {
        return tahunterbit;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getIndexkategoripilbuku() {
        return indexkategoripilbuku;
    }   
     public int getStokBuku(){
        return stok;
    }
}

    

