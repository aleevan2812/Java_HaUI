package view.BaoTriThongTinHeSoLuong;

import controller.BaoTriThongTinHeSoLuongController;
import model.HeSoLuong;
import view.TrangChu.TrangChuAdmin.TrangChuAdminUI;
import view.TuyChonUI;
import util.IOptionEvent;
import util.IUpdateTableEvent;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class BaoTriThongTinHeSoLuongUI extends javax.swing.JFrame {
    BaoTriThongTinHeSoLuongController baoTriThongTinHeSoLuongController;
    private HashMap<String, Object> data;

    public void UpdateTable() throws SQLException {
        ArrayList<HeSoLuong> heSoLuongs = baoTriThongTinHeSoLuongController.onQueryAllHeSoLuong();

        DefaultTableModel defaultTableModel = (DefaultTableModel) tblHeSoLuong.getModel();

        while (defaultTableModel.getRowCount() > 0) {
            defaultTableModel.removeRow(0);
        }

        for (var heSoLuong : heSoLuongs) {
            defaultTableModel.addRow(heSoLuong.toObjectArrayData());
        }
    }

    public boolean validateData() {
        String message = "";
        int numErr = 0;
        try {
            if (txtTenHeSoLuong.getText().trim().equalsIgnoreCase("")) {
                message += "Tên Hệ Số Lương không được để trống!!\n";
                numErr += 1;
            }

            if (txtHeSoLuong.getText().trim().equalsIgnoreCase("")) {
                message += "Hệ Số Lương không được để trống\n";
                numErr += 1;
            }

            if (numErr > 0) {
                throw new Exception(message);
            }

            try {
                Double.parseDouble(txtHeSoLuong.getText());
            } catch (Exception ex) {
                message += "Hệ Số Lương Phải Là Số Thực";
                numErr += 1;
            }

            if (numErr > 0) {
                throw new Exception(message);
            }

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(getContentPane(), message);
        }
        return false;
    }
     
    public BaoTriThongTinHeSoLuongUI(HashMap<String, Object> data) throws SQLException {
        this.data = data;
        initComponents();
        setLocationRelativeTo(null);
        txtTenHeSoLuong.requestFocus();
        baoTriThongTinHeSoLuongController = new BaoTriThongTinHeSoLuongController();
        UpdateTable();

        baoTriThongTinHeSoLuongController.setUpdateTableEvent(new IUpdateTableEvent() {
            @Override
            public void onUpdateDataOnTableEvent() {
                try {
                    UpdateTable();
                } catch (SQLException ex) {
                    Logger.getLogger(BaoTriThongTinHeSoLuongUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaHeSoLuong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenHeSoLuong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHeSoLuong = new javax.swing.JTable();
        btnXoaThongTin = new javax.swing.JButton();
        btnThemHeSoLuong = new javax.swing.JButton();
        btnSuaHeSoLuong = new javax.swing.JButton();
        btnXoaHeSoLuong = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtHeSoLuong = new javax.swing.JTextField();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bảo Trì Thông Tin Hệ Số Lương");
        setResizable(false);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Bảo Trì Thông Tin Hệ Số Lương");

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+3f));
        jLabel2.setText("Mã Hệ Số Lương");

        txtMaHeSoLuong.setEditable(false);
        txtMaHeSoLuong.setFont(txtMaHeSoLuong.getFont().deriveFont(txtMaHeSoLuong.getFont().getSize()+3f));
        txtMaHeSoLuong.setForeground(new java.awt.Color(204, 204, 204));
        txtMaHeSoLuong.setText("Mã sẽ tự điền khi thêm");

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()+3f));
        jLabel3.setText("Tên Hệ Số Lương");

        txtTenHeSoLuong.setFont(txtTenHeSoLuong.getFont().deriveFont(txtTenHeSoLuong.getFont().getSize()+3f));

        tblHeSoLuong.setFont(tblHeSoLuong.getFont().deriveFont(tblHeSoLuong.getFont().getSize()+3f));
        tblHeSoLuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Hệ Số Lương", "Tên Hệ Số Lương", "Hệ Số Lương"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblHeSoLuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHeSoLuongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHeSoLuong);

        btnXoaThongTin.setFont(btnXoaThongTin.getFont().deriveFont(btnXoaThongTin.getFont().getSize()+3f));
        btnXoaThongTin.setText("Xóa Thông Tin");
        btnXoaThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaThongTinActionPerformed(evt);
            }
        });

        btnThemHeSoLuong.setFont(btnThemHeSoLuong.getFont().deriveFont(btnThemHeSoLuong.getFont().getSize()+3f));
        btnThemHeSoLuong.setText("Thêm Hệ Số Lương");
        btnThemHeSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHeSoLuongActionPerformed(evt);
            }
        });

        btnSuaHeSoLuong.setFont(btnSuaHeSoLuong.getFont().deriveFont(btnSuaHeSoLuong.getFont().getSize()+3f));
        btnSuaHeSoLuong.setText("Sửa Hệ Số Lương");
        btnSuaHeSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaHeSoLuongActionPerformed(evt);
            }
        });

        btnXoaHeSoLuong.setFont(btnXoaHeSoLuong.getFont().deriveFont(btnXoaHeSoLuong.getFont().getSize()+3f));
        btnXoaHeSoLuong.setText("Xóa Hệ Số Lương");
        btnXoaHeSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHeSoLuongActionPerformed(evt);
            }
        });

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()+3f));
        jLabel4.setText("Hệ Số Lương");

        txtHeSoLuong.setFont(txtHeSoLuong.getFont().deriveFont(txtHeSoLuong.getFont().getSize()+3f));

        back.setText("Quay lại");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaHeSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                            .addComponent(txtTenHeSoLuong)
                            .addComponent(txtHeSoLuong, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnThemHeSoLuong)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaHeSoLuong)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaHeSoLuong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoaThongTin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(182, 182, 182))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaHeSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenHeSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHeSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemHeSoLuong)
                    .addComponent(btnSuaHeSoLuong)
                    .addComponent(btnXoaThongTin)
                    .addComponent(btnXoaHeSoLuong))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemHeSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHeSoLuongActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    try {
                        baoTriThongTinHeSoLuongController.addHeSoLuong(new HeSoLuong(txtTenHeSoLuong.getText(), Float.parseFloat(txtHeSoLuong.getText())));
                        JOptionPane.showMessageDialog(getContentPane(), "Thêm Hệ Số Lương Mới Thành Công");
                        clearAllTextBox();
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinHeSoLuongUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn thêm Hệ Số Lương Này?", "Thông Báo");
    }//GEN-LAST:event_btnThemHeSoLuongActionPerformed

    private void btnSuaHeSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaHeSoLuongActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    try {
                        if (txtHeSoLuong.getText().equals("")) {
                            JOptionPane.showMessageDialog(getContentPane(), "Bạn chưa chọn Hệ Số Lương cần sửa");
                            return;
                        }
                        baoTriThongTinHeSoLuongController.modifyHeSoLuongByID(txtTenHeSoLuong.getText(), Float.parseFloat(txtHeSoLuong.getText()), Long.parseLong(txtMaHeSoLuong.getText()));
                        JOptionPane.showMessageDialog(getContentPane(), "Sửa Hệ Số Lương Thành Công!!!");
                        clearAllTextBox();
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinHeSoLuongUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn sửa Hệ Số Lương Này?", "Thông Báo");
    }//GEN-LAST:event_btnSuaHeSoLuongActionPerformed

    private void btnXoaHeSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHeSoLuongActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    try {
                        if (txtHeSoLuong.getText().equals("")) {
                            JOptionPane.showMessageDialog(getContentPane(), "Bạn chưa chọn Hệ Số Lương cần xóa");
                            return;
                        }
                        baoTriThongTinHeSoLuongController.deleteHeSoLuongByID(Long.parseLong(txtMaHeSoLuong.getText()));
                        JOptionPane.showMessageDialog(getContentPane(), "Xóa Hệ Số Lương Này Thành Công");
                        clearAllTextBox();
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinHeSoLuongUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn xóa Hệ Số Lương Này?", "Thông Báo");
    }//GEN-LAST:event_btnXoaHeSoLuongActionPerformed

    private void btnXoaThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaThongTinActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                clearAllTextBox();
                JOptionPane.showMessageDialog(getContentPane(), "Xóa thông tin thành công!!");
            }

            @Override
            public void onCancelEvent() {
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn xóa thông tin này không ?", "Thông Báo");
    }//GEN-LAST:event_btnXoaThongTinActionPerformed

    public void clearAllTextBox() {
        txtMaHeSoLuong.setText("");
        txtTenHeSoLuong.setText("");
        txtHeSoLuong.setText("");
        txtTenHeSoLuong.requestFocus();
    }
    private void tblHeSoLuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHeSoLuongMouseClicked
        int rowIndex = tblHeSoLuong.getSelectedRow();
        TableModel model = tblHeSoLuong.getModel();

        String maHeSoLuong = model.getValueAt(rowIndex, 0).toString();
        String tenHeSoLuong = model.getValueAt(rowIndex, 1).toString();
        String heSoLuong = model.getValueAt(rowIndex, 2).toString();

        txtMaHeSoLuong.setText(maHeSoLuong);
        txtTenHeSoLuong.setText(tenHeSoLuong);
        txtHeSoLuong.setText(heSoLuong);
    }//GEN-LAST:event_tblHeSoLuongMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_backActionPerformed

    public void onStartGUI() {
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
            java.util.logging.Logger.getLogger(BaoTriThongTinHeSoLuongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinHeSoLuongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinHeSoLuongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinHeSoLuongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BaoTriThongTinHeSoLuongUI(data).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BaoTriThongTinHeSoLuongUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnSuaHeSoLuong;
    private javax.swing.JButton btnThemHeSoLuong;
    private javax.swing.JButton btnXoaHeSoLuong;
    private javax.swing.JButton btnXoaThongTin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHeSoLuong;
    private javax.swing.JTextField txtHeSoLuong;
    private javax.swing.JTextField txtMaHeSoLuong;
    private javax.swing.JTextField txtTenHeSoLuong;
    // End of variables declaration//GEN-END:variables
}
