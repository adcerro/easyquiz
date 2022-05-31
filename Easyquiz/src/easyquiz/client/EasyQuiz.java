
package easyquiz.client;




import java.awt.Color;


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
        UIManager.put("Button.select", new Color(69, 196, 134) );
        
        
        MainFrame frame = MainFrame.getInstance();
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);
    }
    
}
