
package View;


import javax.swing.*;
import Controller.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Risky07208_AnggotaGUI {
   private static Risky07208_BukuController buku_v = new Risky07208_BukuController();
   JFrame Anggota = new JFrame();
   JTable tabelbuku =new JTable();
   JScrollPane scrollbuku = new JScrollPane(tabelbuku);
   JButton back;
   JLabel top;
   int index;
    
    public Risky07208_AnggotaGUI(){
        Anggota.setSize(700, 450);
        Anggota.setLayout(null);
        Anggota.getContentPane().setBackground(Color.YELLOW);
        
            top =new JLabel("Data Buku");
            top.setBounds(200, 10, 600, 50);
            top.setFont(new Font("Times New Roman",Font.BOLD,40));
            Anggota.add(top);
            
            scrollbuku.setBounds(30, 100, 570, 200);
            tabelbuku.setModel(buku_v.listbuku());
            Anggota.add(scrollbuku);
            
            back = new JButton("back");
            back.setBounds(50, 350, 100, 30);
            back.setBackground(Color.red);
            Anggota.add(back);
            
            Anggota.setLocationRelativeTo(null);
            Anggota.setVisible(true);
            Anggota.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Anggota.dispose();
                Risky07208_GUI man = new Risky07208_GUI();
            }
        });
        
    }
    
}
