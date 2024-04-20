package view.BaoTriThongTinHocPhan;

import controller.BaoTriThongTinHocPhanController;
import model.HocPhan;
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

public class BaoTriThongTinHocPhanUI extends javax.swing.JFrame {
    private BaoTriThongTinHocPhanController controller;

    private HashMap<String, Object> data;
    
    public BaoTriThongTinHocPhanUI(HashMap<String, Object> data) throws SQLException {
        this.data = data;
        initComponents();
        setLocationRelativeTo(null);
        txtTenHocPhan.requestFocus();

        controller = new BaoTriThongTinHocPhanController();
        UpdateTable();
        controller.setUpdateTableEvent(new IUpdateTableEvent() {
            @Override
            public void onUpdateDataOnTableEvent() {
                try {
                    UpdateTable();
                } catch (SQLException ex) {
                    Logger.getLogger(BaoTriThongTinHocPhanUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private boolean validateData() {
        String message = "";
        int numErr = 0;
        try {
            if (txtTenHocPhan.getText().trim().equalsIgnoreCase("")) {
                message += "Tên Học Phần không được để trống!!\n";
                numErr += 1;
            }

            if (txtSoTinChi.getText().trim().equalsIgnoreCase("")) {
                message += "Số Tín Chỉ không được để trống\n";
                numErr += 1;
            }

            if (numErr > 0) {
                throw new Exception(message);
            }

            try {
                Integer.parseInt(txtSoTinChi.getText().trim());
            } catch (Exception e) {
                throw new Exception("Số Tín Chỉ Phải Là Số Nguyên!!");
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(getContentPane(), message);
        }
        return false;
    }

    private void clearAllTextBox() {
        txtMaHocPhan.setText("");
        txtTenHocPhan.setText("");
        txtSoTinChi.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaHocPhan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenHocPhan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoTinChi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHocPhan = new javax.swing.JTable();
        btnXoaHocPhan = new javax.swing.JButton();
        btnThemHocPhan = new javax.swing.JButton();
        btnSuaHocPhan = new javax.swing.JButton();
        btnXoaThongTin = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bảo trì thông tin Học Phần");
        setResizable(false);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Bảo Trì Thông Tin Học Phần");

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+3f));
        jLabel2.setText("Mã Học Phần");

        txtMaHocPhan.setEditable(false);
        txtMaHocPhan.setFont(txtMaHocPhan.getFont().deriveFont(txtMaHocPhan.getFont().getSize()+3f));
        txtMaHocPhan.setForeground(new java.awt.Color(204, 204, 204));
        txtMaHocPhan.setText("Mã tự điền khi thêm");

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()+3f));
        jLabel3.setText("Tên Học Phần");

        txtTenHocPhan.setFont(txtTenHocPhan.getFont().deriveFont(txtTenHocPhan.getFont().getSize()+3f));

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()+3f));
        jLabel4.setText("Số Tín Chỉ");

        txtSoTinChi.setFont(txtSoTinChi.getFont().deriveFont(txtSoTinChi.getFont().getSize()+3f));

        tblHocPhan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Học Phần", "Tên Học Phần", "Số Tín Chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHocPhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHocPhanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHocPhan);

        btnXoaHocPhan.setFont(btnXoaHocPhan.getFont().deriveFont(btnXoaHocPhan.getFont().getSize()+3f));
        btnXoaHocPhan.setText("Xóa Học Phần");
        btnXoaHocPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHocPhanActionPerformed(evt);
            }
        });

        btnThemHocPhan.setFont(btnThemHocPhan.getFont().deriveFont(btnThemHocPhan.getFont().getSize()+3f));
        btnThemHocPhan.setText("Thêm Học Phần");
        btnThemHocPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHocPhanActionPerformed(evt);
            }
        });

        btnSuaHocPhan.setFont(btnSuaHocPhan.getFont().deriveFont(btnSuaHocPhan.getFont().getSize()+3f));
        btnSuaHocPhan.setText("Sửa Học Phần");
        btnSuaHocPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaHocPhanActionPerformed(evt);
            }
        });

        btnXoaThongTin.setFont(btnXoaThongTin.getFont().deriveFont(btnXoaThongTin.getFont().getSize()+3f));
        btnXoaThongTin.setText("Xóa Thông Tin");
        btnXoaThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaThongTinActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(21, 21, 21)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(43, 43, 43)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoTinChi, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                    .addComponent(txtMaHocPhan)
                                    .addComponent(txtTenHocPhan)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(btnThemHocPhan)
                                .addGap(18, 18, 18)
                                .addComponent(btnSuaHocPhan)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoaHocPhan)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoaThongTin))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(75, 75, 75)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoTinChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemHocPhan)
                    .addComponent(btnXoaHocPhan)
                    .addComponent(btnSuaHocPhan)
                    .addComponent(btnXoaThongTin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblHocPhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHocPhanMouseClicked
        int rowIndex = tblHocPhan.getSelectedRow();
        TableModel model = tblHocPhan.getModel();

        String maHocPhan = model.getValueAt(rowIndex, 0).toString();
        String tenHocPhan = model.getValueAt(rowIndex, 1).toString();
        String soTinChi = model.getValueAt(rowIndex, 2).toString();

        txtMaHocPhan.setText(maHocPhan);
        txtTenHocPhan.setText(tenHocPhan);
        txtSoTinChi.setText(soTinChi);
    }//GEN-LAST:event_tblHocPhanMouseClicked

    private void btnThemHocPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHocPhanActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    HocPhan hocPhan = new HocPhan();
                    hocPhan.setTenHocPhan(txtTenHocPhan.getText().trim());
                    hocPhan.setSoTinChi(Integer.parseInt(txtSoTinChi.getText().trim()));

                    try {
                        controller.addNewHocPhan(hocPhan);
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinHocPhanUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    clearAllTextBox();
                    JOptionPane.showMessageDialog(getContentPane(), "Thêm Học Phần thành công!!");
                }
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn thêm Học Phần này không ?", "Thông Báo");
    }//GEN-LAST:event_btnThemHocPhanActionPerformed

    private void btnSuaHocPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaHocPhanActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    if (txtMaHocPhan.getText().equals("")) {
                        JOptionPane.showMessageDialog(getContentPane(), "Bạn chưa chọn Học Phần cần sửa!!");
                        return;
                    }

                    HocPhan hocPhan = new HocPhan();
                    hocPhan.setMaHocPhan(Long.parseLong(txtMaHocPhan.getText().trim()));
                    hocPhan.setTenHocPhan(txtTenHocPhan.getText().trim());
                    hocPhan.setSoTinChi(Integer.parseInt(txtSoTinChi.getText().trim()));

                    try {
                        controller.updateHocPhanByID(hocPhan);
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinHocPhanUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    clearAllTextBox();
                    JOptionPane.showMessageDialog(getContentPane(), "Sửa Học Phần thành công!!");
                }
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn sửa Học Phần này không ?", "Thông Báo");
    }//GEN-LAST:event_btnSuaHocPhanActionPerformed

    private void btnXoaHocPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHocPhanActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    if (txtMaHocPhan.getText().equals("")) {
                        JOptionPane.showMessageDialog(getContentPane(), "Bạn chưa chọn Học Phần cần xóa!!");
                        return;
                    }

                    try {
                        controller.deleteHocPhanByID(Long.parseLong(txtMaHocPhan.getText().trim()));
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinHocPhanUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    clearAllTextBox();
                    JOptionPane.showMessageDialog(getContentPane(), "Xóa Học Phần thành công!!");
                }
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn xóa Học Phần này không ?", "Thông Báo");
    }//GEN-LAST:event_btnXoaHocPhanActionPerformed

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
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn xóa thông tin này không ?", "Thông Báo");
    }//GEN-LAST:event_btnXoaThongTinActionPerformed

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
            java.util.logging.Logger.getLogger(BaoTriThongTinHocPhanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinHocPhanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinHocPhanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinHocPhanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BaoTriThongTinHocPhanUI(data).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BaoTriThongTinHocPhanUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnSuaHocPhan;
    private javax.swing.JButton btnThemHocPhan;
    private javax.swing.JButton btnXoaHocPhan;
    private javax.swing.JButton btnXoaThongTin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHocPhan;
    private javax.swing.JTextField txtMaHocPhan;
    private javax.swing.JTextField txtSoTinChi;
    private javax.swing.JTextField txtTenHocPhan;
    // End of variables declaration//GEN-END:variables

    private void UpdateTable() throws SQLException {
        ArrayList<HocPhan> hocPhans = controller.onQueryAllHocPhan();

        DefaultTableModel defaultTableModel = (DefaultTableModel) tblHocPhan.getModel();

        while (defaultTableModel.getRowCount() > 0) {
            defaultTableModel.removeRow(0);
        }

        for (HocPhan hocPhan : hocPhans) {
            defaultTableModel.addRow(hocPhan.toObjectArrayData());
        }
    }

}
