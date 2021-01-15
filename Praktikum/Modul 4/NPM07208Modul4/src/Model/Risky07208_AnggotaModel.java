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
     @Override
    public int cekData(String ktp, String password){
        int loop = 0;
        if(ListAnggota.isEmpty()){
            loop = -1; //data kosong
        }else{
            for(int i = 0;i<ListAnggota.size();i++){
                if(ListAnggota.get(i).getKtp().equals(ktp)){
                    loop = i;
                    break;
                }else{
                    loop = -2;
                }
            }
        }return loop;
    }
    public Risky07208_AnggotaEntity showDaftarprak(int index){
        return ListAnggota.get(index);
    }
    //public Risky07208_AnggotaEntity getAngEntityArrayList(int index)
  
}

