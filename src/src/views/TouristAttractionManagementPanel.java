package src.views;

import src.DAOs.touristattractions.TouristAttractionDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import src.DAOs.hotels.HotelDAO;
import src.DAOs.hotels.IHotelDAO;
import src.DAOs.touristattractions.ITouristAttractionDAO;
import src.models.Hotel;
import src.models.TouristAttraction;
import src.validates.Validator;

public class TouristAttractionManagementPanel extends javax.swing.JPanel {

    private IHotelDAO hotelDAO;

    private ITouristAttractionDAO touristAttractionDAO;

    private List<Hotel> hotels;

    private List<TouristAttraction> touristAttractions;

    private int selectedHotelIndex = -1;

    private int selectedTouristAttractionIndex = -1;

    private long selectedTouristAttractionId = -1;

    public TouristAttractionManagementPanel() {
        initComponents();
        hotelDAO = HotelDAO.getInstance();
        touristAttractionDAO = TouristAttractionDAO.getInstance();
        loadDataTouristAttraction();
        loadDataHotel();
    }

    private void loadDataTouristAttraction() {
        touristAttractions = touristAttractionDAO.findAll();
        displayTouristAttraction();
    }

    private void loadDataHotel() {
        hotels = hotelDAO.findAll();
        displayHotel();
    }

    private void displayTouristAttraction() {
        DefaultTableModel model = (DefaultTableModel) tableTouristAttractions.getModel();
        model.setRowCount(0);

        for (TouristAttraction attraction : touristAttractions) {
            Object[] row = {attraction.getTouristAttractionId(), attraction.getName(), attraction.getAddress()};
            model.addRow(row);
        }
    }

    private void displayHotel() {
        DefaultTableModel model = (DefaultTableModel) tableHotels.getModel();
        model.setRowCount(0);

        for (Hotel hotel : hotels) {
            if (selectedTouristAttractionId != -1) {
                if (hotel.getTouristAttractionId() == selectedTouristAttractionId) {
                    Object[] row = {hotel.getTouristAttractionId(), hotel.getHotelId(), hotel.getName(), hotel.getPhone(), hotel.getAddress()};
                    model.addRow(row);
                }
            } else {
                Object[] row = {hotel.getTouristAttractionId(), hotel.getHotelId(), hotel.getName(), hotel.getPhone(), hotel.getAddress()};
                model.addRow(row);
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtNameTouristAttraction = new javax.swing.JTextField();
        txtAddressTouristAttraction = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSearchTouristAttraction = new javax.swing.JTextField();
        btnSearchTouristAttraction = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtIdTouristAttrraction = new javax.swing.JPanel();
        txtNameHotel = new javax.swing.JTextField();
        txtPhoneHotel = new javax.swing.JTextField();
        txtAddressHotel = new javax.swing.JTextField();
        txtTouristAttractionIdHotel = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtSearchHotel = new javax.swing.JTextField();
        btnSearchHotel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTouristAttractions = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnDeleteTouristAttraction = new javax.swing.JButton();
        btnAddTouristAttraction = new javax.swing.JButton();
        btnUpdateTouristAttraction = new javax.swing.JButton();
        btnRefreshTouristAttraction = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHotels = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnDeleteHotel = new javax.swing.JButton();
        btnAddHotel = new javax.swing.JButton();
        btnUpdateHotel = new javax.swing.JButton();
        btnRefreshHotel = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 39)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quản lý địa điểm du lịch");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(28, 28, 28))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(235, 227, 227));

        jPanel5.setBackground(new java.awt.Color(235, 227, 227));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Tên địa điểm:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Địa chỉ: ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel10.setText("Thông tin địa điểm du lịch");

        jPanel6.setBackground(new java.awt.Color(235, 227, 227));

        txtNameTouristAttraction.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtAddressTouristAttraction.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtAddressTouristAttraction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(txtNameTouristAttraction, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNameTouristAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddressTouristAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel15.setText("Tìm kiếm");

        txtSearchTouristAttraction.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnSearchTouristAttraction.setText("Tìm kiếm");
        btnSearchTouristAttraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTouristAttractionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtSearchTouristAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchTouristAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15)
                    .addComponent(jLabel10)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchTouristAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchTouristAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(235, 227, 227));

        jPanel7.setBackground(new java.awt.Color(235, 227, 227));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Tên khách sạn:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Số điện thoại:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Địa chỉ: ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setText("Mã địa điểm:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(12, 12, 12))
        );

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel11.setText("Thông tin khách sạn");

        txtIdTouristAttrraction.setBackground(new java.awt.Color(235, 227, 227));

        txtNameHotel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtPhoneHotel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtAddressHotel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        txtTouristAttractionIdHotel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        javax.swing.GroupLayout txtIdTouristAttrractionLayout = new javax.swing.GroupLayout(txtIdTouristAttrraction);
        txtIdTouristAttrraction.setLayout(txtIdTouristAttrractionLayout);
        txtIdTouristAttrractionLayout.setHorizontalGroup(
            txtIdTouristAttrractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtIdTouristAttrractionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtIdTouristAttrractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtIdTouristAttrractionLayout.createSequentialGroup()
                        .addGroup(txtIdTouristAttrractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPhoneHotel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(txtNameHotel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtAddressHotel)
                    .addComponent(txtTouristAttractionIdHotel))
                .addContainerGap())
        );
        txtIdTouristAttrractionLayout.setVerticalGroup(
            txtIdTouristAttrractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtIdTouristAttrractionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTouristAttractionIdHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhoneHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddressHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel16.setText("Tìm kiếm");

        txtSearchHotel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        btnSearchHotel.setText("Tìm kiếm");
        btnSearchHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchHotelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtSearchHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdTouristAttrraction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addComponent(txtIdTouristAttrraction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        tableTouristAttractions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã địa điểm", "Tên địa điểm", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTouristAttractions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTouristAttractionsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTouristAttractions);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel17.setText("Danh sách địa điểm du lịch");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        btnDeleteTouristAttraction.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnDeleteTouristAttraction.setText("Xoá");
        btnDeleteTouristAttraction.setEnabled(false);
        btnDeleteTouristAttraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTouristAttractionActionPerformed(evt);
            }
        });

        btnAddTouristAttraction.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnAddTouristAttraction.setText("Thêm");
        btnAddTouristAttraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTouristAttractionActionPerformed(evt);
            }
        });

        btnUpdateTouristAttraction.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnUpdateTouristAttraction.setText("Cập nhật");
        btnUpdateTouristAttraction.setEnabled(false);
        btnUpdateTouristAttraction.setPreferredSize(new java.awt.Dimension(72, 27));
        btnUpdateTouristAttraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTouristAttractionActionPerformed(evt);
            }
        });

        btnRefreshTouristAttraction.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnRefreshTouristAttraction.setText("Làm mới");
        btnRefreshTouristAttraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTouristAttractionActionPerformed(evt);
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
                        .addComponent(btnAddTouristAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeleteTouristAttraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateTouristAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRefreshTouristAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(btnRefreshTouristAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddTouristAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateTouristAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteTouristAttraction, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        tableHotels.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã địa điểm", "Mã khách sạn", "Tên khách sạn", "Số điện thoại", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHotels.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHotelsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableHotels);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel18.setText("Danh sách cách khách sạn");

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        btnDeleteHotel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnDeleteHotel.setText("Xoá");
        btnDeleteHotel.setEnabled(false);
        btnDeleteHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHotelActionPerformed(evt);
            }
        });

        btnAddHotel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnAddHotel.setText("Thêm");
        btnAddHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHotelActionPerformed(evt);
            }
        });

        btnUpdateHotel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnUpdateHotel.setText("Cập nhật");
        btnUpdateHotel.setEnabled(false);
        btnUpdateHotel.setPreferredSize(new java.awt.Dimension(72, 27));
        btnUpdateHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHotelActionPerformed(evt);
            }
        });

        btnRefreshHotel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnRefreshHotel.setText("Làm mới");
        btnRefreshHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshHotelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAddHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeleteHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnRefreshHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnRefreshHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel17))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchTouristAttractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTouristAttractionActionPerformed
        String contentSearch = txtSearchTouristAttraction.getText();
        if ("".equals(contentSearch)) {
            txtSearchTouristAttraction.requestFocus();
        } else {
            touristAttractions = touristAttractionDAO.search(contentSearch);
            displayTouristAttraction();
        }
    }//GEN-LAST:event_btnSearchTouristAttractionActionPerformed

    private void tableTouristAttractionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTouristAttractionsMouseClicked
        selectedTouristAttractionIndex = tableTouristAttractions.getSelectedRow();
        if (selectedTouristAttractionIndex != -1) {
            btnDeleteTouristAttraction.setEnabled(true);
            btnUpdateTouristAttraction.setEnabled(true);

            selectedTouristAttractionId = (int) tableTouristAttractions.getValueAt(selectedTouristAttractionIndex, 0);
            String name = (String) tableTouristAttractions.getValueAt(selectedTouristAttractionIndex, 1);
            String address = (String) tableTouristAttractions.getValueAt(selectedTouristAttractionIndex, 2);

            txtNameTouristAttraction.setText(name);
            txtAddressTouristAttraction.setText(address);
            loadDataHotel();
        } else {
            btnDeleteTouristAttraction.setEnabled(false);
            btnUpdateTouristAttraction.setEnabled(false);
        }
    }//GEN-LAST:event_tableTouristAttractionsMouseClicked

    private void btnDeleteTouristAttractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTouristAttractionActionPerformed
        if (selectedTouristAttractionIndex != -1) {
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
                int touristAttractionId = (int) tableTouristAttractions.getValueAt(selectedTouristAttractionIndex, 0);
                boolean isDeleted = touristAttractionDAO.delete((long) touristAttractionId);
                if (isDeleted) {
                    loadDataTouristAttraction();
                    btnDeleteTouristAttraction.setEnabled(false);
                    btnUpdateTouristAttraction.setEnabled(false);
                    selectedTouristAttractionIndex = -1;
                    JOptionPane.showMessageDialog(this, "Xóa hướng địa điểm du lịch thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    resetFormTouristAtrtraction();
                    resetFormHotel();
                    loadDataHotel();
                } else {
                    JOptionPane.showMessageDialog(this, "Không thể xóa địa điểm du lịch.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteTouristAttractionActionPerformed

    private void btnAddTouristAttractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTouristAttractionActionPerformed
        String name = txtNameTouristAttraction.getText();
        String address = txtAddressTouristAttraction.getText();

        if (name.isEmpty() || address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin điểm tham quan.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        TouristAttraction newTouristAttraction = new TouristAttraction();
        newTouristAttraction.setName(name);
        newTouristAttraction.setAddress(address);

        if (checkoutValidTouristAttraction(newTouristAttraction)) {
            boolean added = touristAttractionDAO.add(newTouristAttraction);

            if (added) {
                JOptionPane.showMessageDialog(this, "Thêm điểm tham quan thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                loadDataTouristAttraction();
                resetFormTouristAtrtraction();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm điểm tham quan thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddTouristAttractionActionPerformed

    private boolean checkoutValidTouristAttraction(TouristAttraction touristAttraction) {
        touristAttractions = touristAttractionDAO.findAll();

        for (TouristAttraction ta : touristAttractions) {
            if ((ta.getAddress().equals(touristAttraction.getAddress()) && ta.getName().equals(touristAttraction.getName()))
                    && ta.getTouristAttractionId() != touristAttraction.getTouristAttractionId()) {
                JOptionPane.showMessageDialog(this, "Điểm điểm đã tồn tại.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }

        return true;
    }

    private void btnUpdateTouristAttractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTouristAttractionActionPerformed
        if (selectedTouristAttractionIndex != -1) {
            String name = txtNameTouristAttraction.getText();
            String address = txtAddressTouristAttraction.getText();

            if (name.isEmpty() || address.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin điểm tham quan.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int touristAttractionId = (int) tableTouristAttractions.getValueAt(selectedTouristAttractionIndex, 0);

            TouristAttraction updatedTouristAttraction = new TouristAttraction();
            updatedTouristAttraction.setTouristAttractionId(touristAttractionId);
            updatedTouristAttraction.setName(name);
            updatedTouristAttraction.setAddress(address);

            if (checkoutValidTouristAttraction(updatedTouristAttraction)) {
                boolean updated = touristAttractionDAO.update(updatedTouristAttraction);

                if (updated) {
                    JOptionPane.showMessageDialog(this, "Cập nhật điểm tham quan thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    loadDataTouristAttraction();
                    resetFormTouristAtrtraction();
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật điểm tham quan thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một điểm tham quan để cập nhật.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpdateTouristAttractionActionPerformed

    private void btnRefreshTouristAttractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTouristAttractionActionPerformed
        resetFormTouristAtrtraction();
        resetFormHotel();
        loadDataTouristAttraction();
        loadDataHotel();
    }//GEN-LAST:event_btnRefreshTouristAttractionActionPerformed

    private void resetFormTouristAtrtraction() {
        selectedTouristAttractionId = -1;
        txtNameTouristAttraction.setText("");
        txtAddressTouristAttraction.setText("");
        txtSearchTouristAttraction.setText("");
        selectedTouristAttractionIndex = -1;
        btnDeleteTouristAttraction.setEnabled(false);
        btnUpdateTouristAttraction.setEnabled(false);
    }

    private void tableHotelsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHotelsMouseClicked
        selectedHotelIndex = tableHotels.getSelectedRow();
        if (selectedHotelIndex != -1) {
            btnDeleteHotel.setEnabled(true);
            btnUpdateHotel.setEnabled(true);

            int id = (int) tableHotels.getValueAt(selectedHotelIndex, 0);
            String name = (String) tableHotels.getValueAt(selectedHotelIndex, 2);
            String phone = (String) tableHotels.getValueAt(selectedHotelIndex, 3);
            String address = (String) tableHotels.getValueAt(selectedHotelIndex, 4);

            txtTouristAttractionIdHotel.setText(String.valueOf(id));
            txtNameHotel.setText(name);
            txtPhoneHotel.setText(phone);
            txtAddressHotel.setText(address);
        } else {
            btnDeleteHotel.setEnabled(false);
            btnUpdateHotel.setEnabled(false);
        }
    }//GEN-LAST:event_tableHotelsMouseClicked

    private void btnDeleteHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHotelActionPerformed
        if (selectedHotelIndex != -1) {
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
                int hotelId = (int) tableHotels.getValueAt(selectedHotelIndex, 0);
                boolean isDeleted = hotelDAO.delete((long) hotelId);
                if (isDeleted) {
                    btnDeleteHotel.setEnabled(false);
                    btnUpdateHotel.setEnabled(false);
                    selectedHotelIndex = -1;
                    JOptionPane.showMessageDialog(this, "Xóa hướng khách sạn thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    resetFormHotel();
                    loadDataHotel();
                } else {
                    JOptionPane.showMessageDialog(this, "Không thể xóa khách sạn.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteHotelActionPerformed

    private void btnAddHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHotelActionPerformed
        String name = txtNameHotel.getText();
        String address = txtAddressHotel.getText();
        String phone = txtPhoneHotel.getText();
        String touristAttractionIdText = txtTouristAttractionIdHotel.getText();

        if (name.isEmpty() || address.isEmpty() || phone.isEmpty() || touristAttractionIdText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin khách sạn.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!Validator.isValidPhone(phone)) {
            txtPhoneHotel.requestFocus();
            JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int touristAttractionId;
        try {
            touristAttractionId = Integer.parseInt(touristAttractionIdText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Mã điểm tham quan phải là số.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Hotel newHotel = new Hotel();
        newHotel.setName(name);
        newHotel.setAddress(address);
        newHotel.setPhone(phone);
        newHotel.setTouristAttractionId(touristAttractionId);

        if (!checkValidHotelOfTouristAttraction(newHotel)) {
            JOptionPane.showMessageDialog(this, "Mã địa điểm không tồn tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!checkoutValidHotel(newHotel)) {
            return;
        }
        boolean added = hotelDAO.add(newHotel);

        if (added) {
            JOptionPane.showMessageDialog(this, "Thêm khách sạn thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            loadDataHotel();
            resetFormHotel();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm khách sạn thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddHotelActionPerformed

    private void btnUpdateHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHotelActionPerformed
        if (selectedHotelIndex != -1) {
            String name = txtNameHotel.getText();
            String address = txtAddressHotel.getText();
            String phone = txtPhoneHotel.getText();
            String touristAttractionIdText = txtTouristAttractionIdHotel.getText();

            if (name.isEmpty() || address.isEmpty() || phone.isEmpty() || touristAttractionIdText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin khách sạn.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!Validator.isValidPhone(phone)) {
                txtPhoneHotel.requestFocus();
                JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int touristAttractionId;
            try {
                touristAttractionId = Integer.parseInt(touristAttractionIdText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Mã điểm tham quan phải là số.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            int hotelId = (int) tableHotels.getValueAt(selectedHotelIndex, 0);

            Hotel updatedHotel = new Hotel();
            updatedHotel.setHotelId(hotelId);
            updatedHotel.setName(name);
            updatedHotel.setAddress(address);
            updatedHotel.setPhone(phone);
            updatedHotel.setTouristAttractionId(touristAttractionId);

            if (!checkValidHotelOfTouristAttraction(updatedHotel)) {
                JOptionPane.showMessageDialog(this, "Mã địa điểm không tồn tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (!checkoutValidHotel(updatedHotel)) {
                return;
            }

            boolean updated = hotelDAO.update(updatedHotel);

            if (updated) {
                JOptionPane.showMessageDialog(this, "Cập nhật khách sạn thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                loadDataHotel();
                resetFormHotel();
            } else {
                JOptionPane.showMessageDialog(this, "Cập nhật khách sạn thất bại.", "Thông báo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách sạn để cập nhật.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateHotelActionPerformed

    private boolean checkoutValidHotel(Hotel hotel) {
        hotels = hotelDAO.findAll();

        for (Hotel h : hotels) {
            boolean isDuplicate = h.getPhone().equals(hotel.getPhone())
                    && h.getAddress().equals(hotel.getAddress())
                    && h.getName().equals(hotel.getName());

            if (isDuplicate && h.getHotelId() != hotel.getHotelId()) {
                showMessageAndFocus(isDuplicate);
                return false;
            }
        }

        return true;
    }

    private boolean checkValidHotelOfTouristAttraction(Hotel hotel) {
        touristAttractions = touristAttractionDAO.findAll();
        boolean isValidHotel = false;
        for (TouristAttraction ta : touristAttractions) {
            if (hotel.getTouristAttractionId() == ta.getTouristAttractionId()) {
                isValidHotel = true;
                break;
            }
        }
        return isValidHotel;
    }

    private void showMessageAndFocus(boolean isDuplicatePhoneAndAddress) {
        if (isDuplicatePhoneAndAddress) {
            JOptionPane.showMessageDialog(this, "Khách sạn đã tồn tại.", "Thông báo", JOptionPane.WARNING_MESSAGE);
            txtPhoneHotel.requestFocus();
            txtAddressHotel.requestFocus();
        }
    }


    private void btnRefreshHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshHotelActionPerformed
        resetFormHotel();
        loadDataHotel();
    }//GEN-LAST:event_btnRefreshHotelActionPerformed

    private void resetFormHotel() {
        txtTouristAttractionIdHotel.setText("");
        txtNameHotel.setText("");
        txtAddressHotel.setText("");
        txtPhoneHotel.setText("");
        txtSearchHotel.setText("");
        selectedHotelIndex = -1;
        btnDeleteHotel.setEnabled(false);
        btnUpdateHotel.setEnabled(false);
    }

    private void btnSearchHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchHotelActionPerformed
        String contentSearch = txtSearchHotel.getText();
        if ("".equals(contentSearch)) {
            txtSearchHotel.requestFocus();
        } else {
            hotels = hotelDAO.search(contentSearch);
            displayHotel();
        }
    }//GEN-LAST:event_btnSearchHotelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddHotel;
    private javax.swing.JButton btnAddTouristAttraction;
    private javax.swing.JButton btnDeleteHotel;
    private javax.swing.JButton btnDeleteTouristAttraction;
    private javax.swing.JButton btnRefreshHotel;
    private javax.swing.JButton btnRefreshTouristAttraction;
    private javax.swing.JButton btnSearchHotel;
    private javax.swing.JButton btnSearchTouristAttraction;
    private javax.swing.JButton btnUpdateHotel;
    private javax.swing.JButton btnUpdateTouristAttraction;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableHotels;
    private javax.swing.JTable tableTouristAttractions;
    private javax.swing.JTextField txtAddressHotel;
    private javax.swing.JTextField txtAddressTouristAttraction;
    private javax.swing.JPanel txtIdTouristAttrraction;
    private javax.swing.JTextField txtNameHotel;
    private javax.swing.JTextField txtNameTouristAttraction;
    private javax.swing.JTextField txtPhoneHotel;
    private javax.swing.JTextField txtSearchHotel;
    private javax.swing.JTextField txtSearchTouristAttraction;
    private javax.swing.JTextField txtTouristAttractionIdHotel;
    // End of variables declaration//GEN-END:variables
}
