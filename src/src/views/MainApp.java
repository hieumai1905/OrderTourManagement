package src.views;

import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainApp extends javax.swing.JFrame {

    public MainApp() {
        initComponents();
        setLocationRelativeTo(null);
        MainPanel mainPanelContent = new MainPanel();
        setMainPanelLayout(mainPanelContent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnTourManage = new javax.swing.JButton();
        btnEmployeeManage = new javax.swing.JButton();
        btnClientManage = new javax.swing.JButton();
        btnTourGuidMange = new javax.swing.JButton();
        btnBillMange = new javax.swing.JButton();
        btnHotelMange = new javax.swing.JButton();
        btnTouristAttracionMange = new javax.swing.JButton();
        btnPromotionManage = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ứng dụng quản lý đặt tour");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                addWindowClosingListener(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 750));

        btnHome.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnHome.setText("Trang chủ");
        btnHome.setAlignmentY(0.0F);
        btnHome.setBorder(null);
        btnHome.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnTourManage.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnTourManage.setText("Quản lý tour");
        btnTourManage.setAlignmentY(0.0F);
        btnTourManage.setBorder(null);
        btnTourManage.setInheritsPopupMenu(true);
        btnTourManage.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnEmployeeManage.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnEmployeeManage.setText("Quản lý nhân viên");
        btnEmployeeManage.setBorder(null);
        btnEmployeeManage.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnEmployeeManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeManageActionPerformed(evt);
            }
        });

        btnClientManage.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnClientManage.setText("Quản lý khách hàng");
        btnClientManage.setBorder(null);
        btnClientManage.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnClientManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientManageActionPerformed(evt);
            }
        });

        btnTourGuidMange.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnTourGuidMange.setText("Quản lý hướng dẫn viên");
        btnTourGuidMange.setToolTipText("");
        btnTourGuidMange.setAlignmentY(0.0F);
        btnTourGuidMange.setBorder(null);
        btnTourGuidMange.setInheritsPopupMenu(true);
        btnTourGuidMange.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnTourGuidMange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTourGuidMangeActionPerformed(evt);
            }
        });

        btnBillMange.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnBillMange.setText("Quản lý hoá đơn");
        btnBillMange.setBorder(null);
        btnBillMange.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnBillMange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillMangeActionPerformed(evt);
            }
        });

        btnHotelMange.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnHotelMange.setText("Quản lý khách sạn");
        btnHotelMange.setBorder(null);
        btnHotelMange.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnTouristAttracionMange.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnTouristAttracionMange.setText("Quản lý điểm du lịch");
        btnTouristAttracionMange.setToolTipText("");
        btnTouristAttracionMange.setAlignmentY(0.0F);
        btnTouristAttracionMange.setBorder(null);
        btnTouristAttracionMange.setInheritsPopupMenu(true);
        btnTouristAttracionMange.setMargin(new java.awt.Insets(0, 0, 0, 0));

        btnPromotionManage.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnPromotionManage.setText("Quản lý giảm giá");
        btnPromotionManage.setBorder(null);
        btnPromotionManage.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPromotionManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromotionManageActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        btnLogout.setText("Đăng xuất");
        btnLogout.setToolTipText("");
        btnLogout.setAlignmentY(0.0F);
        btnLogout.setBorder(null);
        btnLogout.setInheritsPopupMenu(true);
        btnLogout.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEmployeeManage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBillMange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTourGuidMange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientManage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTourManage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPromotionManage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTouristAttracionMange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHotelMange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTourManage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmployeeManage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBillMange, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTourGuidMange, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientManage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPromotionManage, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTouristAttracionMange, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHotelMange, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(204, 255, 255));
        mainPanel.setAlignmentX(0.0F);
        mainPanel.setAlignmentY(0.0F);
        mainPanel.setPreferredSize(new java.awt.Dimension(1150, 750));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1154, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 120));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Icon and name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmployeeManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeManageActionPerformed
        EmployeeManagementPanel employeeManagementPanel = new EmployeeManagementPanel();
        setMainPanelLayout(employeeManagementPanel);
    }//GEN-LAST:event_btnEmployeeManageActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        MainPanel mainPanelContent = new MainPanel();
        setMainPanelLayout(mainPanelContent);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.setVisible(false);
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnClientManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientManageActionPerformed
        ClientManagementPanel clientManagementPanel = new ClientManagementPanel();
        setMainPanelLayout(clientManagementPanel);
    }//GEN-LAST:event_btnClientManageActionPerformed

    private void btnBillMangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillMangeActionPerformed
        BillManagementPanel billManagementPanel = new BillManagementPanel();
        setMainPanelLayout(billManagementPanel);
    }//GEN-LAST:event_btnBillMangeActionPerformed

    private void btnTourGuidMangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTourGuidMangeActionPerformed
        TourGuideManagementPanel tourGuideManagementPanel = new TourGuideManagementPanel();
        setMainPanelLayout(tourGuideManagementPanel);
    }//GEN-LAST:event_btnTourGuidMangeActionPerformed

    private void btnPromotionManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromotionManageActionPerformed
        PromotionManagementPanel promotionManagementPanel = new PromotionManagementPanel();
        setMainPanelLayout(promotionManagementPanel);
    }//GEN-LAST:event_btnPromotionManageActionPerformed

    private void addWindowClosingListener(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_addWindowClosingListener
        int option = JOptionPane.showOptionDialog(
                null,
                "Bạn có chắc chắn muốn đóng không?",
                "Xác nhận đóng",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new String[]{"Có", "Không"},
                "Có"
        );

        if (option == JOptionPane.YES_OPTION) {
            dispose();
        } else if (option == JOptionPane.NO_OPTION) {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_addWindowClosingListener

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new MainApp().setVisible(true);
        });
    }

    private void setMainPanelLayout(Component component) {
        mainPanel.removeAll();

        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);

        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(component, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(component, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPanel.revalidate();
        mainPanel.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBillMange;
    private javax.swing.JButton btnClientManage;
    private javax.swing.JButton btnEmployeeManage;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHotelMange;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPromotionManage;
    private javax.swing.JButton btnTourGuidMange;
    private javax.swing.JButton btnTourManage;
    private javax.swing.JButton btnTouristAttracionMange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
