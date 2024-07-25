package src.views;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.DAOs.promotions.IPromotionDAO;
import src.DAOs.promotions.PromotionDAO;
import src.models.Promotion;

public class PromotionManagementPanel extends javax.swing.JPanel {

    private List<Promotion> promotions;

    private IPromotionDAO promotionDAO;

    private int selectedRowIndex = -1;

    public PromotionManagementPanel() {
        initComponents();
        promotionDAO = PromotionDAO.getInstance();
        loadData();
    }

    private void loadData() {
        promotions = promotionDAO.findAll();
        displayPromotion();
    }

    private void displayPromotion() {
        DefaultTableModel model = (DefaultTableModel) tablePromotions.getModel();
        model.setRowCount(0);

        for (Promotion promotion : promotions) {
            Object[] row = {
                promotion.getDiscountCode(),
                promotion.getDiscountRate(),
                promotion.getStartAt(),
                promotion.getEndAt(),
                promotion.getQuantity(),};
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        txtDiscountCode = new javax.swing.JTextField();
        dateStart = new com.toedter.calendar.JDateChooser();
        dateEnd = new com.toedter.calendar.JDateChooser();
        txtDiscountRate = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtSearchPromotion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePromotions = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnDeletePromotion = new javax.swing.JButton();
        btnAddPromotion = new javax.swing.JButton();
        btnUpdatePromotion = new javax.swing.JButton();
        btnRefreshPromotion = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 39)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản lý mã giảm giá");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(235, 227, 227));

        jPanel4.setBackground(new java.awt.Color(235, 227, 227));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Mã giảm giá:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Chiết khấu:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Ngày bắt đầu:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Số lượng:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Ngày kết thúc: ");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel10.setText("Thông tin mã giảm giá");

        jPanel5.setBackground(new java.awt.Color(235, 227, 227));

        txtDiscountCode.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtDiscountRate.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtQuantity.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiscountCode, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiscountRate, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDiscountCode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(txtDiscountRate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
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
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(235, 227, 227));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel15.setText("Lọc và tìm kiếm");

        txtSearchPromotion.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        jButton1.setText("Tìm kiếm");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel16.setText("Từ ngày:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel18.setText("Đến ngày:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtSearchPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearchPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        tablePromotions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã giảm giá", "Chiết khấu", "Ngày bắt đầu", "Ngày kết thúc", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePromotions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePromotionsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePromotions);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel17.setText("Danh sách mã giảm giá");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        btnDeletePromotion.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnDeletePromotion.setText("Xoá");
        btnDeletePromotion.setEnabled(false);
        btnDeletePromotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePromotionActionPerformed(evt);
            }
        });

        btnAddPromotion.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnAddPromotion.setText("Thêm");
        btnAddPromotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPromotionActionPerformed(evt);
            }
        });

        btnUpdatePromotion.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnUpdatePromotion.setText("Cập nhật");
        btnUpdatePromotion.setEnabled(false);
        btnUpdatePromotion.setPreferredSize(new java.awt.Dimension(72, 27));
        btnUpdatePromotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePromotionActionPerformed(evt);
            }
        });

        btnRefreshPromotion.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnRefreshPromotion.setText("Làm mới");
        btnRefreshPromotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshPromotionActionPerformed(evt);
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
                        .addComponent(btnAddPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeletePromotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdatePromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRefreshPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnRefreshPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddPromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdatePromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeletePromotion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

    private void btnRefreshPromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshPromotionActionPerformed
        resetForm();
        loadData();
    }//GEN-LAST:event_btnRefreshPromotionActionPerformed

    private void btnAddPromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPromotionActionPerformed
        String discountCode = txtDiscountCode.getText();
        String quantity = txtQuantity.getText();
        String discountRateStr = txtDiscountRate.getText();
        Date startDate = dateStart.getDate();
        Date endDate = dateEnd.getDate();

        if (discountCode.isEmpty() || discountRateStr.isEmpty() || startDate == null || endDate == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin khuyến mãi.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int discountRate = 1;
        int quantityValue = 1;
        try {
            quantityValue = Integer.parseInt(quantity);
            discountRate = Integer.parseInt(discountRateStr);
            if (discountRate < 1 || discountRate > 99) {
                JOptionPane.showMessageDialog(this, "Tỷ lệ giảm giá phải từ 1% đến 99%.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                txtDiscountCode.requestFocus();
                return;
            }
            if (quantityValue < 1) {
                JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn 1", "Thông báo", JOptionPane.WARNING_MESSAGE);
                txtQuantity.requestFocus();
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tỷ lệ và số lượng phải là số", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (endDate.before(startDate)) {
            JOptionPane.showMessageDialog(this, "Ngày kết thúc phải sau ngày bắt đầu.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Promotion newPromotion = new Promotion();
        newPromotion.setDiscountCode(discountCode);
        newPromotion.setDiscountRate(discountRate);
        newPromotion.setQuantity(quantityValue);
        newPromotion.setStartAt(new java.sql.Date(startDate.getTime()));
        newPromotion.setEndAt(new java.sql.Date(endDate.getTime()));

        if (checkoutValidPromotion(newPromotion)) {
            boolean added = promotionDAO.add(newPromotion);

            if (added) {
                JOptionPane.showMessageDialog(this, "Thêm khuyến mãi thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                loadData();
                resetForm();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm khuyến mãi thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddPromotionActionPerformed

    private void btnDeletePromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePromotionActionPerformed
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
                Promotion selectedPromotion = promotions.get(selectedRowIndex);
                int promotionId = selectedPromotion.getPromotionId();
                boolean isDeleted = promotionDAO.delete((long) promotionId);
                if (isDeleted) {
                    loadData();
                    resetForm();
                    JOptionPane.showMessageDialog(this, "Xóa khuyến mãi thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Không thể xóa khuyến mãi.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một khuyến mãi để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletePromotionActionPerformed

    private void btnUpdatePromotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePromotionActionPerformed
        if (selectedRowIndex != -1) {
            String discountCode = txtDiscountCode.getText();
            String quantity = txtQuantity.getText();
            String discountRateStr = txtDiscountRate.getText();
            Date startDate = dateStart.getDate();
            Date endDate = dateEnd.getDate();

            if (discountCode.isEmpty() || discountRateStr.isEmpty() || startDate == null || endDate == null) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin khuyến mãi.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int discountRate = 1;
            int quantityValue = 1;
            try {
                quantityValue = Integer.parseInt(quantity);
                discountRate = Integer.parseInt(discountRateStr);
                if (discountRate < 1 || discountRate > 99) {
                    JOptionPane.showMessageDialog(this, "Tỷ lệ giảm giá phải từ 1% đến 99%.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    txtDiscountCode.requestFocus();
                    return;
                }
                if (quantityValue < 1) {
                    JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn 1", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    txtQuantity.requestFocus();
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Tỷ lệ và số lượng phải là số", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (endDate.before(startDate)) {
                JOptionPane.showMessageDialog(this, "Ngày kết thúc phải sau ngày bắt đầu.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Promotion selectedPromotion = promotions.get(selectedRowIndex);
            selectedPromotion.setDiscountCode(discountCode);
            selectedPromotion.setDiscountRate(discountRate);
            selectedPromotion.setQuantity(quantityValue);
            selectedPromotion.setStartAt(new java.sql.Date(startDate.getTime()));
            selectedPromotion.setEndAt(new java.sql.Date(endDate.getTime()));

            if (checkoutValidPromotion(selectedPromotion)) {
                boolean updated = promotionDAO.update(selectedPromotion);

                if (updated) {
                    JOptionPane.showMessageDialog(this, "Cập nhật khuyến mãi thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    loadData();
                    resetForm();
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật khuyến mãi thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một khuyến mãi để cập nhật.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdatePromotionActionPerformed

    private void tablePromotionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePromotionsMouseClicked
        selectedRowIndex = tablePromotions.getSelectedRow();
        if (selectedRowIndex != -1) {
            btnDeletePromotion.setEnabled(true);
            btnUpdatePromotion.setEnabled(true);
            Promotion selectedPromotion = promotions.get(selectedRowIndex);
            txtDiscountCode.setText(selectedPromotion.getDiscountCode());
            txtDiscountRate.setText(String.valueOf(selectedPromotion.getDiscountRate()));
            txtQuantity.setText(String.valueOf(selectedPromotion.getQuantity()));
            dateStart.setDate(selectedPromotion.getStartAt());
            dateEnd.setDate(selectedPromotion.getEndAt());
        }
    }//GEN-LAST:event_tablePromotionsMouseClicked

    private boolean checkoutValidPromotion(Promotion promotion) {
        promotions = promotionDAO.findAll();

        for (Promotion pm : promotions) {
            if (pm.getDiscountCode().equals(promotion.getDiscountCode()) && pm.getPromotionId() != promotion.getPromotionId()) {
                JOptionPane.showMessageDialog(this, "Mã giảm giá đã tồn tại!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                txtDiscountCode.requestFocus();
                return false;
            }
        }

        return true;
    }

    private void resetForm() {
        txtSearchPromotion.setText("");
        txtDiscountCode.setText("");
        txtDiscountRate.setText("");
        txtQuantity.setText("");
        dateStart.setDate(null);
        dateEnd.setDate(null);
        tablePromotions.clearSelection();
        btnUpdatePromotion.setEnabled(false);
        btnDeletePromotion.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPromotion;
    private javax.swing.JButton btnDeletePromotion;
    private javax.swing.JButton btnRefreshPromotion;
    private javax.swing.JButton btnUpdatePromotion;
    private com.toedter.calendar.JDateChooser dateEnd;
    private com.toedter.calendar.JDateChooser dateStart;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JTable tablePromotions;
    private javax.swing.JTextField txtDiscountCode;
    private javax.swing.JTextField txtDiscountRate;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearchPromotion;
    // End of variables declaration//GEN-END:variables
}
