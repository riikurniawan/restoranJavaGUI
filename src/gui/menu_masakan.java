/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.SQLException;
import java.sql.Connection;
import config.Database;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc9
 */
public class menu_masakan extends javax.swing.JInternalFrame {

    private DefaultTableModel DftTblModel_ListMasakan;
    private String SQL;
    
    /**
     * Creates new form FrmInputMenu
     */
    public menu_masakan() {
        initComponents();
        autonumber();
        TampilData();
        setform(false);
        btn_new.setEnabled(true);
        btn_update.setEnabled(false);
        btn_save.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_edit.setEnabled(false);
        btn_cancel_edit.setVisible(false);
    }
   
    public void autonumber() {
        java.sql.Connection DB = new config.Database().connect();
        txt_idmasakan.setEnabled(false);
        try{
        SQL = "SELECT MAX(RIGHT(id_masakan,1)) AS NO FROM masakan";
        java.sql.PreparedStatement pst = DB.prepareStatement(SQL);
        java.sql.ResultSet rst = pst.executeQuery();
        while (rst.next()) {
                if (rst.first() == false) {
                    txt_idmasakan.setText("1");
                } else {
                    rst.last();
                    int auto_id = rst.getInt(1) + 1;
                    String no = String.valueOf(auto_id);
                    int angka = no.length();
                    for (int j = 0; j < 3 - angka; j++) {
                        no = no;
                    }
                    txt_idmasakan.setText(no);
                }
            }
        rst.close();
        }catch (Exception e){JOptionPane.showMessageDialog(null, e);}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_idmasakan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_namamasakan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cb_status = new javax.swing.JComboBox<>();
        btn_new = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_masakan = new javax.swing.JTable();
        btn_cancel_edit = new javax.swing.JButton();

        setClosable(true);
        setTitle("Masakan");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Input Menu Masakan");

        jLabel2.setText("ID Masakan ");

        jLabel3.setText(":");

        jLabel4.setText("Nama Masakan");

        jLabel5.setText(":");

        jLabel6.setText("Harga");

        jLabel7.setText(":");

        jLabel8.setText("Status Masakan");

        jLabel9.setText(":");

        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Status", "Tersedia", "Kosong" }));

        btn_new.setText("Baru");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_save.setText("Simpan");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_delete.setText("Hapus");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("| List Makanan");

        tbl_masakan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Masakan", "Nama Masakan", "Harga", "Status Makanan"
            }
        ));
        tbl_masakan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_masakanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_masakan);

        btn_cancel_edit.setText("Cancel Edit");
        btn_cancel_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_cancel_edit))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(29, 29, 29)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel5))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(65, 65, 65)
                                            .addComponent(jLabel7)))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_new)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btn_update)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btn_save)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btn_delete))
                                        .addComponent(txt_idmasakan)
                                        .addComponent(txt_namamasakan)
                                        .addComponent(txt_harga)
                                        .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txt_idmasakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_namamasakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_new)
                            .addComponent(btn_update)
                            .addComponent(btn_save)
                            .addComponent(btn_delete))
                        .addGap(18, 18, 18)
                        .addComponent(btn_edit)
                        .addGap(33, 33, 33))
                    .addComponent(btn_cancel_edit))
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_masakanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_masakanMouseClicked
        // TODO add your handling code here:
        int baris = tbl_masakan.getSelectedRow();
        txt_idmasakan.setText(DftTblModel_ListMasakan.getValueAt(baris, 0).toString());
        txt_namamasakan.setText(DftTblModel_ListMasakan.getValueAt(baris, 1).toString());
        txt_harga.setText(DftTblModel_ListMasakan.getValueAt(baris, 2).toString());
        cb_status.setSelectedItem(DftTblModel_ListMasakan.getValueAt(baris, 3).toString());
        
        btn_new.setEnabled(true);
        btn_edit.setEnabled(true);
        btn_delete.setEnabled(true);
        btn_update.setEnabled(false);
        btn_save.setEnabled(false);
        btn_cancel_edit.setVisible(false);
    }//GEN-LAST:event_tbl_masakanMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        if (txt_idmasakan.getText().isEmpty() || txt_namamasakan.getText().isEmpty() || txt_harga.getText().isEmpty() || cb_status.getSelectedIndex()== 0) {
          JOptionPane.showMessageDialog(rootPane,"data harus diisi","informasi",JOptionPane.INFORMATION_MESSAGE);
        } else {
        java.sql.Connection DB = new Database().connect();
        try {
            java.sql.PreparedStatement stmt = DB.prepareStatement("INSERT INTO masakan (id_masakan, nama_masakan, harga, status_masakan) VALUES (?, ?, ?, ?)");
            try {
                stmt.setString(1, txt_idmasakan.getText());
                stmt.setString(2, txt_namamasakan.getText());
                stmt.setString(3, txt_harga.getText());
                stmt.setString(4, cb_status.getSelectedItem().toString());
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Message", JOptionPane.INFORMATION_MESSAGE);
                TampilData();
                baru();
                setform(false);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Data gagal disimpan", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {

            }
        }
        
        btn_new.setEnabled(true);
        btn_save.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_update.setEnabled(false);
        btn_edit.setEnabled(false);
        btn_cancel_edit.setVisible(false);
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // TODO add your handling code here:
        setform(true);
        baru();
        txt_namamasakan.requestFocus();
        btn_save.setEnabled(true);
        btn_update.setEnabled(false);
        btn_edit.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_update.setEnabled(false);
        btn_cancel_edit.setVisible(false);
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        java.sql.Connection DB = new Database().connect();
        int ok = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data ?", "Message", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                SQL = "DELETE FROM masakan WHERE id_masakan = '" + txt_idmasakan.getText() + "'";
                java.sql.PreparedStatement stmt = DB.prepareStatement(SQL);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                TampilData();
                autonumber();
                baru();
                setform(false);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus");
            }
        }
        
        btn_new.setEnabled(true);
        btn_save.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_update.setEnabled(false);
        btn_edit.setEnabled(false);
        btn_cancel_edit.setVisible(false);
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        java.sql.Connection DB = new Database().connect();
        try {
                SQL = "UPDATE masakan SET nama_masakan = '"+txt_namamasakan.getText()+"', harga = '"+txt_harga.getText()+"', status_masakan = '"+cb_status.getSelectedItem()+"' WHERE id_masakan = '"+txt_idmasakan.getText()+"'";
                java.sql.PreparedStatement stmt = DB.prepareStatement(SQL);
                stmt.executeUpdate();
               JOptionPane.showMessageDialog(rootPane,"Data berhasil diupdate","Informasi",JOptionPane.INFORMATION_MESSAGE);
                TampilData();
                autonumber();
                baru();
                setform(false);
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(rootPane,"Data gagal diupdate","Informasi",JOptionPane.INFORMATION_MESSAGE);
            }
        
        btn_update.setEnabled(false);
        btn_edit.setEnabled(false);
        btn_save.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_new.setEnabled(true);
        btn_cancel_edit.setVisible(false);
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        setform(true);
        btn_edit.setVisible(true);
        btn_update.setEnabled(true);
        btn_save.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_new.setEnabled(false);
        btn_cancel_edit.setVisible(true);
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_cancel_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel_editActionPerformed
        // TODO add your handling code here:
        autonumber();
        baru();
        btn_new.setEnabled(true);
        btn_update.setEnabled(false);
        btn_save.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_edit.setEnabled(false);
        btn_cancel_edit.setVisible(false);
    }//GEN-LAST:event_btn_cancel_editActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel_edit;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_masakan;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_idmasakan;
    private javax.swing.JTextField txt_namamasakan;
    // End of variables declaration//GEN-END:variables
    private void TampilData() {
        DftTblModel_ListMasakan = new DefaultTableModel();
        DftTblModel_ListMasakan.addColumn("ID Masakan");
        DftTblModel_ListMasakan.addColumn("Nama Masakan");
        DftTblModel_ListMasakan.addColumn("Harga");
        DftTblModel_ListMasakan.addColumn("Status");

        tbl_masakan.setModel(DftTblModel_ListMasakan);
        java.sql.Connection DB = new Database().connect();
        try {
            java.sql.Statement stmt = DB.createStatement();
            SQL = "SELECT * FROM masakan";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                DftTblModel_ListMasakan.addRow(new Object[]{
                    res.getString("id_masakan"),
                    res.getString("nama_masakan"),
                    res.getString("harga"),
                    res.getString("status_masakan")
                });
            }
        } catch (Exception e) {

        }
    }

    
    private void baru() {
    txt_namamasakan.setText(null);
    txt_harga.setText(null);
    cb_status.setSelectedIndex(0);
}
    
    private void setform(boolean b) {
    txt_namamasakan.setEnabled(b);
    txt_harga.setEnabled(b);
    cb_status.setEnabled(b);
}
}
