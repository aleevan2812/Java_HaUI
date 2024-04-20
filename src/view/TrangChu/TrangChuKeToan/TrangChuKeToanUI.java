package view.TrangChu.TrangChuKeToan;

import view.DangNhap.DangNhapUI;
import view.QuanLyThongTinCaNhan.QuanLyThongTinCaNhanUI;
import view.XemChiTietLuongCaNhan.XemChiTietLuongCaNhanUI;
import java.io.IOException;
import view.XemThongKeLuongChoPhongBanUI.XemThongKeLuongChoPhongBanUI;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.XemChiTietTungNhanSu.XemChiTietLuongTungNhanSuUI;

public class TrangChuKeToanUI extends javax.swing.JFrame {

    private HashMap<String, Object> data;

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }

    public TrangChuKeToanUI(HashMap<String, Object> data) {
        this.data = data;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnXemChiTietLuongCaNhan = new javax.swing.JButton();
        btnSuaThongTinCaNhan = new javax.swing.JButton();
        btnXemChiTietLuongCaNhan1 = new javax.swing.JButton();
        btnXemChiTietLuongCaNhan2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Trang Chủ Kế Toán");

        btnXemChiTietLuongCaNhan.setFont(btnXemChiTietLuongCaNhan.getFont().deriveFont(btnXemChiTietLuongCaNhan.getFont().getSize()+3f));
        btnXemChiTietLuongCaNhan.setText("Xem Chi Tiết Lương Cá Nhân");
        btnXemChiTietLuongCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietLuongCaNhanActionPerformed(evt);
            }
        });

        btnSuaThongTinCaNhan.setFont(btnSuaThongTinCaNhan.getFont().deriveFont(btnSuaThongTinCaNhan.getFont().getSize()+3f));
        btnSuaThongTinCaNhan.setText("Sửa Thông Tin Cá Nhân");
        btnSuaThongTinCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThongTinCaNhanActionPerformed(evt);
            }
        });

        btnXemChiTietLuongCaNhan1.setFont(btnXemChiTietLuongCaNhan1.getFont().deriveFont(btnXemChiTietLuongCaNhan1.getFont().getSize()+3f));
        btnXemChiTietLuongCaNhan1.setText("Xem Thống Kê Lương Theo Từng Phòng Ban");
        btnXemChiTietLuongCaNhan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietLuongCaNhan1ActionPerformed(evt);
            }
        });

        btnXemChiTietLuongCaNhan2.setFont(btnXemChiTietLuongCaNhan2.getFont().deriveFont(btnXemChiTietLuongCaNhan2.getFont().getSize()+3f));
        btnXemChiTietLuongCaNhan2.setText("Xem Chi Tiết Lương Từng Nhân Sự");
        btnXemChiTietLuongCaNhan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietLuongCaNhan2ActionPerformed(evt);
            }
        });

        jButton1.setText("Đăng Xuất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnXemChiTietLuongCaNhan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSuaThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnXemChiTietLuongCaNhan2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXemChiTietLuongCaNhan1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXemChiTietLuongCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXemChiTietLuongCaNhan1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXemChiTietLuongCaNhan2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemChiTietLuongCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietLuongCaNhanActionPerformed
        try {
            new XemChiTietLuongCaNhanUI(data).onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuKeToanUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrangChuKeToanUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXemChiTietLuongCaNhanActionPerformed

    private void btnSuaThongTinCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThongTinCaNhanActionPerformed
        try {
            new QuanLyThongTinCaNhanUI(data).onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuKeToanUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaThongTinCaNhanActionPerformed

    private void btnXemChiTietLuongCaNhan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietLuongCaNhan1ActionPerformed
        try {
            // TODO add your handling code here:
            new XemThongKeLuongChoPhongBanUI("Xem Thống Kê Lương Cho Phòng Ban").setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuKeToanUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXemChiTietLuongCaNhan1ActionPerformed

    private void btnXemChiTietLuongCaNhan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietLuongCaNhan2ActionPerformed
        try {
            // TODO add your handling code here:
            new XemChiTietLuongTungNhanSuUI().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuKeToanUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXemChiTietLuongCaNhan2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            new DangNhapUI().onStartGUI();
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(TrangChuKeToanUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChuKeToanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuKeToanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuKeToanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuKeToanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new TrangChuKeToanUI(data).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaThongTinCaNhan;
    private javax.swing.JButton btnXemChiTietLuongCaNhan;
    private javax.swing.JButton btnXemChiTietLuongCaNhan1;
    private javax.swing.JButton btnXemChiTietLuongCaNhan2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
