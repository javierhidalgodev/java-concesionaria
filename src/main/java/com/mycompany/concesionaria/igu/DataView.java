package com.mycompany.concesionaria.igu;

import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.logica.Controladora;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Javi
 */
public class DataView extends javax.swing.JFrame {

    Controladora controladora;
    JFrame parentFrame;

    public DataView(Controladora controladora, JFrame parentFrame) {
        initComponents();

        this.controladora = controladora;
        this.parentFrame = parentFrame;

        setTitle("Registro de coches");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        initTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pPrincipal = new javax.swing.JPanel();
        pTitle = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        pAction = new javax.swing.JPanel();
        pData = new javax.swing.JPanel();
        pDataFillLeft = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        pDataFillRight = new javax.swing.JPanel();
        pBack = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();

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

        pAction.setLayout(new java.awt.BorderLayout());

        pData.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout pDataFillLeftLayout = new javax.swing.GroupLayout(pDataFillLeft);
        pDataFillLeft.setLayout(pDataFillLeftLayout);
        pDataFillLeftLayout.setHorizontalGroup(
            pDataFillLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDataFillLeftLayout.setVerticalGroup(
            pDataFillLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        pData.add(pDataFillLeft, gridBagConstraints);

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableData);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 4.0;
        gridBagConstraints.weighty = 4.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pData.add(jScrollPane2, gridBagConstraints);

        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        pData.add(btnEdit, gridBagConstraints);

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 10);
        pData.add(btnDelete, gridBagConstraints);

        javax.swing.GroupLayout pDataFillRightLayout = new javax.swing.GroupLayout(pDataFillRight);
        pDataFillRight.setLayout(pDataFillRightLayout);
        pDataFillRightLayout.setHorizontalGroup(
            pDataFillRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDataFillRightLayout.setVerticalGroup(
            pDataFillRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        pData.add(pDataFillRight, gridBagConstraints);

        pAction.add(pData, java.awt.BorderLayout.CENTER);

        pBack.setLayout(new java.awt.GridBagLayout());

        btnBack.setText("HOME");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        pBack.add(btnBack, gridBagConstraints);

        pAction.add(pBack, java.awt.BorderLayout.PAGE_END);

        pPrincipal.add(pAction, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        pPrincipal.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (tableData.getRowCount() > 0) {
            if (tableData.getSelectedRow() != -1) {
                int selectedRow = tableData.getSelectedRow();
                String placa = (String) tableData.getValueAt(selectedRow, 3);

                try {
                    Automovil auto = controladora.findAutoByPlate(placa);

                    AutoForm autoFormFrame = new AutoForm(controladora, this, auto);

                    autoFormFrame.setVisible(true);
                    this.setVisible(false);
                } catch (Exception e) {
                }
            }
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tableData.getRowCount() > 0) {
            if (tableData.getSelectedRow() != -1) {
                int confirmation = JOptionPane.showConfirmDialog(pPrincipal, "¿Estás seguro que deseas eliminar este elemento? La operación es irreversible", "Confirmación de borrado", JOptionPane.YES_NO_OPTION);
               
                if(confirmation == 0) {
                    int row = tableData.getSelectedRow();
                    String plate = (String) tableData.getValueAt(row, 3);

                    try {
                        controladora.destroyAutomovilByPlate(plate);
                        initTable();
                    } catch (Exception e) {
                        System.out.println("ERROR");
                    }                    
                }
                
            } else {
                JOptionPane.showMessageDialog(pPrincipal, "Seleccione un registro para realizar la operación", "Falta registro", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    @Override
    public void dispose() {
        if (parentFrame != null) {
            parentFrame.setVisible(true);
        }

        super.dispose();
    }

    public void initTable() {

        DefaultTableModel table = new DefaultTableModel() {

            // Filas y columnas no serán editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String headers[] = {"MARCA", "MODELO", "COLOR", "PLACA"};
        table.setColumnIdentifiers(headers);

        getData(table);
        tableData.setModel(table);
    }

    private void getData(DefaultTableModel table) {

        List<Automovil> autos = controladora.findAllAutomovil();

        if (autos.size() > 0) {
            for (Automovil a : autos) {
                Object[] auto = {a.getBrand(), a.getModel(), a.getColor(), a.getPlate()};
                table.addRow(auto);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lTitle;
    private javax.swing.JPanel pAction;
    private javax.swing.JPanel pBack;
    private javax.swing.JPanel pData;
    private javax.swing.JPanel pDataFillLeft;
    private javax.swing.JPanel pDataFillRight;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel pTitle;
    private javax.swing.JTable tableData;
    // End of variables declaration//GEN-END:variables
}
