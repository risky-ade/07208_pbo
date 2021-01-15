package Controller;

import Model.Risky07208_AdminModel;
import Entity.Risky07208_AdminEntity;


public class Risky07208_AdminController implements Risky07208_CtrlInterface {
     public Risky07208_AdminModel admin_m;
   int indexLogin =0;
    public Risky07208_AdminController() {
        admin_m = new Risky07208_AdminModel();        
    }

     public void DataAdmin() {
        
       String ktp []    = {"001","002","003"};
       String nama []    = {"Risky","Ade","Sucahyo"};
       String pass [] = {"001","002","003"};
       String alamat [] = {"sby","sdrjo","kdr"};
       String no_telp [] = {"085","089","087"};
        for(int i = 0; i < ktp.length; i++) {
            admin_m.insert(new Risky07208_AdminEntity(ktp[i],pass[i],nama [i],alamat [i],no_telp [i]));
        }
    }
     @Override
     public void login (String ktp,String password){
         indexLogin = admin_m.cekData(ktp, password);
     }
     public Risky07208_AdminEntity adminEntity(){
         return admin_m.showDataAdmin(indexLogin);
     }
       
}
