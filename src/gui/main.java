/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import config.Database;
import java.io.File;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author pc9
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        jam();
        tanggal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnadduser = new javax.swing.JButton();
        btnorder = new javax.swing.JButton();
        btntransaksi = new javax.swing.JButton();
        btnlaporan = new javax.swing.JButton();
        btnstruk = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        DP = new img.DesktopPaneBackground();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        lblnamauser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbliduser = new javax.swing.JLabel();
        lblhakakses = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        lbljam = new javax.swing.JLabel();
        lbltgl = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menu_entry = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menu_riwayat = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Pemesanan Makanan");

        jPanel1.setBackground(new java.awt.Color(255, 234, 167));

        btnadduser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_user_icon.png"))); // NOI18N
        btnadduser.setText("Manajemen User");
        btnadduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadduserActionPerformed(evt);
            }
        });

        btnorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/order_icon.png"))); // NOI18N
        btnorder.setText("Order");
        btnorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorderActionPerformed(evt);
            }
        });

        btntransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transaksi_icon.png"))); // NOI18N
        btntransaksi.setText("Transaksi");
        btntransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransaksiActionPerformed(evt);
            }
        });

        btnlaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/laporan_icon.png"))); // NOI18N
        btnlaporan.setText("Generate Laporan");
        btnlaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlaporanActionPerformed(evt);
            }
        });

        btnstruk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/struk_icon.png"))); // NOI18N
        btnstruk.setText("Struk");
        btnstruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstrukActionPerformed(evt);
            }
        });

        jButton6.setText("Tutup Aplikasi");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Logout");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnlaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnstruk, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btntransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnorder, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(btnadduser, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnadduser)
                .addGap(36, 36, 36)
                .addComponent(btnorder)
                .addGap(40, 40, 40)
                .addComponent(btntransaksi)
                .addGap(38, 38, 38)
                .addComponent(btnlaporan)
                .addGap(41, 41, 41)
                .addComponent(btnstruk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 429, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        DP.setBackground(new java.awt.Color(204, 204, 204));
        DP.setPreferredSize(new java.awt.Dimension(290, 98));

        jLayeredPane1.setBackground(new java.awt.Color(102, 102, 102));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(290, 98));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELAMAT DATANG");

        lblnamauser.setForeground(new java.awt.Color(255, 255, 255));
        lblnamauser.setText("Nama User");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Anda");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Anda disini sebagai");

        lbliduser.setBackground(new java.awt.Color(255, 255, 255));
        lbliduser.setForeground(new java.awt.Color(255, 255, 255));
        lbliduser.setText("ID User");

        lblhakakses.setForeground(new java.awt.Color(255, 255, 255));
        lblhakakses.setText("Hak Akses");

        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblnamauser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lbliduser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblhakakses, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblnamauser))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblhakakses))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbliduser)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblnamauser))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbliduser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblhakakses))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setOpaque(true);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        lbljam.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbljam.setForeground(new java.awt.Color(255, 0, 51));
        lbljam.setText("-");

        lbltgl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar_icon.png"))); // NOI18N
        lbltgl.setText("Tanggal");

        info.setBackground(new java.awt.Color(255, 255, 255));
        info.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        info.setText("-");

        DP.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DP.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DP.setLayer(lbljam, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DP.setLayer(lbltgl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DP.setLayer(info, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DPLayout = new javax.swing.GroupLayout(DP);
        DP.setLayout(DPLayout);
        DPLayout.setHorizontalGroup(
            DPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DPLayout.createSequentialGroup()
                .addContainerGap(419, Short.MAX_VALUE)
                .addGroup(DPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DPLayout.createSequentialGroup()
                        .addGroup(DPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DPLayout.createSequentialGroup()
                        .addComponent(lbljam)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DPLayout.createSequentialGroup()
                        .addComponent(lbltgl)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DPLayout.createSequentialGroup()
                        .addComponent(info)
                        .addContainerGap())))
        );
        DPLayout.setVerticalGroup(
            DPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DPLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbljam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltgl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(info)
                .addContainerGap())
        );

        menu.setText("Menu");

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu.add(jMenuItem1);

        jMenuItem2.setText("Tutup Aplikasi");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menu.add(jMenuItem2);

        jMenuBar1.add(menu);

        menu_entry.setText("Entry Data");

        jMenuItem3.setText("Masakan");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menu_entry.add(jMenuItem3);

        jMenuItem4.setText("Level");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menu_entry.add(jMenuItem4);

        jMenuBar1.add(menu_entry);

        menu_riwayat.setText("Riwayat");

        jMenuItem5.setText("Log Transaksi");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menu_riwayat.add(jMenuItem5);

        jMenuBar1.add(menu_riwayat);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DP, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DP, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Anda Yakin Ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(confirm == 0 ){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorderActionPerformed
        // TODO add your handling code here:
        order o = new order(this, true);
        o.txtiduser.setText(lbliduser.getText());
        JOptionPane.showMessageDialog(rootPane,"Silahkan Pilih Makanan","Sukses",JOptionPane.INFORMATION_MESSAGE);
        o.setVisible(true);
    }//GEN-LAST:event_btnorderActionPerformed

    private void btntransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransaksiActionPerformed
        // TODO add your handling code here:
        transaksi t = new transaksi(this, true);
        t.txt_iduser.setText(lbliduser.getText());
        t.setVisible(true);
    }//GEN-LAST:event_btntransaksiActionPerformed

    private void btnadduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadduserActionPerformed
        // TODO add your handling code here:
        user u = new user();
        DP.add(u);
        u.setVisible(true);
    }//GEN-LAST:event_btnadduserActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        menu_masakan mm = new menu_masakan();
        DP.add(mm);
        mm.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(rootPane,"Anda Yakin Ingin Logout ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
        dispose();
        login l = new login();
        l.setVisible(true);
        } 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Anda Yakin Ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(confirm == 0 ){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(rootPane,"Anda Yakin Ingin Logout ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
        dispose();
        login l = new login();
        l.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        level l = new level(this, true);
        l.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnlaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlaporanActionPerformed
        // TODO add your handling code here:
        java.sql.Connection conn = new Database().connect();
        File lokasi = new File("src/report/laporan.jrxml");
        try {
            JasperDesign jd = JRXmlLoader.load(lokasi);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            JasperPrint jp = JasperFillManager.fillReport(jr,null, conn);
            JasperViewer.viewReport(jp,false);
        } catch (JRException ex) {
        }
    }//GEN-LAST:event_btnlaporanActionPerformed

    private void btnstrukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstrukActionPerformed
        // TODO add your handling code here:
        cetak c = new cetak(this, true);
        c.setVisible(true);
    }//GEN-LAST:event_btnstrukActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        logtransaksi l = new logtransaksi(this, true);
        l.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane DP;
    public javax.swing.JButton btnadduser;
    public javax.swing.JButton btnlaporan;
    public javax.swing.JButton btnorder;
    public javax.swing.JButton btnstruk;
    public javax.swing.JButton btntransaksi;
    public javax.swing.JLabel info;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblhakakses;
    public javax.swing.JLabel lbliduser;
    private javax.swing.JLabel lbljam;
    public javax.swing.JLabel lblnamauser;
    private javax.swing.JLabel lbltgl;
    private javax.swing.JMenu menu;
    public javax.swing.JMenu menu_entry;
    public javax.swing.JMenu menu_riwayat;
    // End of variables declaration//GEN-END:variables

    private void jam() {
     Timer tt = new Timer();
     tt.scheduleAtFixedRate(new TimerTask() {
         
         @Override
         public void run() {
             lbljam.setText(new SimpleDateFormat("HH:mm:ss").format(new java.util.Date()));
             
         }
     }, 0, 1000);
 }
    private void tanggal() {
        lbltgl.setText(new SimpleDateFormat("dd / MMMM / YYYY").format(new java.util.Date()));
    }
}
