package view.BaoTriThongTinPhuCap;

import controller.BaoTriThongTinPhuCapController;
import model.PhuCap;
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

public class BaoTriThongTinPhuCapUI extends javax.swing.JFrame {
    private BaoTriThongTinPhuCapController baoTriThongTinPhuCapController;
    private HashMap<String, Object> data;

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
    
    public BaoTriThongTinPhuCapUI(HashMap<String, Object> data)throws SQLException {
        this.data = data;
        initComponents();
        setLocationRelativeTo(null);
        txtTenPhuCap.requestFocus();

        baoTriThongTinPhuCapController = new BaoTriThongTinPhuCapController();
        UpdateTable();

        baoTriThongTinPhuCapController.setUpdateTableEvent(new IUpdateTableEvent() {
            @Override
            public void onUpdateDataOnTableEvent() {
                try {
                    UpdateTable();
                } catch (SQLException ex) {
                    Logger.getLogger(BaoTriThongTinPhuCapUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnThemPhuCap = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhuCap = new javax.swing.JTable();
        btnXoaPhuCap = new javax.swing.JButton();
        btnSuaPhuCap = new javax.swing.JButton();
        btnXoaThongTin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMaPhuCap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenPhuCap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTienPhuCap = new javax.swing.JTextField();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bảo Trì Thông Tin Phụ Cấp");
        setResizable(false);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Bảo trì thông tin Phụ Cấp");

        btnThemPhuCap.setFont(btnThemPhuCap.getFont().deriveFont(btnThemPhuCap.getFont().getSize()+3f));
        btnThemPhuCap.setText("Thêm Phụ Cấp");
        btnThemPhuCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPhuCapActionPerformed(evt);
            }
        });

        tblPhuCap.setFont(tblPhuCap.getFont().deriveFont(tblPhuCap.getFont().getSize()+3f));
        tblPhuCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Phụ Cấp", "Tên Phụ Cấp", "Tiền Phụ Cấp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPhuCap.setColumnSelectionAllowed(true);
        tblPhuCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhuCapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhuCap);
        tblPhuCap.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnXoaPhuCap.setFont(btnXoaPhuCap.getFont().deriveFont(btnXoaPhuCap.getFont().getSize()+3f));
        btnXoaPhuCap.setText("Xóa Phụ Cấp");
        btnXoaPhuCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPhuCapActionPerformed(evt);
            }
        });

        btnSuaPhuCap.setFont(btnSuaPhuCap.getFont().deriveFont(btnSuaPhuCap.getFont().getSize()+3f));
        btnSuaPhuCap.setText("Sửa Phụ Cấp");
        btnSuaPhuCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaPhuCapActionPerformed(evt);
            }
        });

        btnXoaThongTin.setFont(btnXoaThongTin.getFont().deriveFont(btnXoaThongTin.getFont().getSize()+3f));
        btnXoaThongTin.setText("Xóa Thông Tin");
        btnXoaThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaThongTinActionPerformed(evt);
            }
        });

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+3f));
        jLabel2.setText("Mã Phụ Cấp:");

        txtMaPhuCap.setEditable(false);
        txtMaPhuCap.setFont(txtMaPhuCap.getFont().deriveFont(txtMaPhuCap.getFont().getSize()+3f));
        txtMaPhuCap.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMaPhuCap.setEnabled(false);

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()+3f));
        jLabel3.setText("Tên Phụ Cấp:");

        txtTenPhuCap.setFont(txtTenPhuCap.getFont().deriveFont(txtTenPhuCap.getFont().getSize()+3f));

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()+3f));
        jLabel4.setText("Tiền Phụ Cấp:");

        txtTienPhuCap.setFont(txtTienPhuCap.getFont().deriveFont(txtTienPhuCap.getFont().getSize()+3f));

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
                        .addGap(110, 110, 110)
                        .addComponent(btnThemPhuCap)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaPhuCap)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaPhuCap)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaThongTin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(208, 208, 208))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(83, 83, 83)
                        .addComponent(txtTienPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTienPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaPhuCap)
                    .addComponent(btnThemPhuCap)
                    .addComponent(btnSuaPhuCap)
                    .addComponent(btnXoaThongTin))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemPhuCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPhuCapActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    PhuCap phuCap = new PhuCap();
                    phuCap.setTenPhuCap(txtTenPhuCap.getText().trim());
                    phuCap.setTienPhuCap(Long.parseLong(txtTienPhuCap.getText().trim()));

                    try {
                        baoTriThongTinPhuCapController.addNewPhuCap(phuCap);
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinPhuCapUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    clearAllTextBox();
                    JOptionPane.showMessageDialog(getContentPane(), "Thêm Phụ Cấp thành công!!");
                }
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn thêm Phụ Cấp này không ?", "Thông Báo");
    }//GEN-LAST:event_btnThemPhuCapActionPerformed

    private void btnSuaPhuCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaPhuCapActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    if (txtMaPhuCap.getText().equals("")) {
                        JOptionPane.showMessageDialog(getContentPane(), "Bạn chưa chọn Phụ Cấp cần sửa!!");
                        return;
                    }
                    PhuCap phuCap = new PhuCap();
                    phuCap.setMaPhuCap(Long.parseLong(txtMaPhuCap.getText().trim()));
                    phuCap.setTenPhuCap(txtTenPhuCap.getText().trim());
                    phuCap.setTienPhuCap(Long.parseLong(txtTienPhuCap.getText().trim()));

                    try {
                        baoTriThongTinPhuCapController.updatePhuCapByID(phuCap);
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinPhuCapUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    clearAllTextBox();
                    JOptionPane.showMessageDialog(getContentPane(), "Sửa Phụ Cấp thành công!!");
                }
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn sửa Phụ Cấp này không ?", "Thông Báo");
    }//GEN-LAST:event_btnSuaPhuCapActionPerformed

    private void btnXoaPhuCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhuCapActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    if (txtMaPhuCap.getText().equals("")) {
                        JOptionPane.showMessageDialog(getContentPane(), "Bạn chưa chọn Phụ Cấp cần xóa!!");
                        return;
                    }

                    try {
                        baoTriThongTinPhuCapController.deletePhuCapByID(Long.parseLong(txtMaPhuCap.getText()));
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinPhuCapUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    clearAllTextBox();
                    JOptionPane.showMessageDialog(getContentPane(), "Xóa Phụ Cấp thành công!!");
                }

            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });
        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn xóa Phụ Cấp này không ?", "Thông Báo");
    }//GEN-LAST:event_btnXoaPhuCapActionPerformed

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

    private void tblPhuCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhuCapMouseClicked
        int rowIndex = tblPhuCap.getSelectedRow();
        TableModel model = tblPhuCap.getModel();

        String maPhuCap = model.getValueAt(rowIndex, 0).toString();
        String tenPhuCap = model.getValueAt(rowIndex, 1).toString();
        String tienPhuCap = model.getValueAt(rowIndex, 2).toString();

        txtMaPhuCap.setText(maPhuCap);
        txtTenPhuCap.setText(tenPhuCap);
        txtTienPhuCap.setText(tienPhuCap);
    }//GEN-LAST:event_tblPhuCapMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    public void clearAllTextBox() {
        txtMaPhuCap.setText("");
        txtTenPhuCap.setText("");
        txtTienPhuCap.setText("");
    }

    public boolean validateData() {
        String message = "";
        int numErr = 0;
        try {
            if (txtTenPhuCap.getText().trim().equalsIgnoreCase("")) {
                message += "Tên Phụ Cấp không được để trống!!\n";
                numErr += 1;
            }

            if (txtTienPhuCap.getText().trim().equalsIgnoreCase("")) {
                message += "Tiền Phụ Cấp không được để trống\n";
                numErr += 1;
            }

            if (numErr > 0) {
                throw new Exception(message);
            }

            try {
                Long.parseLong(txtTienPhuCap.getText().trim());
            } catch (Exception ex) {
                throw new Exception("Tiền phụ cấp phải nhập đúng định dạng");
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(getContentPane(), message);
        }
        return false;
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
            java.util.logging.Logger.getLogger(BaoTriThongTinPhuCapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinPhuCapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinPhuCapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinPhuCapUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BaoTriThongTinPhuCapUI(data).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BaoTriThongTinPhuCapUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnSuaPhuCap;
    private javax.swing.JButton btnThemPhuCap;
    private javax.swing.JButton btnXoaPhuCap;
    private javax.swing.JButton btnXoaThongTin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhuCap;
    private javax.swing.JTextField txtMaPhuCap;
    private javax.swing.JTextField txtTenPhuCap;
    private javax.swing.JTextField txtTienPhuCap;
    // End of variables declaration//GEN-END:variables

    private void UpdateTable() throws SQLException {
        ArrayList<PhuCap> phuCaps = baoTriThongTinPhuCapController.onQueryAllPhuCap();

        DefaultTableModel defaultTableModel = (DefaultTableModel) tblPhuCap.getModel();

        while (defaultTableModel.getRowCount() > 0) {
            defaultTableModel.removeRow(0);
        }

        for (PhuCap phuCap : phuCaps) {
            defaultTableModel.addRow(phuCap.toObjectArrayData());
        }
    }
}
