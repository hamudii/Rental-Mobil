package rentalmobil;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idPegawaiInputField = new javax.swing.JTextField();
        namaPegawaiInputField = new javax.swing.JTextField();
        ContactInputField = new javax.swing.JTextField();
        usernameInputField = new javax.swing.JTextField();
        passwordInputField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatPegawaiInputField = new javax.swing.JTextArea();
        insertInputButton = new javax.swing.JButton();
        resetInputButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        idPegawaiEditField = new javax.swing.JTextField();
        namaPegawaiEditField = new javax.swing.JTextField();
        ContactEditField = new javax.swing.JTextField();
        usernameEditField = new javax.swing.JTextField();
        passwordEditField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamatPegawaiEditField = new javax.swing.JTextArea();
        UpdatePegawaiButton = new javax.swing.JButton();
        deletePegawaiButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        idPegawaiSearchField = new javax.swing.JTextField();
        searchPegawaiButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        idMobilInputField = new javax.swing.JTextField();
        jenisMobilInputField = new javax.swing.JTextField();
        sewaMobilInputField = new javax.swing.JTextField();
        stokMobilInputField = new javax.swing.JTextField();
        insertMobilButton = new javax.swing.JButton();
        resetMobilButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        idMobilEditField = new javax.swing.JTextField();
        jenisMobilEditField = new javax.swing.JTextField();
        sewaMobilEditField = new javax.swing.JTextField();
        stokMobilEditField = new javax.swing.JTextField();
        editMobilButton = new javax.swing.JButton();
        deleteMobilButton = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        idMobilSearchField = new javax.swing.JTextField();
        mobilSearchButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 190, 0));

        logoutButton.setBackground(new java.awt.Color(202, 31, 61));
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(37, 24, 46));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Welcome");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 24, 46));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(505, Short.MAX_VALUE)
                        .addComponent(logoutButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel42)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Admin", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 190, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 24, 46));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Input Data Pegawai");

        jLabel3.setForeground(new java.awt.Color(37, 24, 46));
        jLabel3.setText("Id pegawai :");

        jLabel4.setForeground(new java.awt.Color(37, 24, 46));
        jLabel4.setText("Nama :");

        jLabel5.setForeground(new java.awt.Color(37, 24, 46));
        jLabel5.setText("Alamat :");

        jLabel6.setForeground(new java.awt.Color(37, 24, 46));
        jLabel6.setText("Contact Person :");

        jLabel7.setForeground(new java.awt.Color(37, 24, 46));
        jLabel7.setText("Username :");

        jLabel8.setForeground(new java.awt.Color(37, 24, 46));
        jLabel8.setText("Password :");

        alamatPegawaiInputField.setColumns(20);
        alamatPegawaiInputField.setRows(5);
        jScrollPane1.setViewportView(alamatPegawaiInputField);

        insertInputButton.setBackground(new java.awt.Color(0, 51, 255));
        insertInputButton.setForeground(new java.awt.Color(255, 255, 255));
        insertInputButton.setText("Insert");
        insertInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertInputButtonActionPerformed(evt);
            }
        });

        resetInputButton.setBackground(new java.awt.Color(202, 31, 61));
        resetInputButton.setForeground(new java.awt.Color(255, 255, 255));
        resetInputButton.setText("Reset");
        resetInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetInputButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(insertInputButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetInputButton)
                        .addContainerGap(334, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContactInputField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameInputField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordInputField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(namaPegawaiInputField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idPegawaiInputField, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(130, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idPegawaiInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namaPegawaiInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ContactInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(usernameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(passwordInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertInputButton)
                    .addComponent(resetInputButton))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Input Pegawai", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 190, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(37, 24, 46));
        jLabel9.setText("Search data pegawai");

        jLabel10.setForeground(new java.awt.Color(37, 24, 46));
        jLabel10.setText("Id pegawai :");

        jLabel11.setForeground(new java.awt.Color(37, 24, 46));
        jLabel11.setText("Nama :");

        jLabel12.setForeground(new java.awt.Color(37, 24, 46));
        jLabel12.setText("Alamat :");

        jLabel13.setForeground(new java.awt.Color(37, 24, 46));
        jLabel13.setText("Contact Person :");

        jLabel14.setForeground(new java.awt.Color(37, 24, 46));
        jLabel14.setText("Username :");

        jLabel15.setForeground(new java.awt.Color(37, 24, 46));
        jLabel15.setText("Password :");

        idPegawaiEditField.setEditable(false);
        idPegawaiEditField.setEnabled(false);

        namaPegawaiEditField.setEnabled(false);

        ContactEditField.setEnabled(false);

        usernameEditField.setEnabled(false);

        passwordEditField.setEnabled(false);

        alamatPegawaiEditField.setColumns(20);
        alamatPegawaiEditField.setRows(5);
        alamatPegawaiEditField.setEnabled(false);
        jScrollPane2.setViewportView(alamatPegawaiEditField);

        UpdatePegawaiButton.setBackground(new java.awt.Color(0, 51, 255));
        UpdatePegawaiButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdatePegawaiButton.setText("Update");
        UpdatePegawaiButton.setEnabled(false);
        UpdatePegawaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePegawaiButtonActionPerformed(evt);
            }
        });

        deletePegawaiButton.setBackground(new java.awt.Color(202, 31, 61));
        deletePegawaiButton.setForeground(new java.awt.Color(255, 255, 255));
        deletePegawaiButton.setText("Delete");
        deletePegawaiButton.setEnabled(false);
        deletePegawaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePegawaiButtonActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(37, 24, 46));
        jLabel16.setText("Result data pegawai");

        jLabel17.setForeground(new java.awt.Color(37, 24, 46));
        jLabel17.setText("Id pegawai :");

        idPegawaiSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPegawaiSearchFieldActionPerformed(evt);
            }
        });

        searchPegawaiButton.setBackground(new java.awt.Color(51, 153, 0));
        searchPegawaiButton.setForeground(new java.awt.Color(255, 255, 255));
        searchPegawaiButton.setText("Search");
        searchPegawaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPegawaiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(UpdatePegawaiButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletePegawaiButton)
                        .addContainerGap(336, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ContactEditField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameEditField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordEditField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                            .addComponent(namaPegawaiEditField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idPegawaiEditField, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(130, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idPegawaiSearchField))
                    .addComponent(jLabel9)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPegawaiButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(idPegawaiSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPegawaiButton))
                .addGap(14, 14, 14)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(idPegawaiEditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(namaPegawaiEditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ContactEditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(usernameEditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(passwordEditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdatePegawaiButton)
                    .addComponent(deletePegawaiButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Pegawai", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 190, 0));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Input Data Mobil");

        jLabel19.setText("Id mobil :");

        jLabel20.setText("Jenis :");

        jLabel21.setText("Sewa :");

        jLabel22.setText("Stok :");

        insertMobilButton.setBackground(new java.awt.Color(51, 51, 255));
        insertMobilButton.setForeground(new java.awt.Color(255, 255, 255));
        insertMobilButton.setText("insert");
        insertMobilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertMobilButtonActionPerformed(evt);
            }
        });

        resetMobilButton.setBackground(new java.awt.Color(202, 31, 61));
        resetMobilButton.setForeground(new java.awt.Color(255, 255, 255));
        resetMobilButton.setText("reset");
        resetMobilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetMobilButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idMobilInputField)
                            .addComponent(jenisMobilInputField)
                            .addComponent(sewaMobilInputField)
                            .addComponent(stokMobilInputField)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(insertMobilButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetMobilButton))))
                    .addComponent(jLabel18))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel18)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(idMobilInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jenisMobilInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(sewaMobilInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(stokMobilInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertMobilButton)
                    .addComponent(resetMobilButton))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Input Mobil", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 190, 0));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(37, 24, 46));
        jLabel23.setText("Search data mobil");

        jLabel24.setForeground(new java.awt.Color(37, 24, 46));
        jLabel24.setText("Id mobil :");

        jLabel25.setForeground(new java.awt.Color(37, 24, 46));
        jLabel25.setText("Jenis :");

        jLabel26.setForeground(new java.awt.Color(37, 24, 46));
        jLabel26.setText("Sewa :");

        jLabel27.setForeground(new java.awt.Color(37, 24, 46));
        jLabel27.setText("Stok :");

        idMobilEditField.setEditable(false);
        idMobilEditField.setEnabled(false);

        jenisMobilEditField.setEnabled(false);
        jenisMobilEditField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jenisMobilEditFieldInputMethodTextChanged(evt);
            }
        });

        sewaMobilEditField.setEnabled(false);

        stokMobilEditField.setEnabled(false);

        editMobilButton.setBackground(new java.awt.Color(51, 51, 255));
        editMobilButton.setForeground(new java.awt.Color(255, 255, 255));
        editMobilButton.setText("Edit");
        editMobilButton.setEnabled(false);
        editMobilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMobilButtonActionPerformed(evt);
            }
        });

        deleteMobilButton.setBackground(new java.awt.Color(202, 31, 61));
        deleteMobilButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteMobilButton.setText("Delete");
        deleteMobilButton.setEnabled(false);
        deleteMobilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMobilButtonActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(37, 24, 46));
        jLabel28.setText("Data mobil");

        jLabel29.setForeground(new java.awt.Color(37, 24, 46));
        jLabel29.setText("Id mobil :");

        mobilSearchButton.setBackground(new java.awt.Color(0, 204, 0));
        mobilSearchButton.setForeground(new java.awt.Color(255, 255, 255));
        mobilSearchButton.setText("Search");
        mobilSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idMobilEditField)
                            .addComponent(jenisMobilEditField)
                            .addComponent(sewaMobilEditField)
                            .addComponent(stokMobilEditField)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(editMobilButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deleteMobilButton))
                                    .addComponent(idMobilSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobilSearchButton)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(idMobilSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobilSearchButton))
                .addGap(20, 20, 20)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(idMobilEditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jenisMobilEditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(sewaMobilEditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(stokMobilEditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editMobilButton)
                    .addComponent(deleteMobilButton))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Data Mobil", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 190, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Pelanggan", "id_mobil", "Mobil", "Petugas", "Tgl. Pinjam", "Tgl. Kembali", "Sewa", "Denda"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane3.setViewportView(jTable1);

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(37, 24, 46));
        jLabel30.setText("Data Transaksi");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(200, 200, 200))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Report", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        Login log = new Login(); 
        log.setVisible(true); 
        dispose (); 
        javax.swing.JOptionPane.showMessageDialog(null, "Logout Success");
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void insertInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertInputButtonActionPerformed
        Pegawai peg = new Pegawai();
        peg.setId(idPegawaiInputField.getText()); 
        peg.setNama(namaPegawaiInputField.getText());
        peg.setAlamat(alamatPegawaiInputField.getText());
        peg.setCp(ContactInputField.getText());
        peg.setUsername(usernameInputField.getText());
        peg.setPassword(passwordInputField.getText());
        peg.insertPegawai();
        javax.swing.JOptionPane.showMessageDialog(null, "Insert Success");
        idPegawaiInputField.setText(null);
        namaPegawaiInputField.setText(null);
        alamatPegawaiInputField.setText(null);
        ContactInputField.setText(null);
        usernameInputField.setText(null);
        passwordInputField.setText(null) ;
        
    }//GEN-LAST:event_insertInputButtonActionPerformed

    private void resetInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetInputButtonActionPerformed
        idPegawaiInputField.setText(null);
        namaPegawaiInputField.setText(null);
        alamatPegawaiInputField.setText(null);
        ContactInputField.setText(null);
        usernameInputField.setText(null);
        passwordInputField.setText(null) ;
    }//GEN-LAST:event_resetInputButtonActionPerformed

    private void UpdatePegawaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePegawaiButtonActionPerformed
        Pegawai peg = new Pegawai();
        peg.setId(idPegawaiEditField.getText());
        peg.setNama(namaPegawaiEditField.getText());
        peg.setAlamat(alamatPegawaiEditField.getText());
        peg.setCp(ContactEditField.getText());
        peg.setUsername(usernameEditField.getText());
        peg.setPassword(passwordEditField.getText());
        peg.setKode("1");
        peg.updatePegawai();
        javax.swing.JOptionPane.showMessageDialog(null, "Update Success");
    }//GEN-LAST:event_UpdatePegawaiButtonActionPerformed

    private void deletePegawaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePegawaiButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Apakah anda yakin akan menghapus?");
        namaPegawaiEditField.setEnabled(false); 
        alamatPegawaiEditField.setEnabled(false); 
        ContactEditField.setEnabled(false); 
        usernameEditField.setEnabled(false);
        passwordEditField.setEnabled(false);
        UpdatePegawaiButton.setEnabled(false); 
        deletePegawaiButton.setEnabled(false);
        Pegawai peg = new Pegawai();
        peg.setId(idPegawaiEditField.getText());
        peg.setNama(namaPegawaiEditField.getText());
        peg.setAlamat(alamatPegawaiEditField.getText());
        peg.setCp(ContactEditField.getText());
        peg.setUsername(usernameEditField.getText());
        peg.setPassword(passwordEditField.getText());
        peg.deletePegawai();
        JOptionPane.showMessageDialog(null, "Delete Success");
        idPegawaiEditField.setText(null);
        namaPegawaiEditField.setText(null);
        alamatPegawaiEditField.setText(null);
        ContactEditField.setText(null);
        usernameEditField.setText(null);
        passwordEditField.setText(null);
    }//GEN-LAST:event_deletePegawaiButtonActionPerformed

    private void idPegawaiSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPegawaiSearchFieldActionPerformed
  
    }//GEN-LAST:event_idPegawaiSearchFieldActionPerformed

    private void insertMobilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertMobilButtonActionPerformed
        Mobil mob = new Mobil();
        mob.setId (idMobilInputField.getText ());
        mob.setJenis (jenisMobilInputField.getText ());
        mob.setSewa (sewaMobilInputField. getText ());
        mob.setStok(stokMobilInputField.getText());
        mob.insertMobil();
        javax.swing.JOptionPane.showMessageDialog(null, "Insert Success");

    }//GEN-LAST:event_insertMobilButtonActionPerformed

    private void resetMobilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetMobilButtonActionPerformed
        idMobilInputField.setText(null) ;
        jenisMobilInputField.setText(null);
        sewaMobilInputField.setText(null);
        stokMobilInputField.setText(null);
    }//GEN-LAST:event_resetMobilButtonActionPerformed

    private void editMobilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMobilButtonActionPerformed
        // TODO add your handling code here:
        idMobilEditField.setEnabled(true);
        jenisMobilEditField.setEnabled(true);
        sewaMobilEditField.setEnabled(true);
        stokMobilEditField.setEnabled(true);
        Mobil mob = new Mobil();
        mob.setId (idMobilEditField.getText ());
        mob.setJenis (jenisMobilEditField.getText ());
        mob.setSewa (sewaMobilEditField. getText ());
        mob.setStok(stokMobilEditField.getText());
        mob.updateMobil();
        javax.swing.JOptionPane.showMessageDialog(null, "Update Success");
        
    }//GEN-LAST:event_editMobilButtonActionPerformed

    private void deleteMobilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMobilButtonActionPerformed
            JOptionPane.showMessageDialog(null, "Apakah anda yakin akan menghapus?");
            idMobilEditField.setEnabled(false);
            jenisMobilEditField.setEnabled(false);
            sewaMobilEditField.setEnabled(false);
            stokMobilEditField.setEnabled(false);
            Mobil mob = new Mobil();
            mob.setId(idMobilEditField.getText());
            mob.setJenis(jenisMobilEditField.getText());
            mob.setSewa(sewaMobilEditField.getText());
            mob.setStok(stokMobilEditField.getText());
            mob.deleteMobil();
            JOptionPane.showMessageDialog(null, "Delete Success");
            idMobilEditField.setText(null);
            jenisMobilEditField.setText(null);
            sewaMobilEditField.setText(null);
            stokMobilEditField.setText(null);
    }//GEN-LAST:event_deleteMobilButtonActionPerformed

    private void mobilSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilSearchButtonActionPerformed
        Koneksi kon = new Koneksi();
        ResultSet rs = null;
        try{
            rs = kon.getData("select *from mobil where id_mobil = '"+idMobilSearchField.getText()+"'");
            while(rs.next()){
                idMobilEditField.setText(rs.getString("id_mobil"));
                jenisMobilEditField.setText(rs.getString("jenis"));
                sewaMobilEditField.setText(rs.getString("sewa")) ;
                stokMobilEditField.setText(rs.getString("stok"));
                JOptionPane.showMessageDialog(null,"Search Success") ;
                idMobilSearchField.setText(null) ;
                idMobilEditField.setEnabled(true) ;
                jenisMobilEditField.setEnabled(true);
                sewaMobilEditField.setEnabled(true);
                stokMobilEditField.setEnabled(true);
                editMobilButton.setEnabled(true);
                deleteMobilButton.setEnabled(true);
            } 
                rs.close(); 
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            }
                
    }//GEN-LAST:event_mobilSearchButtonActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        Koneksi kon = new Koneksi(); 
        ResultSet rs = null; int i = 0;
        rs = kon.getData("select *from peminjaman");
            try {
                while(rs.next()){ 
                    jTable1.setValueAt(rs.getString("id_peminjaman"), i, 0); 
                    jTable1.setValueAt(rs.getString("id_pelanggan"), i, 1); 
                    jTable1.setValueAt(rs.getString("id_mobil"), i, 2);
                    jTable1.setValueAt(rs.getString("jenis_mobil"), i, 3); 
                    jTable1.setValueAt(rs.getString("id_pegawai"), i, 4); 
                    jTable1.setValueAt(rs.getString("tgl_pinjam"), i, 5); 
                    jTable1.setValueAt(rs.getString("tgl_hrs_kembali"), i, 6); 
                    jTable1.setValueAt(rs.getString("biaya"), i, 7); 
                    jTable1.setValueAt(rs.getString("denda"), i, 8); 
                    i++; 
                }
                rs.close(); 
            } catch(Exception e){ 
                
            }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jenisMobilEditFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jenisMobilEditFieldInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisMobilEditFieldInputMethodTextChanged

    private void searchPegawaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPegawaiButtonActionPerformed
        // TODO add your handling code here:
        Koneksi kon = new Koneksi();
        ResultSet rs = null;
        try{ 
            rs = kon.getData("select *from user where id_user = '"+idPegawaiSearchField.getText()+"' and kode = '1'");
            while(rs.next()){
                idPegawaiEditField.setText(rs.getString("id_user"));
                namaPegawaiEditField.setText(rs.getString("nama"));
                alamatPegawaiEditField.setText(rs.getString("alamat"));
                ContactEditField.setText(rs.getString("cp"));
                usernameEditField.setText(rs.getString("username"));
                passwordEditField.setText(rs.getString("password")); 
                javax.swing.JOptionPane.showMessageDialog(null, "Search Success");  
                namaPegawaiEditField.setEnabled(true); 
                alamatPegawaiEditField.setEnabled(true); 
                ContactEditField.setEnabled(true); 
                usernameEditField.setEnabled(true);
                passwordEditField.setEnabled(true);
                UpdatePegawaiButton.setEnabled(true); 
                deletePegawaiButton.setEnabled(true);
            } 
            rs.close(); 
        }
        catch(Exception e){ 
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage()); 
        }
    }//GEN-LAST:event_searchPegawaiButtonActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ContactEditField;
    private javax.swing.JTextField ContactInputField;
    private javax.swing.JButton UpdatePegawaiButton;
    private javax.swing.JTextArea alamatPegawaiEditField;
    private javax.swing.JTextArea alamatPegawaiInputField;
    private javax.swing.JButton deleteMobilButton;
    private javax.swing.JButton deletePegawaiButton;
    private javax.swing.JButton editMobilButton;
    private javax.swing.JTextField idMobilEditField;
    private javax.swing.JTextField idMobilInputField;
    private javax.swing.JTextField idMobilSearchField;
    private javax.swing.JTextField idPegawaiEditField;
    private javax.swing.JTextField idPegawaiInputField;
    private javax.swing.JTextField idPegawaiSearchField;
    private javax.swing.JButton insertInputButton;
    private javax.swing.JButton insertMobilButton;
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
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jenisMobilEditField;
    private javax.swing.JTextField jenisMobilInputField;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton mobilSearchButton;
    private javax.swing.JTextField namaPegawaiEditField;
    private javax.swing.JTextField namaPegawaiInputField;
    private javax.swing.JTextField passwordEditField;
    private javax.swing.JTextField passwordInputField;
    private javax.swing.JButton resetInputButton;
    private javax.swing.JButton resetMobilButton;
    private javax.swing.JButton searchPegawaiButton;
    private javax.swing.JTextField sewaMobilEditField;
    private javax.swing.JTextField sewaMobilInputField;
    private javax.swing.JTextField stokMobilEditField;
    private javax.swing.JTextField stokMobilInputField;
    private javax.swing.JTextField usernameEditField;
    private javax.swing.JTextField usernameInputField;
    // End of variables declaration//GEN-END:variables
}
