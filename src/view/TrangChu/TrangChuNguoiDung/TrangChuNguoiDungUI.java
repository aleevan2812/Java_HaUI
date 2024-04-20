package view.TrangChu.TrangChuNguoiDung;

import model.TaiKhoan;
import view.DangNhap.DangNhapUI;
import view.XemChiTietLuongCaNhan.XemChiTietLuongCaNhanUI;
import view.QuanLyThongTinCaNhan.QuanLyThongTinCaNhanUI;
import util.XuLyFile;
import java.io.IOException;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrangChuNguoiDungUI extends javax.swing.JFrame {
    private HashMap<String, Object> data;
    
    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }

    public TrangChuNguoiDungUI(HashMap<String, Object> data) {
        this.data = data;
        initComponents();
        setLocationRelativeTo(null);
        String res1 = String.format("Xin chào, " + data.get("TenTaiKhoan"));
        lblUsername.setText(res1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSuaThongTinCaNhan = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnXemChiTietLuongCaNhan = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang Chủ");

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Trang Chủ");

        btnSuaThongTinCaNhan.setFont(btnSuaThongTinCaNhan.getFont().deriveFont(btnSuaThongTinCaNhan.getFont().getSize()+3f));
        btnSuaThongTinCaNhan.setText("Sửa Thông Tin Cá Nhân");
        btnSuaThongTinCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThongTinCaNhanActionPerformed(evt);
            }
        });

        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnXemChiTietLuongCaNhan.setFont(btnXemChiTietLuongCaNhan.getFont().deriveFont(btnXemChiTietLuongCaNhan.getFont().getSize()+3f));
        btnXemChiTietLuongCaNhan.setText("Xem Chi Tiết Lương Cá Nhân");
        btnXemChiTietLuongCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietLuongCaNhanActionPerformed(evt);
            }
        });

        lblUsername.setText("Xin Chào, User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(100, 100, 100)
                .addComponent(btnDangXuat)
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(btnXemChiTietLuongCaNhan)
                .addGap(18, 18, 18)
                .addComponent(btnSuaThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblUsername))
                    .addComponent(btnDangXuat))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuaThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXemChiTietLuongCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaThongTinCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThongTinCaNhanActionPerformed
        QuanLyThongTinCaNhanUI quanLyThongTinCaNhanUI;
        try {
            quanLyThongTinCaNhanUI = new QuanLyThongTinCaNhanUI(data);
            quanLyThongTinCaNhanUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuNguoiDungUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaThongTinCaNhanActionPerformed

    private void btnXemChiTietLuongCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietLuongCaNhanActionPerformed
        XemChiTietLuongCaNhanUI xemChiTietLuongCaNhanUI;
        try {
            xemChiTietLuongCaNhanUI = new XemChiTietLuongCaNhanUI(data);
            xemChiTietLuongCaNhanUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuNguoiDungUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrangChuNguoiDungUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnXemChiTietLuongCaNhanActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        try {
            // TODO add your handling code here:
            new DangNhapUI().onStartGUI();
            XuLyFile.luuTaiKhoan(new TaiKhoan("",""));
        } catch (IOException ex) {
            Logger.getLogger(TrangChuNguoiDungUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChuNguoiDungUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuNguoiDungUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuNguoiDungUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuNguoiDungUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuNguoiDungUI(data).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnSuaThongTinCaNhan;
    private javax.swing.JButton btnXemChiTietLuongCaNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
