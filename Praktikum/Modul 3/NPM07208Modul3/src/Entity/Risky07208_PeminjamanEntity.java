package Entity;

import java.util.Date;
public class Risky07208_PeminjamanEntity {
    private String no_pinjam,status;
    private int index_Buku;
    private Risky07208_AnggotaEntity index_Anggota;
    private int jumlah;      
    private Date tgl_pinjam;

 public void Risky07208_PeminjamanEntity(String status, String no_pinjam, int index_Buku, Risky07208_AnggotaEntity index_Anggota,int jumlah,Date tgl_pinjam){
        this.status=status;
        this.no_pinjam=no_pinjam;
        this.index_Buku=index_Buku;
        this.index_Anggota=index_Anggota;
        this.jumlah=jumlah;
        this.tgl_pinjam=tgl_pinjam;
        
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNo_pinjam(String no_pinjam) {
        this.no_pinjam = no_pinjam;
    }

    public void setIndex_Buku(int index_Buku) {
        this.index_Buku=index_Buku;
    }

    public void setIndex_Anggota(Risky07208_AnggotaEntity index_Anggota) {
        this.index_Anggota = index_Anggota;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setTgl_pinjam(Date tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public String getStatus() {
        return status;
    }
    public String getNo_pinjam() {
        return no_pinjam;
    }

    public int getIndex_Buku() {
        return index_Buku;
    }

    public Risky07208_AnggotaEntity getIndex_Anggota() {
        return index_Anggota;
    }

    public int getJumlah() {
        return jumlah;
    }

    public Date getTgl_pinjam() {
        return tgl_pinjam;
    }       
            
}

