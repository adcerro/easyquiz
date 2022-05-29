/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package easyquiz;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author aland
 */
public class YesNoQuestionPane extends javax.swing.JPanel {

    /**
     * Creates new form YesNoQuestion
     */
    public YesNoQuestionPane(YesNoQuestion quest) {
        initComponents();
        questionLabel.setText(quest.getQuestion());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        questionLabel = new javax.swing.JLabel();
        trueButton = new javax.swing.JButton();
        falseButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(237, 232, 227));

        questionLabel.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        questionLabel.setForeground(new java.awt.Color(25, 29, 99));
        questionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionLabel.setText("Your question goes here");

        trueButton.setBackground(new java.awt.Color(244, 243, 246));
        trueButton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        trueButton.setText("True");
        trueButton.setFocusPainted(false);
        trueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trueButtonActionPerformed(evt);
            }
        });

        falseButton.setBackground(new java.awt.Color(244, 243, 246));
        falseButton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        falseButton.setText("False");
        falseButton.setFocusPainted(false);
        falseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                falseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(trueButton, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(falseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addGap(189, 189, 189))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(falseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void trueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trueButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trueButtonActionPerformed

    private void falseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_falseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_falseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton falseButton;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JButton trueButton;
    // End of variables declaration//GEN-END:variables
}
