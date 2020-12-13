package Entity;

public class Risky07208_BukuEntity {
    private String Risky07208_judulbuku,Risky07208_tahunterbit,Risky07208_kodebuku,Risky07208_pengarang;
    int indexkategoripilbuku;
    // Constructor
    public Risky07208_BukuEntity(String Risky07208_judulbuku,String Risky07208_kodebuku, String Risky07208_tahunterbit,
             String Risky07208_pengarang,int indexkategoripilbuku){
        
        this.Risky07208_judulbuku = Risky07208_judulbuku;
        this.Risky07208_kodebuku = Risky07208_kodebuku;
        this.Risky07208_tahunterbit = Risky07208_tahunterbit;
        this.Risky07208_pengarang = Risky07208_pengarang;
        this.indexkategoripilbuku=indexkategoripilbuku;
    }

    public void setRisky07208_judulbuku(String Risky07208_judulbuku) {
        this.Risky07208_judulbuku = Risky07208_judulbuku;
    }

    public void setRisky07208_tahunterbit(String Risky07208_tahunterbit) {
        this.Risky07208_tahunterbit = Risky07208_tahunterbit;
    }

    public void setRisky07208_kodebuku(String Risky07208_kodebuku) {
        this.Risky07208_kodebuku = Risky07208_kodebuku;
    }

    public void setRisky07208_pengarang(String Risky07208_pengarang) {
        this.Risky07208_pengarang = Risky07208_pengarang;
    }

    public void setIndexkategoripilbuku(int indexkategoripilbuku) {
        this.indexkategoripilbuku = indexkategoripilbuku;
    }

    public String getRisky07208_judulbuku() {
        return Risky07208_judulbuku;
    }

    public String getRisky07208_tahunterbit() {
        return Risky07208_tahunterbit;
    }

    public String getRisky07208_kodebuku() {
        return Risky07208_kodebuku;
    }

    public String getRisky07208_pengarang() {
        return Risky07208_pengarang;
    }

    public int getIndexkategoripilbuku() {
        return indexkategoripilbuku;
    }
    
}

    

