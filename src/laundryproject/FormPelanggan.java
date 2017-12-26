/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryproject;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Seviana Pungky B.
 */
public class FormPelanggan extends javax.swing.JFrame {
    LaundryProject konek= new LaundryProject();


    /**
     * Creates new form FormPelanggan
     */
    public FormPelanggan() {
        initComponents();
        setLocationRelativeTo(this);
        aktif(false);
        btubah.setEnabled(false);
        bthapus.setEnabled(false);
        btsimpan.setEnabled(false);
        btbatal.setEnabled(false);
        bttambah.setEnabled(true);
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtidplg = new javax.swing.JTextField();
        txtnmplg = new javax.swing.JTextField();
        txtnohpplg = new javax.swing.JTextField();
        btmenu = new javax.swing.JButton();
        btsimpan = new javax.swing.JButton();
        btubah = new javax.swing.JButton();
        btbatal = new javax.swing.JButton();
        bthapus = new javax.swing.JButton();
        bttambah = new javax.swing.JButton();
        cmdsearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtalamatplg = new javax.swing.JTextArea();
        btlihatdata = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pelanggan - Camte Laundry Kiloan");

        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Bell Gothic Std Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PELANGGAN");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(197, 197, 197))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("ID Pelanggan");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("No Hp");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Alamat");

        txtidplg.setText("P-");

        txtnmplg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnmplgActionPerformed(evt);
            }
        });

        txtnohpplg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnohpplgActionPerformed(evt);
            }
        });

        btmenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/home.png"))); // NOI18N
        btmenu.setText("Back To Menu");
        btmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuActionPerformed(evt);
            }
        });

        btsimpan.setText("Simpan");
        btsimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btsimpanMouseClicked(evt);
            }
        });
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });

        btubah.setText("Ubah");
        btubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btubahActionPerformed(evt);
            }
        });

        btbatal.setText("Batal");
        btbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbatalActionPerformed(evt);
            }
        });

        bthapus.setText("Hapus");
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });

        bttambah.setText("Tambah");
        bttambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttambahActionPerformed(evt);
            }
        });

        cmdsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/searchicon-25.png"))); // NOI18N
        cmdsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsearchActionPerformed(evt);
            }
        });

        txtalamatplg.setColumns(20);
        txtalamatplg.setRows(5);
        jScrollPane2.setViewportView(txtalamatplg);

        btlihatdata.setText("Lihat Data Pelanggan");
        btlihatdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlihatdataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btlihatdata)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(62, 62, 62)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                        .addComponent(txtnmplg)
                                        .addComponent(txtnohpplg)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(26, 26, 26)
                                    .addComponent(txtidplg)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmdsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bttambah, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btmenu)
                                    .addGap(114, 114, 114))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btubah, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btsimpan)
                                    .addGap(11, 11, 11)
                                    .addComponent(btbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(bthapus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btlihatdata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(cmdsearch)
                    .addComponent(txtidplg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtnmplg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtnohpplg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bthapus)
                    .addComponent(bttambah)
                    .addComponent(btsimpan)
                    .addComponent(btubah)
                    .addComponent(btbatal))
                .addGap(18, 18, 18)
                .addComponent(btmenu)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnmplgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnmplgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnmplgActionPerformed

    private void txtnohpplgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnohpplgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnohpplgActionPerformed

    private void btbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbatalActionPerformed
        // TODO add your handling code here:
        aktif(false);
        btubah.setEnabled(false);
        bthapus.setEnabled(false);
        btsimpan.setEnabled(false);
        btbatal.setEnabled(false);
        bttambah.setEnabled(true);
        txtidplg.setText("P-");
        txtnmplg.setText("");
        txtnohpplg.setText("");
        txtalamatplg.setText("");
    }//GEN-LAST:event_btbatalActionPerformed

    private void btubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btubahActionPerformed
        // TODO add your handling code here:
        String idplg = txtidplg.getText();
        String nama = txtnmplg.getText();
        String nohp = txtnohpplg.getText();
        String alamat = txtalamatplg.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = (Connection) DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/projectlaundry", "root", "");
            Statement statement = (Statement) koneksi.createStatement();
            String sql="UPDATE pelanggan SET namaplg='"+nama+"',nohp='"+nohp+"',alamat='"+alamat+"' WHERE id_plg LIKE '"+idplg+"'";
            statement.executeUpdate(sql);
            statement.close();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah","Informasi",JOptionPane.INFORMATION_MESSAGE);
            koneksi.close();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btubahActionPerformed

    private void btmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuActionPerformed
        // TODO add your handling code here:
        new FormMenu();
        this.dispose();
    }//GEN-LAST:event_btmenuActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        // TODO add your handling code here:          
        String idplg = txtidplg.getText();
        String nama = txtnmplg.getText();
        String nohp = txtnohpplg.getText();
        String alamat = txtalamatplg.getText();
        {
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection koneksi = (Connection) DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/projectlaundry", "root", "");
                Statement statement = (Statement) koneksi.createStatement();
                String sql="insert into pelanggan values('"+idplg+"','"+nama+"','"+nohp+"','"+alamat+"')";
                int executeUpdate = statement.executeUpdate(sql);
                statement.close();
                JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan","Informasi",JOptionPane.INFORMATION_MESSAGE);
                
                aktif(true);
                idauto();
                //txtidplg.setText("P-");
                txtnmplg.setText("");
                txtnohpplg.setText("");
                txtalamatplg.setText("");
                koneksi.close();
            }
            catch (     ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e){
                JOptionPane.showMessageDialog(null, "Error: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btsimpanActionPerformed

    private void bttambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttambahActionPerformed
        // TODO add your handling code here:
        idauto();
        btubah.setEnabled(false);
        bthapus.setEnabled(false);
        btsimpan.setEnabled(true);
        btbatal.setEnabled(true);
        bttambah.setEnabled(false); 
        aktif(true);
        
    }//GEN-LAST:event_bttambahActionPerformed

    private void btsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btsimpanMouseClicked
        // TODO add your handling code here: 
    }//GEN-LAST:event_btsimpanMouseClicked

    private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
        // TODO add your handling code here:
        String idplg = txtidplg.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = (Connection) DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/projectlaundry", "root", "");
            Statement statement = (Statement) koneksi.createStatement();
            String sql="DELETE FROM pelanggan WHERE id_plg LIKE '"+idplg+"'";
            statement.executeUpdate(sql);
            statement.close();
            txtidplg.setText("P-");
            txtnmplg.setText("");
            txtnohpplg.setText("");
            txtalamatplg.setText("");
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus","Informasi",JOptionPane.INFORMATION_MESSAGE);
            koneksi.close();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e) { JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bthapusActionPerformed

    private void cmdsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsearchActionPerformed
        // TODO add your handling code here:
        String idplg = txtidplg.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = (Connection) DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/projectlaundry", "root", "");
            Statement statement = (Statement) koneksi.createStatement();
            String sql="SELECT * FROM pelanggan WHERE id_plg like '"+idplg+"'";
            ResultSet rs = statement.executeQuery(sql);
        if (rs.next()){
            aktif(true);
            btubah.setEnabled(true);
            bthapus.setEnabled(true);
            btbatal.setEnabled(true);
            bttambah.setEnabled(false);
            btsimpan.setEnabled(false);
            txtnmplg.setText(rs.getString(2));
            txtnohpplg.setText(rs.getString(3));
            txtalamatplg.setText(rs.getString(4));
            JOptionPane.showMessageDialog(null, "Data ditemukan","Informasi",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan ","Informasi",JOptionPane.INFORMATION_MESSAGE);
        }
        statement.close();
            koneksi.close();
        }
        catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Eror:"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_cmdsearchActionPerformed

    private void btlihatdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlihatdataActionPerformed
        // TODO add your handling code here:
        new DataPelanggan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btlihatdataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbatal;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton btlihatdata;
    private javax.swing.JButton btmenu;
    private javax.swing.JButton btsimpan;
    private javax.swing.JButton bttambah;
    private javax.swing.JButton btubah;
    private javax.swing.JButton cmdsearch;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtalamatplg;
    private javax.swing.JTextField txtidplg;
    private javax.swing.JTextField txtnmplg;
    private javax.swing.JTextField txtnohpplg;
    // End of variables declaration//GEN-END:variables

     private void aktif(boolean x) {
      txtidplg.requestFocus();
      txtnmplg.setEditable(x);
      txtnohpplg.setEditable(x);
      txtalamatplg.setEditable(x);
    }


    private void idauto()
    {
        konek.getkoneksi();
        try {
            String sql="select max(right(id_plg,5)) as no from pelanggan";
            konek.rs=konek.st.executeQuery(sql);
            while(konek.rs.next()){
                
                if(konek.rs.first()==false){
                    txtidplg.setText("P-00001");
                }
                else{
                    konek.rs.last();
                    int a = konek.rs.getInt(1)+1;
                    String kode1 = String.valueOf(a);
                    int kode_leng=kode1.length();
                    
                    for(int i=0;i<5-kode_leng;i++){
                        kode1="0"+kode1;
                    }
                txtidplg.setText("P-"+kode1);
                }
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Kesalahan ID = "+e);
        }
    }
}
