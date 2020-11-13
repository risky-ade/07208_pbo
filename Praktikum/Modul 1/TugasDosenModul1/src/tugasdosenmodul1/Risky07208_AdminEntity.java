package tugasdosenmodul1;


public class Risky07208_AdminEntity {
     
    String Risky07208_ktp,Risky07208_nama,Risky07208_alamat,Risky07208_password;
    
    public Risky07208_AdminEntity(String Risky07208_ktp, String Risky07208_nama,
            String Risky07208_alamat, String Risky07208_password){
        
        this.Risky07208_ktp = Risky07208_ktp;
        this.Risky07208_nama = Risky07208_nama;
        this.Risky07208_alamat = Risky07208_alamat;
        this.Risky07208_password = Risky07208_password;     
    }
    
    String getKtp(){
        return this.Risky07208_ktp;
    }
    String getNama(){
        return this.Risky07208_nama; 
    }
    String getAlamat(){
        return this.Risky07208_alamat; 
    }
    String getPassword(){
        return this.Risky07208_password;}   
}
