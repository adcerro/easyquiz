
package easyquiz;




import java.awt.Color;
import javax.swing.JTable;


import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


/**
 *
 * @author aland
 */
public class EasyQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            UIManager.put("nimbusBase", new Color(49,205,99));
            UIManager.put("nimbusBlueGrey", new Color(237,232,227));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        MainFrame frame = new MainFrame();
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);
    }
    
}
