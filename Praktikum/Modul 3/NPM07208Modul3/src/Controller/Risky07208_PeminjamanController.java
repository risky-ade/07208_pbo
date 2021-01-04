package Controller;

import Entity.*;
import Model.Risky07208_PeminjamanModel;
import java.util.ArrayList;
import java.util.Date;

public class Risky07208_PeminjamanController {
    Risky07208_PeminjamanModel pinjam_m;
    
    public Risky07208_PeminjamanController(){
        pinjam_m = new Risky07208_PeminjamanModel();
    }
    
    public ArrayList<Risky07208_PeminjamanEntity> viewPeminjaman(){
        return pinjam_m.getListPinjam();
    }
    
    public void insertPeminjaman( int index_Buku,Risky07208_AnggotaEntity index_Anggota,int jumlah,Date tgl_pinjam){
        Risky07208_PeminjamanEntity data = new Risky07208_PeminjamanEntity();
        data.setNo_pinjam("");
        data.setIndex_Buku(index_Buku);
        data.setIndex_Anggota(index_Anggota);
        data.setJumlah(jumlah);
        data.setTgl_pinjam(tgl_pinjam);
        data.setStatus("0");
        pinjam_m.insert(data);
        
    }
    
    public Risky07208_PeminjamanEntity getDetail(int index){
        return pinjam_m.getListPinjam().get(index);
    }
    
    public int cekPinjamAnggota(String ktp, String status){
        int result = -1;
        if(pinjam_m.getListPinjam().size()>0){
            for(int i=0; i<pinjam_m.getListPinjam().size(); i++){
            String noktp = pinjam_m.getListPinjam().get(i).getIndex_Anggota().getKtp();
            String statusPinjam = pinjam_m.getListPinjam().get(i).getStatus();
            if(noktp.equals(ktp)&& statusPinjam.equals(status)){
                result=i;
                break;
            }else{
                result= -1;
            }
        }
      }
      return result;
    }


}

