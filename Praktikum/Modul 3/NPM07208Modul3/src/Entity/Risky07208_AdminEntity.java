package Entity;

public class Risky07208_AdminEntity extends Risky07208_ManusiaAbstractEntity {
    private String password;
    
    public Risky07208_AdminEntity(String ktp, String password, String nama,String alamat, String no_telp ){
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
