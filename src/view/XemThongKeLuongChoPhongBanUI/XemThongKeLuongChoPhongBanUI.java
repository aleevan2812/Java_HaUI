/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.XemThongKeLuongChoPhongBanUI;

import javax.swing.DefaultComboBoxModel;
import controller.BaoTriThongTinPhongBanController;
import controller.QuanLyThongTinCaNhanController;
import java.util.HashMap;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.IUpdateTableEvent;
/**
 *
 * @author Admin
 */
public class XemThongKeLuongChoPhongBanUI extends javax.swing.JFrame {
     private HashMap<String, Object> data;
    QuanLyThongTinCaNhanController quanLyThongTinCaNhanController;
    
    public XemThongKeLuongChoPhongBanUI(String name) throws SQLException {
       this.data = data;
        initComponents();
        jLabel1.setText(name);
        generateComboBoxData();
        generateComboBoxData2();
        setLocationRelativeTo(null);
        quanLyThongTinCaNhanController = new QuanLyThongTinCaNhanController();
        UpdateTable("");

        quanLyThongTinCaNhanController.setUpdateTableEvent(new IUpdateTableEvent() {
            @Override
            public void onUpdateDataOnTableEvent() {
                try {
                    UpdateTable("");
                } catch (SQLException ex) {
                    Logger.getLogger(XemThongKeLuongChoPhongBanUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

     public void UpdateTable(String queryString) throws SQLException { 
          ArrayList<String> dsluongcanhan = quanLyThongTinCaNhanController.onQueryAllUserCheckCaNhan(queryString,false); 
          DefaultTableModel defaultTableModel = (DefaultTableModel) jTable1.getModel(); 
          
          while (defaultTableModel.getRowCount() > 0) {  
              defaultTableModel.removeRow(0);  
          } 
          for (int i = 0; i < dsluongcanhan.size(); i++) { 
              String[] strings = dsluongcanhan.get(i).split(",");
              String[] datas = new String[strings.length]; 
              System.arraycopy(strings, 0, datas, 0, strings.length); 
              defaultTableModel.addRow((Object[]) datas); 
          } 
      }
     
     private void generateComboBoxData2() throws SQLException{
        BaoTriThongTinPhongBanController baoTriThongTinPhongBanController=new BaoTriThongTinPhongBanController();
        ArrayList<String> dstenhps = baoTriThongTinPhongBanController.onQueryAllMaPhong();
        cboMaPhong.setModel(new DefaultComboBoxModel<>(dstenhps.toArray(new String[dstenhps.size()])));
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboThang = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboMaPhong = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thống Kê Lương Phòng Ban Theo Tháng Năm");

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));

        cboThang.setFont(cboThang.getFont().deriveFont(cboThang.getFont().getSize()+3f));

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+3f));
        jLabel2.setText("Tháng:");

        cboMaPhong.setFont(cboMaPhong.getFont().deriveFont(cboMaPhong.getFont().getSize()+3f));

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()+3f));
        jLabel3.setText("Năm:");

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()+3f));
        jLabel4.setText("Mã Phòng:");

        cboNam.setFont(cboNam.getFont().deriveFont(cboNam.getFont().getSize()+3f));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Mã Phòng Ban", "Tháng", "Năm", "Số Ngày Làm Việc", "Số Giờ Làm Thêm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getSize()+3f));
        jButton1.setText("Thống Kê");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboMaPhong, 0, 338, Short.MAX_VALUE)
                    .addComponent(cboThang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboNam, javax.swing.GroupLayout.Alignment.TRAILING, 0, 338, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try {
            String thang=(String) cboThang.getSelectedItem();
            String nam =(String) cboNam.getSelectedItem();
            String maphong=(String) cboMaPhong.getSelectedItem();
            UpdateTable("where thang= "+thang+" and nam="+nam+" and maphong="+maphong);
        } catch (SQLException ex) {
            Logger.getLogger(XemThongKeLuongChoPhongBanUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(XemThongKeLuongChoPhongBanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemThongKeLuongChoPhongBanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemThongKeLuongChoPhongBanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemThongKeLuongChoPhongBanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new XemThongKeLuongChoPhongBanUI("").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(XemThongKeLuongChoPhongBanUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboMaPhong;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
