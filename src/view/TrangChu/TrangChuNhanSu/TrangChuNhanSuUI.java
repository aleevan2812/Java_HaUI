package view.TrangChu.TrangChuNhanSu;

import model.TaiKhoan;
import view.DangNhap.DangNhapUI;
import view.QuanLyThongTinCaNhan.QuanLyThongTinCaNhanUI;
import view.XemChiTietLuongCaNhan.XemChiTietLuongCaNhanUI;
import util.XuLyFile;
import java.io.IOException;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.ChamCongGiangDay.ChamCongGiangDayUI;

public class TrangChuNhanSuUI extends javax.swing.JFrame {
    private HashMap<String, Object> data;
    public TrangChuNhanSuUI(HashMap<String, Object> data) {
        this.data = data;
        initComponents();
        setLocationRelativeTo(null);
        lblUsername.setText("Xin chào, " + data.get("TenTaiKhoan"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnXemChiTietLuongCaNhan = new javax.swing.JButton();
        btnChamCongGiangDay = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnSuaThongTinCaNhan = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Trang Chủ Nhân Sự");

        btnXemChiTietLuongCaNhan.setFont(btnXemChiTietLuongCaNhan.getFont().deriveFont(btnXemChiTietLuongCaNhan.getFont().getSize()+3f));
        btnXemChiTietLuongCaNhan.setText("Xem Chi Tiết Lương Cá Nhân");
        btnXemChiTietLuongCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietLuongCaNhanActionPerformed(evt);
            }
        });

        btnChamCongGiangDay.setFont(btnChamCongGiangDay.getFont().deriveFont(btnChamCongGiangDay.getFont().getSize()+3f));
        btnChamCongGiangDay.setText("Chấm Công Giảng Dạy");
        btnChamCongGiangDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChamCongGiangDayActionPerformed(evt);
            }
        });

        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnSuaThongTinCaNhan.setFont(btnSuaThongTinCaNhan.getFont().deriveFont(btnSuaThongTinCaNhan.getFont().getSize()+3f));
        btnSuaThongTinCaNhan.setText("Sửa Thông Tin Cá Nhân");
        btnSuaThongTinCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThongTinCaNhanActionPerformed(evt);
            }
        });

        lblUsername.setText("Xin chào, User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnChamCongGiangDay, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnXemChiTietLuongCaNhan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSuaThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(btnDangXuat)))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblUsername))
                    .addComponent(btnDangXuat))
                .addGap(40, 40, 40)
                .addComponent(btnChamCongGiangDay, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuaThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXemChiTietLuongCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemChiTietLuongCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietLuongCaNhanActionPerformed
        XemChiTietLuongCaNhanUI xemChiTietLuongCaNhanUI;
        try {
            xemChiTietLuongCaNhanUI = new XemChiTietLuongCaNhanUI(data);
            xemChiTietLuongCaNhanUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuNhanSuUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrangChuNhanSuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnXemChiTietLuongCaNhanActionPerformed

    private void btnChamCongGiangDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChamCongGiangDayActionPerformed
             try {
            ChamCongGiangDayUI chamCongGiangDayUI = new ChamCongGiangDayUI();
            chamCongGiangDayUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuNhanSuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnChamCongGiangDayActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        try {
            // TODO add your handling code here:
            XuLyFile.luuTaiKhoan(new TaiKhoan("", ""));
            new DangNhapUI().onStartGUI();
        } catch (IOException ex) {
            Logger.getLogger(TrangChuNhanSuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnSuaThongTinCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThongTinCaNhanActionPerformed
        try {
            QuanLyThongTinCaNhanUI quanLyThongTinCaNhanUI = new QuanLyThongTinCaNhanUI(data);
            quanLyThongTinCaNhanUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuNhanSuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaThongTinCaNhanActionPerformed

    public void onStartGUI() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        lblUsername.setText("Xin chào, 1");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChuNhanSuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuNhanSuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuNhanSuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuNhanSuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            new TrangChuNhanSuUI(data).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChamCongGiangDay;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnSuaThongTinCaNhan;
    private javax.swing.JButton btnXemChiTietLuongCaNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables

}
