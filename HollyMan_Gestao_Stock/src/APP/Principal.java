package APP;

import VIEW.Admin;
import VIEW.Login;
import javax.swing.JOptionPane;

/**
 *
 * @author HOLLY MAN
 */
public class Principal {
    
    public static void main(String[] args) {
        try {
            
               new Login().setVisible(true);
               
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     
    }
    
}
