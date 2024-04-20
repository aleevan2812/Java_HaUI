package view.QuanLyThongTinCaNhan;

import controller.QuanLyThongTinCaNhanController;
import model.NhanVien;
import model.TaiKhoan;
import view.TrangChu.TrangChuAdmin.TrangChuAdminUI;
import view.TrangChu.TrangChuGiamDoc.TrangChuGiamDocUI;
import view.TrangChu.TrangChuKeToan.TrangChuKeToanUI;
import view.TrangChu.TrangChuNguoiDung.TrangChuNguoiDungUI;
import view.TrangChu.TrangChuNhanSu.TrangChuNhanSuUI;
import util.KetNoiCSDL;
import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.IOptionEvent;
import view.TuyChonUI;

public class QuanLyThongTinCaNhanUI extends javax.swing.JFrame {

    private QuanLyThongTinCaNhanController controller;
    private HashMap<String, Object> data;
    private static final String insertNhanVien
            = "insert into NHANVIEN(MANHANVIEN, TENNHANVIEN, GIOITINH, NGAYSINH, DIACHI, CHUCVU, TRINHDO, MAPHONG, MAHESOLUONG, MATAIKHOAN) "
            + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String updateNhanVien
            = "update NHANVIEN SET "
            + "TENNHANVIEN = ?,"
            + "GIOITINH = ?,"
            + "NGAYSINH = ?,"
            + "DIACHI = ?,"
            + "TRINHDO = ? "
            + "where MANHANVIEN = ?";

    private static final String checkNhanVien
            = "select count(*) from NHANVIEN "
            + "where MANHANVIEN = ?";

    public QuanLyThongTinCaNhanUI() {
    }

    public QuanLyThongTinCaNhanUI(HashMap<String, Object> data) throws SQLException {
        this.data = data;
        controller = new QuanLyThongTinCaNhanController();
        initComponents();
        setLocationRelativeTo(null);
        initData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdGroupGioiTinh = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        cboTrinhDo = new javax.swing.JComboBox<>();
        btnSuaThongTinCaNhan = new javax.swing.JButton();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        btnQuayLai = new javax.swing.JButton();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Thông Tin Cá Nhân");

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+3f));
        jLabel2.setText("Họ tên:");

        txtHoTen.setFont(txtHoTen.getFont().deriveFont(txtHoTen.getFont().getSize()+3f));

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()+3f));
        jLabel3.setText("Giới Tính:");

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getSize()+3f));
        jLabel5.setText("Ngày Sinh:");

        jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getSize()+3f));
        jLabel7.setText("Địa Chỉ:");

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane1.setViewportView(txtDiaChi);

        jLabel10.setFont(jLabel10.getFont().deriveFont(jLabel10.getFont().getSize()+3f));
        jLabel10.setText("Trình Độ:");

        cboTrinhDo.setFont(cboTrinhDo.getFont().deriveFont(cboTrinhDo.getFont().getSize()+3f));
        cboTrinhDo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đại Học", "Cao Đẳng", "Thạc Sĩ", "Tiến Sĩ", "Phó Giáo Sư", "Giáo Sư" }));

        btnSuaThongTinCaNhan.setFont(btnSuaThongTinCaNhan.getFont().deriveFont(btnSuaThongTinCaNhan.getFont().getSize()+3f));
        btnSuaThongTinCaNhan.setText("Sửa Thông Tin Cá Nhân");
        btnSuaThongTinCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThongTinCaNhanActionPerformed(evt);
            }
        });

        rdGroupGioiTinh.add(rdNam);
        rdNam.setFont(rdNam.getFont().deriveFont(rdNam.getFont().getSize()+3f));
        rdNam.setText("Nam");

        rdGroupGioiTinh.add(rdNu);
        rdNu.setFont(rdNu.getFont().deriveFont(rdNu.getFont().getSize()+3f));
        rdNu.setText("Nữ");

        btnQuayLai.setText("Quay Lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rdNam)
                                .addGap(18, 18, 18)
                                .addComponent(rdNu))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtHoTen))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboTrinhDo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(btnSuaThongTinCaNhan))
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnQuayLai)
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnQuayLai))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rdNam)
                    .addComponent(rdNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTrinhDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(40, 40, 40)
                .addComponent(btnSuaThongTinCaNhan)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaThongTinCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThongTinCaNhanActionPerformed
        // chèn nhân viên 
       
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                Connection connection = KetNoiCSDL.getConnection();
                PreparedStatement preparedStatement2;
                int check=-1;
                try {
                    
                    PreparedStatement preparedStatement1 = connection.prepareStatement(checkNhanVien);
                    preparedStatement1.setLong(1, (int) data.get("ID"));
                    ResultSet resultSet1 = preparedStatement1.executeQuery();
                    resultSet1.next();
                    check = resultSet1.getInt(1);
                    if (check == 1) {
                        preparedStatement2 = connection.prepareStatement(updateNhanVien);
                        preparedStatement2.setString(1, txtHoTen.getText().trim());
                        preparedStatement2.setInt(2, rdNam.isSelected() ? 0 : 1);
                        java.sql.Date date = new java.sql.Date(txtNgaySinh.getDate().getTime());
                        preparedStatement2.setDate(3, date);
                        preparedStatement2.setString(4, txtDiaChi.getText());
                        preparedStatement2.setString(5, cboTrinhDo.getSelectedItem().toString());
                        preparedStatement2.setLong(6, (int) data.get("ID"));
                        preparedStatement2.executeUpdate();
                    } else {
                        preparedStatement2 = connection.prepareStatement(insertNhanVien);
                        preparedStatement2.setLong(1, (int) data.get("ID"));
                        preparedStatement2.setString(2, txtHoTen.getText().trim());
                        preparedStatement2.setInt(3, rdNam.isSelected() ? 0 : 1);
                        java.sql.Date date = new java.sql.Date(txtNgaySinh.getDate().getTime());
                        preparedStatement2.setDate(4, date);
                        preparedStatement2.setString(5, txtDiaChi.getText());
                        String chucvu = "";
                        switch ((int) data.get("Quyen")) {
                            case 0 -> {
                                chucvu = "admin";
                            }

                            case 1 -> {
                                chucvu = "Giáo viên";
                            }

                            case 2 -> {
                                chucvu = "Kế toán";
                            }

                            case 3 -> {
                                chucvu = "Nhân sự";
                            }

                            case 4 -> {
                                chucvu = "Giám đốc";
                            }
                        }
                        preparedStatement2.setString(6, chucvu);
                        preparedStatement2.setString(7, cboTrinhDo.getSelectedItem().toString());
                        preparedStatement2.setInt(8, 1);
                        preparedStatement2.setInt(9, 1);
                        preparedStatement2.setInt(10, (int) data.get("ID"));
                        preparedStatement2.executeUpdate();

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyThongTinCaNhanUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                 if(check!=-1)
            JOptionPane.showMessageDialog(getContentPane(), "Sửa thông tin cá nhân thành công","Sửa thông tin", JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog(getContentPane(), "Sửa thông tin cá nhân không thành công","Sửa thông tin", JOptionPane.ERROR_MESSAGE);
            }

            @Override
            public void onCancelEvent() {
            }
        });
        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn sửa thông tin cá nhân không ?", "Thông Báo");
    }//GEN-LAST:event_btnSuaThongTinCaNhanActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    public void onStartGUI() throws SQLException {
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
            java.util.logging.Logger.getLogger(QuanLyThongTinCaNhanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyThongTinCaNhanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyThongTinCaNhanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyThongTinCaNhanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new QuanLyThongTinCaNhanUI(data).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyThongTinCaNhanUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    private void initData() throws SQLException {
        NhanVien nhanVien = controller.onQueryUserInfo((int) data.get("ID"));
        if (nhanVien != null) {
            txtHoTen.setText(nhanVien.getTenNhanVien());
            txtNgaySinh.setDate(new Date(nhanVien.getNgaySinh().getTime()));
            txtDiaChi.setText(nhanVien.getDiaChi());

//            for (int i = 0; i < cboChucVu.getItemCount(); i++) {
//                if (cboChucVu.getItemAt(i).equalsIgnoreCase(nhanVien.getChucVu())) {
//                    cboChucVu.setSelectedIndex(i);
//                    break;
//                }
//            }
            for (int i = 0; i < cboTrinhDo.getItemCount(); i++) {
                if (cboTrinhDo.getItemAt(i).equalsIgnoreCase(nhanVien.getTrinhDo())) {
                    cboTrinhDo.setSelectedIndex(i);
                    break;
                }
            }

            if (nhanVien.getGioiTinh() == 0) {
                rdNam.setSelected(true);
            } else {
                rdNu.setSelected(true);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSuaThongTinCaNhan;
    private javax.swing.JComboBox<String> cboTrinhDo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup rdGroupGioiTinh;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    // End of variables declaration//GEN-END:variables
}
