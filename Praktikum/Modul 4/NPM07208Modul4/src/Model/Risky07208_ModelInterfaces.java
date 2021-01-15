package Model;

public interface Risky07208_ModelInterfaces { // jadi class model yang menggunakan methode yang sama harus
    //mengimplementasikan ke model interface agar bisa menggunakan methode" yang ada di model interface 
    public void insert(Object x);
    public void update(int index, Object x);
    public void delete(int index);
    public int cekData(String ktp, String password);
    //public void getwhere(int index);
}
