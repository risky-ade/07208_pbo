package Model;

import Entity.Risky07208_AdminEntity;
import java.util.ArrayList;
public class Risky07208_AdminModel {
    private ArrayList<Risky07208_AdminEntity> admin;
  
    public Risky07208_AdminModel() {
        admin = new ArrayList<Risky07208_AdminEntity>();
        
    }
    public ArrayList<Risky07208_AdminEntity> getListAdmin(){
       return admin;
    }
    public void DataAdmin() {
        
       String ktp []    = {"001","002","003","004"};
       String nama []    = {"Risky","Ade","Sucahyo","Rosyid"};
       String pass [] = {"01","02","03","04"};
       String alamat [] = {"sby","sdrjo","mojo","kdr"};
       String no_telp [] = {"085","089","087","081"};
        for(int i = 0; i < ktp.length; i++) {
            admin.add(new Risky07208_AdminEntity(ktp[i],pass[i],nama [i],alamat [i],no_telp [i]));
        }
    }
    
}
