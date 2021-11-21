/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;

import Business.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Deepika Reddy
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ManageDeliverybtn = new javax.swing.JButton();
        ManageResbtn = new javax.swing.JButton();
        ManageCxbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setForeground(new java.awt.Color(255, 204, 204));
        setLayout(new java.awt.BorderLayout());

        jSplitPane.setDividerLocation(120);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        ManageDeliverybtn.setText("Manage Delivery Person");
        ManageDeliverybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageDeliverybtnActionPerformed(evt);
            }
        });

        ManageResbtn.setText("Manage Restaurants");
        ManageResbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageResbtnActionPerformed(evt);
            }
        });

        ManageCxbtn.setText("Manage All Customers");
        ManageCxbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageCxbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ManageCxbtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ManageDeliverybtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ManageResbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addComponent(ManageCxbtn)
                .addGap(40, 40, 40)
                .addComponent(ManageResbtn)
                .addGap(35, 35, 35)
                .addComponent(ManageDeliverybtn)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void ManageResbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageResbtnActionPerformed
        ManageRestaurantJPanel manageResPanel=new ManageRestaurantJPanel(userProcessContainer, ecosystem);
        
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("ManageRestaurantJPanel",manageResPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageResbtnActionPerformed

    private void ManageDeliverybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageDeliverybtnActionPerformed
        ManageDeliveryManJPanel manageDelvPanel=new ManageDeliveryManJPanel(userProcessContainer, ecosystem);
        
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("ManageDeliveryManJPanel",manageDelvPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageDeliverybtnActionPerformed

    private void ManageCxbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageCxbtnActionPerformed
        ManageCustomerJPanel manageCustPanel=new ManageCustomerJPanel(userProcessContainer, ecosystem);
        
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("ManageCustomerJPanel",manageCustPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageCxbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageCxbtn;
    private javax.swing.JButton ManageDeliverybtn;
    private javax.swing.JButton ManageResbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
