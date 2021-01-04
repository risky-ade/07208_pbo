package Model;

import Entity.Risky07208_PeminjamanEntity;
import java.util.ArrayList;


public class Risky07208_PeminjamanModel implements Risky07208_ModelInterfaces {
    
private ArrayList<Risky07208_PeminjamanEntity>ListPinjam;
    
    public Risky07208_PeminjamanModel(){
        ListPinjam = new ArrayList();
    }
    public ArrayList<Risky07208_PeminjamanEntity > getListPinjam(){
        return ListPinjam;
    }    
    
  @Override
    
    public void insert (Object x){
        ListPinjam.add((Risky07208_PeminjamanEntity) x);
    }
    
   @Override
    public void update(int index, Object x) {
        ListPinjam.set(index ,(Risky07208_PeminjamanEntity) x);
    }

    @Override
    public void delete(int index) {
        ListPinjam.remove(index);
    } 
}
