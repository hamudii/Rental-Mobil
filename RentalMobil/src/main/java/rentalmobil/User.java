package rentalmobil;

import javax.swing.JOptionPane;
import java.sql.ResultSet;
public class User extends javax.swing.JFrame {

    public User() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dataMobil = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idInputField = new javax.swing.JTextField();
        namaInputField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatInputField = new javax.swing.JTextArea();
        contactInputField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        usernameInputField = new javax.swing.JTextField();
        passwordInputField = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idSearchField = new javax.swing.JTextField();
        searchIdPelanggan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        idSearchResultField = new javax.swing.JTextField();
        namaSearchResultField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamatSearchResultField = new javax.swing.JTextArea();
        contactSearchResultField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        ussernameSearchResultField = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        passwordSearchResultField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        mobilTable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        idPegawaiPinjamField = new javax.swing.JTextField();
        idPeminjamPinjamField = new javax.swing.JTextField();
        idPelangganPinjamField = new javax.swing.JTextField();
        jenisMobilComboBox = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        tanggalComboBox = new javax.swing.JComboBox<>();
        bulanComboBox = new javax.swing.JComboBox<>();
        lamaPinjamField = new javax.swing.JTextField();
        biayaPinjamField = new javax.swing.JTextField();
        totalPinjamField = new javax.swing.JTextField();
        kembaliPinjamField = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        savePinjamButton = new javax.swing.JButton();
        cancelPinjamButton = new javax.swing.JButton();
        tahunComboBox = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        idMobilField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        idPeminjamanPengembalianField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        idPelangganPengembalianField = new javax.swing.JTextField();
        idMobilPengembalianField = new javax.swing.JTextField();
        tanggalPinjamPengembalianField = new javax.swing.JTextField();
        lamaPinjamPengembalianField = new javax.swing.JTextField();
        biayaSewaPengembalianField = new javax.swing.JTextField();
        tanggalKembaliPengembalianField = new javax.swing.JTextField();
        telatPengembalianField = new javax.swing.JTextField();
        prosesPengembalianButton = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        dendaPengembalianField = new javax.swing.JTextField();
        savePengembalianButton = new javax.swing.JButton();
        searchPengembalianButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rental Mobil");

        dataMobil.setBackground(new java.awt.Color(255, 255, 255));
        dataMobil.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        dataMobil.setPreferredSize(new java.awt.Dimension(500, 300));
        dataMobil.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dataMobilStateChanged(evt);
            }
        });
        dataMobil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataMobilFocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(37, 24, 46));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User");

        logoutButton.setBackground(new java.awt.Color(202, 31, 61));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Welcome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel1)
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(jLabel42)
                    .addContainerGap(141, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(152, 152, 152)
                .addComponent(logoutButton)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(jLabel42)
                    .addContainerGap(240, Short.MAX_VALUE)))
        );

        dataMobil.addTab("User", jPanel1);

        jPanel2.setBackground(new java.awt.Color(37, 24, 46));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 190, 0));
        jLabel2.setText("Input Data Pelanggan");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id pelanggan :");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alamat :");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact person :");

        alamatInputField.setColumns(20);
        alamatInputField.setRows(5);
        jScrollPane1.setViewportView(alamatInputField);

        saveButton.setBackground(new java.awt.Color(0, 51, 255));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(202, 31, 61));
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        usernameInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameInputFieldActionPerformed(evt);
            }
        });

        passwordInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputFieldActionPerformed(evt);
            }
        });

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Username :");

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Password :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(contactInputField)
                    .addComponent(namaInputField)
                    .addComponent(idInputField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton))
                    .addComponent(passwordInputField)
                    .addComponent(usernameInputField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 125, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(122, 122, 122))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namaInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(resetButton))
                .addGap(56, 56, 56))
        );

        dataMobil.addTab("Input Pelanggan", jPanel2);

        jPanel3.setBackground(new java.awt.Color(37, 24, 46));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 190, 0));
        jLabel7.setText("Search Data Pelanggan");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Id pelanggan :");

        searchIdPelanggan.setBackground(new java.awt.Color(0, 153, 0));
        searchIdPelanggan.setForeground(new java.awt.Color(255, 255, 255));
        searchIdPelanggan.setText("Search");
        searchIdPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchIdPelangganActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 190, 0));
        jLabel9.setText("Result Data Pelanggan");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Id pelanggan :");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nama :");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Alamat :");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Contact Person :");

        idSearchResultField.setEditable(false);

        alamatSearchResultField.setColumns(20);
        alamatSearchResultField.setRows(5);
        jScrollPane2.setViewportView(alamatSearchResultField);

        updateButton.setBackground(new java.awt.Color(0, 51, 255));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(202, 31, 61));
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Username :");

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Password :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2)
                                .addComponent(namaSearchResultField)
                                .addComponent(idSearchResultField)
                                .addComponent(contactSearchResultField)
                                .addComponent(ussernameSearchResultField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel37)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(updateButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(deleteButton))
                                .addComponent(passwordSearchResultField))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchIdPelanggan))
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(idSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchIdPelanggan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(idSearchResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(namaSearchResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactSearchResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ussernameSearchResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(passwordSearchResultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        dataMobil.addTab("Data Pelanggan", jPanel3);

        jPanel4.setBackground(new java.awt.Color(37, 24, 46));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(254, 190, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Data Mobil");

        mobilTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Jenis", "Sewa", "Stok"
            }
        ));
        mobilTable.setEnabled(false);
        jScrollPane3.setViewportView(mobilTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(181, 181, 181))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        dataMobil.addTab("Mobil", jPanel4);

        jPanel5.setBackground(new java.awt.Color(37, 24, 46));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 190, 0));
        jLabel15.setText("Transaksi Peminjaman");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Id pegawai :");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Id peminjaman :");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Id pelanggan :");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Jenis mobil :");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Tanggal pinjam :");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Biaya sewa :");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Total sewa :");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Tanggal kembali :");

        jenisMobilComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jenisMobilComboBoxFocusGained(evt);
            }
        });
        jenisMobilComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisMobilComboBoxActionPerformed(evt);
            }
        });

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Lama pinjam :");

        tanggalComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        tanggalComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalComboBoxActionPerformed(evt);
            }
        });

        bulanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        generateButton.setBackground(new java.awt.Color(0, 153, 0));
        generateButton.setForeground(new java.awt.Color(255, 255, 255));
        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        savePinjamButton.setBackground(new java.awt.Color(0, 51, 255));
        savePinjamButton.setForeground(new java.awt.Color(255, 255, 255));
        savePinjamButton.setText("Save");
        savePinjamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePinjamButtonActionPerformed(evt);
            }
        });

        cancelPinjamButton.setBackground(new java.awt.Color(202, 31, 61));
        cancelPinjamButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelPinjamButton.setText("Cancel");
        cancelPinjamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPinjamButtonActionPerformed(evt);
            }
        });

        tahunComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019", "2018", "2017" }));

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("hari");

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("ID :");

        idMobilField.setEditable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 133, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(104, 104, 104))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(savePinjamButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelPinjamButton))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(kembaliPinjamField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(totalPinjamField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(biayaPinjamField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(generateButton)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lamaPinjamField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idPelangganPinjamField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idPeminjamPinjamField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idPegawaiPinjamField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(tanggalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bulanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tahunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jenisMobilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idMobilField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(idPegawaiPinjamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(idPeminjamPinjamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(idPelangganPinjamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jenisMobilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(idMobilField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tanggalComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bulanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tahunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(lamaPinjamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addGap(8, 8, 8)
                .addComponent(generateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(biayaPinjamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(totalPinjamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(kembaliPinjamField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savePinjamButton)
                    .addComponent(cancelPinjamButton))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        dataMobil.addTab("Peminjaman", jPanel5);

        jPanel6.setBackground(new java.awt.Color(37, 24, 46));

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 190, 0));
        jLabel25.setText("Search Data Transaksi");

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Id peminjaman :");

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 190, 0));
        jLabel27.setText("Transaksi Pengembalian");

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Id pelanggan :");

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Id mobil :");

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Tanggal pinjam :");

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Lama pinjam :");

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Biaya sewa :");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Tanggal kembali :");

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Telat :");

        idPelangganPengembalianField.setEditable(false);

        idMobilPengembalianField.setEditable(false);

        tanggalPinjamPengembalianField.setEditable(false);

        lamaPinjamPengembalianField.setEditable(false);

        biayaSewaPengembalianField.setEditable(false);

        tanggalKembaliPengembalianField.setEditable(false);

        prosesPengembalianButton.setBackground(new java.awt.Color(0, 204, 0));
        prosesPengembalianButton.setForeground(new java.awt.Color(255, 255, 255));
        prosesPengembalianButton.setText("Proses");
        prosesPengembalianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesPengembalianButtonActionPerformed(evt);
            }
        });

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Denda :");

        dendaPengembalianField.setEditable(false);

        savePengembalianButton.setBackground(new java.awt.Color(0, 51, 255));
        savePengembalianButton.setForeground(new java.awt.Color(255, 255, 255));
        savePengembalianButton.setText("Save");
        savePengembalianButton.setEnabled(false);
        savePengembalianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePengembalianButtonActionPerformed(evt);
            }
        });

        searchPengembalianButton.setBackground(new java.awt.Color(0, 204, 0));
        searchPengembalianButton.setForeground(new java.awt.Color(255, 255, 255));
        searchPengembalianButton.setText("Search");
        searchPengembalianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPengembalianButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(405, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(biayaSewaPengembalianField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lamaPinjamPengembalianField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggalPinjamPengembalianField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idMobilPengembalianField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idPelangganPengembalianField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel27))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel26)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(idPeminjamanPengembalianField)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searchPengembalianButton))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel25))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tanggalKembaliPengembalianField)
                                .addComponent(telatPengembalianField)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(prosesPengembalianButton)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(dendaPengembalianField)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savePengembalianButton)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(idPeminjamanPengembalianField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPengembalianButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(idPelangganPengembalianField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(idMobilPengembalianField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(tanggalPinjamPengembalianField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(lamaPinjamPengembalianField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(biayaSewaPengembalianField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33)
                    .addComponent(tanggalKembaliPengembalianField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(telatPengembalianField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prosesPengembalianButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(dendaPengembalianField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savePengembalianButton))
                .addGap(11, 11, 11))
        );

        dataMobil.addTab("Pengembalian", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dataMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dataMobil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
        JOptionPane.showMessageDialog(null,"Logout Success");
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        Pelanggan pel = new Pelanggan();
        pel.setId(idInputField.getText());
        pel.setNama(namaInputField.getText());
        pel.setAlamat(alamatInputField.getText());
        pel.setCp(contactInputField.getText());
        pel.setUsername(usernameInputField.getText());
        pel.setPassword(passwordInputField.getText());
        pel.insertPelanggan();
        JOptionPane.showMessageDialog(null, "Insert Success");
    }//GEN-LAST:event_saveButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        idInputField.setText(null);
        namaInputField.setText(null);
        alamatInputField.setText(null);
        contactInputField.setText(null);
        usernameInputField.setText(null);
        passwordInputField.setText(null);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void searchIdPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchIdPelangganActionPerformed
        Koneksi kon = new Koneksi();
        ResultSet rs = null;
        try {
            rs = kon.getData("select *from user where id_user = '"+ idSearchField.getText()+"' and kode = '2'");
            while (rs.next()) {
                idSearchResultField.setText(rs.getString("id_user"));
                namaSearchResultField.setText(rs.getString("nama"));
                alamatSearchResultField.setText(rs.getString("alamat"));
                contactSearchResultField.setText(rs.getString("cp"));
                ussernameSearchResultField.setText(rs.getString("username"));
                passwordSearchResultField.setText(rs.getString("password"));
             }
            JOptionPane.showMessageDialog(null, "Search Success ");
            idSearchResultField.setEnabled(true);
            namaSearchResultField.setEnabled(true);
            alamatSearchResultField.setEnabled(true);
            contactSearchResultField.setEnabled(true);
            ussernameSearchResultField.setEnabled(true);
            passwordSearchResultField.setEnabled(true);
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }//GEN-LAST:event_searchIdPelangganActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        Pelanggan pel = new Pelanggan();
        pel.setId(idSearchResultField.getText());
        pel.setNama(namaSearchResultField.getText());
        pel.setAlamat(alamatSearchResultField.getText());
        pel.setCp(contactSearchResultField.getText());
        pel.setUsername(ussernameSearchResultField.getText());
        pel.setPassword(passwordSearchResultField.getText());
        pel.setKode("2");
        pel.updatePelanggan();
        JOptionPane.showMessageDialog(null, "Update Success");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Apakah anda yakin akan menghapus?");
        idSearchResultField.setEnabled(false);
        namaSearchResultField.setEnabled(false);
        alamatSearchResultField.setEnabled(false);
        contactSearchResultField.setEnabled(false);
        ussernameSearchResultField.setEnabled(false);
        passwordSearchResultField.setEnabled(false);
        Pelanggan pel = new Pelanggan();
        pel.setId(idSearchResultField.getText());
        pel.setNama(namaSearchResultField.getText());
        pel.setAlamat(alamatSearchResultField.getText());
        pel.setCp(contactSearchResultField.getText());
        pel.setUsername(ussernameSearchResultField.getText());
        pel.setPassword(passwordSearchResultField.getText());
        pel.deletePelanggan();
        JOptionPane.showMessageDialog(null,"Delete Success");
        idSearchResultField.setText(null);
        namaSearchResultField.setText(null);
        alamatSearchResultField.setText(null);
        contactSearchResultField.setText(null);
        ussernameSearchResultField.setText(null);
        passwordSearchResultField.setText(null);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void dataMobilStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dataMobilStateChanged
        Koneksi kon = new Koneksi();
        ResultSet rs = null;
        int i = 0;
        try {
          rs = kon.getData("select *from mobil");
          while (rs.next()) {
            mobilTable.setValueAt(rs.getString("id_mobil"), i, 0);
            mobilTable.setValueAt(rs.getString("jenis"), i, 1);
            mobilTable.setValueAt(rs.getString("sewa"), i, 2);
            mobilTable.setValueAt(rs.getString("stok"), i, 3);
            i++;
          }
          rs.close();
        }catch (Exception e){
        }
    }//GEN-LAST:event_dataMobilStateChanged

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        Koneksi kon = new Koneksi();
        ResultSet rs = null;
        try {
          rs = kon.getData("select *from mobil where jenis = '" + jenisMobilComboBox.getSelectedItem() + "'");
          while (rs.next()) {
            biayaPinjamField.setText(rs.getString("sewa"));
            int k, l, m, n, o, tgl, bln, thn;
            k = Integer.valueOf(lamaPinjamField.getText());
            tgl = Integer.valueOf("" + tanggalComboBox.getSelectedItem());
            bln = Integer.valueOf("" + bulanComboBox.getSelectedItem());
            thn = Integer.valueOf("" + tahunComboBox.getSelectedItem());
            n = Integer.valueOf(biayaPinjamField.getText());
            m = k + tgl;
            o = k * n;
            totalPinjamField.setText(String.valueOf(o));
            if(bln == 2){
                while(m > 29){
                    m = m - 29;
                    bln = bln + 1;
                }
            }
            else if(bln % 2 == 1){
                while(m > 31){
                    m = m - 31;
                    bln = bln + 1;
                }
            }
            else if(bln %2 == 0){
                while(m > 30){
                    m = m - 30;
                    bln = bln + 1;
                }
            }
            
            while(bln > 12){
                bln = bln - 12;
                thn = thn + 1;
            }
            idMobilField.setText(rs.getString("id_mobil"));
            kembaliPinjamField.setText( thn + "-" + bln + "-" + String.valueOf(m));
          }
          rs.close();
        } catch (Exception e) {}
    }//GEN-LAST:event_generateButtonActionPerformed

    private void savePinjamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePinjamButtonActionPerformed
        Koneksi kon = new Koneksi();
        ResultSet rs = null;
        try {
          rs = kon.getData("select *from mobil where jenis = '" + jenisMobilComboBox.getSelectedItem() + "'");
          int stok = Integer.valueOf(rs.getString("stok"));
          stok -= 1;
          System.out.print(stok);
          String s = "update mobil set stok = '"+stok+"' where jenis ='"+jenisMobilComboBox.getSelectedItem()+"'";
          kon.query(s);
          rs.close();
        } catch (Exception e) {}
        
        Peminjaman pem = new Peminjaman();
        pem.setPeminjaman(idPeminjamPinjamField.getText());
        pem.setPelanggan(idPelangganPinjamField.getText());
        pem.setMobil(idMobilField.getText());
        pem.setJenisMobil(""+jenisMobilComboBox.getSelectedItem());
        pem.setPtanggal(""+tanggalComboBox.getSelectedItem());
        pem.setPbulan(""+bulanComboBox.getSelectedItem());
        pem.setPtahun(""+tahunComboBox.getSelectedItem());
        pem.setKtahun(kembaliPinjamField.getText());
        pem.setLama(lamaPinjamField.getText());
        pem.setPetugas(idPegawaiPinjamField.getText());
        pem.setBiaya(biayaPinjamField.getText());
        pem.insertPeminjaman();
        JOptionPane.showMessageDialog(null, "Insert Success");
        idPeminjamPinjamField.setText(null) ;
        idPeminjamPinjamField.setText(null);
        idMobilField.setText(null);
        jenisMobilComboBox.setSelectedIndex(0);
        tanggalComboBox.setSelectedIndex(0);
        bulanComboBox.setSelectedIndex(0); 
        tahunComboBox.setSelectedIndex(0);
        kembaliPinjamField.setText(null); 
        kembaliPinjamField.setText(null); 
        biayaPinjamField.setText(null);
        totalPinjamField.setText(null) ;
    }//GEN-LAST:event_savePinjamButtonActionPerformed

    private void searchPengembalianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPengembalianButtonActionPerformed
        Koneksi kon = new Koneksi();
        ResultSet rs = null;
        try{ 
            rs = kon.getData("select *from peminjaman where id_peminjaman = '"+idPeminjamanPengembalianField.getText()+"'");
            while(rs.next()){
                idPelangganPengembalianField.setText(rs.getString("id_pelanggan"));
                idMobilPengembalianField.setText(rs.getString("jenis_mobil"));
                tanggalPinjamPengembalianField.setText(rs.getString("tgl_pinjam"));
                lamaPinjamPengembalianField.setText(String.valueOf(rs.getInt("lama") ));
                biayaSewaPengembalianField.setText(String.valueOf(rs.getInt("biaya" )));
                tanggalKembaliPengembalianField.setText(rs.getString("tgl_hrs_kembali"));
            } 
            rs.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }//GEN-LAST:event_searchPengembalianButtonActionPerformed

    private void prosesPengembalianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesPengembalianButtonActionPerformed
        int k, l;
        k = Integer.valueOf(telatPengembalianField.getText());
        l = k * 100000;
        dendaPengembalianField.setText(String.valueOf(l));
        savePengembalianButton.setEnabled(true); 
    }//GEN-LAST:event_prosesPengembalianButtonActionPerformed

    private void savePengembalianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePengembalianButtonActionPerformed
        Peminjaman pem = new Peminjaman();
        pem.setPeminjaman(idPeminjamanPengembalianField.getText());
        pem.setTelat(telatPengembalianField.getText());
        pem.setDenda(dendaPengembalianField.getText());
        pem.updatePeminjaman();
        JOptionPane.showMessageDialog(null, "Update Success");
    }//GEN-LAST:event_savePengembalianButtonActionPerformed

    private void cancelPinjamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPinjamButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelPinjamButtonActionPerformed

    private void usernameInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameInputFieldActionPerformed

    private void passwordInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordInputFieldActionPerformed

    private void tanggalComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalComboBoxActionPerformed

    private void jenisMobilComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisMobilComboBoxActionPerformed
        // TODO add your handling code here:
//        Koneksi kon = new Koneksi();
//        ResultSet rs = null;
//        int i = 0;
//        try {
//          rs = kon.getData("select *from mobil");
//          while (rs.next()) {
//            jenisMobilComboBox.addItem(rs.getString("jenis"));
//            i++;
//          }
//          rs.close();
//        }catch (Exception e){
//            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
//        }
        
    }//GEN-LAST:event_jenisMobilComboBoxActionPerformed

    private void jenisMobilComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jenisMobilComboBoxFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jenisMobilComboBoxFocusGained

    private void dataMobilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataMobilFocusGained
        // TODO add your handling code here:
        Koneksi kon = new Koneksi();
        ResultSet rs = null;
        jenisMobilComboBox.removeAllItems();
        int i = 0;
        try {
          rs = kon.getData("select *from mobil");
          while (rs.next()) {
            jenisMobilComboBox.addItem(rs.getString("jenis"));
            i++;
          }
          rs.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }//GEN-LAST:event_dataMobilFocusGained

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatInputField;
    private javax.swing.JTextArea alamatSearchResultField;
    private javax.swing.JTextField biayaPinjamField;
    private javax.swing.JTextField biayaSewaPengembalianField;
    private javax.swing.JComboBox<String> bulanComboBox;
    private javax.swing.JButton cancelPinjamButton;
    private javax.swing.JTextField contactInputField;
    private javax.swing.JTextField contactSearchResultField;
    private javax.swing.JTabbedPane dataMobil;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField dendaPengembalianField;
    private javax.swing.JButton generateButton;
    private javax.swing.JTextField idInputField;
    private javax.swing.JTextField idMobilField;
    private javax.swing.JTextField idMobilPengembalianField;
    private javax.swing.JTextField idPegawaiPinjamField;
    private javax.swing.JTextField idPelangganPengembalianField;
    private javax.swing.JTextField idPelangganPinjamField;
    private javax.swing.JTextField idPeminjamPinjamField;
    private javax.swing.JTextField idPeminjamanPengembalianField;
    private javax.swing.JTextField idSearchField;
    private javax.swing.JTextField idSearchResultField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jenisMobilComboBox;
    private javax.swing.JTextField kembaliPinjamField;
    private javax.swing.JTextField lamaPinjamField;
    private javax.swing.JTextField lamaPinjamPengembalianField;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTable mobilTable;
    private javax.swing.JTextField namaInputField;
    private javax.swing.JTextField namaSearchResultField;
    private javax.swing.JTextField passwordInputField;
    private javax.swing.JTextField passwordSearchResultField;
    private javax.swing.JButton prosesPengembalianButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton savePengembalianButton;
    private javax.swing.JButton savePinjamButton;
    private javax.swing.JButton searchIdPelanggan;
    private javax.swing.JButton searchPengembalianButton;
    private javax.swing.JComboBox<String> tahunComboBox;
    private javax.swing.JComboBox<String> tanggalComboBox;
    private javax.swing.JTextField tanggalKembaliPengembalianField;
    private javax.swing.JTextField tanggalPinjamPengembalianField;
    private javax.swing.JTextField telatPengembalianField;
    private javax.swing.JTextField totalPinjamField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField usernameInputField;
    private javax.swing.JTextField ussernameSearchResultField;
    // End of variables declaration//GEN-END:variables
}
