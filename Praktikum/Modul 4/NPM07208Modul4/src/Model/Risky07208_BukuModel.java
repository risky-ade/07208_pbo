package Model;

import Entity.Risky07208_BukuEntity;
import java.util.ArrayList;

public class Risky07208_BukuModel implements Risky07208_ModelInterfaces{
     private ArrayList<Risky07208_BukuEntity> ListBuku;
    
    public Risky07208_BukuModel(){
        ListBuku = new ArrayList<>();
    }
    
    public ArrayList<Risky07208_BukuEntity> getListBuku(){
       return ListBuku;
    }   

    @Override
    public void insert(Object x) {
        ListBuku.add((Risky07208_BukuEntity) x);
    }

    @Override
    public void update(int index, Object x) {
        ListBuku.set(index ,(Risky07208_BukuEntity) x);
    }

    @Override
    public void delete(int index) {
        ListBuku.remove(index);
    } 
    public int cekData(String kode,String nama){
        int loop = 0;
        if(ListBuku.isEmpty()){
            loop = -1; //data kosong
        }else{
            for(int i = 0;i<ListBuku.size();i++){
                if(ListBuku.get(i).getKodebuku().equals(kode)){
                    loop = i;
                    break;
                }else{
                    loop = -2;
                }
            }
        }return loop;
    }
}
