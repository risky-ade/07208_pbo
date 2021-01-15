package Model;

import Entity.Risky07208_AdminEntity;
import java.util.ArrayList;
public class Risky07208_AdminModel implements Risky07208_ModelInterfaces{
     private ArrayList<Risky07208_AdminEntity> ListAdmin;
    
    public Risky07208_AdminModel(){
        ListAdmin = new ArrayList<>();
    }
    
    public ArrayList<Risky07208_AdminEntity> getListAdmin(){
       return ListAdmin;
    }   

    @Override
    public void insert(Object x) {
        ListAdmin.add((Risky07208_AdminEntity) x);
    }

    @Override
    public void update(int index, Object x) {
        ListAdmin.set(index ,(Risky07208_AdminEntity) x);
    }

    @Override
    public void delete(int index) {
        ListAdmin.remove(index);
    } 
    @Override
    public  int cekData(String ktp, String password){
        int loop = 0;
        for(Risky07208_AdminEntity adminEntity : ListAdmin){
            if(adminEntity.getKtp().equals(ktp) && adminEntity.getPassword().equals(password)){
                break;
            }else{
                  loop++;
            }
        }
        return loop;
    }
    public Risky07208_AdminEntity showDataAdmin(int index){
        return ListAdmin.get(index);
    }
}
