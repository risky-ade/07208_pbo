package Controller;

import Model.Risky07208_AnggotaModel;
import Entity.Risky07208_AnggotaEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import View.Risky07208_allobjctrl;

public class Risky07208_AnggotaController implements Risky07208_CtrlInterface{
    Risky07208_AnggotaModel anggota_m = new Risky07208_AnggotaModel();
    int indexLogin =0; 
 public ArrayList<Risky07208_AnggotaEntity> getListAnggota(){
       return anggota_m.getListAnggota();
    }
 public Risky07208_AnggotaEntity getDetail(int index){
    return anggota_m.getListAnggota().get(index);
 }
 public DefaultTableModel daftaranggota(){
        DefaultTableModel dtmdaftaranggota = new DefaultTableModel();
        Object[] kolom = {"KTP","Nama","Password","Alamat","No Telp","Id Anggota"};
        dtmdaftaranggota.setColumnIdentifiers(kolom);
        
        int size = Risky07208_allobjctrl.anggota.getListAnggota().size();
         for (int i=0; i<size; i++){
             Object [] data = new Object[8];
            data[0] = Risky07208_allobjctrl.anggota.getListAnggota().get(i).getKtp();
            data[1] = Risky07208_allobjctrl.anggota.getListAnggota().get(i).getNama();
            data[2] = Risky07208_allobjctrl.anggota.getListAnggota().get(i).getPassword();
            data[3] = Risky07208_allobjctrl.anggota.getListAnggota().get(i).getAlamat();
            data[4] = Risky07208_allobjctrl.anggota.getListAnggota().get(i).getNoTelp();
            data[5] = Risky07208_allobjctrl.anggota.getListAnggota().get(i).getIdPerpus();
            
            dtmdaftaranggota.addRow(data);
           
     }
        return dtmdaftaranggota;
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
    
    @Override
     public void login (String ktp,String password){
         indexLogin = anggota_m.cekData(ktp, password);
     }
     public Risky07208_AnggotaEntity anggotaEntity(){
         return anggota_m.showDaftarprak(indexLogin);
     }
    
}
