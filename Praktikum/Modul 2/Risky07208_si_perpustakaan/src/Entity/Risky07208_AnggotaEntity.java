package Entity;


public class Risky07208_AnggotaEntity extends Risky07208_WargaperpusAbstractEntity{
    private String password;
    
    public Risky07208_AnggotaEntity(String ktp, String nama, String alamat, String no_telp, String password){
        super(ktp, nama, alamat, no_telp);
        this.password = password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    @Override
    public String getKtp(){
        return this.ktp;
    }
    
    public String getPassword(){
        return this.password;
    }
}