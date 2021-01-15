package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Risky07208_GUI {
    JFrame LogReg = new JFrame();
    JLabel login,daftar,top;
    JRadioButton radioadmin,radioanggota;
    JTextField textktplogin,textnama,textnotelp,textktpdaftar,textalamat,textid;
    JLabel labelktplogin,labelnama,labelpasswordlogin,labelnotelp,labelalamat,labelid,labelktpdaftar,labelpassworddaftar;
    JButton check,reg;
    JPasswordField passwordlogin,passworddaftar;
    private boolean ceklogin = false;
    
    public Risky07208_GUI(){
        
        LogReg.setSize(700, 630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.PINK);
        top = new JLabel("Sistem Informasi Perpustakaan");
        top.setBounds(50, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        LogReg.add(top);
        
        login = new JLabel("login");
        login.setBounds(100, 50, 100, 100);
        login.setFont(new Font("Times New Roman",Font.BOLD,30));
        LogReg.add(login);
        
        radioadmin = new JRadioButton("Admin pepus");
        radioadmin.setBounds(30, 150, 100, 30);
        radioadmin.setBackground(Color.CYAN);
        LogReg.add(radioadmin);
        
        radioanggota = new JRadioButton("Anggota");
        radioanggota.setBounds(140, 150, 100, 30);
        radioanggota.setBackground(Color.CYAN);
        LogReg.add(radioanggota);
        
        labelktplogin = new JLabel("KTP");
        labelktplogin.setBounds(30, 180, 30, 30);
        LogReg.add(labelktplogin);
        
        textktplogin = new JTextField();
        textktplogin.setBounds(30, 210, 200, 30);
        LogReg.add(textktplogin);
        
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(30, 240, 200, 30);
        LogReg.add(labelpasswordlogin);
        
        passwordlogin =new JPasswordField();
        passwordlogin.setBounds(30, 270, 200, 30);
        LogReg.add(passwordlogin);
        
        check =new JButton("check");
        check.setBounds(90, 320, 100, 40);
        check.setBackground(Color.GREEN);
        LogReg.add(check);
        
        daftar =new JLabel("Buat Akun");
        daftar.setFont(new Font("Times New Roman",Font.BOLD,30));
        daftar.setBounds(440, 50, 150, 100);
        LogReg.add(daftar);
        
        labelktpdaftar =new JLabel("Ktp");
        labelktpdaftar.setBounds(400, 150, 30, 30);
        LogReg.add(labelktpdaftar);
        
        textktpdaftar =new JTextField();
        textktpdaftar.setBounds(400, 180, 200, 30);
        LogReg.add(textktpdaftar);
        
        labelnama =new JLabel("Nama");
        labelnama.setBounds(400, 210, 100, 30);
        LogReg.add(labelnama);
        
        textnama =new JTextField();
        textnama.setBounds(400, 240, 200, 30);
        LogReg.add(textnama);
        
        labelpassworddaftar =new JLabel("Password");
        labelpassworddaftar.setBounds(400, 270, 100, 30);
        LogReg.add(labelpassworddaftar);
        
        passworddaftar =new JPasswordField();
        passworddaftar.setBounds(400, 300, 200, 30);
        LogReg.add(passworddaftar);
        
        labelnotelp = new JLabel("No Telepon");
        labelnotelp.setBounds(400, 330, 100, 30);
        LogReg.add(labelnotelp);
        
        textnotelp = new JTextField();
        textnotelp.setBounds(400, 360, 200, 30);
        LogReg.add(textnotelp);
               
        labelalamat = new JLabel("Alamat");
        labelalamat.setBounds(400, 390, 200, 30);
        LogReg.add(labelalamat);
        
        textalamat = new JTextField();
        textalamat.setBounds(400, 420, 200, 30);
        LogReg.add(textalamat);
        
        labelid = new JLabel("ID Anggota");
        labelid.setBounds(400, 450, 200, 30);
        LogReg.add(labelid);
        
        textid =new JTextField();
        textid.setBounds(400, 480, 200, 30);
        LogReg.add(textid);
        
        reg = new JButton("Daftar");
        reg.setBounds(460, 520, 100, 40);
        reg.setBackground(Color.GREEN);
        LogReg.add(reg);
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        radioadmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioadmin.isSelected()){
                    radioanggota.setSelected(false);
                    ceklogin = true;
                }
                
            }
        });
        radioanggota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioanggota.isSelected()){
                    radioadmin.setSelected(false);
                    ceklogin = false;
                }
            }
        });
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ceklogin == true){
                    try{
                        Risky07208_allobjctrl.admin.DataAdmin();
                        Risky07208_allobjctrl.admin.login(textktplogin.getText(), passwordlogin.getText());
                        String nama = Risky07208_allobjctrl.admin.adminEntity().getNama();
                        JOptionPane.showMessageDialog(null,"Selamat Datang "+nama,"Information",JOptionPane.INFORMATION_MESSAGE);
                        Risky07208_AdminGUI Admin = new Risky07208_AdminGUI();
                        LogReg.dispose();
                    
                    }catch (Exception exception){
                        JOptionPane.showMessageDialog(null,"KTP atau Password salah","Information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }else{
                    try{
                        Risky07208_allobjctrl.anggota.login(textktplogin.getText(),passwordlogin.getText());
                        String nama = Risky07208_allobjctrl.anggota.anggotaEntity().getNama();
                        JOptionPane.showMessageDialog(null,"Selamat Datang "+nama,"Information",JOptionPane.INFORMATION_MESSAGE);
                        Risky07208_AnggotaGUI anggo = new Risky07208_AnggotaGUI();
                        LogReg.dispose();
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null,"KTP atau Password salah","Information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                }
            }
        });
        reg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try{
                   String ktp = textktpdaftar.getText();
                   String alamat = textalamat.getText();                   
                   String nama = textnama.getText();
                   String pass =passworddaftar.getText();
                   String notelp = textnotelp.getText();
                   String idanggota = textid.getText();
                   Risky07208_allobjctrl.anggota.insertAnggota(ktp, nama, alamat, notelp, pass, idanggota);
                   JOptionPane.showMessageDialog(null,"Register Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                   kosong();
               }catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"Format Salah", "Register Gagal", JOptionPane.INFORMATION_MESSAGE);
               }
            }
        });
    }
    void kosong(){
        textktpdaftar.setText(null);
        textnama.setText(null);
        passworddaftar.setText(null);
        textalamat.setText(null);
        textnotelp.setText(null);
        textktplogin.setText(null);
        passwordlogin.setText(null);
        textid.setText(null);
    }
}
