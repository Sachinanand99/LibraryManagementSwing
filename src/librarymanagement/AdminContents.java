package librarymanagement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author raman
 */
public class AdminContents extends javax.swing.JFrame {

    /**
     * Creates new form ADMINcontents
     */
    public AdminContents() {
        initComponents();
        bookmanagementpanel.setVisible(true);
        finepanel.setVisible(false);
        adminpage.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminpage = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        bookManagementSideButton = new javax.swing.JButton();
        fineSideButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        finepanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        generateFineButton = new javax.swing.JButton();
        removeFineButton = new javax.swing.JButton();
        bookmanagementpanel = new javax.swing.JPanel();
        addBookButton = new javax.swing.JButton();
        deleteBookButton = new javax.swing.JButton();
        viewIssuedBooksButton = new javax.swing.JButton();
        listAllBooksButton = new javax.swing.JButton();
        issueBookButton = new javax.swing.JButton();
        listAvailableBooksButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        returnBooksButton = new javax.swing.JButton();

        adminpage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidepanel.setBackground(new java.awt.Color(51, 204, 255));

        bookManagementSideButton.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        bookManagementSideButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/execution.png"))); // NOI18N
        bookManagementSideButton.setText("BOOK MANAGEMENT");
        bookManagementSideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookManagementSideButtonMouseClicked(evt);
            }
        });
        bookManagementSideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookManagementSideButtonActionPerformed(evt);
            }
        });

        fineSideButton.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        fineSideButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banking.png"))); // NOI18N
        fineSideButton.setText("         FINE");
        fineSideButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        fineSideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fineSideButtonMouseClicked(evt);
            }
        });
        fineSideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fineSideButtonActionPerformed(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout (1).png"))); // NOI18N
        logoutButton.setText("LOGOUT");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/content.png"))); // NOI18N
        jLabel1.setText("Admin contents");

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookManagementSideButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fineSideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(bookManagementSideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(fineSideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(logoutButton)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        finepanel.setBackground(new java.awt.Color(51, 204, 255));

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banking.png"))); // NOI18N
        jLabel2.setText("MANAGE FINES");

        generateFineButton.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        generateFineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add (1).png"))); // NOI18N
        generateFineButton.setText("SHOW FINE");
        generateFineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateFineButtonActionPerformed(evt);
            }
        });

        removeFineButton.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        removeFineButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash-bin.png"))); // NOI18N
        removeFineButton.setText("    REMOVE FINE");
        removeFineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout finepanelLayout = new javax.swing.GroupLayout(finepanel);
        finepanel.setLayout(finepanelLayout);
        finepanelLayout.setHorizontalGroup(
            finepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finepanelLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(finepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(finepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(removeFineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(generateFineButton, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        finepanelLayout.setVerticalGroup(
            finepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finepanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(generateFineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(removeFineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        bookmanagementpanel.setBackground(new java.awt.Color(0, 204, 255));

        addBookButton.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        addBookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addBookButton.setText("ADD BOOK");
        addBookButton.setPreferredSize(new java.awt.Dimension(164, 23));
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        deleteBookButton.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        deleteBookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete (1).png"))); // NOI18N
        deleteBookButton.setText("DELETE BOOK");
        deleteBookButton.setPreferredSize(new java.awt.Dimension(164, 23));
        deleteBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookButtonActionPerformed(evt);
            }
        });

        viewIssuedBooksButton.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        viewIssuedBooksButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png"))); // NOI18N
        viewIssuedBooksButton.setText("VIEW ISSUED BOOKS");
        viewIssuedBooksButton.setPreferredSize(new java.awt.Dimension(164, 23));
        viewIssuedBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewIssuedBooksButtonActionPerformed(evt);
            }
        });

        listAllBooksButton.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        listAllBooksButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book (2).png"))); // NOI18N
        listAllBooksButton.setText("LIST ALL BOOKS ");
        listAllBooksButton.setPreferredSize(new java.awt.Dimension(164, 23));
        listAllBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAllBooksButtonActionPerformed(evt);
            }
        });

        issueBookButton.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        issueBookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/expression (1).png"))); // NOI18N
        issueBookButton.setText("ISSUE BOOK");
        issueBookButton.setPreferredSize(new java.awt.Dimension(164, 23));
        issueBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookButtonActionPerformed(evt);
            }
        });

        listAvailableBooksButton.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        listAvailableBooksButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/convenience.png"))); // NOI18N
        listAvailableBooksButton.setText("LIST AVAILABLE BOOKS");
        listAvailableBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAvailableBooksButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage books");

        returnBooksButton.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        returnBooksButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return.png"))); // NOI18N
        returnBooksButton.setText("        RETURN BOOK");
        returnBooksButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        returnBooksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBooksButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookmanagementpanelLayout = new javax.swing.GroupLayout(bookmanagementpanel);
        bookmanagementpanel.setLayout(bookmanagementpanelLayout);
        bookmanagementpanelLayout.setHorizontalGroup(
            bookmanagementpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookmanagementpanelLayout.createSequentialGroup()
                .addGroup(bookmanagementpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookmanagementpanelLayout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bookmanagementpanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(bookmanagementpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(deleteBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(issueBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(bookmanagementpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listAllBooksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listAvailableBooksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewIssuedBooksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
            .addGroup(bookmanagementpanelLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(returnBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookmanagementpanelLayout.setVerticalGroup(
            bookmanagementpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookmanagementpanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(bookmanagementpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewIssuedBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(bookmanagementpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listAllBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(bookmanagementpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listAvailableBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issueBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(returnBooksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(504, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 232, Short.MAX_VALUE)
                    .addComponent(bookmanagementpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 225, Short.MAX_VALUE)
                    .addComponent(finepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bookmanagementpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(finepanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookManagementSideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookManagementSideButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_bookManagementSideButtonActionPerformed

    private void fineSideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fineSideButtonActionPerformed
        // TODO add your handling code here:
              
    }//GEN-LAST:event_fineSideButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        MainPage reges = new MainPage();
        reges.setVisible(true);
        reges.pack();
        reges.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        // TODO add your handling code here:
        AddBook addbook = new AddBook();
        addbook.setVisible(true);
        addbook.pack();
        addbook.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void deleteBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookButtonActionPerformed
        // TODO add your handling code here:
        DeleteBook DELbook = new DeleteBook();
        DELbook.setVisible(true);
        DELbook.pack();
        DELbook.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_deleteBookButtonActionPerformed

    private void bookManagementSideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookManagementSideButtonMouseClicked
        // TODO add your handling code here:
        bookmanagementpanel.setVisible(true);
        finepanel.setVisible(false);
        adminpage.setVisible(false);
    }//GEN-LAST:event_bookManagementSideButtonMouseClicked

    private void viewIssuedBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewIssuedBooksButtonActionPerformed
        // TODO add your handling code here:
        ViewIssuedBooks ViewIssuedbook = new ViewIssuedBooks();
        ViewIssuedbook.setVisible(true);
        ViewIssuedbook.pack();
        ViewIssuedbook.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_viewIssuedBooksButtonActionPerformed

    private void listAllBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAllBooksButtonActionPerformed
        // TODO add your handling code here:
        ListAllBook ListAllbooks = new ListAllBook();
        ListAllbooks.setVisible(true);
        ListAllbooks.pack();
        ListAllbooks.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_listAllBooksButtonActionPerformed

    private void issueBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBookButtonActionPerformed
        // TODO add your handling code hereDELbook
        IssueBook Issuebook = new IssueBook();
        Issuebook.setVisible(true);
        Issuebook.pack();
        Issuebook.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_issueBookButtonActionPerformed

    private void listAvailableBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAvailableBooksButtonActionPerformed
        // TODO add your handling code here:
        ListAvailableBook ListAvlbooks = new ListAvailableBook();
        ListAvlbooks.setVisible(true);
        ListAvlbooks.pack();
        ListAvlbooks.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_listAvailableBooksButtonActionPerformed

    private void fineSideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fineSideButtonMouseClicked
        // TODO add your handling code here:
         bookmanagementpanel.setVisible(false);
        finepanel.setVisible(true);
        adminpage.setVisible(false);
    }//GEN-LAST:event_fineSideButtonMouseClicked

    private void generateFineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateFineButtonActionPerformed
        // TODO add your handling code here:
        Showfine GFINE = new Showfine();
        GFINE.setVisible(true);
        GFINE.pack();
        GFINE.setLocationRelativeTo(null);
        this.dispose();       
    }//GEN-LAST:event_generateFineButtonActionPerformed

    private void removeFineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFineButtonActionPerformed
        // TODO add your handling code here:
        RemoveFines removeFine = new  RemoveFines();
        removeFine.setVisible(true);
        removeFine.pack();
        removeFine.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_removeFineButtonActionPerformed

    private void returnBooksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBooksButtonActionPerformed
        // TODO add your handling code here:
        ReturnBooks returnbooks = new ReturnBooks();
        returnbooks.setVisible(true);
        returnbooks.pack();
        returnbooks.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_returnBooksButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AdminContents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminContents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminContents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminContents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminContents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JPanel adminpage;
    private javax.swing.JButton bookManagementSideButton;
    private javax.swing.JPanel bookmanagementpanel;
    private javax.swing.JButton deleteBookButton;
    private javax.swing.JButton fineSideButton;
    private javax.swing.JPanel finepanel;
    private javax.swing.JButton generateFineButton;
    private javax.swing.JButton issueBookButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton listAllBooksButton;
    private javax.swing.JButton listAvailableBooksButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton removeFineButton;
    private javax.swing.JButton returnBooksButton;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JButton viewIssuedBooksButton;
    // End of variables declaration//GEN-END:variables
}
