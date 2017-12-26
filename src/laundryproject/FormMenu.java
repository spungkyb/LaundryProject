/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundryproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Seviana Pungky B.
 */
public class FormMenu extends javax.swing.JFrame {
     java.util.Date tglsekarang = new java.util.Date();
    private SimpleDateFormat smpdtfmt = new SimpleDateFormat("MMMMMMMMM, dd yyyy", Locale.getDefault());
    //diatas adalah pengaturan format penulisan, bisa diubah sesuai keinginan.
    private String tanggal = smpdtfmt.format(tglsekarang);
    private Connection Con;
    private Statement stm;

    /**
     * Creates new form FormMenu
     */
    public FormMenu() {
        initComponents();
        this.setExtendedState(FormMenu.MAXIMIZED_BOTH);
        date.setText(tanggal);
        setTime();
    }
    
    public final void setTime(){
        ActionListener taskPerformer = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            String nol_jam = "", nol_menit = "",nol_detik = "";

            java.util.Date dateTime = new java.util.Date();
            int nilai_jam = dateTime.getHours();
            int nilai_menit = dateTime.getMinutes();
            int nilai_detik = dateTime.getSeconds();
            if(nilai_jam <= 9) nol_jam= "0";
            if(nilai_menit <= 9) nol_menit= "0";
            if(nilai_detik <= 9) nol_detik= "0";
            String jam = nol_jam + Integer.toString(nilai_jam);
            String menit = nol_menit + Integer.toString(nilai_menit);
            String detik = nol_detik + Integer.toString(nilai_detik);
            time.setText(jam+":"+menit+":"+detik+"");
            }
        };
        new Timer(1000, taskPerformer).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mlyn = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mplgbr = new javax.swing.JMenuItem();
        mdtplg = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        mtransaksibaru = new javax.swing.JMenuItem();
        mdatatransaksi = new javax.swing.JMenuItem();
        mcetaktransaksi = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        mstatus = new javax.swing.JMenuItem();
        mdtstatus = new javax.swing.JMenuItem();
        j = new javax.swing.JMenu();
        mlaporan = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        mabout = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        mlogout = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        mkeluar = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        jMenu8.setText("File");
        jMenuBar3.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar3.add(jMenu9);

        jMenu11.setText("jMenu11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - Camte Laundry Kiloan");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/laundrypic.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1364, 647));
        jLabel1.setMinimumSize(new java.awt.Dimension(1364, 647));
        jLabel1.setPreferredSize(new java.awt.Dimension(1364, 647));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1364, 66));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATE : ");

        date.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("date");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIME : ");

        time.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("time");

        exit.setFont(new java.awt.Font("Bell Gothic Std Black", 1, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Bell Gothic Std Black", 1, 18)); // NOI18N
        logout.setText("LOG OUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(326, 326, 326)
                .addComponent(logout)
                .addGap(43, 43, 43)
                .addComponent(exit)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logout)
                        .addComponent(exit))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(date)
                        .addComponent(jLabel4)
                        .addComponent(time)))
                .addGap(17, 17, 17))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/24x24l.png"))); // NOI18N
        jMenu2.setText("Layanan");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mlyn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/Create.png"))); // NOI18N
        mlyn.setText("Master Layanan");
        mlyn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlynActionPerformed(evt);
            }
        });
        jMenu2.add(mlyn);

        jMenuBar1.add(jMenu2);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/24x24plg.png"))); // NOI18N
        jMenu7.setText("Pelanggan");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mplgbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/Create.png"))); // NOI18N
        mplgbr.setText("Tambah Pelanggan Baru");
        mplgbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mplgbrActionPerformed(evt);
            }
        });
        jMenu7.add(mplgbr);

        mdtplg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/People.png"))); // NOI18N
        mdtplg.setText("Data Pelanggan");
        mdtplg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdtplgActionPerformed(evt);
            }
        });
        jMenu7.add(mdtplg);

        jMenuBar1.add(jMenu7);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/24x24transaksi.png"))); // NOI18N
        jMenu10.setText("Transaksi");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mtransaksibaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/Create.png"))); // NOI18N
        mtransaksibaru.setText("Transaksi Baru");
        mtransaksibaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtransaksibaruActionPerformed(evt);
            }
        });
        jMenu10.add(mtransaksibaru);

        mdatatransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/Report.png"))); // NOI18N
        mdatatransaksi.setText("Data Transaksi");
        mdatatransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdatatransaksiActionPerformed(evt);
            }
        });
        jMenu10.add(mdatatransaksi);

        mcetaktransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/Print.png"))); // NOI18N
        mcetaktransaksi.setText("Cetak Transaksi");
        mcetaktransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcetaktransaksiActionPerformed(evt);
            }
        });
        jMenu10.add(mcetaktransaksi);

        jMenuBar1.add(jMenu10);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/24x24status.png"))); // NOI18N
        jMenu12.setText("Status");
        jMenu12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/16x16sts.png"))); // NOI18N
        mstatus.setText("Status Laundry");
        mstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mstatusActionPerformed(evt);
            }
        });
        jMenu12.add(mstatus);

        mdtstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/Report.png"))); // NOI18N
        mdtstatus.setText("Data Status Laundry");
        mdtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdtstatusActionPerformed(evt);
            }
        });
        jMenu12.add(mdtstatus);

        jMenuBar1.add(jMenu12);

        j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/24x24laporan.png"))); // NOI18N
        j.setText("Keuangan");
        j.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mlaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/Dollar.png"))); // NOI18N
        mlaporan.setText("Laporan Keuangan");
        mlaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlaporanActionPerformed(evt);
            }
        });
        j.add(mlaporan);

        jMenuBar1.add(j);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/24x24about.png"))); // NOI18N
        jMenu14.setText("About");
        jMenu14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mabout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/aboutt.png"))); // NOI18N
        mabout.setText("Tentang Laundry ");
        mabout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maboutActionPerformed(evt);
            }
        });
        jMenu14.add(mabout);

        jMenuBar1.add(jMenu14);

        jMenu15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/24x24logout.png"))); // NOI18N
        jMenu15.setText("Logout");
        jMenu15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/logout.png"))); // NOI18N
        mlogout.setText("Log Out Admin");
        mlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlogoutActionPerformed(evt);
            }
        });
        jMenu15.add(mlogout);

        jMenuBar1.add(jMenu15);

        jMenu16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/24x24exit.png"))); // NOI18N
        jMenu16.setText("Keluar");
        jMenu16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        mkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laundryproject/images/Cancel.png"))); // NOI18N
        mkeluar.setText("Keluar Aplikasi");
        mkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mkeluarActionPerformed(evt);
            }
        });
        jMenu16.add(mkeluar);

        jMenuBar1.add(jMenu16);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1364, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mplgbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mplgbrActionPerformed
        // TODO add your handling code here:
         new FormPelanggan().setVisible(true);
    }//GEN-LAST:event_mplgbrActionPerformed

    private void mlynActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlynActionPerformed
        // TODO add your handling code here:
        new FormMasterLayanan().setVisible(true);
    }//GEN-LAST:event_mlynActionPerformed

    private void mdtplgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdtplgActionPerformed
        // TODO add your handling code here:
        new DataPelanggan().setVisible(true);
    }//GEN-LAST:event_mdtplgActionPerformed

    private void mtransaksibaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtransaksibaruActionPerformed
        // TODO add your handling code here:
        new FormTransaksi().setVisible(true);
    }//GEN-LAST:event_mtransaksibaruActionPerformed

    private void mdatatransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdatatransaksiActionPerformed
        // TODO add your handling code here:
        new DataTransaksi().setVisible(true);
    }//GEN-LAST:event_mdatatransaksiActionPerformed

    private void mcetaktransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcetaktransaksiActionPerformed
        // TODO add your handling code here:
        new FormCetakTransaksi().setVisible(true);
    }//GEN-LAST:event_mcetaktransaksiActionPerformed

    private void mstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mstatusActionPerformed
        // TODO add your handling code here:
        new FormStatus().setVisible(true);
    }//GEN-LAST:event_mstatusActionPerformed

    private void mdtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdtstatusActionPerformed
        // TODO add your handling code here:
        new DataStatus().setVisible(true);
    }//GEN-LAST:event_mdtstatusActionPerformed

    private void mlaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlaporanActionPerformed
        // TODO add your handling code here:
        new FormKeuangan().setVisible(true);
    }//GEN-LAST:event_mlaporanActionPerformed

    private void maboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maboutActionPerformed
        // TODO add your handling code here:
        new FormAbout().setVisible(true);
    }//GEN-LAST:event_maboutActionPerformed

    private void mlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlogoutActionPerformed
        // TODO add your handling code here:
        dispose(); 
        new FormLogin().setVisible(true);
    }//GEN-LAST:event_mlogoutActionPerformed

    private void mkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mkeluarActionPerformed
        // TODO add your handling code here:
        int a;
        a=JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menutup aplikasi ini?", "Keluar", JOptionPane. YES_NO_OPTION);
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            return;
        }
    }//GEN-LAST:event_mkeluarActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        int a;
        a=JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menutup aplikasi ini?", "Keluar", JOptionPane. YES_NO_OPTION);
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            return;
        }
    }//GEN-LAST:event_exitActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        dispose();
        new FormLogin().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JButton exit;
    private javax.swing.JMenu j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JMenuItem mabout;
    private javax.swing.JMenuItem mcetaktransaksi;
    private javax.swing.JMenuItem mdatatransaksi;
    private javax.swing.JMenuItem mdtplg;
    private javax.swing.JMenuItem mdtstatus;
    private javax.swing.JMenuItem mkeluar;
    private javax.swing.JMenuItem mlaporan;
    private javax.swing.JMenuItem mlogout;
    private javax.swing.JMenuItem mlyn;
    private javax.swing.JMenuItem mplgbr;
    private javax.swing.JMenuItem mstatus;
    private javax.swing.JMenuItem mtransaksibaru;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}