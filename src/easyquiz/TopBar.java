/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package easyquiz;

/**
 *
 * @author aland
 */
public class TopBar extends javax.swing.JPanel {

    /**
     * Creates new form TopBar
     */
    public TopBar(String user,String quiztitle) {
        initComponents();
        userLabel.setText(userLabel.getText()+" "+user);
        quizLabel.setText(quiztitle);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userLabel = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        quizLabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        scoreLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(237, 232, 227));
        setPreferredSize(new java.awt.Dimension(400, 35));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        userLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setText("User:");
        add(userLabel);
        add(filler2);

        quizLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        quizLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(quizLabel);
        add(filler1);

        scoreLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("Score: 00");
        add(scoreLabel);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel quizLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}