package npm07208modul2;

import Entity.Risky07208_AnggotaEntity;
import Entity.Risky07208_BukuEntity;
import Entity.Risky07208_KategoriEntity;
import Model.Risky07208_BukuModel;
import Model.Risky07208_AnggotaModel;
import Model.Risky07208_AdminModel;

import java.util.Scanner;

public class NPM07208Modul2 {
    Risky07208_AnggotaModel anggota_m = new Risky07208_AnggotaModel();
    Risky07208_BukuModel buku_m = new Risky07208_BukuModel();
    Risky07208_KategoriEntity kategori= new Risky07208_KategoriEntity();
    Risky07208_AdminModel admin_m = new Risky07208_AdminModel();
    Scanner input = new Scanner(System.in);

  
    public static void main(String[] args) {
        //constraktor 
         NPM07208Modul2 app = new NPM07208Modul2();
        app.menu_awal();
    }
    
    public void menu_awal(){
        System.out.println("Selamat Datang Di Perpustakaan Informatika ITATS :");
       int Risky07208_pil;
       
               
       do{
           System.out.println("1. Daftar Anggota");
           System.out.println("2. Login");
           System.out.println("3. Exit");
           System.out.print("Pilih = ");
           Risky07208_pil = input.nextInt();
           switch(Risky07208_pil){
               case 1:
                   daftar();
                   break;
               case 2:
                   int pilLogin;
               System.out.print("1. Login Aslab" + "\n2. Login Anggota"+
                       "\nPilih : ");
                       pilLogin = input.nextInt();
                       System.out.print("ID KTP = ");
                            String ktp = input.next();
                            System.out.print("Password = ");
                            String pass = input.next();
                       if(pilLogin == 1){
                            admin_m.DataAdmin();
                            LoginAdmin(ktp, pass);
                            break;
                       }else{
                            Login(ktp, pass);
                            break;
                       }
                             
           }
       }while(Risky07208_pil!=3);
    }
    
     public void daftar(){
        System.out.print("Input ID Ktp = ");
        String ktp = input.next();
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Alamat = ");
        String alamat = input.next();
        System.out.print("Input No telp = ");
        String no_telp = input.next();
        System.out.print("Input Password = ");
        String pass = input.next();  
        anggota_m.insert(new Risky07208_AnggotaEntity(ktp,nama,alamat,no_telp,pass));
        
    }
    
    public void Login (String ktp, String pass){
    
            boolean isLogin = false;
        int i;
        // Cek Login
        for (i = 0; i < anggota_m.getListAnggota().size(); i++) {
            if(ktp.equals(anggota_m.getListAnggota().get(i).getKtp()) && pass.equals(anggota_m.getListAnggota().get(i).getPassword())){
                isLogin = true;
                break;
            }else{
                isLogin = false;
            }
        }
        // Get Index Login        
        if(isLogin){
            System.out.println("");
            viewMenu();
        }else{
            System.out.println("Username Atau Password Salah\n");
        }       
        }
    
    public void LoginAdmin(String ktp, String pass){
    
            boolean isLogin = false;
        int i;
        // Cek Login
        for (i = 0; i < admin_m.getListAdmin().size(); i++) {
            if(ktp.equals(admin_m.getListAdmin().get(i).getKtp()) && pass.equals(admin_m.getListAdmin().get(i).getPassword())){
                isLogin = true;
                break;
            }else{
                isLogin = false;
            }
        }
        // Get Index Login        
        if(isLogin){
            System.out.println("");
            viewMenu();
        }else{
            System.out.println("Username Atau Password Salah\n");
        }       
        }
            
    
    public void add_databuku(){
        
        for(int i=0;i<kategori.kategoripilbuku.length;i++){
        System.out.println(i+"."+kategori.kategoripilbuku[i]);
        }
        System.out.println("Pilih kategori buku = ");
        int indexpilbuku = input.nextInt();
        System.out.print("Input Kode Buku = ");
        String Risky07208_kodebuku = input.next();
        System.out.print("Input Judul Buku = ");
        String Risky07208_judulbuku = input.next();        
        System.out.print("Input Tahun Terbit = ");
        String Risky07208_tahunterbit = input.next();
        System.out.print("Input Pengarang = ");
        String Risky07208_pengarang = input.next();
        buku_m.insert(new Risky07208_BukuEntity(Risky07208_judulbuku,Risky07208_kodebuku,Risky07208_tahunterbit,Risky07208_pengarang,indexpilbuku));
        System.out.print("Data Buku Berhasil Disimpan !!\n");
    }
    
    public void viewListBuku(){
    
        if(buku_m.getListBuku().size()>0){
            int no = 0;
            for (int i = 0; i < buku_m.getListBuku().size(); i++) {
                no++;
                System.out.println("[Buku " + no + "]");
                System.out.println("kategori buku = "+kategori.kategoripilbuku[buku_m.getListBuku().get(i).getIndexkategoripilbuku()]);
                System.out.println("Kode Buku = "+buku_m.getListBuku().get(i).getRisky07208_kodebuku());
                System.out.println("Judul Buku = "+buku_m.getListBuku().get(i).getRisky07208_judulbuku());                
                System.out.println("Tahun Terbit = "+buku_m.getListBuku().get(i).getRisky07208_tahunterbit());
                System.out.println("Pengarang = "+buku_m.getListBuku().get(i).getRisky07208_pengarang());            }
        }else{
            System.out.println("Data Buku Kosong");
        }
    }
    
    public void editBuku(){
        if(buku_m.getListBuku().size()>0){
            for (int i = 0; i < buku_m.getListBuku().size(); i++) {
                System.out.println("["+i+"] "+buku_m.getListBuku().get(i).getRisky07208_judulbuku());
            }
             
            System.out.print("Pilih Index Buku : ");
            int selectIndex = input.nextInt();
            
          
        for(int i=0;i<kategori.kategoripilbuku.length;i++){
        System.out.println(i+"."+kategori.kategoripilbuku[i]);
        }
        System.out.println("Pilih kategori buku = ");
        int indexpilbuku = input.nextInt();
        System.out.print("Input Kode Buku = ");
        String Risky07208_kodebuku = input.next();
        System.out.print("Input Judul Buku = ");
        String Risky07208_judulbuku = input.next();
        System.out.print("Input Tahun Terbit = ");
        String Risky07208_tahunterbit = input.next();
        System.out.print("Input Pengarang = ");
        String Risky07208_pengarang = input.next();

            buku_m. update(selectIndex, new Risky07208_BukuEntity(Risky07208_kodebuku,Risky07208_judulbuku,Risky07208_tahunterbit,Risky07208_pengarang,indexpilbuku));
            
            System.out.print("Data Buku Berhasil Diubah !!\n");
        }else{
            System.out.println("Data Buku Kosong\n");
        }
    }
    
   public void deleteBuku(){
        if(buku_m.getListBuku().size()>0){
            for (int i = 0; i < buku_m.getListBuku().size(); i++) {
                System.out.println("["+i+"] "+buku_m.getListBuku().get(i).getRisky07208_judulbuku());
            }
            
            System.out.print("Pilih Index Buku : ");
            int selectIndex = input.nextInt();
            
            buku_m.delete(selectIndex);
            System.out.print("Data Buku Berhasil Dihapus !!\n");
        }else{
            System.out.println("Data Buku Kosong\n");
        }
    }
    
    public void viewMenu(){
        int pil;
        do{
            System.out.println("=== Menu Data Buku ====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Ubah Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pil = input.nextInt();

            switch(pil){
                case 1 :
                    add_databuku();
                    break;
                case 2 : 
                    viewListBuku();
                    break;
                case 3 : 
                    editBuku();
                    break;
                case 4 : 
                    deleteBuku();
                    break;
            }
        }while (pil!=0);
    }
    
}
