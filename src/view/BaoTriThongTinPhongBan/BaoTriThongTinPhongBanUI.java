package view.BaoTriThongTinPhongBan;

import controller.BaoTriThongTinPhongBanController;
import model.PhongBan;
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

public class BaoTriThongTinPhongBanUI extends javax.swing.JFrame {
    private final BaoTriThongTinPhongBanController baoTriThongTinPhongBanController;
    private HashMap<String, Object> data;

    public BaoTriThongTinPhongBanUI(HashMap<String, Object> data) throws SQLException {
        this.data = data;
        initComponents();
        setLocationRelativeTo(null);
        txtTenPhong.requestFocus();

        baoTriThongTinPhongBanController = new BaoTriThongTinPhongBanController();
        UpdateTable();
        baoTriThongTinPhongBanController.setUpdateTableEvent(new IUpdateTableEvent() {
            @Override
            public void onUpdateDataOnTableEvent() {
                try {
                    UpdateTable();
                } catch (SQLException ex) {
                    Logger.getLogger(BaoTriThongTinPhongBanUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void UpdateTable() throws SQLException {
        ArrayList<PhongBan> phongBans = baoTriThongTinPhongBanController.onQueryAllPhongBan();

        DefaultTableModel defaultTableModel = (DefaultTableModel) tblPhongBan.getModel();

        while (defaultTableModel.getRowCount() > 0) {
            defaultTableModel.removeRow(0);
        }

        for (var phongBan : phongBans) {
            defaultTableModel.addRow(phongBan.toObjectArrayData());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaPhong = new javax.swing.JTextField();
        txtTenPhong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenTruongPhong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhongBan = new javax.swing.JTable();
        btnThemPhongBan = new javax.swing.JButton();
        btnSuaPhongBan = new javax.swing.JButton();
        btnXoaPhongBan = new javax.swing.JButton();
        btnXoaThongTin = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bảo trì thông tin Phòng Ban");
        setResizable(false);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Bảo trì thông tin Phòng Ban");

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+4f));
        jLabel2.setText("Mã Phòng");

        txtMaPhong.setFont(txtMaPhong.getFont().deriveFont(txtMaPhong.getFont().getSize()+4f));
        txtMaPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMaPhongMouseClicked(evt);
            }
        });

        txtTenPhong.setFont(txtTenPhong.getFont().deriveFont(txtTenPhong.getFont().getSize()+4f));

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()+4f));
        jLabel3.setText("Tên Phòng");

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()+4f));
        jLabel4.setText("Tên Trưởng Phòng");

        txtTenTruongPhong.setFont(txtTenTruongPhong.getFont().deriveFont(txtTenTruongPhong.getFont().getSize()+4f));

        tblPhongBan.setFont(tblPhongBan.getFont().deriveFont(tblPhongBan.getFont().getSize()+4f));
        tblPhongBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Phòng", "Tên Phòng", "Tên Trưởng Phòng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPhongBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhongBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhongBan);

        btnThemPhongBan.setFont(btnThemPhongBan.getFont().deriveFont(btnThemPhongBan.getFont().getSize()+4f));
        btnThemPhongBan.setText("Thêm Phòng Ban");
        btnThemPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPhongBanActionPerformed(evt);
            }
        });

        btnSuaPhongBan.setFont(btnSuaPhongBan.getFont().deriveFont(btnSuaPhongBan.getFont().getSize()+4f));
        btnSuaPhongBan.setText("Sửa Phòng Ban");
        btnSuaPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaPhongBanActionPerformed(evt);
            }
        });

        btnXoaPhongBan.setFont(btnXoaPhongBan.getFont().deriveFont(btnXoaPhongBan.getFont().getSize()+4f));
        btnXoaPhongBan.setText("Xóa Phòng Ban");
        btnXoaPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPhongBanActionPerformed(evt);
            }
        });

        btnXoaThongTin.setFont(btnXoaThongTin.getFont().deriveFont(btnXoaThongTin.getFont().getSize()+4f));
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaPhong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenTruongPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnThemPhongBan)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaPhongBan)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaPhongBan)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaThongTin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(245, 245, 245))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
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
                    .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenTruongPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemPhongBan)
                    .addComponent(btnSuaPhongBan)
                    .addComponent(btnXoaPhongBan)
                    .addComponent(btnXoaThongTin))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPhongBanActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    PhongBan phongBan = new PhongBan();
                    phongBan.setTenPhong(txtTenPhong.getText());
                    phongBan.setTenTruongPhong(txtTenTruongPhong.getText());

                    try {
                        baoTriThongTinPhongBanController.addNewPhongBan(phongBan);
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinPhongBanUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    clearAllTextBox();
                    JOptionPane.showMessageDialog(getContentPane(), "Thêm mới Phòng Ban thành công!!");
                }
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn thêm Phòng Ban này không ?", "Thông Báo");
    }//GEN-LAST:event_btnThemPhongBanActionPerformed


    private void btnSuaPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaPhongBanActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    if (txtMaPhong.getText().equals("")) {
                        JOptionPane.showMessageDialog(getContentPane(), "Bạn chưa chọn Phòng Ban cần xóa!!");
                        return;
                    }

                    PhongBan phongBan = new PhongBan();
                    phongBan.setMaPhong(Long.parseLong(txtMaPhong.getText()));
                    phongBan.setTenPhong(txtTenPhong.getText());
                    phongBan.setTenTruongPhong(txtTenTruongPhong.getText());

                    try {
                        baoTriThongTinPhongBanController.updatePhongBanByID(phongBan);
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinPhongBanUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    clearAllTextBox();
                    JOptionPane.showMessageDialog(getContentPane(), "Sửa Phòng Ban thành công!!");
                }
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn sửa phòng ban này không ?", "Thông Báo");
    }//GEN-LAST:event_btnSuaPhongBanActionPerformed

    private void btnXoaPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhongBanActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    if (txtMaPhong.getText().equals("")) {
                        JOptionPane.showMessageDialog(getContentPane(), "Bạn chưa chọn Phòng Ban cần xóa!!");
                        return;
                    }
                    try {
                        baoTriThongTinPhongBanController.deletePhongBanByID(Long.parseLong(txtMaPhong.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinPhongBanUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    clearAllTextBox();
                    JOptionPane.showMessageDialog(getContentPane(), "Xóa phòng ban thành công!!");
                }
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn xóa Phòng Ban này không ?", "Thông Báo");
    }//GEN-LAST:event_btnXoaPhongBanActionPerformed

    private void btnXoaThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaThongTinActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    clearAllTextBox();
                    JOptionPane.showMessageDialog(getContentPane(), "Xóa thông tin thành công!!");
                }

            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn xóa thông tin này không ?", "Thông Báo");
    }//GEN-LAST:event_btnXoaThongTinActionPerformed

    private void txtMaPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaPhongMouseClicked
        JOptionPane.showMessageDialog(getContentPane(), "Mã Phòng được tự động sinh\nBạn không được phép sửa mã!!!");
        txtTenPhong.requestFocus();
    }//GEN-LAST:event_txtMaPhongMouseClicked

    private void tblPhongBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhongBanMouseClicked
        int rowIndex = tblPhongBan.getSelectedRow();
        TableModel model = tblPhongBan.getModel();

        String maPhong = model.getValueAt(rowIndex, 0).toString();
        String tenPhong = model.getValueAt(rowIndex, 1).toString();
        String tenTruongPhong = model.getValueAt(rowIndex, 2).toString();

        txtMaPhong.setText(maPhong);
        txtTenPhong.setText(tenPhong);
        txtTenTruongPhong.setText(tenTruongPhong);
    }//GEN-LAST:event_tblPhongBanMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_backActionPerformed

    public void clearAllTextBox() {
        txtMaPhong.setText("");
        txtTenPhong.setText("");
        txtTenTruongPhong.setText("");
    }

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
            java.util.logging.Logger.getLogger(BaoTriThongTinPhongBanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinPhongBanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinPhongBanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinPhongBanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BaoTriThongTinPhongBanUI(data).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BaoTriThongTinPhongBanUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private boolean validateData() {
        String message = "";
        int numErr = 0;
        try {
            if (txtTenPhong.getText().trim().equalsIgnoreCase("")) {
                message += "Tên Phòng không được để trống!!\n";
                numErr += 1;
            }

            if (txtTenTruongPhong.getText().trim().equalsIgnoreCase("")) {
                message += "Tên Trưởng Phòng không được để trống\n";
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnSuaPhongBan;
    private javax.swing.JButton btnThemPhongBan;
    private javax.swing.JButton btnXoaPhongBan;
    private javax.swing.JButton btnXoaThongTin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhongBan;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtTenPhong;
    private javax.swing.JTextField txtTenTruongPhong;
    // End of variables declaration//GEN-END:variables
}
