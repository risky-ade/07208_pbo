
package View;

import javax.swing.*;
import Controller.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Entity.Risky07208_KategoriEntity;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Risky07208_AdminGUI {
    
    private Risky07208_AnggotaController anggota_v = new Risky07208_AnggotaController();
    JFrame Admin = new JFrame();
    JTable tabelanggota =new JTable();
    JScrollPane scrolladmin = new JScrollPane(tabelanggota);
    JButton insert,view,update,delete,back;
    JLabel admin,anggota,labelkode,labeljudul,labelthnterbit,labelpengarang,labelstok;
    JTextField textkode,textjudul,textthnterbit,textpengarang,textstok;
    JComboBox pilkategori = new JComboBox(Risky07208_KategoriEntity.kategoripilbuku);
    
    public Risky07208_AdminGUI(){
        Admin.setSize(900, 630);
        Admin.setLayout(null);
        Admin.getContentPane().setBackground(Color.YELLOW);
        
            admin =new JLabel("Admin Perpus");
            admin.setBounds(200, 10, 600, 50);
            admin.setFont(new Font("Times New Roman",Font.BOLD,40));
            Admin.add(admin);
            
            scrolladmin.setBounds(30, 130, 570, 200);
            tabelanggota.setModel(anggota_v.daftaranggota());
            Admin.add(scrolladmin);
            //
            anggota =new JLabel("Daftar Anggota");
            anggota.setBounds(30, 10, 570, 200);
            anggota.setFont(new Font("Times New Roman",Font.BOLD,20));
            Admin.add(anggota);
            
            
            pilkategori.setBounds(660, 90, 200, 30);
            Admin.add(pilkategori);
            
        labelkode =new JLabel("Kode buku");
        labelkode.setBounds(660, 120, 100, 30);
        Admin.add(labelkode);
        
        textkode =new JTextField();
        textkode.setBounds(660, 150, 200, 30);
        Admin.add(textkode);
        
        labeljudul =new JLabel("Judul");
        labeljudul.setBounds(660, 180, 100, 30);
        Admin.add(labeljudul);
        
        textjudul =new JTextField();
        textjudul.setBounds(660, 210, 200, 30);
        Admin.add(textjudul);
        
        labelthnterbit =new JLabel("Tahun terbit");
        labelthnterbit.setBounds(660, 240, 100, 30);
        Admin.add(labelthnterbit);
        
        textthnterbit =new JTextField();
        textthnterbit.setBounds(660, 270, 200, 30);
        Admin.add(textthnterbit);
        
        labelpengarang = new JLabel("Pengarang");
        labelpengarang.setBounds(660, 300, 100, 30);
        Admin.add(labelpengarang);
        
        textpengarang = new JTextField();
        textpengarang.setBounds(660, 330, 200, 30);
        Admin.add(textpengarang);
               
        labelstok = new JLabel("Stok");
        labelstok.setBounds(660, 360, 100, 30);
        Admin.add(labelstok);
        
        textstok = new JTextField();
        textstok.setBounds(660, 390, 200, 30);
        Admin.add(textstok);
        //
            
            insert =new JButton("input buku");
            insert.setBounds(690, 450, 100, 30);
            insert.setBackground(Color.GREEN);
            Admin.add(insert);
            
            view =new JButton("lihat buku");
            view.setBounds(350, 450, 100, 30);
            view.setBackground(Color.GREEN);
            Admin.add(view);
            
         
            
            back = new JButton("back");
            back.setBounds(50, 450, 100, 30);
            back.setBackground(Color.red);
            Admin.add(back);
            
            Admin.setLocationRelativeTo(null);
            Admin.setVisible(true);
            Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin.dispose();
                Risky07208_GUI men = new Risky07208_GUI();
            }
        });
            
            
            insert.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    try{
                        String kodebuku = textkode.getText();
                        String judul = textjudul.getText();
                        String tahunterbit = textthnterbit.getText();
                        String pengarang = textpengarang.getText();
                        int stok = Integer.valueOf(textstok.getText());
                        Risky07208_allobjctrl.buku.insertBuku(judul, kodebuku, tahunterbit, pengarang, pilkategori.getSelectedIndex(), stok);
                        JOptionPane.showMessageDialog(null,"Input Buku Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"Format Salah", "input buku Gagal", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            });

        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin.dispose();
                Risky07208_BukuGUI buku =new Risky07208_BukuGUI();
            }
        });
        
 }
    public void kosong(){
        textkode.setText(null);
        textjudul.setText(null);
        textthnterbit.setText(null);
        textpengarang.setText(null);
        textstok.setText(null);
    }
   
}
