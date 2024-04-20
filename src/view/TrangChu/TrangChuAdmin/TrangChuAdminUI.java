package view.TrangChu.TrangChuAdmin;

import model.TaiKhoan;
import view.BaoTriThongTinChamCong.BaoTriThongTinChamCongUI;
import view.BaoTriThongTinHeSoLuong.BaoTriThongTinHeSoLuongUI;
import view.BaoTriThongTinHocPhan.BaoTriThongTinHocPhanUI;
import view.BaoTriThongTinNhanVien.BaoTriThongTinNhanVienUI;
import view.BaoTriThongTinPhongBan.BaoTriThongTinPhongBanUI;
import view.BaoTriThongTinPhuCap.BaoTriThongTinPhuCapUI;
import view.BaoTriThongTinTaiKhoan.BaoTriThongTinTaiKhoanUI;
import view.BaoTriThongTinTienThuong.BaoTriThongTinTienThuongUI;
import view.DangNhap.DangNhapUI;
import view.QuanLyThongTinCaNhan.QuanLyThongTinCaNhanUI;
import view.TuyChonUI;
import view.XemChiTietLuongCaNhan.XemChiTietLuongCaNhanUI;
import util.IOptionEvent;
import util.XuLyFile;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrangChuAdminUI extends javax.swing.JFrame implements ActionListener {
    private HashMap<String, Object> data;

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }

    /**
     * Creates new form TrangChuAdminUI
     *
     * @param data
     */
    public TrangChuAdminUI(HashMap<String, Object> data) {
        this.data = data;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnHeSoLuong = new javax.swing.JButton();
        btnPhuCap = new javax.swing.JButton();
        btnTienThuong = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnChamCong = new javax.swing.JButton();
        btnHocPhan = new javax.swing.JButton();
        btnPhongBan = new javax.swing.JButton();
        btnTaiKhoan = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnXemChiTietLuongCaNhan = new javax.swing.JButton();
        btnQuanLyThongTinCaNhan = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang Chủ Quản Trị");

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Trang Chủ Quản Trị");

        btnHeSoLuong.setFont(btnHeSoLuong.getFont().deriveFont(btnHeSoLuong.getFont().getSize()+3f));
        btnHeSoLuong.setText("Hệ Số Lương");
        btnHeSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeSoLuongActionPerformed(evt);
            }
        });

        btnPhuCap.setFont(btnPhuCap.getFont().deriveFont(btnPhuCap.getFont().getSize()+3f));
        btnPhuCap.setText("Phụ Cấp");
        btnPhuCap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhuCapActionPerformed(evt);
            }
        });

        btnTienThuong.setFont(btnTienThuong.getFont().deriveFont(btnTienThuong.getFont().getSize()+3f));
        btnTienThuong.setText("Tiền Thưởng");
        btnTienThuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTienThuongActionPerformed(evt);
            }
        });

        btnNhanVien.setFont(btnNhanVien.getFont().deriveFont(btnNhanVien.getFont().getSize()+3f));
        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnChamCong.setFont(btnChamCong.getFont().deriveFont(btnChamCong.getFont().getSize()+3f));
        btnChamCong.setText("Chấm Công");
        btnChamCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChamCongActionPerformed(evt);
            }
        });

        btnHocPhan.setFont(btnHocPhan.getFont().deriveFont(btnHocPhan.getFont().getSize()+3f));
        btnHocPhan.setText("Học Phần");
        btnHocPhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocPhanActionPerformed(evt);
            }
        });

        btnPhongBan.setFont(btnPhongBan.getFont().deriveFont(btnPhongBan.getFont().getSize()+3f));
        btnPhongBan.setText("Phòng Ban");
        btnPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongBanActionPerformed(evt);
            }
        });

        btnTaiKhoan.setFont(btnTaiKhoan.getFont().deriveFont(btnTaiKhoan.getFont().getSize()+3f));
        btnTaiKhoan.setText("Tài Khoản");
        btnTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKhoanActionPerformed(evt);
            }
        });

        btnThoat.setFont(btnThoat.getFont().deriveFont(btnThoat.getFont().getSize()+3f));
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
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

        btnQuanLyThongTinCaNhan.setFont(btnQuanLyThongTinCaNhan.getFont().deriveFont(btnQuanLyThongTinCaNhan.getFont().getSize()+3f));
        btnQuanLyThongTinCaNhan.setText("Quản Lý Thông Tin Cá Nhân");
        btnQuanLyThongTinCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyThongTinCaNhanActionPerformed(evt);
            }
        });

        lblUsername.setText("Xin chào, Nhóm 7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsername)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(85, 85, 85)
                                .addComponent(btnDangXuat))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHeSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTienThuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnChamCong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnXemChiTietLuongCaNhan)
                        .addGap(18, 18, 18)
                        .addComponent(btnQuanLyThongTinCaNhan)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblUsername))
                    .addComponent(btnDangXuat))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHeSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTienThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnChamCong, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPhuCap, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuanLyThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXemChiTietLuongCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        try {
            // TODO add your handling code here:
            XuLyFile.luuTaiKhoan(new TaiKhoan("", ""));
            new DangNhapUI().onStartGUI();
        } catch (IOException ex) {
            Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnPhuCapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhuCapActionPerformed
        // TODO add your handling code here:
        //Button Phu Cap
        try {
            BaoTriThongTinPhuCapUI baoTriThongTinPhuCapUI = new BaoTriThongTinPhuCapUI(data);
            baoTriThongTinPhuCapUI.setData(data);
            baoTriThongTinPhuCapUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPhuCapActionPerformed

    private void btnHeSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeSoLuongActionPerformed
        // TODO add your handling code here:
        try {
            BaoTriThongTinHeSoLuongUI baoTriThongTinHeSoLuongUI = new BaoTriThongTinHeSoLuongUI(data);
            baoTriThongTinHeSoLuongUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHeSoLuongActionPerformed

    private void btnPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongBanActionPerformed
        // TODO add your handling code here:
        try {
            BaoTriThongTinPhongBanUI baoTriThongTinPhongBanUI = new BaoTriThongTinPhongBanUI(data);
            baoTriThongTinPhongBanUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPhongBanActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        try {
            BaoTriThongTinNhanVienUI baoTriThongTinNhanVienUI = new BaoTriThongTinNhanVienUI(data);
            baoTriThongTinNhanVienUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnTienThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTienThuongActionPerformed
        // TODO add your handling code here:
        try {
            BaoTriThongTinTienThuongUI baoTriThongTinTienThuongUI = new BaoTriThongTinTienThuongUI(data);
            baoTriThongTinTienThuongUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTienThuongActionPerformed

    private void btnTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoanActionPerformed
        // TODO add your handling code here:
        try {
            BaoTriThongTinTaiKhoanUI baoTriThongTinTaiKhoanUI = new BaoTriThongTinTaiKhoanUI(data);
            baoTriThongTinTaiKhoanUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTaiKhoanActionPerformed

    private void btnHocPhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocPhanActionPerformed
        // TODO add your handling code here:
        try {
            BaoTriThongTinHocPhanUI baoTriThongTinHocPhanUI = new BaoTriThongTinHocPhanUI(data);
            baoTriThongTinHocPhanUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHocPhanActionPerformed

    private void btnChamCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChamCongActionPerformed
         try {
            this.setVisible(false);
            BaoTriThongTinChamCongUI baoTriThongTinChamCongUI = new BaoTriThongTinChamCongUI(data);
            baoTriThongTinChamCongUI.onStartGUI();
            
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
         this.setVisible(true);
    }//GEN-LAST:event_btnChamCongActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        TuyChonUI tuyChonUI = new TuyChonUI();

        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                dispose();
            }

            @Override
            public void onCancelEvent() {

            }
        });

        tuyChonUI.onCallGUI(this.getContentPane(), "Bạn có muốn thoát chương trình", "Thông Báo");
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnXemChiTietLuongCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietLuongCaNhanActionPerformed
        // TODO add your handling code here:
        XemChiTietLuongCaNhanUI xemChiTietLuongCaNhanUI;
        try {
            xemChiTietLuongCaNhanUI = new XemChiTietLuongCaNhanUI(data);
            xemChiTietLuongCaNhanUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }//GEN-LAST:event_btnXemChiTietLuongCaNhanActionPerformed

    private void btnQuanLyThongTinCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyThongTinCaNhanActionPerformed
        // TODO add your handling code here:
        try {
            QuanLyThongTinCaNhanUI quanLyThongTinCaNhanUI = new QuanLyThongTinCaNhanUI(data);
            quanLyThongTinCaNhanUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuAdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }          
        
    }//GEN-LAST:event_btnQuanLyThongTinCaNhanActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChuAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuAdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        lblUsername.setText("Xin chào," + data.get("TenTaiKhoan"));

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuAdminUI(data).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChamCong;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHeSoLuong;
    private javax.swing.JButton btnHocPhan;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnPhongBan;
    private javax.swing.JButton btnPhuCap;
    private javax.swing.JButton btnQuanLyThongTinCaNhan;
    private javax.swing.JButton btnTaiKhoan;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTienThuong;
    private javax.swing.JButton btnXemChiTietLuongCaNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
