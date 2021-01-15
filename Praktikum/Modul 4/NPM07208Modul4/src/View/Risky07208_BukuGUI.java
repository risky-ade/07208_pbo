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

public class Risky07208_BukuGUI {
    private static Risky07208_BukuController buku_v = new Risky07208_BukuController();
   JFrame Buku = new JFrame();
    JTable tabelbuku =new JTable();
    JScrollPane scrollbuku = new JScrollPane(tabelbuku);
    JButton update,delete,back;
    JLabel top,labelkode,labeljudul,labelthnterbit,labelpengarang,labelstok;
    JTextField textkode,textjudul,textthnterbit,textpengarang,textstok;
    JComboBox pilkategori = new JComboBox(Risky07208_KategoriEntity.kategoripilbuku);
    int index;
    
    public Risky07208_BukuGUI(){
        Buku.setSize(900, 630);
        Buku.setLayout(null);
        Buku.getContentPane().setBackground(Color.YELLOW);
        
            top =new JLabel("Data Buku");
            top.setBounds(200, 10, 600, 50);
            top.setFont(new Font("Times New Roman",Font.BOLD,40));
            Buku.add(top);
            
            scrollbuku.setBounds(30, 100, 570, 200);
            tabelbuku.setModel(buku_v.listbuku());
            Buku.add(scrollbuku);
            
             pilkategori.setBounds(660, 90, 200, 30);
             Buku.add(pilkategori);
            
        labelkode =new JLabel("Kode buku");
        labelkode.setBounds(660, 120, 100, 30);
        Buku.add(labelkode);
        
        textkode =new JTextField();
        textkode.setBounds(660, 150, 200, 30);
        Buku.add(textkode);
        
        labeljudul =new JLabel("Judul");
        labeljudul.setBounds(660, 180, 100, 30);
        Buku.add(labeljudul);
        
        textjudul =new JTextField();
        textjudul.setBounds(660, 210, 200, 30);
        Buku.add(textjudul);
        
        labelthnterbit =new JLabel("Tahun terbit");
        labelthnterbit.setBounds(660, 240, 100, 30);
        Buku.add(labelthnterbit);
        
        textthnterbit =new JTextField();
        textthnterbit.setBounds(660, 270, 200, 30);
        Buku.add(textthnterbit);
        
        labelpengarang = new JLabel("Pengarang");
        labelpengarang.setBounds(660, 300, 100, 30);
        Buku.add(labelpengarang);
        
        textpengarang = new JTextField();
        textpengarang.setBounds(660, 330, 200, 30);
        Buku.add(textpengarang);
               
        labelstok = new JLabel("Stok");
        labelstok.setBounds(660, 360, 100, 30);
        Buku.add(labelstok);
        
        textstok = new JTextField();
        textstok.setBounds(660, 390, 200, 30);
        Buku.add(textstok);
        //
            
            update =new JButton("ubah buku");
            update.setBounds(660, 450, 100, 30);
            update.setBackground(Color.GREEN);
            Buku.add(update);
            
            delete =new JButton("hapus buku");
            delete.setBounds(760, 450, 100, 30);
            delete.setBackground(Color.GREEN);
            Buku.add(delete);
            
            
            back = new JButton("back");
            back.setBounds(50, 450, 100, 30);
            back.setBackground(Color.red);
            Buku.add(back);
            
            Buku.setLocationRelativeTo(null);
            Buku.setVisible(true);
            Buku.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Buku.dispose();
                Risky07208_AdminGUI min = new Risky07208_AdminGUI();
            }
        });
        tabelbuku.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int i = tabelbuku.getSelectedRow();
                index=i;
                pilkategori.setSelectedItem(Risky07208_allobjctrl.buku.listbuku().getValueAt(i, 0).toString());
                textkode.setText(Risky07208_allobjctrl.buku.listbuku().getValueAt(i, 1).toString());
                textjudul.setText(Risky07208_allobjctrl.buku.listbuku().getValueAt(i, 2).toString());
                textthnterbit.setText(Risky07208_allobjctrl.buku.listbuku().getValueAt(i, 3).toString());
                textpengarang.setText(Risky07208_allobjctrl.buku.listbuku().getValueAt(i, 4).toString());
                textstok.setText(Risky07208_allobjctrl.buku.listbuku().getValueAt(i, 5).toString()); 
                
            }            
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                        String kodebuku = textkode.getText();
                        String judul = textjudul.getText();
                        String tahunterbit = textthnterbit.getText();
                        String pengarang = textpengarang.getText();
                        int stok = Integer.valueOf(textstok.getText());
                        Risky07208_allobjctrl.buku.deleteBuku(index);
                        JOptionPane.showMessageDialog(null,"Hapus Buku Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                        tabelbuku.setModel(Risky07208_allobjctrl.buku.listbuku());
                    }catch (Exception exception){}
            }
        });
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try{
                        String kodebuku = textkode.getText();
                        String judul = textjudul.getText();
                        String tahunterbit = textthnterbit.getText();
                        String pengarang = textpengarang.getText();
                        int stok = Integer.valueOf(textstok.getText());
                        Risky07208_allobjctrl.buku.updateBuku(index, judul, kodebuku, tahunterbit, pengarang,pilkategori.getSelectedIndex(), stok);
                        JOptionPane.showMessageDialog(null,"Input Buku Sukses","Information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                        tabelbuku.setModel(Risky07208_allobjctrl.buku.listbuku());
                    }catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"Format Salah", "input buku Gagal", JOptionPane.INFORMATION_MESSAGE);
                    }
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
