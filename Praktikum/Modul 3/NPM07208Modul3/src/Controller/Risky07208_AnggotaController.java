package Controller;

import Model.Risky07208_AnggotaModel;
import Entity.Risky07208_AnggotaEntity;
import java.util.ArrayList;

public class Risky07208_AnggotaController {
    Risky07208_AnggotaModel anggota_m = new Risky07208_AnggotaModel();
     
 public ArrayList<Risky07208_AnggotaEntity> getListAnggota(){
       return anggota_m.getListAnggota();
    }
 public Risky07208_AnggotaEntity getDetail(int index){
    return anggota_m.getListAnggota().get(index);
 }
    public void insertAnggota(String ktp,String nama, String alamat, String no_telp, 
            String password, String id_perpus){
        Risky07208_AnggotaEntity data = new Risky07208_AnggotaEntity();
        data.setKtp(ktp);
        data.setNama(nama);
        data.setAlamat(alamat);
        data.setNoTelp(no_telp);
        data.setPassword(password);
        data.setIdPerpus(id_perpus);
        anggota_m.insert(data);
    }
    
}
