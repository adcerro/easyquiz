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
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25));
        falseButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(237, 232, 227));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        questionLabel.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        questionLabel.setForeground(new java.awt.Color(25, 29, 99));
        questionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionLabel.setText("Your question goes here");
        questionLabel.setAlignmentX(0.5F);
        questionLabel.setMaximumSize(new java.awt.Dimension(500, 150));
        add(questionLabel);

        trueButton.setBackground(new java.awt.Color(244, 243, 246));
        trueButton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        trueButton.setText("True");
        trueButton.setAlignmentX(0.5F);
        trueButton.setFocusPainted(false);
        trueButton.setMaximumSize(new java.awt.Dimension(90, 32));
        trueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trueButtonActionPerformed(evt);
            }
        });
        add(trueButton);
        add(filler1);

        falseButton.setBackground(new java.awt.Color(244, 243, 246));
        falseButton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        falseButton.setText("False");
        falseButton.setAlignmentX(0.5F);
        falseButton.setFocusPainted(false);
        falseButton.setMaximumSize(new java.awt.Dimension(90, 32));
        falseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                falseButtonActionPerformed(evt);
            }
        });
        add(falseButton);
    }// </editor-fold>//GEN-END:initComponents

    private void trueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trueButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trueButtonActionPerformed

    private void falseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_falseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_falseButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton falseButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JButton trueButton;
    // End of variables declaration//GEN-END:variables
}
