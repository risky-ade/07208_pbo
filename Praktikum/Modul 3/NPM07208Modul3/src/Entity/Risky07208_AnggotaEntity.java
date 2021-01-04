package Entity;

public class Risky07208_AnggotaEntity extends Risky07208_ManusiaAbstractEntity{
    private String password,id_perpus;
    
    public Risky07208_AnggotaEntity(String ktp,String nama, String alamat, String no_telp, 
            String password, String id_perpus){
        super(ktp, nama, alamat, no_telp);
        this.password = password;
        this.id_perpus = id_perpus;
    }
    public Risky07208_AnggotaEntity(){
        
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    public String getIdPerpus(){
        return this.id_perpus;
    }
    public void setIdPerpus(String id_perpus){
        this.id_perpus = id_perpus;
    }
    
    @Override
    public String getKtp(){
        return this.ktp;
    }
    
    public String getPassword(){
        return this.password;
    }
}