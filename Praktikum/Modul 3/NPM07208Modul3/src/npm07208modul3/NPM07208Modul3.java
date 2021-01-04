package npm07208modul3;

import Entity.*;
import Controller.*;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NPM07208Modul3 {
   Risky07208_AnggotaController anggota_c = new Risky07208_AnggotaController();
   Risky07208_AdminController admin_c = new Risky07208_AdminController();
   Risky07208_BukuController buku_c = new Risky07208_BukuController();
   Risky07208_KategoriEntity kategori= new Risky07208_KategoriEntity();
   Risky07208_PeminjamanController pinjam_c=new Risky07208_PeminjamanController();
   Scanner input = new Scanner(System.in);

  
    public static void main(String[] args) {
       // constraktor 
         NPM07208Modul3 app = new NPM07208Modul3();
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
               System.out.print("1. Login Admin" + "\n2. Login Anggota"+
                       "\nPilih : ");
                       pilLogin = input.nextInt();
                       System.out.print("ID KTP = ");
                            String ktp = input.next();
                            System.out.print("Password = ");
                            String pass = input.next();
                       if(pilLogin == 1){
                            admin_c.DataAdmin();
                            LoginAdmin(ktp, pass);
                            break;
                       }else{
                            Login(ktp, pass);
                            
                            break;
                       }
                             
           }
       }while(Risky07208_pil!=3);
    }
    
    
    
    public void Login (String ktp, String pass){
    
            boolean isLogin = false;
        int i;
        // Cek Login
        for (i = 0; i < anggota_c.getListAnggota().size(); i++) {
            if(ktp.equals(anggota_c.getListAnggota().get(i).getKtp()) && pass.equals(anggota_c.getListAnggota().get(i).getPassword())){
                isLogin = true;
                break;
            }else{
                isLogin = false;
            }
        }
        // Get Index Login 
        
        if(isLogin){
            System.out.println("");
            System.out.println("Selamat Datang " + anggota_c.getListAnggota().get(i).getNama()+ " Di Sistem Informasi Perpustakaan !!");
            menuAnggota();
        }else{
            System.out.println("Username Atau Password Salah\n");
        }   
        }
        
    
    public void LoginAdmin(String ktp, String pass){
    
            boolean isLogin = false;
        int i;
        // Cek Login
        for (i = 0; i < admin_c.admin_m.getListAdmin().size(); i++) {
            if(ktp.equals(admin_c.admin_m.getListAdmin().get(i).getKtp()) && pass.equals(admin_c.admin_m.getListAdmin().get(i).getPassword())){
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
        System.out.print("Input ID Perpus = ");
        String id_perpus = input.next();
       anggota_c.insertAnggota(ktp, nama, alamat, no_telp, pass, id_perpus);
        
    }
     public void add_databuku(){
        try{
        for(int i=0;i<kategori.kategoripilbuku.length;i++){
        System.out.println(i+"."+kategori.kategoripilbuku[i]);
        }
        System.out.println("Pilih kategori buku = ");
        int indexpilbuku = input.nextInt();
        System.out.print("Input Kode Buku = ");
        String kodebuku = input.next();
        System.out.print("Input Judul Buku = ");
        String judulbuku = input.next();        
        System.out.print("Input Tahun Terbit = ");
        String tahunterbit = input.next();
        System.out.print("Input Pengarang = ");
        String pengarang = input.next();
        System.out.print("Input Stok Buku = ");
        int stok = input.nextInt();
        buku_c.insertBuku(judulbuku, kodebuku, tahunterbit, pengarang, indexpilbuku, stok);
        System.out.print("Data Buku Berhasil Disimpan !!\n");
        }catch (InputMismatchException a){
            System.out.println("ERROR");
        }
        input.nextLine();
    }
    
    public void menuAnggota(){
        int pil;
        do{
            System.out.println("=== Menu Buku ====");
            System.out.println("1. Lihat buku");
            System.out.println("2. Peminjaman");
            System.out.println("3. Pengembalian");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pil = input.nextInt();

            switch(pil){
                case 1 :
                    viewListBuku();
                    break;
                case 2 : 
                    peminjaman();
                    break;
                case 3 : 
                    
                    break;
    }
        }while (pil!=0);
        }
     
    public void peminjaman(){
        
        int cekBuku = -1;
        if(cekBuku != -1){
            System.out.println("");
            System.out.println("Pinjam Buku");
            System.out.println("Jumlah : ");
            int jumlah = input.nextInt();//jumlah yang dipinjam
            System.out.print("Tanggal Pinjam (dd/mm/yy) : ");
            Date tglPinjam = new Date(input.next()); // input tanggal pinjam
            //pinjam_c.insertPeminjaman(cekBuku,jumlah, tglPinjam);
            System.out.println("Peminjaman berhasil");
        }
            
            
            
    }
 
    public void viewListBuku(){
    
        if(buku_c.getListBuku().size()>0){
            int no = 0;
            for (int i = 0; i < buku_c.getListBuku().size(); i++) {
                no++;
                System.out.println("[Buku " + no + "]");
                System.out.println("kategori buku = "+kategori.kategoripilbuku[buku_c.getListBuku().get(i).getIndexkategoripilbuku()]);
                System.out.println("Kode Buku = "+buku_c.getListBuku().get(i).getKodebuku());
                System.out.println("Judul Buku = "+buku_c.getListBuku().get(i).getJudulbuku());                
                System.out.println("Tahun Terbit = "+buku_c.getListBuku().get(i).getTahunterbit());
                System.out.println("Pengarang = "+buku_c.getListBuku().get(i).getPengarang());      
                System.out.println("Input Stok Buku = "+buku_c.getListBuku().get(i).getStokBuku());
            }
        }else{
            System.out.println("Data Buku Kosong");
        }
    }
    
    public void editBuku(){
        if(buku_c.getListBuku().size()>0){
            for (int i = 0; i < buku_c.getListBuku().size(); i++) {
                System.out.println("["+i+"] "+buku_c.getListBuku().get(i).getJudulbuku());
            }
             
            System.out.print("Pilih Index Buku : ");
            int selectIndex = input.nextInt();
          
        for(int i=0;i<kategori.kategoripilbuku.length;i++){
        System.out.println(i+"."+kategori.kategoripilbuku[i]);
        }
        System.out.println("Pilih kategori buku = ");
        int indexpilbuku = input.nextInt();
        System.out.print("Input Kode Buku = ");
        String kodebuku = input.next();
        System.out.print("Input Judul Buku = ");
        String judulbuku = input.next();
        System.out.print("Input Tahun Terbit = ");
        String tahunterbit = input.next();
        System.out.print("Input Pengarang = ");
        String pengarang = input.next();
        System.out.print("Input Stok Buku = ");
        int stok = input.nextInt();
            buku_c.updateBuku(selectIndex,judulbuku, kodebuku, tahunterbit, pengarang, indexpilbuku, stok);
            
            System.out.print("Data Buku Berhasil Diubah !!\n");
        }else{
            System.out.println("Data Buku Kosong\n");
        }
    }
    
   public void deleteBuku(){
        if(buku_c.getListBuku().size()>0){
            for (int i = 0; i < buku_c.getListBuku().size(); i++) {
                System.out.println("["+i+"] "+buku_c.getListBuku().get(i).getJudulbuku());
            }
            
            System.out.print("Pilih Index Buku : ");
            int selectIndex = input.nextInt();
            
            buku_c.deleteBuku(selectIndex);
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
            System.out.println("5. Lihat List Anggota");
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
                case 5 :
                    lihatAnggota();
                    break;
            }
        }while (pil!=0);
    }
    
    public void lihatAnggota(){
         if(anggota_c.getListAnggota().size()>0){
            int no = 0;
            System.out.println("list Nama Anggota");
            for (int i = 0; i < anggota_c.getListAnggota().size(); i++) {
                no++;
                System.out.print("[ "+ no + " ]: " +anggota_c.getListAnggota().get(i).getNama());
                System.out.println( " Id : " +anggota_c.getListAnggota().get(i).getIdPerpus());
            }
        }else{
             System.out.println("List Anggota Kosong");
         }
    }
    
    
}
