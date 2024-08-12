/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

/**
 *
 * @author waksh
 */
public class CashierPanel extends javax.swing.JFrame {

    /**
     * Creates new form CashierPanel
     */
    String cashierusername;
    
    public CashierPanel() {
        initComponents();
    }
    
    public CashierPanel(String username) {
        initComponents();
        cashierusername = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StockDetails = new javax.swing.JButton();
        WelcomeMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ViewProducts = new javax.swing.JButton();
        MainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        StockDetails.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        StockDetails.setText("Stock Details");
        StockDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockDetailsActionPerformed(evt);
            }
        });

        WelcomeMessage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        WelcomeMessage.setText("Welcome");

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 48)); // NOI18N
        jLabel1.setText("Select your desired menu");

        ViewProducts.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ViewProducts.setText("View Product Details");
        ViewProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProductsActionPerformed(evt);
            }
        });

        MainMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MainMenu.setText("Sign Out");
        MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(ViewProducts)
                    .addComponent(StockDetails))
                .addGap(151, 151, 151))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(WelcomeMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainMenu)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(WelcomeMessage)
                    .addComponent(MainMenu))
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(ViewProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StockDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StockDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockDetailsActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CashierStockPage().setVisible(true);
    }//GEN-LAST:event_StockDetailsActionPerformed

    private void ViewProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProductsActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CashierProductsPage().setVisible(true);
    }//GEN-LAST:event_ViewProductsActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        WelcomeMessage.setText("Welcome " + cashierusername);
    }//GEN-LAST:event_formWindowOpened

    private void MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CashierSignIn().setVisible(true);
    }//GEN-LAST:event_MainMenuActionPerformed

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
            java.util.logging.Logger.getLogger(CashierPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainMenu;
    private javax.swing.JButton StockDetails;
    private javax.swing.JButton ViewProducts;
    private javax.swing.JLabel WelcomeMessage;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
