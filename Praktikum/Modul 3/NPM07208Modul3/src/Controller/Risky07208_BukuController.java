
package Controller;

import Entity.Risky07208_BukuEntity;
import Model.Risky07208_BukuModel;
import Entity.Risky07208_KategoriEntity;
import java.util.ArrayList;

public class Risky07208_BukuController {
    //inisialisasi object
    Risky07208_BukuModel buku_m = new Risky07208_BukuModel();
    Risky07208_KategoriEntity kategori= new Risky07208_KategoriEntity();
    
public Risky07208_BukuController() {
        buku_m = new Risky07208_BukuModel();
        
    } 

public ArrayList<Risky07208_BukuEntity> getListBuku(){
       return buku_m.getListBuku();
    }
public Risky07208_BukuEntity getDetail(int index){
    return buku_m.getListBuku().get(index);
}

public void insertBuku(String judulbuku, String kodebuku, String tahunterbit,
             String pengarang,int indexkategoripilbuku, int stok){
    Risky07208_BukuEntity buku = new Risky07208_BukuEntity();
    buku.setJudulbuku(judulbuku);
    buku.setKodebuku(kodebuku);
    buku.setTahunterbit(tahunterbit);
    buku.setPengarang(pengarang);
    buku.setIndexkategoripilbuku(indexkategoripilbuku);
    buku.setStokBuku(stok);
        buku_m.insert(buku);
}
public void updateBuku (int index ,String judulbuku, String kodebuku, String tahunterbit,
             String pengarang,int indexkategoripilbuku, int stok){
    Risky07208_BukuEntity buku = new Risky07208_BukuEntity();
    buku.setJudulbuku(judulbuku);
    buku.setKodebuku(kodebuku);
    buku.setTahunterbit(tahunterbit);
    buku.setPengarang(pengarang);
    buku.setIndexkategoripilbuku(indexkategoripilbuku);
    buku.setStokBuku(stok);
        buku_m.update( index,buku);
    }
public void deleteBuku (int index){
    buku_m.delete(index);
}

}

