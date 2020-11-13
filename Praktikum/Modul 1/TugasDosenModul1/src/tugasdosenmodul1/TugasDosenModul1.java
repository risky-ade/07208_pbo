package tugasdosenmodul1;

import java.util.ArrayList;
import java.util.Scanner;


public class TugasDosenModul1 {

   ArrayList <Risky07208_AdminEntity> dataAdmin = new ArrayList();
   ArrayList <Risky07208_BukuEntity> databuku = new ArrayList();
   Scanner input = new Scanner (System.in);
    public static
            void main(String[] args) {
      System.out.println("Selamat Datang Di Perpustakaan Informatika ITATS :");
       int Risky07208_pil;
       
       TugasDosenModul1 var = new TugasDosenModul1();
       
               Scanner input1 = new Scanner (System.in);
       do{
           System.out.println("1. Daftar");
           System.out.println("2. Login");
           System.out.println("3. Exit");
           System.out.print("Pilih = ");
           Risky07208_pil = input1.nextInt();
           switch(Risky07208_pil){
               case 1:
                   var.daftar();
                   break;
               case 2:
                   System.out.print("ID KTP = ");
                   String Risky07208_ktp = input1.next();
                   System.out.print("Password = ");
                   String Risky07208_pass = input1.next();
                   var.Login(Risky07208_ktp, Risky07208_pass);
                   break;          
           }
       }while(Risky07208_pil!=3);
    }
    
    void daftar(){
        
        System.out.print("Input ID Ktp = ");
        String Risky07208_ktp = input.next();
        System.out.print("Input Nama = ");
        String Risky07208_nama = input.next();
        System.out.print("Input Alamat = ");
        String Risky07208_alamat = input.next();
        System.out.print("Input Password = ");
        String Risky07208_pass = input.next();  
        dataAdmin. add(new Risky07208_AdminEntity(Risky07208_ktp,Risky07208_nama,Risky07208_alamat,Risky07208_pass));
        
    }
    
    void viewMenu(){
        
        int Risky07208_pil;
        do{
            System.out.println("=== Menu Buku ====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Ubah Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            Risky07208_pil = input.nextInt();

            switch(Risky07208_pil){
                case 1 :
                    databuku();
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
        }while (Risky07208_pil!=0);
    }
    
    void databuku(){
        for(int i=0;i<Risky07208_KategoriEntity.pilbuku.length;i++){
        System.out.println(i+"."+Risky07208_KategoriEntity.pilbuku[i]);
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
        databuku. add(new Risky07208_BukuEntity(Risky07208_judulbuku,Risky07208_kodebuku,Risky07208_tahunterbit,Risky07208_pengarang,indexpilbuku));
        System.out.print("Data Buku Berhasil Disimpan !!\n");
    }
    
    
        void Login (String Risky07208_ktp, String Risky07208_pass){
           
            boolean isLogin = false;
        int i;
        // Cek Login
        for (i = 0; i < dataAdmin.size(); i++) {
            if(Risky07208_ktp.equals(dataAdmin.get(i).getKtp()) && Risky07208_pass.equals(dataAdmin.get(i).getPassword())){
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
        
         void viewListBuku(){
             
        if(databuku.size()>0){
            int no = 0;
            for (int i = 0; i < databuku.size(); i++) {
                no++;
                System.out.println("[Buku " + no + "]");
                 System.out.println("kategori buku = "+Risky07208_KategoriEntity.pilbuku[databuku.get(i).indexpilbuku]);
                 System.out.println("Kode Buku = "+databuku.get(i).getKodeBuku());
                System.out.println("Judul Buku = "+databuku.get(i).getJudulBuku());                
                System.out.println("Tahun Terbit = "+databuku.get(i).getTahunTerbit());
                System.out.println("Pengarang = "+databuku.get(i).getPengarang());            }
        }else{
            System.out.println("Data Buku Kosong");
        }
    }
        
        void editBuku(){
        if(databuku.size()>0){
            for (int i = 0; i < databuku.size(); i++) {
                System.out.println("["+i+"] "+databuku.get(i).getJudulBuku());
            }
             
            System.out.print("Pilih Index Buku : ");
            int selectIndex = input.nextInt();
            
          
        for(int i=0;i<Risky07208_KategoriEntity.pilbuku.length;i++){
        System.out.println(i+"."+Risky07208_KategoriEntity.pilbuku[i]);
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

            databuku. set(selectIndex, new Risky07208_BukuEntity(Risky07208_kodebuku,Risky07208_judulbuku,Risky07208_tahunterbit,Risky07208_pengarang,indexpilbuku));
            
            System.out.print("Data Buku Berhasil Diubah !!\n");
        }else{
            System.out.println("Data Buku Kosong\n");
        }
    }
    
     void deleteBuku(){
        if(databuku.size()>0){
            for (int i = 0; i < databuku.size(); i++) {
                System.out.println("["+i+"] "+databuku.get(i).getJudulBuku());
            }
            
            System.out.print("Pilih Index Buku : ");
            int selectIndex = input.nextInt();
            
            databuku.remove(selectIndex);
            System.out.print("Data Buku Berhasil Dihapus !!\n");
        }else{
            System.out.println("Data Buku Kosong\n");
        }
    }
}
