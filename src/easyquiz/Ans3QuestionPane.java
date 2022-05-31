/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package easyquiz;

/**
 *
 * @author aland
 */
public class Ans3QuestionPane extends javax.swing.JPanel {

    /**
     * Creates new form Ans3Question
     */
    public Ans3QuestionPane(Ans3Question quest) {
        initComponents();
        questionLabel.setText(quest.getQuestion());
        opt1Button.setText(quest.getOp1());
        opt2Button.setText(quest.getOp2());
        opt3Button.setText(quest.getOp3());
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
        opt1Button = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25));
        opt2Button = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25), new java.awt.Dimension(0, 25));
        opt3Button = new javax.swing.JButton();

        setBackground(new java.awt.Color(237, 232, 227));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        questionLabel.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        questionLabel.setForeground(new java.awt.Color(25, 29, 99));
        questionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionLabel.setText("Your question goes here");
        questionLabel.setAlignmentX(0.5F);
        questionLabel.setMaximumSize(new java.awt.Dimension(500, 150));
        add(questionLabel);

        opt1Button.setBackground(new java.awt.Color(244, 243, 246));
        opt1Button.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        opt1Button.setText("Continue");
        opt1Button.setAlignmentX(0.5F);
        opt1Button.setFocusPainted(false);
        opt1Button.setMaximumSize(new java.awt.Dimension(200, 42));
        add(opt1Button);
        add(filler1);

        opt2Button.setBackground(new java.awt.Color(244, 243, 246));
        opt2Button.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        opt2Button.setText("Continue");
        opt2Button.setAlignmentX(0.5F);
        opt2Button.setFocusPainted(false);
        opt2Button.setMaximumSize(new java.awt.Dimension(200, 42));
        add(opt2Button);
        add(filler2);

        opt3Button.setBackground(new java.awt.Color(244, 243, 246));
        opt3Button.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        opt3Button.setText("Continue");
        opt3Button.setAlignmentX(0.5F);
        opt3Button.setFocusPainted(false);
        opt3Button.setMaximumSize(new java.awt.Dimension(200, 42));
        add(opt3Button);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton opt1Button;
    private javax.swing.JButton opt2Button;
    private javax.swing.JButton opt3Button;
    private javax.swing.JLabel questionLabel;
    // End of variables declaration//GEN-END:variables
}
