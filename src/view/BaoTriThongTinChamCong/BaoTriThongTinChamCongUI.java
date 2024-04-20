package view.BaoTriThongTinChamCong;

import controller.BaoTriThongTinChamCongController;
import model.ChamCong;
import view.TuyChonUI;
import util.IOptionEvent;
import util.IUpdateTableEvent;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;

public final class BaoTriThongTinChamCongUI extends javax.swing.JFrame {
    BaoTriThongTinChamCongController baoTriThongTinChamCongController;
    private HashMap<String, Object> data;
    
    public void UpdateTable() throws SQLException {
        ArrayList<ChamCong> chamCongs = baoTriThongTinChamCongController.onQueryAllChamCongs();

        DefaultTableModel defaultTableModel = (DefaultTableModel) tblChamCong.getModel();

        while (defaultTableModel.getRowCount() > 0) {
            defaultTableModel.removeRow(0);
        }
        for (var chamCong : chamCongs) {
            defaultTableModel.addRow(chamCong.toObjectArrayData());
        }
    }
    
    public boolean validateData() {
        String message = "";
        int numErr = 0;
        try {
            
            if (txtSoGioLamThem.getText().trim().equalsIgnoreCase("")) {
                message += "Số giờ làm thêm không được để trống\n";
                numErr += 1;
            }
            
            if (txtTienUngTruoc.getText().trim().equalsIgnoreCase("")) {
                message += "Tiền ứng trước không được để trống\n";
                numErr += 1;
            }
            
            if (txtMaNhanVien.getText().trim().equalsIgnoreCase("")) {
                message += "Mã nhân viên không được để trống\n";
                numErr += 1;
            }
            if (numErr > 0) {
                throw new Exception(message);
            }

            try {
                if(Integer.parseInt(txtSoGioLamThem.getText()) < 0){
                    message += "Số giờ làm thêm phải >=0";
                    numErr += 1;
                }
            } catch (NumberFormatException ex) {
                message += "Số giờ làm thêm phải là số nguyên";
                numErr += 1;
            }
            
            try {
                if(Long.parseLong(txtTienUngTruoc.getText()) < 0){
                    message += "Tiền ứng trước phải >= 0";
                    numErr += 1;
                }
                
            } catch (NumberFormatException ex) {
                message += "Tiền ứng trước phải là số nguyên";
                numErr += 1;
            }
            Long manv=baoTriThongTinChamCongController.onQueryMaChamCong(txtMaNhanVien.getText());
            if(manv == null) {
                message += "Mã nhân viên không tồn tại";
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
   
   public BaoTriThongTinChamCongUI(HashMap<String, Object> data) throws SQLException {
        this.data = data;
        initComponents();
        generateComboBoxData();
        setLocationRelativeTo(null);
        txtMaCong.requestFocus();
        baoTriThongTinChamCongController = new BaoTriThongTinChamCongController();
        UpdateTable();

        baoTriThongTinChamCongController.setUpdateTableEvent(new IUpdateTableEvent() {
            @Override
            public void onUpdateDataOnTableEvent() {
                try {
                    UpdateTable();
                } catch (SQLException ex) {
                    Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaCong = new javax.swing.JTextField();
        cboThang = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSoNgayLamViec = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        txtTienUngTruoc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSoGioLamThem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblChamCong = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bảo trì thông tin chấm công");
        setResizable(false);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Bảo trì thông tin chấm công");

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+3f));
        jLabel2.setText("Mã Công");

        txtMaCong.setFont(txtMaCong.getFont().deriveFont(txtMaCong.getFont().getSize()+3f));
        txtMaCong.setForeground(new java.awt.Color(204, 204, 204));
        txtMaCong.setText("Mã sẽ tự điền khi thêm");
        txtMaCong.setEnabled(false);

        cboThang.setFont(cboThang.getFont().deriveFont(cboThang.getFont().getSize()+3f));

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()+3f));
        jLabel3.setText("Tháng:");

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()+3f));
        jLabel4.setText("Năm:");

        cboNam.setFont(cboNam.getFont().deriveFont(cboNam.getFont().getSize()+3f));

        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getSize()+3f));
        jLabel6.setText("Mã Nhân Viên");

        txtMaNhanVien.setFont(txtMaNhanVien.getFont().deriveFont(txtMaNhanVien.getFont().getSize()+3f));

        jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getSize()+3f));
        jLabel7.setText("Số ngày làm việc");

        txtSoNgayLamViec.setFont(txtSoNgayLamViec.getFont().deriveFont(txtSoNgayLamViec.getFont().getSize()+3f));
        txtSoNgayLamViec.setModel(new javax.swing.SpinnerNumberModel());

        jLabel8.setFont(jLabel8.getFont().deriveFont(jLabel8.getFont().getSize()+3f));
        jLabel8.setText("Tiền ứng trước");

        txtTienUngTruoc.setFont(txtTienUngTruoc.getFont().deriveFont(txtTienUngTruoc.getFont().getSize()+3f));

        jLabel9.setFont(jLabel9.getFont().deriveFont(jLabel9.getFont().getSize()+3f));
        jLabel9.setText("Số giờ làm thêm");

        txtSoGioLamThem.setFont(txtSoGioLamThem.getFont().deriveFont(txtSoGioLamThem.getFont().getSize()+3f));

        jLabel10.setFont(jLabel10.getFont().deriveFont(jLabel10.getFont().getSize()+3f));
        jLabel10.setText("Danh sách thưởng");

        jLabel11.setFont(jLabel11.getFont().deriveFont(jLabel11.getFont().getSize()+3f));
        jLabel11.setText("Danh sách phụ cấp");

        jLabel12.setFont(jLabel12.getFont().deriveFont(jLabel12.getFont().getSize()+3f));
        jLabel12.setText("Danh sách học phần");

        tblChamCong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Công", "Tháng", "Năm", "Số ngày làm việc", "Số giờ làm thêm", "Tiền ứng trước", "Mã Nhân Viên"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblChamCong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChamCongMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblChamCong);

        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getSize()+3f));
        jButton1.setText("Xóa Thông Tin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(jButton2.getFont().deriveFont(jButton2.getFont().getSize()+3f));
        jButton2.setText("Thêm Chấm Công");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(jButton3.getFont().deriveFont(jButton3.getFont().getSize()+3f));
        jButton3.setText("Sửa Chấm Công");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(jButton4.getFont().deriveFont(jButton4.getFont().getSize()+3f));
        jButton4.setText("Xóa Chấm Công");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane6.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane7.setViewportView(jTextArea3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane8.setViewportView(jTextArea4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(46, 46, 46)
                                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtMaCong, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(cboThang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoNgayLamViec, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(txtSoGioLamThem)
                            .addComponent(txtTienUngTruoc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtSoNgayLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtSoGioLamThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtTienUngTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jScrollPane7))
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton1)))
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private ArrayList<String> processTextAreaData(JTextArea textArea) {
        // Lấy nội dung từ JTextArea
        String text = textArea.getText();

        // Tách các dòng thành mảng các dòng
        String[] lines = text.split(System.lineSeparator());

        // Tạo ArrayList để lưu dữ liệu từ JTextArea
        ArrayList<String> dataList = new ArrayList<>();
           
        // Thêm mỗi dòng vào ArrayList
        for (String line : lines) {
            dataList.add(line);
        }
        return dataList;
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // them cham cong:
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    try {
                        ArrayList<String> dsth=processTextAreaData(jTextArea2);
                        ArrayList<String> dshp=processTextAreaData(jTextArea3);
                        ArrayList<String> dsphc=processTextAreaData(jTextArea4);
                        ChamCong chamCong= new ChamCong(
                                Integer.parseInt((String) cboThang.getSelectedItem()),
                                Integer.parseInt((String) cboNam.getSelectedItem()), 
                                (int) txtSoNgayLamViec.getValue(),
                                Integer.parseInt(txtSoGioLamThem.getText()),
                                Long.parseLong(txtTienUngTruoc.getText()),
                                Long.parseLong(txtMaNhanVien.getText())
                        );
                        chamCong.setDanhSachThuong(dsth);
                        chamCong.setDanhSachHocPhan(dshp);
                        chamCong.setDanhSachPhuCap(dsphc);
                        baoTriThongTinChamCongController.addChamCong(chamCong);
                       
                        JOptionPane.showMessageDialog(getContentPane(), "Thêm chấm công Mới Thành Công");
                        clearAllTextBox();
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn thêm Chấm công Này?", "Thông Báo");
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    private void tblChamCongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChamCongMouseClicked
        // TODO add your handling code here:
         int rowIndex = tblChamCong.getSelectedRow();
        TableModel model = tblChamCong.getModel();

        String maCong = model.getValueAt(rowIndex, 0).toString();
        String thang = model.getValueAt(rowIndex, 1).toString();
        String nam = model.getValueAt(rowIndex, 2).toString();
        String soNgayLamViec = model.getValueAt(rowIndex, 3).toString();
        String soGioLamViec = model.getValueAt(rowIndex, 4).toString();
        String soTienUngTruoc= model.getValueAt(rowIndex, 5).toString();
        String maNhanVien =model.getValueAt(rowIndex, 6).toString();
        txtMaCong.setText(maCong);
        txtMaNhanVien.setText(maNhanVien);
        txtSoGioLamThem.setText(soGioLamViec);
        txtTienUngTruoc.setText(soTienUngTruoc);
        cboThang.setSelectedItem(thang);
        cboNam.setSelectedItem(nam);
        txtSoNgayLamViec.setValue(Integer.valueOf(soNgayLamViec));
        
        try {
            ArrayList<String> dsth= baoTriThongTinChamCongController.onQueryAllDS(maCong,"dsthuong");
            ArrayList<String> dshp= baoTriThongTinChamCongController.onQueryAllDS(maCong,"dshocphan");
            ArrayList<String> dsphc= baoTriThongTinChamCongController.onQueryAllDS(maCong,"dsphucap");
            String txtdsth = String.join(System.lineSeparator(), dsth);
            String txtdshp = String.join(System.lineSeparator(), dshp);
            String txtdsphc = String.join(System.lineSeparator(), dsphc);
            
            jTextArea2.setText(txtdsth);
            jTextArea3.setText(txtdshp);
            jTextArea4.setText(txtdsphc);
        } catch (SQLException ex) {
            Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblChamCongMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // sửa chấm công:
          TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    try {
                        if (txtMaCong.getText().equals("")) {
                            JOptionPane.showMessageDialog(getContentPane(), "Bạn chưa chọn Chấm công cần sửa");
                            return;
                        }
                        ArrayList<String> dsth=processTextAreaData(jTextArea2);
                        ArrayList<String> dshp=processTextAreaData(jTextArea3);
                        ArrayList<String> dsphc=processTextAreaData(jTextArea4);
                        baoTriThongTinChamCongController.modifyHeSoLuongByID(new ChamCong(
                                Long.parseLong(txtMaCong.getText()),
                                Integer.parseInt((String) cboThang.getSelectedItem()),
                                Integer.parseInt((String) cboNam.getSelectedItem()),
                                (int) txtSoNgayLamViec.getValue(),
                                Integer.parseInt(txtSoGioLamThem.getText()),
                                Long.parseLong(txtTienUngTruoc.getText()),
                                Long.parseLong(txtMaNhanVien.getText()),
                                dsth,
                                dsphc,
                                dshp
                        ));
                        JOptionPane.showMessageDialog(getContentPane(), "Sửa Chấm công Thành Công!!!");
                        clearAllTextBox();
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn sửa Chấm Công Này?", "Thông Báo");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // xóa chấm công:
         TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if (validateData()) {
                    try {
                        if (txtMaCong.getText().equals("")) {
                            JOptionPane.showMessageDialog(getContentPane(), "Bạn chưa chọn chấm công cần xóa");
                            return;
                        }
                        baoTriThongTinChamCongController.deleteChamCongByID(Long.parseLong(txtMaCong.getText()));
                        JOptionPane.showMessageDialog(getContentPane(), "Xóa Chấm Công Này Thành Công");
                        clearAllTextBox();
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });

        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn xóa chấm công Này?", "Thông Báo");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // xóa thông tin:
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
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void clearAllTextBox() {
        txtMaCong.setText("");
        txtSoGioLamThem.setText("");
        txtTienUngTruoc.setText("");
        txtMaNhanVien.setText("");
        jTextArea2.setText("");
        jTextArea3.setText("");
        jTextArea4.setText("");
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
            java.util.logging.Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 try {
                    new BaoTriThongTinChamCongUI(data).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void generateComboBoxData(){
        ArrayList<String> thang = new ArrayList(); 
        
        for(int i = 1 ; i <= 12 ; i++){
            thang.add(String.valueOf(i));
        }
      
        ArrayList<String> nam = new ArrayList<>();
        
        for (int i = 1970; i <= 2022; i++) {
            nam.add(String.valueOf(i));
        }
        
       cboThang.setModel(new DefaultComboBoxModel<>(thang.toArray(new String[thang.size()])));
       cboNam.setModel(new DefaultComboBoxModel<>(nam.toArray(new String[nam.size()])));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTable tblChamCong;
    private javax.swing.JTextField txtMaCong;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtSoGioLamThem;
    private javax.swing.JSpinner txtSoNgayLamViec;
    private javax.swing.JTextField txtTienUngTruoc;
    // End of variables declaration//GEN-END:variables
}
