package RecruitmentForm;

import Database.DBEngine;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author caotrungduc
 */
public class Recruitment extends javax.swing.JFrame {
    
    ArrayList<RecruitmentDTO> listRecruitData = new ArrayList<>();
    ArrayList<RecruitmentDTO> listRecruit = new ArrayList<>();
    RecruitmentDTO recruit = new RecruitmentDTO();
    int selectedRow = -1;
    
    String selectedFilter = "";
    String selectedSort = "";
    
    static String fileName = "src\\Database\\Recruit.txt";
    static DBEngine db = new DBEngine();
    
    public Recruitment() {
        initComponents();
    }
    
    public void clearInput() {
        txtTitle.setText("");
        btnGroupPos.clearSelection();
        txtAge.setText("");
        btnGroupGen.clearSelection();
        txtQuantity.setText("");
        txtDeadline.setText("");
        txtDegree.setText("");
        txtExperience.setText(""); 
    }
    
    public void loadTable() {
        tblRecruit.setModel(new RecruitmentDAO(listRecruit));
    }
    
    public void saveData() {
        try {
            db.SaveFile(fileName, listRecruit);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void getData() {
        try {
            listRecruitData = (ArrayList<RecruitmentDTO>) db.ReadFile(fileName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void checkValidDate(String date) throws Exception {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate.parse(date, formatter);
        } catch (Exception e) {
            throw new Exception("Invalid date (dd-MM-yyyy)");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupPos = new javax.swing.ButtonGroup();
        btnGroupGen = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        radioBtnPosL = new javax.swing.JRadioButton();
        radioBtnPosS = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        radioBtnGenM = new javax.swing.JRadioButton();
        radioBtnGenF = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDeadline = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDegree = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtExperience = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFilter = new javax.swing.JButton();
        cbFilter = new javax.swing.JComboBox<>();
        cbSort = new javax.swing.JComboBox<>();
        btnSort = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecruit = new javax.swing.JTable();
        radioBtnGenB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Title:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Position:");

        txtTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnGroupPos.add(radioBtnPosL);
        radioBtnPosL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnPosL.setText("Lecturer");

        btnGroupPos.add(radioBtnPosS);
        radioBtnPosS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnPosS.setText("Specialist");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Age:");

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Gender:");

        btnGroupGen.add(radioBtnGenM);
        radioBtnGenM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnGenM.setText("Male");

        btnGroupGen.add(radioBtnGenF);
        radioBtnGenF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnGenF.setText("Female");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Deadline:");

        txtDeadline.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Degree:");

        txtDegree.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Experience:");

        txtExperience.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAdd.setBackground(new java.awt.Color(176, 227, 230));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(176, 227, 230));
        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(176, 227, 230));
        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFilter.setBackground(new java.awt.Color(176, 227, 230));
        btnFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnFilter.setText("Filter by");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        cbFilter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Lecturer", "Specialist" }));

        cbSort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "Age", "Quantity", "Deadline" }));

        btnSort.setBackground(new java.awt.Color(176, 227, 230));
        btnSort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSort.setText("Sort by");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        tblRecruit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblRecruit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Position", "Age", "Gender", "Quantity", "Deadline", "Degree", "Experience"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblRecruit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRecruitMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRecruit);

        btnGroupGen.add(radioBtnGenB);
        radioBtnGenB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioBtnGenB.setText("Both");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1))
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                            .addComponent(txtAge)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnEdit)
                                                .addGap(31, 31, 31)
                                                .addComponent(btnDelete))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                .addComponent(txtDegree)))))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(radioBtnPosL)
                                            .addGap(35, 35, 35)
                                            .addComponent(radioBtnPosS))
                                        .addComponent(txtExperience, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                        .addComponent(txtDeadline))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioBtnGenM)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioBtnGenF)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioBtnGenB))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(217, 217, 217)
                                .addComponent(btnFilter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnSort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 42, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(radioBtnPosL)
                    .addComponent(radioBtnPosS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(radioBtnGenM)
                    .addComponent(radioBtnGenF)
                    .addComponent(radioBtnGenB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd)
                        .addComponent(btnEdit)
                        .addComponent(btnDelete)
                        .addComponent(btnFilter)
                        .addComponent(cbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSort)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtTitle.getText().isEmpty() 
            || (!radioBtnPosL.isSelected() && !radioBtnPosS.isSelected())
            || txtAge.getText().isEmpty()
            || (!radioBtnGenM.isSelected() && !radioBtnGenF.isSelected() && !radioBtnGenB.isSelected())
            || txtDeadline.getText().isEmpty()
            || txtQuantity.getText().isEmpty()
            || txtDegree.getText().isEmpty()
            || txtExperience.getText().isEmpty()
                ){
            JOptionPane.showConfirmDialog(this,"Not enough information to add","Notification", HEIGHT);
            return;
        }
        
        try {
            String title = txtTitle.getText();
            String position = (radioBtnPosL.isSelected() ? "Lecturer" : "Specialist");
            
            String gender;
            if (radioBtnGenB.isSelected()) gender = "Both";
            else if (radioBtnGenM.isSelected()) gender = "Male";
            else gender = "Female";
            
            String degree = txtDegree.getText();
            String experience = txtExperience.getText();
            
            int age = Integer.parseInt(txtAge.getText());
            if (age < 18) throw new Exception("The age is at least 18");
            
            int quantity = Integer.parseInt(txtQuantity.getText());
            if (quantity <= 0) throw new Exception("The quantity is over 0");

            String deadline = txtDeadline.getText();
            checkValidDate(deadline);

            recruit = new RecruitmentDTO(title, position, gender, deadline, degree, experience, age, quantity);
            listRecruit.add(recruit);

            loadTable();
            saveData();
            clearInput();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e.getMessage(),"Notification", HEIGHT);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblRecruitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRecruitMouseClicked
        selectedRow = tblRecruit.getSelectedRow();
        if (selectedRow != -1) {
            recruit = listRecruit.get(selectedRow);
            
            txtTitle.setText(recruit.getTitle());
            
            boolean isSelectedPosL = (recruit.getPosition().equals("Lecturer"));
            radioBtnPosL.setSelected(isSelectedPosL);
            radioBtnPosS.setSelected(!isSelectedPosL);
            
            txtAge.setText(recruit.getAge()+"");
            
            boolean isSelectedGenM = (recruit.getGender().equals("Male"));
            boolean isSelectedGenF = (recruit.getGender().equals("Female"));
            radioBtnGenM.setSelected(isSelectedGenM);
            radioBtnGenF.setSelected(isSelectedGenF);
            radioBtnGenB.setSelected(!(isSelectedGenM || isSelectedGenF));
            
            txtQuantity.setText(recruit.getQuantity()+"");
            txtDeadline.setText(recruit.getDeadline());
            txtDegree.setText(recruit.getDegree());
            txtExperience.setText(recruit.getExperience());
        }
    }//GEN-LAST:event_tblRecruitMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        selectedRow = tblRecruit.getSelectedRow();
        if (selectedRow != -1) {
            recruit = listRecruit.get(selectedRow);
            
            try {
                recruit.setTitle(txtTitle.getText());
                recruit.setPosition((radioBtnPosL.isSelected() ? "Lecturer" : "Specialist"));
                recruit.setAge(Integer.parseInt(txtAge.getText()));

                if (radioBtnGenB.isSelected()) recruit.setGender("Both");
                else if (radioBtnGenM.isSelected()) recruit.setGender("Male");
                else recruit.setGender("Female");

                recruit.setQuantity(Integer.parseInt(txtQuantity.getText()));
                recruit.setDeadline(txtDeadline.getText());
                recruit.setDegree(txtDegree.getText());
                recruit.setExperience(txtExperience.getText());
                listRecruit.set(selectedRow, recruit);

                loadTable();
                saveData();
                clearInput();
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(this, e.getMessage(),"Notification", HEIGHT);
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        selectedRow = tblRecruit.getSelectedRow();
        if (selectedRow != -1) {
            recruit = listRecruit.remove(selectedRow);
            
            loadTable();
            saveData();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        selectedFilter = (String) cbFilter.getSelectedItem();
        
        getData();
        listRecruit.clear();
        
        switch(selectedFilter) {
            case "All":
            {
                listRecruit.addAll(listRecruitData);
                break;
            }
            case "Lecturer":
            {
                for(RecruitmentDTO recruit : listRecruitData) {
                    if (recruit.getPosition().equals("Lecturer")) {
                        listRecruit.add(recruit);
                    }
                }
                break;
            }
            case "Specialist":
            {
                for(RecruitmentDTO recruit : listRecruitData) {
                    if (recruit.getPosition().equals("Specialist")) {
                        listRecruit.add(recruit);
                    }
                }
                break;
            }
            default:
            {
                JOptionPane.showConfirmDialog(this,"Field is not exist!","Notification", HEIGHT);
            }
        }
        
        loadTable();
    }//GEN-LAST:event_btnFilterActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        selectedSort = (String) cbSort.getSelectedItem();
        
        switch(selectedSort) {
            case "Title":
            {
                Collections.sort(listRecruit, Comparator.comparing(RecruitmentDTO::getTitle));
                break;
            }
            case "Age":
            {
                Collections.sort(listRecruit, Comparator.comparingInt(RecruitmentDTO::getAge));
                break;
            }
            case "Quantity":
            {
                Collections.sort(listRecruit, Comparator.comparingInt(RecruitmentDTO::getQuantity));
                break;
            }
            case "Deadline":
            {
                Collections.sort(listRecruit, Comparator.comparing(RecruitmentDTO::getDeadline));
                break;
            }
            default:
            {
                JOptionPane.showConfirmDialog(this,"Field is not exist!","Notification", HEIGHT);
            }
        }
        
        loadTable();
    }//GEN-LAST:event_btnSortActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getData();
        listRecruit = new ArrayList<RecruitmentDTO>(listRecruitData);
        loadTable();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recruitment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Recruitment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFilter;
    private javax.swing.ButtonGroup btnGroupGen;
    private javax.swing.ButtonGroup btnGroupPos;
    private javax.swing.JButton btnSort;
    private javax.swing.JComboBox<String> cbFilter;
    private javax.swing.JComboBox<String> cbSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioBtnGenB;
    private javax.swing.JRadioButton radioBtnGenF;
    private javax.swing.JRadioButton radioBtnGenM;
    private javax.swing.JRadioButton radioBtnPosL;
    private javax.swing.JRadioButton radioBtnPosS;
    private javax.swing.JTable tblRecruit;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDeadline;
    private javax.swing.JTextField txtDegree;
    private javax.swing.JTextField txtExperience;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
