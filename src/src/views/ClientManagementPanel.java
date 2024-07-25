package src.views;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.DAOs.clients.ClientDAO;
import src.DAOs.clients.IClientDAO;
import src.models.Client;
import src.validates.Validator;

public class ClientManagementPanel extends javax.swing.JPanel {

    private List<Client> clients;

    private IClientDAO clientDAO;

    private int selectedRowIndex = -1;

    public ClientManagementPanel() {
        initComponents();
        clientDAO = ClientDAO.getInstance();
        loadData();
    }

    private void loadData() {
        clients = clientDAO.findAll();
        displayClient();
    }

    private void displayClient() {
        DefaultTableModel tableModel = (DefaultTableModel) tableClients.getModel();
        tableModel.setRowCount(0);

        for (Client client : clients) {
            Object[] rowData = {
                client.getClientId(),
                client.getName(),
                client.getPhone(),
                client.getEmail(),
                client.isGender() ? "Nam" : "Nữ",
                client.getAddress()
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
        txtNameClient = new javax.swing.JTextField();
        txtPhoneClient = new javax.swing.JTextField();
        txtAddressClient = new javax.swing.JTextField();
        txtEmailClient = new javax.swing.JTextField();
        cbGenderClient = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtSearchClient = new javax.swing.JTextField();
        btnSearchClient = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClients = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnDeleteClient = new javax.swing.JButton();
        btnAddClient = new javax.swing.JButton();
        btnUpdateClient = new javax.swing.JButton();
        btnRefreshClient = new javax.swing.JButton();
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
        jLabel4.setText("Email:");

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
        jLabel10.setText("Thông tin khách hàng");

        jPanel5.setBackground(new java.awt.Color(235, 227, 227));

        txtNameClient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtPhoneClient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtAddressClient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtEmailClient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        cbGenderClient.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbGenderClient.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbGenderClient, javax.swing.GroupLayout.Alignment.LEADING, 0, 186, Short.MAX_VALUE)
                    .addComponent(txtPhoneClient, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmailClient, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddressClient, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNameClient, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNameClient, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhoneClient, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailClient, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGenderClient, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddressClient, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(26, Short.MAX_VALUE))
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

        txtSearchClient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnSearchClient.setText("Tìm kiếm");
        btnSearchClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClientActionPerformed(evt);
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
                        .addComponent(txtSearchClient, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchClient, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearchClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchClient, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        tableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Email", "Giới tính", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableClients);
        if (tableClients.getColumnModel().getColumnCount() > 0) {
            tableClients.getColumnModel().getColumn(4).setHeaderValue("Giới tính");
            tableClients.getColumnModel().getColumn(5).setHeaderValue("Địa chỉ");
        }

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel17.setText("Danh sách khách hàng");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        btnDeleteClient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnDeleteClient.setText("Xoá");
        btnDeleteClient.setEnabled(false);
        btnDeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteClientActionPerformed(evt);
            }
        });

        btnAddClient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnAddClient.setText("Thêm");
        btnAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClientActionPerformed(evt);
            }
        });

        btnUpdateClient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnUpdateClient.setText("Cập nhật");
        btnUpdateClient.setEnabled(false);
        btnUpdateClient.setPreferredSize(new java.awt.Dimension(72, 27));
        btnUpdateClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateClientActionPerformed(evt);
            }
        });

        btnRefreshClient.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnRefreshClient.setText("Làm mới");
        btnRefreshClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshClientActionPerformed(evt);
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
                        .addComponent(btnAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeleteClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateClient, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRefreshClient, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnRefreshClient, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateClient, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteClient, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 39)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản lý khách hàng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(jLabel1)
                .addContainerGap(398, Short.MAX_VALUE))
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

    private void btnSearchClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClientActionPerformed
        String contentSearch = txtSearchClient.getText();
        if ("".equals(contentSearch)) {
            txtSearchClient.requestFocus();
        } else {
            clients = clientDAO.search(contentSearch);
            displayClient();
        }
    }//GEN-LAST:event_btnSearchClientActionPerformed

    private void btnRefreshClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshClientActionPerformed
        loadData();
        resetForm();
    }//GEN-LAST:event_btnRefreshClientActionPerformed

    private void btnAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClientActionPerformed
        String name = txtNameClient.getText();
        String phone = txtPhoneClient.getText();
        String address = txtAddressClient.getText();
        String emailText = txtEmailClient.getText();
        String gender = (String) cbGenderClient.getSelectedItem();

        if (name.isEmpty() || phone.isEmpty() || address.isEmpty() || emailText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin khách hàng.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!Validator.isValidPhone(phone)) {
            txtPhoneClient.requestFocus();
            JOptionPane.showMessageDialog(this, "Số điện thoại phải có 10 ký tự và bắt đầu bằng số 0.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!Validator.isValidEmail(emailText)) {
            txtEmailClient.requestFocus();
            JOptionPane.showMessageDialog(this, "Email không hợp lệ. Email phải có định dạng như 'example@domain.com'.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Client newClient = new Client();
        newClient.setName(name);
        newClient.setPhone(phone);
        newClient.setAddress(address);
        newClient.setEmail(emailText);
        newClient.setGender(gender.equals("Nam"));
        if (checkoutValidClient(newClient)) {
            boolean added = clientDAO.add(newClient);

            if (added) {
                JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                loadData();
                resetForm();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm khách hàng thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddClientActionPerformed

    private void btnUpdateClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateClientActionPerformed
        if (selectedRowIndex != -1) {
            String name = txtNameClient.getText();
            String phone = txtPhoneClient.getText();
            String address = txtAddressClient.getText();
            String emailText = txtEmailClient.getText();
            String gender = (String) cbGenderClient.getSelectedItem();

            if (name.isEmpty() || phone.isEmpty() || address.isEmpty() || emailText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin khách hàng.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!Validator.isValidPhone(phone)) {
                txtPhoneClient.requestFocus();
                JOptionPane.showMessageDialog(this, "Số điện thoại phải có 10 ký tự và bắt đầu bằng số 0.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!Validator.isValidEmail(emailText)) {
                txtEmailClient.requestFocus();
                JOptionPane.showMessageDialog(this, "Email không hợp lệ. Email phải có định dạng như 'example@domain.com'.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int clientId = (int) tableClients.getValueAt(selectedRowIndex, 0);

            Client updatedClient = new Client();
            updatedClient.setClientId(clientId);
            updatedClient.setName(name);
            updatedClient.setPhone(phone);
            updatedClient.setAddress(address);
            updatedClient.setEmail(emailText);
            updatedClient.setGender(gender.equals("Nam"));
            if (checkoutValidClient(updatedClient)) {
                boolean updated = clientDAO.update(updatedClient);

                if (updated) {
                    JOptionPane.showMessageDialog(this, "Cập nhật khách hàng thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    loadData();
                    resetForm();
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật khách hàng thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng để cập nhật.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateClientActionPerformed

    private boolean checkoutValidClient(Client client) {
        clients = clientDAO.findAll();

        for (Client c : clients) {
            boolean isDuplicatePhone = c.getPhone().equals(client.getPhone());
            boolean isDuplicateEmail = c.getEmail().equals(client.getEmail());

            if ((isDuplicatePhone || isDuplicateEmail) && c.getClientId() != client.getClientId()) {
                showMessageAndFocus(isDuplicatePhone, isDuplicateEmail);
                return false;
            }
        }

        return true;
    }

    private void showMessageAndFocus(boolean isDuplicatePhone, boolean isDuplicateEmail) {
        if (isDuplicatePhone) {
            JOptionPane.showMessageDialog(this, "Số điện thoại đã tồn tại.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtPhoneClient.requestFocus();
        } else if (isDuplicateEmail) {
            JOptionPane.showMessageDialog(this, "Email đã tồn tại.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtEmailClient.requestFocus();
        }
    }

    private void btnDeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteClientActionPerformed
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
                int tourGuideId = (int) tableClients.getValueAt(selectedRowIndex, 0);
                boolean isDeleted = clientDAO.delete((long) tourGuideId);
                if (isDeleted) {
                    loadData();
                    btnDeleteClient.setEnabled(false);
                    btnUpdateClient.setEnabled(false);
                    selectedRowIndex = -1;
                    JOptionPane.showMessageDialog(this, "Xóa khách hàng thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    resetForm();
                } else {
                    JOptionPane.showMessageDialog(this, "Không thể xóa khách hàng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteClientActionPerformed

    private void tableClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientsMouseClicked
        selectedRowIndex = tableClients.getSelectedRow();
        if (selectedRowIndex != -1) {
            btnDeleteClient.setEnabled(true);
            btnUpdateClient.setEnabled(true);

            String name = (String) tableClients.getValueAt(selectedRowIndex, 1);
            String phone = (String) tableClients.getValueAt(selectedRowIndex, 2);
            String email = (String) tableClients.getValueAt(selectedRowIndex, 3);
            String gender = (String) tableClients.getValueAt(selectedRowIndex, 4);
            String address = (String) tableClients.getValueAt(selectedRowIndex, 5);

            txtNameClient.setText(name);
            txtPhoneClient.setText(phone);
            txtAddressClient.setText(address);
            txtEmailClient.setText(email);
            cbGenderClient.setSelectedItem(gender);
        } else {
            btnDeleteClient.setEnabled(false);
            btnUpdateClient.setEnabled(false);
        }
    }//GEN-LAST:event_tableClientsMouseClicked

    private void resetForm() {
        txtSearchClient.setText("");
        txtNameClient.setText("");
        txtPhoneClient.setText("");
        txtAddressClient.setText("");
        txtEmailClient.setText("");
        cbGenderClient.setSelectedIndex(0);
        selectedRowIndex = -1;
        btnDeleteClient.setEnabled(false);
        btnUpdateClient.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClient;
    private javax.swing.JButton btnDeleteClient;
    private javax.swing.JButton btnRefreshClient;
    private javax.swing.JButton btnSearchClient;
    private javax.swing.JButton btnUpdateClient;
    private javax.swing.JComboBox<String> cbGenderClient;
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
    private javax.swing.JTable tableClients;
    private javax.swing.JTextField txtAddressClient;
    private javax.swing.JTextField txtEmailClient;
    private javax.swing.JTextField txtNameClient;
    private javax.swing.JTextField txtPhoneClient;
    private javax.swing.JTextField txtSearchClient;
    // End of variables declaration//GEN-END:variables
}
