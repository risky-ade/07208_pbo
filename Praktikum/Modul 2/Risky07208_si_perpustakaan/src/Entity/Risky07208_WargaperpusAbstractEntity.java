package Entity;
public abstract class Risky07208_WargaperpusAbstractEntity {
    protected String ktp, nama, alamat, no_telp;
    
    public Risky07208_WargaperpusAbstractEntity(String ktp, String nama, String alamat, String no_telp){
        this.ktp = ktp;
        this.nama = nama;
        this.alamat = alamat;
        this.no_telp = no_telp;
    }
    
    public Risky07208_WargaperpusAbstractEntity(){
       
    }
    
    public abstract String getKtp();
    
    // Setter       
    public void setKtp(String ktp){
        this.ktp = ktp;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public void setNoTelp(String no_telp){
        this.no_telp = no_telp;
    }
    
    // Selector / Getter
    public String getNama(){
        return this.nama;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public String getNoTelp(){
        return this.no_telp;
    }
}


