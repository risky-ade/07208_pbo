package Model;

import Entity.Risky07208_AnggotaEntity;
import java.util.ArrayList;

public class Risky07208_AnggotaModel implements Risky07208_ModelInterfaces{
    private ArrayList<Risky07208_AnggotaEntity> ListAnggota;
    
    public Risky07208_AnggotaModel(){
       ListAnggota = new ArrayList<>();
    }
    
    public ArrayList<Risky07208_AnggotaEntity> getListAnggota(){
       return ListAnggota;
    }

    @Override
    public void insert(Object x) {
        ListAnggota.add((Risky07208_AnggotaEntity) x);
    }

    @Override
    public void update(int index, Object x) {
        
    }

    @Override
    public void delete(int index) {
    
    }
    
  
}

