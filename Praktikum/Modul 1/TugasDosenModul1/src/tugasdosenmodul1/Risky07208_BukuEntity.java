package tugasdosenmodul1;


public class Risky07208_BukuEntity {
    //Atribut deklarasi
    String Risky07208_judulbuku,Risky07208_tahunterbit,Risky07208_kodebuku,Risky07208_pengarang;
    int indexpilbuku;
    public Risky07208_BukuEntity(String Risky07208_judulbuku,String Risky07208_kodebuku, String Risky07208_tahunterbit,
             String Risky07208_pengarang,int indexpilbuku){
        
        this.Risky07208_judulbuku = Risky07208_judulbuku;
        this.Risky07208_kodebuku = Risky07208_kodebuku;
        this.Risky07208_tahunterbit = Risky07208_tahunterbit;
        this.Risky07208_pengarang = Risky07208_pengarang;
        this.indexpilbuku=indexpilbuku;
    }
    String getJudulBuku(){
        return this.Risky07208_judulbuku;
    }
    String getKodeBuku(){
        return this.Risky07208_kodebuku;
     
    }
    String getTahunTerbit(){
        return this.Risky07208_tahunterbit;
     
    }
    String getPengarang(){
        return this.Risky07208_pengarang;
     
    }
    int getindexPilBuku(){
    return indexpilbuku;
    }
}
