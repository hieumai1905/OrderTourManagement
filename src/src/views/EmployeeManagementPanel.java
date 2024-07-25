package src.views;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.DAOs.employees.EmployeeDAO;
import src.DAOs.employees.IEmployeeDAO;
import src.models.Employee;
import src.validates.Validator;

public class EmployeeManagementPanel extends javax.swing.JPanel {

    private List<Employee> employees;

    private IEmployeeDAO employeeDAO;

    private int selectedRowIndex = -1;

    private static int resultByRole = -1; // -1 is all, 0 is employee and 1 is manage

    private static int resultByStatus = -1; // -1 is all, 0 is inaction and 1 is active

    public EmployeeManagementPanel() {
        initComponents();
        employeeDAO = EmployeeDAO.getInstance();
        resultByRole = -1;
        resultByStatus = -1;
        loadData();

    }

    private void loadData() {
        employees = employeeDAO.findAll();
        displayEmployee();
    }

    private void displayEmployee() {
        DefaultTableModel tableModel = (DefaultTableModel) tableEmployees.getModel();
        tableModel.setRowCount(0);

        for (Employee employee : employees) {
            if (filterEmployee(employee)) {
                Object[] rowData = {
                    employee.getEmployeeId(),
                    employee.getName(),
                    employee.getPhone(),
                    employee.getEmail(),
                    employee.getBirthday(),
                    employee.isGender() ? "Nam" : "Nữ",
                    employee.getAddress(),
                    employee.getStatus() ? "Còn làm" : "Đã nghỉ",
                    employee.getRole() ? "Quản lý" : "Nhân viên",
                    employee.getUsername()
                };
                tableModel.addRow(rowData);
            }
        }
    }

    private boolean filterEmployee(Employee employee) {
        if (resultByRole != -1) {
            if ((resultByRole == 0 && !employee.getRole()) || (resultByRole == 1 && employee.getRole())) {
                if (resultByStatus != -1) {
                    if ((resultByStatus == 0 && employee.getStatus()) || (resultByStatus == 1 && !employee.getStatus())) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        } else {
            if (resultByStatus != -1) {
                if ((resultByStatus == 0 && employee.getStatus()) || (resultByStatus == 1 && !employee.getStatus())) {
                    return false;
                }
            }
        }
        return true;
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtUsernameEmployee = new javax.swing.JTextField();
        txtPasswordEmployee = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        txtNameEmployee = new javax.swing.JTextField();
        txtPhoneEmployee = new javax.swing.JTextField();
        txtAddressEmployee = new javax.swing.JTextField();
        txtEmailEmployee = new javax.swing.JTextField();
        cbStatus = new javax.swing.JComboBox<>();
        cbRoleEmployee = new javax.swing.JComboBox<>();
        dateBirthdayEmployee = new com.toedter.calendar.JDateChooser();
        cbGenderEmployee = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtSearchEmployee = new javax.swing.JTextField();
        btnSearchEmployee = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        cbFilterEmployeeStatus = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cbFilterEmployeeRole = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmployees = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnDeleteEmployee = new javax.swing.JButton();
        btnAddEmployee = new javax.swing.JButton();
        btnUpdateEmployee = new javax.swing.JButton();
        btnRefreshEmployee = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 39)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản lý nhân viên");

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
        jLabel2.setText("Họ và tên:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Số điện thoại:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Ngày sinh:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Địa chỉ:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Giới tính:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Quyền hạn:");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel14.setText("Trạng thái:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel14))
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
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel9.setText("Tài khoản nhân viên");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel10.setText("Thông tin nhân viên");

        jPanel6.setBackground(new java.awt.Color(235, 227, 227));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setText("Mật khẩu:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel12.setText("Tài khoản:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(235, 227, 227));

        txtUsernameEmployee.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsernameEmployee)
                    .addComponent(txtPasswordEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUsernameEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPasswordEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(235, 227, 227));

        txtNameEmployee.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtPhoneEmployee.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtAddressEmployee.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtEmailEmployee.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        cbStatus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn làm", "Đã nghỉ" }));

        cbRoleEmployee.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbRoleEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên", "Quản lý" }));

        cbGenderEmployee.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbGenderEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPhoneEmployee, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddressEmployee, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNameEmployee, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbRoleEmployee, 0, 186, Short.MAX_VALUE)
                    .addComponent(dateBirthdayEmployee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailEmployee, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbGenderEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNameEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhoneEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(dateBirthdayEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbGenderEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddressEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbRoleEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(235, 227, 227));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel15.setText("Lọc và tìm kiếm");

        txtSearchEmployee.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnSearchEmployee.setText("Tìm kiếm");
        btnSearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEmployeeActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel16.setText("Trạng thái:");

        cbFilterEmployeeStatus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbFilterEmployeeStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Còn làm", "Đã nghỉ" }));
        cbFilterEmployeeStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFilterEmployeeStatusItemStateChanged(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel13.setText("Quyền hạn:");

        cbFilterEmployeeRole.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbFilterEmployeeRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Nhân viên", "Quản lý" }));
        cbFilterEmployeeRole.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFilterEmployeeRoleItemStateChanged(evt);
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
                        .addComponent(txtSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel13))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(cbFilterEmployeeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbFilterEmployeeRole, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFilterEmployeeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbFilterEmployeeRole, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        tableEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Số điện thoại", "Email", "Ngày sinh", "Giới tính", "Địa chỉ", "Trạng thái", "Quyền", "Tài khoản"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEmployees);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel17.setText("Danh sách nhân viên");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        btnDeleteEmployee.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnDeleteEmployee.setText("Xoá");
        btnDeleteEmployee.setEnabled(false);
        btnDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeeActionPerformed(evt);
            }
        });

        btnAddEmployee.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnAddEmployee.setText("Thêm");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });

        btnUpdateEmployee.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnUpdateEmployee.setText("Cập nhật");
        btnUpdateEmployee.setEnabled(false);
        btnUpdateEmployee.setPreferredSize(new java.awt.Dimension(72, 27));
        btnUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEmployeeActionPerformed(evt);
            }
        });

        btnRefreshEmployee.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnRefreshEmployee.setText("Làm mới");
        btnRefreshEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshEmployeeActionPerformed(evt);
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
                        .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeleteEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRefreshEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnRefreshEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
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

    private void cbFilterEmployeeStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFilterEmployeeStatusItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String selectedStatus = (String) cbFilterEmployeeStatus.getSelectedItem();

            switch (selectedStatus) {
                case "Tất cả" ->
                    resultByStatus = -1;
                case "Còn làm" ->
                    resultByStatus = 1;
                case "Đã nghỉ" ->
                    resultByStatus = 0;
            }
            displayEmployee();
        }
    }//GEN-LAST:event_cbFilterEmployeeStatusItemStateChanged

    private void cbFilterEmployeeRoleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFilterEmployeeRoleItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String selectedRole = (String) cbFilterEmployeeRole.getSelectedItem();

            switch (selectedRole) {
                case "Tất cả" ->
                    resultByRole = -1;
                case "Quản lý" ->
                    resultByRole = 1;
                case "Nhân viên" ->
                    resultByRole = 0;
            }
            displayEmployee();
        }
    }//GEN-LAST:event_cbFilterEmployeeRoleItemStateChanged

    private void btnRefreshEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshEmployeeActionPerformed
        loadData();
        resetForm();
    }//GEN-LAST:event_btnRefreshEmployeeActionPerformed

    private void btnSearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEmployeeActionPerformed
        String contentSearch = txtSearchEmployee.getText();
        if ("".equals(contentSearch)) {
            txtSearchEmployee.requestFocus();
        } else {
            employees = employeeDAO.search(contentSearch);
            displayEmployee();
        }
    }//GEN-LAST:event_btnSearchEmployeeActionPerformed

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
        String name = txtNameEmployee.getText();
        String phone = txtPhoneEmployee.getText();
        String email = txtEmailEmployee.getText();
        String address = txtAddressEmployee.getText();
        String username = txtUsernameEmployee.getText();
        String password = txtPasswordEmployee.getText();
        Date birthday = dateBirthdayEmployee.getDate();
        String gender = (String) cbGenderEmployee.getSelectedItem();
        String role = (String) cbRoleEmployee.getSelectedItem();
        String status = (String) cbStatus.getSelectedItem();

        if (name.isEmpty() || phone.isEmpty() || email.isEmpty() || address.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin nhân viên.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!Validator.isValidPhone(phone)) {
            txtPhoneEmployee.requestFocus();
            JOptionPane.showMessageDialog(this, "Số điện thoại phải có 11 ký tự và bắt đầu bằng số 0.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!Validator.isValidEmail(email)) {
            txtEmailEmployee.requestFocus();
            JOptionPane.showMessageDialog(this, "Email không hợp lệ.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Employee newEmployee = new Employee();
        newEmployee.setName(name);
        newEmployee.setPhone(phone);
        newEmployee.setEmail(email);
        newEmployee.setAddress(address);
        newEmployee.setUsername(username);
        newEmployee.setPassword(password);
        newEmployee.setBirthday((java.sql.Date) new java.sql.Date(birthday.getTime()));
        newEmployee.setGender(gender.equals("Nam"));
        newEmployee.setRole(role.equals("Quản lý"));
        newEmployee.setStatus(status.equals("Còn làm"));

        if (checkoutValidEmployee(newEmployee)) {
            boolean added = employeeDAO.add(newEmployee);

            if (added) {
                JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                loadData();
                resetForm();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm nhân viên thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void btnUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEmployeeActionPerformed
        if (selectedRowIndex != -1) {
            String name = txtNameEmployee.getText();
            String phone = txtPhoneEmployee.getText();
            String email = txtEmailEmployee.getText();
            String address = txtAddressEmployee.getText();
            String username = txtUsernameEmployee.getText();
            String password = txtPasswordEmployee.getText();
            Date birthday = dateBirthdayEmployee.getDate();
            String gender = (String) cbGenderEmployee.getSelectedItem();
            String role = (String) cbRoleEmployee.getSelectedItem();
            String status = (String) cbStatus.getSelectedItem();

            if (name.isEmpty() || phone.isEmpty() || email.isEmpty() || address.isEmpty() || username.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin nhân viên.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!Validator.isValidPhone(phone)) {
                txtPhoneEmployee.requestFocus();
                JOptionPane.showMessageDialog(this, "Số điện thoại phải có 11 ký tự và bắt đầu bằng số 0.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!Validator.isValidEmail(email)) {
                txtEmailEmployee.requestFocus();
                JOptionPane.showMessageDialog(this, "Email không hợp lệ.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int employeeId = (int) tableEmployees.getValueAt(selectedRowIndex, 0);

            Employee updatedEmployee = new Employee();
            updatedEmployee.setEmployeeId(employeeId);
            updatedEmployee.setName(name);
            updatedEmployee.setPhone(phone);
            updatedEmployee.setEmail(email);
            updatedEmployee.setAddress(address);
            updatedEmployee.setUsername(username);
            updatedEmployee.setPassword(password);
            updatedEmployee.setBirthday(birthday);
            updatedEmployee.setGender(gender.equals("Nam"));
            updatedEmployee.setRole(role.equals("Quản lý"));
            updatedEmployee.setStatus(status.equals("Còn làm"));
            if (checkoutValidEmployee(updatedEmployee)) {
                boolean updated = employeeDAO.update(updatedEmployee);

                if (updated) {
                    JOptionPane.showMessageDialog(this, "Cập nhật nhân viên thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    loadData();
                    resetForm();
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật nhân viên thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một nhân viên để cập nhật.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateEmployeeActionPerformed

    private boolean checkoutValidEmployee(Employee employee) {
        employees = employeeDAO.findAll();

        for (Employee emp : employees) {
            if (emp.getEmployeeId() != employee.getEmployeeId()
                    && (emp.getPhone().equals(employee.getPhone())
                    || emp.getEmail().equals(employee.getEmail())
                    || emp.getUsername().equals(employee.getUsername()))) {

                if (emp.getPhone().equals(employee.getPhone())) {
                    JOptionPane.showMessageDialog(this, "Số điện thoại đã tồn tại.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    txtPhoneEmployee.requestFocus();
                } else if (emp.getEmail().equals(employee.getEmail())) {
                    JOptionPane.showMessageDialog(this, "Email đã tồn tại.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    txtEmailEmployee.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(this, "Tên đăng nhập đã tồn tại.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                    txtUsernameEmployee.requestFocus();
                }

                return false;
            }
        }

        return true;
    }

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed
        if (selectedRowIndex != -1) {
            int option = JOptionPane.showOptionDialog(
                    null,
                    "Bạn có chắc chắn muốn xóa nhân viên này?",
                    "Xác nhận xóa",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    new String[]{"Có", "Không"},
                    "Có"
            );

            if (option == JOptionPane.YES_OPTION) {
                int employeeId = (int) tableEmployees.getValueAt(selectedRowIndex, 0);
                boolean isDeleted = employeeDAO.delete((long) employeeId);
                if (isDeleted) {
                    loadData();
                    btnDeleteEmployee.setEnabled(false);
                    btnUpdateEmployee.setEnabled(false);
                    selectedRowIndex = -1;
                    JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    resetForm();
                } else {
                    JOptionPane.showMessageDialog(this, "Không thể xóa nhân viên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed

    private void tableEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmployeesMouseClicked
        selectedRowIndex = tableEmployees.getSelectedRow();
        if (selectedRowIndex != -1) {
            btnDeleteEmployee.setEnabled(true);
            btnUpdateEmployee.setEnabled(true);

            Employee selectedEmployee = employees.get(selectedRowIndex);

            txtNameEmployee.setText(selectedEmployee.getName());
            txtPhoneEmployee.setText(selectedEmployee.getPhone());
            txtEmailEmployee.setText(selectedEmployee.getEmail());
            dateBirthdayEmployee.setDate(selectedEmployee.getBirthday());
            cbGenderEmployee.setSelectedItem((selectedEmployee.isGender()) ? "Nam" : "Nữ");
            txtAddressEmployee.setText(selectedEmployee.getAddress());
            txtUsernameEmployee.setText(selectedEmployee.getUsername());
            cbRoleEmployee.setSelectedItem(selectedEmployee.getRole() ? "Quản lý" : "Nhân viên");
            cbStatus.setSelectedItem(selectedEmployee.getStatus() ? "Còn làm" : "Đã nghỉ");
        } else {
            btnDeleteEmployee.setEnabled(false);
            btnUpdateEmployee.setEnabled(false);
        }
    }//GEN-LAST:event_tableEmployeesMouseClicked

    private void resetForm() {
        txtSearchEmployee.setText("");
        txtNameEmployee.setText("");
        txtPhoneEmployee.setText("");
        txtAddressEmployee.setText("");
        txtEmailEmployee.setText("");
        txtUsernameEmployee.setText("");
        txtPasswordEmployee.setText("");
        cbGenderEmployee.setSelectedIndex(0);
        cbRoleEmployee.setSelectedIndex(0);
        cbStatus.setSelectedIndex(0);
        dateBirthdayEmployee.setDate(null);
        tableEmployees.clearSelection();
        btnDeleteEmployee.setEnabled(false);
        btnUpdateEmployee.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnDeleteEmployee;
    private javax.swing.JButton btnRefreshEmployee;
    private javax.swing.JButton btnSearchEmployee;
    private javax.swing.JButton btnUpdateEmployee;
    private javax.swing.JComboBox<String> cbFilterEmployeeRole;
    private javax.swing.JComboBox<String> cbFilterEmployeeStatus;
    private javax.swing.JComboBox<String> cbGenderEmployee;
    private javax.swing.JComboBox<String> cbRoleEmployee;
    private javax.swing.JComboBox<String> cbStatus;
    private com.toedter.calendar.JDateChooser dateBirthdayEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEmployees;
    private javax.swing.JTextField txtAddressEmployee;
    private javax.swing.JTextField txtEmailEmployee;
    private javax.swing.JTextField txtNameEmployee;
    private javax.swing.JPasswordField txtPasswordEmployee;
    private javax.swing.JTextField txtPhoneEmployee;
    private javax.swing.JTextField txtSearchEmployee;
    private javax.swing.JTextField txtUsernameEmployee;
    // End of variables declaration//GEN-END:variables
}
