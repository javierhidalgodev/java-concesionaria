package com.mycompany.concesionaria.igu;

import com.mycompany.concesionaria.logica.Controladora;

/**
 *
 * @author Javi
 */
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();

        setTitle("Concesionaria");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pPrincipal = new javax.swing.JPanel();
        pTitle = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        pAction = new javax.swing.JPanel();
        pActionBtns = new javax.swing.JPanel();
        btnAutoForm = new javax.swing.JButton();
        btnViewData = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        pActionImage = new javax.swing.JPanel();
        lImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pPrincipal.setLayout(new java.awt.BorderLayout());

        pTitle.setLayout(new java.awt.GridBagLayout());

        lTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lTitle.setText("CONCESIONARIA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 204, 32, 200);
        pTitle.add(lTitle, gridBagConstraints);

        pPrincipal.add(pTitle, java.awt.BorderLayout.PAGE_START);

        pAction.setLayout(new java.awt.GridLayout(1, 2));

        pActionBtns.setLayout(new java.awt.GridBagLayout());

        btnAutoForm.setText("REGISTRAR COCHE");
        btnAutoForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoFormActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pActionBtns.add(btnAutoForm, gridBagConstraints);

        btnViewData.setText("COCHES REGISTRADOS");
        btnViewData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDataActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pActionBtns.add(btnViewData, gridBagConstraints);

        btnExit.setText("SALIR");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        pActionBtns.add(btnExit, gridBagConstraints);

        pAction.add(pActionBtns);

        pActionImage.setLayout(new java.awt.GridBagLayout());

        lImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kia-logo.png"))); // NOI18N
        pActionImage.add(lImage, new java.awt.GridBagConstraints());

        pAction.add(pActionImage);

        pPrincipal.add(pAction, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDataActionPerformed
        try {
            Controladora controladora = new Controladora();
            DataView dataViewFrame = new DataView(controladora, this);

            dataViewFrame.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            NotificationHandle.showErrorDialog(pPrincipal, Message.ERROR_CONEXION);
        }
    }//GEN-LAST:event_btnViewDataActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAutoFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoFormActionPerformed
        try {
            Controladora controladora = new Controladora();
            AutoForm autoFormFrame = new AutoForm(controladora, this);

            autoFormFrame.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
            NotificationHandle.showErrorDialog(pPrincipal, Message.ERROR_CONEXION);
        }
    }//GEN-LAST:event_btnAutoFormActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutoForm;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnViewData;
    private javax.swing.JLabel lImage;
    private javax.swing.JLabel lTitle;
    private javax.swing.JPanel pAction;
    private javax.swing.JPanel pActionBtns;
    private javax.swing.JPanel pActionImage;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel pTitle;
    // End of variables declaration//GEN-END:variables
}
