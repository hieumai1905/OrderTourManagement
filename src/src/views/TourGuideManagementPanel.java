    package src.views;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.DAOs.tourguides.ITourGuideDAO;
import src.DAOs.tourguides.TourGuideDAO;
import src.models.TourGuide;
import src.validates.Validator;

public class TourGuideManagementPanel extends javax.swing.JPanel {

    private List<TourGuide> tourGuides;

    private ITourGuideDAO tourGuideDAO;

    private int selectedRowIndex = -1;

    public TourGuideManagementPanel() {
        initComponents();
        tourGuideDAO = TourGuideDAO.getInstance();
        loadData();
    }

    private void loadData() {
        tourGuides = tourGuideDAO.findAll();
        displayTourGuide();
    }

    private void displayTourGuide() {
        DefaultTableModel tableModel = (DefaultTableModel) tableTourGuides.getModel();
        tableModel.setRowCount(0);

        for (TourGuide tourGuide : tourGuides) {
            Object[] rowData = {
                tourGuide.getTourGuideId(),
                tourGuide.getName(),
                tourGuide.getPhone(),
                tourGuide.getAge(),
                tourGuide.isGender() ? "Nam" : "Nữ",
                tourGuide.getAddress()
            };
            tableModel.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtNameTourGuide = new javax.swing.JTextField();
        txtPhoneTourGuide = new javax.swing.JTextField();
        txtAddressTourGuide = new javax.swing.JTextField();
        txtAgeTourGuide = new javax.swing.JTextField();
        cbGenderTourGuide = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtSearchTourGuide = new javax.swing.JTextField();
        btnSearchTourGuide = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTourGuides = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnDeleteTourGuide = new javax.swing.JButton();
        btnAddTourGuide = new javax.swing.JButton();
        btnUpdateTourGuide = new javax.swing.JButton();
        btnRefreshTourGuide = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(235, 227, 227));

        jPanel4.setBackground(new java.awt.Color(235, 227, 227));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Họ và tên:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Số điện thoại:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Tuổi:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Địa chỉ:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Giới tính:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel10.setText("Thông tin hướng dẫn viên");

        jPanel5.setBackground(new java.awt.Color(235, 227, 227));

        txtNameTourGuide.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtPhoneTourGuide.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtAddressTourGuide.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtAgeTourGuide.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        cbGenderTourGuide.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbGenderTourGuide.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbGenderTourGuide, javax.swing.GroupLayout.Alignment.LEADING, 0, 186, Short.MAX_VALUE)
                    .addComponent(txtPhoneTourGuide, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAgeTourGuide, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddressTourGuide, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNameTourGuide, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNameTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhoneTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAgeTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGenderTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddressTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(235, 227, 227));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel15.setText("Lọc và tìm kiếm");

        txtSearchTourGuide.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnSearchTourGuide.setText("Tìm kiếm");
        btnSearchTourGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTourGuideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtSearchTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSearchTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearchTourGuide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        tableTourGuides.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã hướng dẫn viên", "Tên hướng dẫn viên", "Số điện thoại", "Tuổi", "Giới tính", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTourGuides.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTourGuidesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTourGuides);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel17.setText("Danh sách hướng dẫn viên");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        btnDeleteTourGuide.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnDeleteTourGuide.setText("Xoá");
        btnDeleteTourGuide.setEnabled(false);
        btnDeleteTourGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTourGuideActionPerformed(evt);
            }
        });

        btnAddTourGuide.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnAddTourGuide.setText("Thêm");
        btnAddTourGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTourGuideActionPerformed(evt);
            }
        });

        btnUpdateTourGuide.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnUpdateTourGuide.setText("Cập nhật");
        btnUpdateTourGuide.setEnabled(false);
        btnUpdateTourGuide.setPreferredSize(new java.awt.Dimension(72, 27));
        btnUpdateTourGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTourGuideActionPerformed(evt);
            }
        });

        btnRefreshTourGuide.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnRefreshTourGuide.setText("Làm mới");
        btnRefreshTourGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTourGuideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAddTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeleteTourGuide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRefreshTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnRefreshTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteTourGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 39)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản lý hướng dẫn viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(jLabel1)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchTourGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTourGuideActionPerformed
        String contentSearch = txtSearchTourGuide.getText();
        if ("".equals(contentSearch)) {
            txtSearchTourGuide.requestFocus();
        } else {
            tourGuides = tourGuideDAO.search(contentSearch);
            displayTourGuide();
        }
    }//GEN-LAST:event_btnSearchTourGuideActionPerformed

    private void tableTourGuidesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTourGuidesMouseClicked
        selectedRowIndex = tableTourGuides.getSelectedRow();
        if (selectedRowIndex != -1) {
            btnDeleteTourGuide.setEnabled(true);
            btnUpdateTourGuide.setEnabled(true);

            String name = (String) tableTourGuides.getValueAt(selectedRowIndex, 1);
            String phone = (String) tableTourGuides.getValueAt(selectedRowIndex, 2);
            int age = (int) tableTourGuides.getValueAt(selectedRowIndex, 3);
            String gender = (String) tableTourGuides.getValueAt(selectedRowIndex, 4);
            String address = (String) tableTourGuides.getValueAt(selectedRowIndex, 5);

            txtNameTourGuide.setText(name);
            txtPhoneTourGuide.setText(phone);
            txtAgeTourGuide.setText(String.valueOf(age));
            txtAddressTourGuide.setText(address);
            cbGenderTourGuide.setSelectedItem(gender);
        } else {
            btnDeleteTourGuide.setEnabled(false);
            btnUpdateTourGuide.setEnabled(false);
        }
    }//GEN-LAST:event_tableTourGuidesMouseClicked

    private void btnDeleteTourGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTourGuideActionPerformed
        if (selectedRowIndex != -1) {
            int option = JOptionPane.showOptionDialog(
                    null,
                    "Bạn có chắc chắn muốn xóa không?",
                    "Xác nhận xóa",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    new String[]{"Có", "Không"},
                    "Có"
            );

            if (option == JOptionPane.YES_OPTION) {
                int tourGuideId = (int) tableTourGuides.getValueAt(selectedRowIndex, 0);
                boolean isDeleted = tourGuideDAO.delete((long) tourGuideId);
                if (isDeleted) {
                    loadData();
                    btnDeleteTourGuide.setEnabled(false);
                    btnUpdateTourGuide.setEnabled(false);
                    selectedRowIndex = -1;
                    JOptionPane.showMessageDialog(this, "Xóa hướng dẫn viên thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    resetForm();
                } else {
                    JOptionPane.showMessageDialog(this, "Không thể xóa hướng dẫn viên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteTourGuideActionPerformed

    private void btnRefreshTourGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTourGuideActionPerformed
        resetForm();
        loadData();
    }//GEN-LAST:event_btnRefreshTourGuideActionPerformed

    private void btnUpdateTourGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTourGuideActionPerformed
        if (selectedRowIndex != -1) {
            String name = txtNameTourGuide.getText();
            String phone = txtPhoneTourGuide.getText();
            String address = txtAddressTourGuide.getText();
            String ageText = txtAgeTourGuide.getText();
            String gender = (String) cbGenderTourGuide.getSelectedItem();

            if (name.isEmpty() || phone.isEmpty() || address.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin hướng dẫn viên.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!Validator.isValidPhone(phone)) {
                txtPhoneTourGuide.requestFocus();
                JOptionPane.showMessageDialog(this, "Số điện thoại phải có 11 ký tự và bắt đầu bằng số 0.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int age;
            try {
                age = Integer.parseInt(ageText);
                if (!Validator.isValidAge(age)) {
                    txtAgeTourGuide.setText("");
                    txtAgeTourGuide.requestFocus();
                    JOptionPane.showMessageDialog(this, "Tuổi phải từ 1 đến 99.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Tuổi phải là số.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int tourGuideId = (int) tableTourGuides.getValueAt(selectedRowIndex, 0);

            TourGuide updatedTourGuide = new TourGuide();
            updatedTourGuide.setTourGuideId(tourGuideId);
            updatedTourGuide.setName(name);
            updatedTourGuide.setPhone(phone);
            updatedTourGuide.setAddress(address);
            updatedTourGuide.setAge(age);
            updatedTourGuide.setGender(gender.equals("Nam"));
            if (checkoutValidTourGuide(updatedTourGuide)) {
                boolean updated = tourGuideDAO.update(updatedTourGuide);

                if (updated) {
                    JOptionPane.showMessageDialog(this, "Cập nhật hướng dẫn viên thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    loadData();
                    resetForm();
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật hướng dẫn viên thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hướng dẫn viên để cập nhật.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateTourGuideActionPerformed

    private void btnAddTourGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTourGuideActionPerformed
        String name = txtNameTourGuide.getText();
        String phone = txtPhoneTourGuide.getText();
        String address = txtAddressTourGuide.getText();
        String ageText = txtAgeTourGuide.getText();
        String gender = (String) cbGenderTourGuide.getSelectedItem();

        if (name.isEmpty() || phone.isEmpty() || address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin hướng dẫn viên.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!Validator.isValidPhone(phone)) {
            txtPhoneTourGuide.requestFocus();
            JOptionPane.showMessageDialog(this, "Số điện thoại phải có 11 ký tự và bắt đầu bằng số 0.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int age;
        try {
            age = Integer.parseInt(ageText);
            if (!Validator.isValidAge(age)) {
                txtAgeTourGuide.setText("");
                txtAgeTourGuide.requestFocus();
                JOptionPane.showMessageDialog(this, "Tuổi phải từ 1 đến 99.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tuổi phải là số.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        TourGuide tourGuide = new TourGuide();
        tourGuide.setName(name);
        tourGuide.setPhone(phone);
        tourGuide.setAddress(address);
        tourGuide.setAge(age);
        tourGuide.setGender(gender.equals("Nam"));

        if (checkoutValidTourGuide(tourGuide)) {
            boolean added = tourGuideDAO.add(tourGuide);

            if (added) {
                JOptionPane.showMessageDialog(this, "Thêm hướng dẫn viên thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                loadData();
                resetForm();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm hướng dẫn viên thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddTourGuideActionPerformed

    private boolean checkoutValidTourGuide(TourGuide tourGuide) {
        tourGuides = tourGuideDAO.findAll();

        for (TourGuide tg : tourGuides) {
            if (tg.getPhone().equals(tourGuide.getPhone()) && tg.getTourGuideId() != tourGuide.getTourGuideId()) {
                JOptionPane.showMessageDialog(this, "Số điện thoại đã tồn tại.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                txtPhoneTourGuide.requestFocus();
                return false;
            }
        }

        return true;
    }

    private void resetForm() {
        txtSearchTourGuide.setText("");
        txtNameTourGuide.setText("");
        txtPhoneTourGuide.setText("");
        txtAddressTourGuide.setText("");
        txtAgeTourGuide.setText("");
        cbGenderTourGuide.setSelectedIndex(0);
        selectedRowIndex = -1;
        btnDeleteTourGuide.setEnabled(false);
        btnUpdateTourGuide.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTourGuide;
    private javax.swing.JButton btnDeleteTourGuide;
    private javax.swing.JButton btnRefreshTourGuide;
    private javax.swing.JButton btnSearchTourGuide;
    private javax.swing.JButton btnUpdateTourGuide;
    private javax.swing.JComboBox<String> cbGenderTourGuide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTourGuides;
    private javax.swing.JTextField txtAddressTourGuide;
    private javax.swing.JTextField txtAgeTourGuide;
    private javax.swing.JTextField txtNameTourGuide;
    private javax.swing.JTextField txtPhoneTourGuide;
    private javax.swing.JTextField txtSearchTourGuide;
    // End of variables declaration//GEN-END:variables
}
